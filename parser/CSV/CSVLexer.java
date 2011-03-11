// $ANTLR 3.3 Nov 30, 2010 12:50:56 CSV.g 2011-03-10 16:25:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CSVLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int NUMBER=4;
    public static final int COMMENT=5;
    public static final int WS=6;

    // delegates
    // delegators

    public CSVLexer() {;} 
    public CSVLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CSVLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CSV.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSV.g:3:6: ( ',' )
            // CSV.g:3:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSV.g:28:8: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )* )
            // CSV.g:28:10: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )*
            {
            // CSV.g:28:10: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // CSV.g:28:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // CSV.g:28:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CSV.g:28:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // CSV.g:28:29: ( '.' ( '0' .. '9' )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // CSV.g:28:30: '.' ( '0' .. '9' )+
            	    {
            	    match('.'); 
            	    // CSV.g:28:34: ( '0' .. '9' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // CSV.g:28:35: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSV.g:29:9: ( ( '//' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\t' )* )
            // CSV.g:29:11: ( '//' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\t' )*
            {
            // CSV.g:29:11: ( '//' )
            // CSV.g:29:12: '//'
            {
            match("//"); 


            }

            // CSV.g:29:18: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | '\\t' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' '||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // CSV.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' '||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CSV.g:30:4: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
            // CSV.g:30:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
            {
            // CSV.g:30:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // CSV.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // CSV.g:1:8: ( T__7 | NUMBER | COMMENT | WS )
        int alt7=4;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt7=1;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=2;
            }
            break;
        case '/':
            {
            alt7=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;
        }

        switch (alt7) {
            case 1 :
                // CSV.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // CSV.g:1:15: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 3 :
                // CSV.g:1:22: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 4 :
                // CSV.g:1:30: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}