grammar Expr;

@header {
import java.util.HashMap;
}
@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog:   stat+ ;
                
stat:   expr NEWLINE {System.out.println($expr.value);}
    |   ID '=' expr NEWLINE
        {memory.put($ID.text, $expr.value);}
    |   NEWLINE
    ;

expr   returns [boolean value]
    :  e=orExpr {$value = $e.value;}
    ;

orExpr returns [boolean value]
    :   e=andExpr {$value = $e.value;} ('or' e=andExpr {$value = $value || $e.value;})*
    ;

andExpr returns [boolean value]
    :   e=notExpr {$value = $e.value;} ('and' e=notExpr {$value = $value && $e.value;})*
    ;

notExpr returns [boolean value]
    :   e=atom {$value = $e.value;}
        |
        'not' e=atom {$value = !$e.value;}

    ;

atom returns [boolean value]
    :   TRUE 
        {
        $value = Boolean.parseBoolean("true");
        }
    |
	  FALSE 
        {
        $value = Boolean.parseBoolean("false");
        }
    |   ID
        {
        Boolean v = (Boolean)memory.get($ID.text);
        if ( v!=null ) $value = v.booleanValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' e=expr ')' {$value = $e.value;}
    ;

ID  :   ('a'..'z') ('0'..'9')* ;
TRUE : 'T' ;
FALSE :   'F' ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
