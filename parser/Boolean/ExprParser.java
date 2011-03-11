// $ANTLR 3.3 Nov 30, 2010 12:50:56 Expr.g 2011-03-11 02:49:28

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "ID", "TRUE", "FALSE", "WS", "'='", "'or'", "'and'", "'not'", "'('", "')'"
    };
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int NEWLINE=4;
    public static final int ID=5;
    public static final int TRUE=6;
    public static final int FALSE=7;
    public static final int WS=8;

    // delegates
    // delegators


        public ExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "Expr.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // Expr.g:11:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // Expr.g:11:5: ( ( stat )+ )
            // Expr.g:11:9: ( stat )+
            {
            // Expr.g:11:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NEWLINE && LA1_0<=FALSE)||(LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Expr.g:11:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog22);
            	    stat();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "stat"
    // Expr.g:13:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        Token ID2=null;
        boolean expr1 = false;

        boolean expr3 = false;


        try {
            // Expr.g:13:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==9) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2>=10 && LA2_2<=11)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // Expr.g:13:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat49);
                    expr1=expr();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat51); 
                    System.out.println(expr1);

                    }
                    break;
                case 2 :
                    // Expr.g:14:9: ID '=' expr NEWLINE
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat63); 
                    match(input,9,FOLLOW_9_in_stat65); 
                    pushFollow(FOLLOW_expr_in_stat67);
                    expr3=expr();

                    state._fsp--;

                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat69); 
                    memory.put((ID2!=null?ID2.getText():null), expr3);

                    }
                    break;
                case 3 :
                    // Expr.g:16:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat89); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stat"


    // $ANTLR start "expr"
    // Expr.g:19:1: expr returns [boolean value] : e= orExpr ;
    public final boolean expr() throws RecognitionException {
        boolean value = false;

        boolean e = false;


        try {
            // Expr.g:20:5: (e= orExpr )
            // Expr.g:20:8: e= orExpr
            {
            pushFollow(FOLLOW_orExpr_in_expr115);
            e=orExpr();

            state._fsp--;

            value = e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "expr"


    // $ANTLR start "orExpr"
    // Expr.g:23:1: orExpr returns [boolean value] : e= andExpr ( 'or' e= andExpr )* ;
    public final boolean orExpr() throws RecognitionException {
        boolean value = false;

        boolean e = false;


        try {
            // Expr.g:24:5: (e= andExpr ( 'or' e= andExpr )* )
            // Expr.g:24:9: e= andExpr ( 'or' e= andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr142);
            e=andExpr();

            state._fsp--;

            value = e;
            // Expr.g:24:40: ( 'or' e= andExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Expr.g:24:41: 'or' e= andExpr
            	    {
            	    match(input,10,FOLLOW_10_in_orExpr147); 
            	    pushFollow(FOLLOW_andExpr_in_orExpr151);
            	    e=andExpr();

            	    state._fsp--;

            	    value = value || e;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "orExpr"


    // $ANTLR start "andExpr"
    // Expr.g:27:1: andExpr returns [boolean value] : e= notExpr ( 'and' e= notExpr )* ;
    public final boolean andExpr() throws RecognitionException {
        boolean value = false;

        boolean e = false;


        try {
            // Expr.g:28:5: (e= notExpr ( 'and' e= notExpr )* )
            // Expr.g:28:9: e= notExpr ( 'and' e= notExpr )*
            {
            pushFollow(FOLLOW_notExpr_in_andExpr180);
            e=notExpr();

            state._fsp--;

            value = e;
            // Expr.g:28:40: ( 'and' e= notExpr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Expr.g:28:41: 'and' e= notExpr
            	    {
            	    match(input,11,FOLLOW_11_in_andExpr185); 
            	    pushFollow(FOLLOW_notExpr_in_andExpr189);
            	    e=notExpr();

            	    state._fsp--;

            	    value = value && e;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "andExpr"


    // $ANTLR start "notExpr"
    // Expr.g:31:1: notExpr returns [boolean value] : (e= atom | 'not' e= atom );
    public final boolean notExpr() throws RecognitionException {
        boolean value = false;

        boolean e = false;


        try {
            // Expr.g:32:5: (e= atom | 'not' e= atom )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=ID && LA5_0<=FALSE)||LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Expr.g:32:9: e= atom
                    {
                    pushFollow(FOLLOW_atom_in_notExpr218);
                    e=atom();

                    state._fsp--;

                    value = e;

                    }
                    break;
                case 2 :
                    // Expr.g:34:9: 'not' e= atom
                    {
                    match(input,12,FOLLOW_12_in_notExpr240); 
                    pushFollow(FOLLOW_atom_in_notExpr244);
                    e=atom();

                    state._fsp--;

                    value = !e;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "notExpr"


    // $ANTLR start "atom"
    // Expr.g:38:1: atom returns [boolean value] : ( TRUE | FALSE | ID | '(' e= expr ')' );
    public final boolean atom() throws RecognitionException {
        boolean value = false;

        Token ID4=null;
        boolean e = false;


        try {
            // Expr.g:39:5: ( TRUE | FALSE | ID | '(' e= expr ')' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case TRUE:
                {
                alt6=1;
                }
                break;
            case FALSE:
                {
                alt6=2;
                }
                break;
            case ID:
                {
                alt6=3;
                }
                break;
            case 13:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Expr.g:39:9: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_atom270); 

                            value = Boolean.parseBoolean("true");
                            

                    }
                    break;
                case 2 :
                    // Expr.g:44:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_atom292); 

                            value = Boolean.parseBoolean("false");
                            

                    }
                    break;
                case 3 :
                    // Expr.g:48:9: ID
                    {
                    ID4=(Token)match(input,ID,FOLLOW_ID_in_atom313); 

                            Boolean v = (Boolean)memory.get((ID4!=null?ID4.getText():null));
                            if ( v!=null ) value = v.booleanValue();
                            else System.err.println("undefined variable "+(ID4!=null?ID4.getText():null));
                            

                    }
                    break;
                case 4 :
                    // Expr.g:54:9: '(' e= expr ')'
                    {
                    match(input,13,FOLLOW_13_in_atom333); 
                    pushFollow(FOLLOW_expr_in_atom337);
                    e=expr();

                    state._fsp--;

                    match(input,14,FOLLOW_14_in_atom339); 
                    value = e;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog22 = new BitSet(new long[]{0x00000000000030F2L});
    public static final BitSet FOLLOW_expr_in_stat49 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_stat51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat63 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_stat65 = new BitSet(new long[]{0x00000000000030E0L});
    public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr142 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_orExpr147 = new BitSet(new long[]{0x00000000000030E0L});
    public static final BitSet FOLLOW_andExpr_in_orExpr151 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_notExpr_in_andExpr180 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_andExpr185 = new BitSet(new long[]{0x00000000000030E0L});
    public static final BitSet FOLLOW_notExpr_in_andExpr189 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_atom_in_notExpr218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_notExpr240 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_atom_in_notExpr244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_atom333 = new BitSet(new long[]{0x00000000000030E0L});
    public static final BitSet FOLLOW_expr_in_atom337 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_atom339 = new BitSet(new long[]{0x0000000000000002L});

}