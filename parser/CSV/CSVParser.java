// $ANTLR 3.3 Nov 30, 2010 12:50:56 CSV.g 2011-03-10 16:25:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CSVParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "COMMENT", "WS", "','"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int NUMBER=4;
    public static final int COMMENT=5;
    public static final int WS=6;

    // delegates
    // delegators


        public CSVParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CSVParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CSVParser.tokenNames; }
    public String getGrammarFileName() { return "CSV.g"; }



    // $ANTLR start "file"
    // CSV.g:4:1: file returns [List values=new ArrayList()] : a= NUMBER ( ',' b= NUMBER )* EOF ;
    public final List file() throws RecognitionException {
        List values = new ArrayList();

        Token a=null;
        Token b=null;

        try {
            // CSV.g:5:2: (a= NUMBER ( ',' b= NUMBER )* EOF )
            // CSV.g:5:4: a= NUMBER ( ',' b= NUMBER )* EOF
            {
            a=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_file19); 

                    try{
            	  Integer.parseInt((a!=null?a.getText():null));
                    values.add((a!=null?Integer.valueOf(a.getText()):0));
                    }
            	  catch(NumberFormatException nfe){
            	  values.add(Double.parseDouble((a!=null?a.getText():null)));
                    }
                  
            // CSV.g:15:4: ( ',' b= NUMBER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==7) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CSV.g:15:5: ',' b= NUMBER
            	    {
            	    match(input,7,FOLLOW_7_in_file34); 
            	    b=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_file38); 

            	            try{
            	    	  Integer.parseInt((b!=null?b.getText():null));
            	            values.add((b!=null?Integer.valueOf(b.getText()):0));
            	            }
            	    	  catch(NumberFormatException nfe){
            	    	  values.add(Double.parseDouble((b!=null?b.getText():null)));
            	            }
            	          

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_file57); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return values;
    }
    // $ANTLR end "file"

    // Delegated rules


 

    public static final BitSet FOLLOW_NUMBER_in_file19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_file34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NUMBER_in_file38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOF_in_file57 = new BitSet(new long[]{0x0000000000000002L});

}