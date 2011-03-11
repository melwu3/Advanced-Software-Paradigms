// $ANTLR 3.3 Nov 30, 2010 12:50:56 Expr.g 2011-03-11 02:49:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExprLexer extends Lexer {
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

    public ExprLexer() {;} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Expr.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:3:6: ( '=' )
            // Expr.g:3:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:4:7: ( 'or' )
            // Expr.g:4:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:5:7: ( 'and' )
            // Expr.g:5:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:6:7: ( 'not' )
            // Expr.g:6:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:7:7: ( '(' )
            // Expr.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:8:7: ( ')' )
            // Expr.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:57:5: ( ( 'a' .. 'z' ) ( '0' .. '9' )* )
            // Expr.g:57:9: ( 'a' .. 'z' ) ( '0' .. '9' )*
            {
            // Expr.g:57:9: ( 'a' .. 'z' )
            // Expr.g:57:10: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // Expr.g:57:20: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Expr.g:57:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:58:6: ( 'T' )
            // Expr.g:58:8: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:59:7: ( 'F' )
            // Expr.g:59:11: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:60:8: ( ( '\\r' )? '\\n' )
            // Expr.g:60:9: ( '\\r' )? '\\n'
            {
            // Expr.g:60:9: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Expr.g:60:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Expr.g:61:5: ( ( ' ' | '\\t' )+ )
            // Expr.g:61:9: ( ' ' | '\\t' )+
            {
            // Expr.g:61:9: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Expr.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        // Expr.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | ID | TRUE | FALSE | NEWLINE | WS )
        int alt4=11;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // Expr.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // Expr.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // Expr.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // Expr.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // Expr.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // Expr.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // Expr.g:1:45: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // Expr.g:1:48: TRUE
                {
                mTRUE(); 

                }
                break;
            case 9 :
                // Expr.g:1:53: FALSE
                {
                mFALSE(); 

                }
                break;
            case 10 :
                // Expr.g:1:59: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 11 :
                // Expr.g:1:67: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\uffff\3\7\12\uffff";
    static final String DFA4_eofS =
        "\17\uffff";
    static final String DFA4_minS =
        "\1\11\1\uffff\1\162\1\156\1\157\12\uffff";
    static final String DFA4_maxS =
        "\1\172\1\uffff\1\162\1\156\1\157\12\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\2\1\3\1"+
        "\4";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\13\1\12\2\uffff\1\12\22\uffff\1\13\7\uffff\1\5\1\6\23\uffff"+
            "\1\1\10\uffff\1\11\15\uffff\1\10\14\uffff\1\3\14\7\1\4\1\2\13"+
            "\7",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | ID | TRUE | FALSE | NEWLINE | WS );";
        }
    }
 

}