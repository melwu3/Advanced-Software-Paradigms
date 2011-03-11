grammar CSV; // must be stored in a file called CSV.g


file returns [List values=new ArrayList()]
	: a=NUMBER 
      {
        try{
	  Integer.parseInt($a.text);
        $values.add($a.int);
        }
	  catch(NumberFormatException nfe){
	  $values.add(Double.parseDouble($a.text));
        }
      }
	  (',' b=NUMBER 
      {
        try{
	  Integer.parseInt($b.text);
        $values.add($b.int);
        }
	  catch(NumberFormatException nfe){
	  $values.add(Double.parseDouble($b.text));
        }
      })*
      EOF
	;

NUMBER	: ('-')? ('0'..'9')+ ('.' ('0'..'9')+)* ;
COMMENT : ('//') ('a'..'z'|'A'..'Z'|'0'..'9'|' '|'\t')* ; 
WS	: (' '|'\n'|'\t'|'\r')+ {skip();} ;