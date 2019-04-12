/* The following code was generated by JFlex 1.7.0 */

package ubordeaux.deptinfo.compilation.project.main;
import beaver.Symbol;
import beaver.Scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>/autofs/unitytravail/travail/alegendre001/Compilation/compilator_LEA/scanner/ScannerExpr.jflex</tt>
 */
class ScannerExpr extends Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\0\26\0\1\55\1\6\3\0\1\51\1\0\1\34\1\35"+
    "\1\46\1\44\1\56\1\45\1\26\1\47\1\3\11\2\1\31\1\57"+
    "\1\52\1\53\1\54\2\0\6\5\24\1\1\40\1\0\1\41\1\30"+
    "\1\1\1\0\1\10\1\12\1\32\1\17\1\13\1\27\1\14\1\43"+
    "\1\15\2\1\1\25\1\1\1\16\1\24\1\22\1\1\1\11\1\23"+
    "\1\20\1\33\1\7\1\42\1\4\1\21\1\1\1\36\1\50\1\37"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\1\14\2\1\4\1\2"+
    "\1\5\1\6\1\2\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\2\1\15\1\16\1\17\1\20\2\1\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\2\0\1\27\10\2"+
    "\1\30\4\2\1\31\6\2\1\32\1\33\4\2\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\5\2"+
    "\1\44\2\2\1\45\23\2\1\46\1\2\1\47\2\2"+
    "\1\50\1\51\1\52\6\2\1\53\1\2\1\54\2\2"+
    "\1\55\10\2\1\56\1\2\1\57\1\60\1\61\6\2"+
    "\1\62\1\63\1\2\1\64\1\65\1\66\1\67\1\70"+
    "\3\2\1\71\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\u0390\0\60\0\60\0\u03c0\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u03f0\0\60\0\60"+
    "\0\60\0\60\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510"+
    "\0\60\0\60\0\u0540\0\360\0\60\0\u0570\0\u05a0\0\u05d0"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\140\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\140\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870"+
    "\0\u08a0\0\140\0\60\0\u08d0\0\u0900\0\u0930\0\u0960\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u0540\0\140\0\u0990"+
    "\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\140\0\u0a80\0\u0ab0\0\140"+
    "\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30"+
    "\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0"+
    "\0\u0de0\0\u0e10\0\u0e40\0\140\0\u0e70\0\140\0\u0ea0\0\u0ed0"+
    "\0\140\0\140\0\140\0\u0f00\0\u0f30\0\u0f60\0\u0f90\0\u0fc0"+
    "\0\u0ff0\0\140\0\u1020\0\140\0\u1050\0\u1080\0\140\0\u10b0"+
    "\0\u10e0\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\140"+
    "\0\u1230\0\140\0\140\0\140\0\u1260\0\u1290\0\u12c0\0\u12f0"+
    "\0\u1320\0\u1350\0\140\0\140\0\u1380\0\140\0\140\0\140"+
    "\0\140\0\140\0\u13b0\0\u13e0\0\u1410\0\140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\2\3\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\3\1\14\1\15\1\16\1\17"+
    "\1\3\1\20\1\21\1\22\1\3\1\23\1\24\1\25"+
    "\1\26\1\27\1\3\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\3\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\61\0"+
    "\5\3\1\0\17\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\16\0\2\4\56\0\2\4\1\53\53\0\6\54"+
    "\1\55\51\54\1\0\5\3\1\0\1\3\1\56\15\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\2\3\1\57\14\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\4\3\1\60\12\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\4\3\1\61\10\3\1\62\1\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\7\3"+
    "\1\63\6\3\1\64\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\7\3\1\65\7\3\1\0"+
    "\1\66\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\4\3\1\67\12\3\1\0\1\3\2\0\1\3\1\70"+
    "\6\0\2\3\15\0\5\3\1\0\4\3\1\71\1\3"+
    "\1\72\6\3\1\73\1\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\2\3\1\74\7\3"+
    "\1\75\4\3\1\0\1\3\2\0\2\3\6\0\1\3"+
    "\1\76\15\0\5\3\1\0\2\3\1\77\14\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\11\3\1\100\5\3\1\0\1\3\2\0\2\3\6\0"+
    "\1\101\1\3\15\0\5\3\1\0\17\3\1\0\1\102"+
    "\2\0\2\3\6\0\2\3\42\0\1\103\32\0\5\3"+
    "\1\0\1\3\1\104\15\3\1\0\1\3\2\0\1\3"+
    "\1\105\6\0\2\3\15\0\5\3\1\0\1\3\1\106"+
    "\15\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\17\3\1\0\1\3\2\0\2\3\6\0"+
    "\1\3\1\107\64\0\1\110\60\0\1\111\61\0\1\112"+
    "\57\0\1\113\57\0\1\114\57\0\1\115\6\0\2\116"+
    "\1\0\1\116\2\0\1\116\1\0\2\116\3\0\1\116"+
    "\7\0\1\116\2\0\1\116\26\0\5\3\1\0\2\3"+
    "\1\117\14\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\15\0\5\3\1\0\2\3\1\120\14\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\1\3"+
    "\1\121\7\3\1\122\5\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\5\3\1\123\11\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\15\3\1\124\1\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\10\3\1\125\6\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\14\3\1\126\2\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\11\3\1\127\5\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\17\3\1\0\1\3\2\0\2\3\6\0\1\130"+
    "\1\3\15\0\5\3\1\0\16\3\1\131\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\17\3"+
    "\1\0\1\132\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\14\3\1\133\2\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\17\3\1\0\1\3"+
    "\2\0\1\3\1\134\6\0\2\3\15\0\5\3\1\0"+
    "\13\3\1\135\3\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\4\3\1\136\12\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\6\3\1\137\6\3\1\140\1\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\2\3\1\141"+
    "\14\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\6\3\1\142\10\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\16\3\1\143"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\7\3\1\144\7\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\14\3\1\145\2\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\6\3\1\146\10\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\1\3\1\147\15\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\10\3\1\150\6\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\17\3\1\0\1\3"+
    "\2\0\1\3\1\151\6\0\2\3\15\0\5\3\1\0"+
    "\6\3\1\152\10\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\16\3\1\153\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\4\3"+
    "\1\154\12\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\15\0\5\3\1\0\4\3\1\155\12\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\16\3"+
    "\1\156\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\1\3\1\157\15\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\13\3\1\160"+
    "\3\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\4\3\1\161\12\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\4\3\1\162"+
    "\12\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\7\3\1\163\7\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\7\3\1\164"+
    "\7\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\17\3\1\0\1\3\2\0\1\165\1\3"+
    "\6\0\2\3\15\0\5\3\1\0\6\3\1\166\10\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\11\3\1\167\5\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\14\3\1\170\2\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\17\3\1\0\1\3\2\0\1\171\1\3\6\0"+
    "\2\3\15\0\5\3\1\0\4\3\1\172\12\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\16\3\1\173\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\15\0\5\3\1\0\12\3\1\174\4\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\16\3"+
    "\1\175\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\2\3\1\176\14\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\7\3\1\177"+
    "\7\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\4\3\1\200\12\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\5\3\1\201"+
    "\11\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\17\3\1\0\1\3\2\0\1\3\1\202"+
    "\6\0\2\3\15\0\5\3\1\0\15\3\1\203\1\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\11\3\1\204\5\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\4\3\1\205\12\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\7\3\1\206\7\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\17\3\1\0\1\3"+
    "\2\0\1\207\1\3\6\0\2\3\15\0\5\3\1\0"+
    "\4\3\1\210\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\11\3\1\211\5\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\4\3\1\212\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\7\3\1\213\7\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\7\3\1\214\7\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\1\3\1\215\15\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\4\3\1\216\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\16\3\1\217\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\15\0\5\3\1\0\14\3"+
    "\1\220\2\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\15\0\5\3\1\0\16\3\1\221\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\10\3\1\222"+
    "\6\3\1\0\1\3\2\0\2\3\6\0\2\3\15\0"+
    "\5\3\1\0\5\3\1\223\11\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\15\0\5\3\1\0\17\3\1\0"+
    "\1\3\2\0\2\3\6\0\1\3\1\224\15\0\5\3"+
    "\1\0\6\3\1\225\10\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\7\3\1\226\7\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\2\3\1\227\14\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\11\3\1\230\5\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\4\3\1\231\12\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\15\0\5\3\1\0\7\3\1\232\7\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\15\0\5\3"+
    "\1\0\17\3\1\0\1\3\2\0\1\3\1\233\6\0"+
    "\2\3\15\0\5\3\1\0\15\3\1\234\1\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\2\3\1\235\14\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\15\0\5\3\1\0\7\3\1\236\7\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\15\0\5\3\1\0"+
    "\4\3\1\237\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5184];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\22\1\2\11\1\1\6\11\1\1\4\11"+
    "\6\1\2\11\2\0\1\11\25\1\1\11\4\1\6\11"+
    "\122\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  ScannerExpr(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 154) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol nextToken() throws java.io.IOException, Scanner.Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	System.out.println(yytext()); return new Symbol(Terminals.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            } 
            // fall through
          case 59: break;
          case 2: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.IDENTIFIER, yyline, yycolumn, yytext());
            } 
            // fall through
          case 60: break;
          case 3: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER_LIT, yyline, yycolumn, new Integer(yytext()));
            } 
            // fall through
          case 61: break;
          case 4: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.STRUCT, yyline, yycolumn);
            } 
            // fall through
          case 62: break;
          case 5: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.CIRCUMFLEX, yyline, yycolumn);
            } 
            // fall through
          case 63: break;
          case 6: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.COLON, yyline, yycolumn);
            } 
            // fall through
          case 64: break;
          case 7: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.LPAR, yyline, yycolumn);
            } 
            // fall through
          case 65: break;
          case 8: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RPAR, yyline, yycolumn);
            } 
            // fall through
          case 66: break;
          case 9: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.LCURLY_BRACKET, yyline, yycolumn);
            } 
            // fall through
          case 67: break;
          case 10: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RCURLY_BRACKET, yyline, yycolumn);
            } 
            // fall through
          case 68: break;
          case 11: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.LBRACKET, yyline, yycolumn);
            } 
            // fall through
          case 69: break;
          case 12: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RBRACKET, yyline, yycolumn);
            } 
            // fall through
          case 70: break;
          case 13: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PLUS, yyline, yycolumn);
            } 
            // fall through
          case 71: break;
          case 14: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.MINUS, yyline, yycolumn);
            } 
            // fall through
          case 72: break;
          case 15: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.TIMES, yyline, yycolumn);
            } 
            // fall through
          case 73: break;
          case 16: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DIV, yyline, yycolumn);
            } 
            // fall through
          case 74: break;
          case 17: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INFERIOR, yyline, yycolumn);
            } 
            // fall through
          case 75: break;
          case 18: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.EQ, yyline, yycolumn);
            } 
            // fall through
          case 76: break;
          case 19: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SUPERIOR, yyline, yycolumn);
            } 
            // fall through
          case 77: break;
          case 20: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.NOT, yyline, yycolumn);
            } 
            // fall through
          case 78: break;
          case 21: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.COMMA, yyline, yycolumn);
            } 
            // fall through
          case 79: break;
          case 22: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SEMI, yyline, yycolumn);
            } 
            // fall through
          case 80: break;
          case 23: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.STRING_LIT, yyline, yycolumn, yytext());
            } 
            // fall through
          case 81: break;
          case 24: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.IF, yyline, yycolumn);
            } 
            // fall through
          case 82: break;
          case 25: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DO, yyline, yycolumn);
            } 
            // fall through
          case 83: break;
          case 26: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.OF, yyline, yycolumn);
            } 
            // fall through
          case 84: break;
          case 27: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DOUBLE_DOT, yyline, yycolumn);
            } 
            // fall through
          case 85: break;
          case 28: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.OR, yyline, yycolumn);
            } 
            // fall through
          case 86: break;
          case 29: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.AND, yyline, yycolumn);
            } 
            // fall through
          case 87: break;
          case 30: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INFERIOR_EQ, yyline, yycolumn);
            } 
            // fall through
          case 88: break;
          case 31: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.EQUALS, yyline, yycolumn);
            } 
            // fall through
          case 89: break;
          case 32: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SUPERIOR_EQ, yyline, yycolumn);
            } 
            // fall through
          case 90: break;
          case 33: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DIFF, yyline, yycolumn);
            } 
            // fall through
          case 91: break;
          case 34: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER_LIT, yyline, yycolumn, Integer.parseInt(yytext().substring(2),16));
            } 
            // fall through
          case 92: break;
          case 35: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.VAR, yyline, yycolumn);
            } 
            // fall through
          case 93: break;
          case 36: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.END, yyline, yycolumn);
            } 
            // fall through
          case 94: break;
          case 37: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.NEW, yyline, yycolumn);
            } 
            // fall through
          case 95: break;
          case 38: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.ELSE, yyline, yycolumn);
            } 
            // fall through
          case 96: break;
          case 39: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.NULL, yyline, yycolumn);
            } 
            // fall through
          case 97: break;
          case 40: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.TRUE, yyline, yycolumn);
            } 
            // fall through
          case 98: break;
          case 41: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.TYPE, yyline, yycolumn);
            } 
            // fall through
          case 99: break;
          case 42: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.THEN, yyline, yycolumn);
            } 
            // fall through
          case 100: break;
          case 43: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.CASE, yyline, yycolumn);
            } 
            // fall through
          case 101: break;
          case 44: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.ARRAY, yyline, yycolumn);
            } 
            // fall through
          case 102: break;
          case 45: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.BEGIN, yyline, yycolumn);
            } 
            // fall through
          case 103: break;
          case 46: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.FALSE, yyline, yycolumn);
            } 
            // fall through
          case 104: break;
          case 47: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.WHILE, yyline, yycolumn);
            } 
            // fall through
          case 105: break;
          case 48: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.READLN, yyline, yycolumn);
            } 
            // fall through
          case 106: break;
          case 49: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RETURN, yyline, yycolumn);
            } 
            // fall through
          case 107: break;
          case 50: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.STR, yyline, yycolumn, yytext());
            } 
            // fall through
          case 108: break;
          case 51: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SWITCH, yyline, yycolumn);
            } 
            // fall through
          case 109: break;
          case 52: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.BOOL, yyline, yycolumn, new Boolean(yytext()));
            } 
            // fall through
          case 110: break;
          case 53: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INT, yyline, yycolumn);
            } 
            // fall through
          case 111: break;
          case 54: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DEFAULT, yyline, yycolumn);
            } 
            // fall through
          case 112: break;
          case 55: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DISPOSE, yyline, yycolumn);
            } 
            // fall through
          case 113: break;
          case 56: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PRINTLN, yyline, yycolumn);
            } 
            // fall through
          case 114: break;
          case 57: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.FUNCTION, yyline, yycolumn);
            } 
            // fall through
          case 115: break;
          case 58: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PROCEDURE, yyline, yycolumn);
            } 
            // fall through
          case 116: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
