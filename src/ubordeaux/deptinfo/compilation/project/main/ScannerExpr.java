/* The following code was generated by JFlex 1.7.0 */

package ubordeaux.deptinfo.compilation.project.main;
import beaver.Symbol;
import beaver.Scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>/autofs/unitytravail/travail/zychen/L3/S6/compilation/compilator_LEA/scanner/ScannerExpr.jflex</tt>
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
    "\12\0\1\11\1\11\1\11\1\11\23\0\1\56\1\6\3\0\1\52"+
    "\1\0\1\37\1\40\1\10\1\47\1\57\1\50\1\31\1\7\1\3"+
    "\11\2\1\34\1\60\1\53\1\54\1\55\2\0\6\5\24\1\1\43"+
    "\1\0\1\44\1\33\1\1\1\0\1\13\1\15\1\35\1\22\1\16"+
    "\1\32\1\17\1\46\1\20\2\1\1\30\1\1\1\21\1\27\1\25"+
    "\1\1\1\14\1\26\1\23\1\36\1\12\1\45\1\4\1\24\1\1"+
    "\1\41\1\51\1\42\7\0\1\11\u1fa2\0\1\11\1\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\1\1\4\1\5\14\2"+
    "\1\6\1\2\1\7\1\10\1\2\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\2\1\17\1\20\2\1\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\2\0\1\27\1\30"+
    "\1\0\10\2\1\31\4\2\1\32\6\2\1\33\1\34"+
    "\4\2\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\0\1\44\5\2\1\45\2\2\1\46\16\2\1\30"+
    "\5\2\1\47\1\2\1\50\2\2\1\51\1\52\1\53"+
    "\6\2\1\54\1\2\1\55\2\2\1\56\4\2\1\57"+
    "\3\2\1\60\1\2\1\61\1\62\1\63\6\2\1\64"+
    "\1\65\1\2\1\66\1\67\1\70\1\71\1\72\3\2"+
    "\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[163];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\61"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\61\0\61"+
    "\0\u0405\0\61\0\61\0\61\0\61\0\61\0\61\0\u0436"+
    "\0\61\0\61\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c"+
    "\0\61\0\61\0\u058d\0\365\0\61\0\u05be\0\u05ef\0\u0620"+
    "\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\142"+
    "\0\u07a8\0\u07d9\0\u080a\0\u083b\0\142\0\u086c\0\u089d\0\u08ce"+
    "\0\u08ff\0\u0930\0\u0961\0\142\0\61\0\u0992\0\u09c3\0\u09f4"+
    "\0\u0a25\0\61\0\61\0\61\0\61\0\61\0\61\0\u058d"+
    "\0\u0a56\0\142\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b\0\142"+
    "\0\u0b7c\0\u0bad\0\142\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2"+
    "\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a"+
    "\0\u0e5b\0\61\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\142"+
    "\0\u0f81\0\142\0\u0fb2\0\u0fe3\0\142\0\142\0\142\0\u1014"+
    "\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\142\0\u113a\0\142"+
    "\0\u116b\0\u119c\0\142\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291"+
    "\0\u12c2\0\u12f3\0\u1324\0\142\0\u1355\0\142\0\142\0\142"+
    "\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u144a\0\u147b\0\142\0\142"+
    "\0\u14ac\0\142\0\142\0\142\0\142\0\142\0\u14dd\0\u150e"+
    "\0\u153f\0\142\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[163];
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
    "\1\2\1\11\1\12\1\13\1\14\1\15\1\3\1\16"+
    "\1\17\1\20\1\21\1\3\1\22\1\23\1\24\1\3"+
    "\1\25\1\26\1\27\1\30\1\31\1\3\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\3\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\62\0\5\3\4\0\17\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\14\0\2\4\57\0\2\4\1\53\54\0"+
    "\6\54\1\55\52\54\7\0\1\56\1\57\51\0\5\3"+
    "\4\0\1\3\1\60\15\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\2\3\1\61\14\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\4\3\1\62\12\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\4\3\1\63\10\3"+
    "\1\64\1\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\13\0\5\3\4\0\7\3\1\65\6\3\1\66\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\7\3\1\67\7\3\1\0\1\70\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\4\3\1\71\12\3\1\0"+
    "\1\3\2\0\1\3\1\72\6\0\2\3\13\0\5\3"+
    "\4\0\4\3\1\73\1\3\1\74\6\3\1\75\1\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\2\3\1\76\7\3\1\77\4\3\1\0\1\3"+
    "\2\0\2\3\6\0\1\3\1\100\13\0\5\3\4\0"+
    "\2\3\1\101\14\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\11\3\1\102\5\3\1\0"+
    "\1\3\2\0\2\3\6\0\1\103\1\3\13\0\5\3"+
    "\4\0\17\3\1\0\1\104\2\0\2\3\6\0\2\3"+
    "\43\0\1\105\30\0\5\3\4\0\1\3\1\106\15\3"+
    "\1\0\1\3\2\0\1\3\1\107\6\0\2\3\13\0"+
    "\5\3\4\0\1\3\1\110\15\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\17\3\1\0"+
    "\1\3\2\0\2\3\6\0\1\3\1\111\63\0\1\112"+
    "\61\0\1\113\62\0\1\114\60\0\1\115\60\0\1\116"+
    "\60\0\1\117\6\0\2\120\1\0\1\120\5\0\1\120"+
    "\1\0\2\120\3\0\1\120\7\0\1\120\2\0\1\120"+
    "\23\0\11\56\1\0\47\56\10\57\1\121\50\57\1\0"+
    "\5\3\4\0\2\3\1\122\14\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\2\3\1\123"+
    "\14\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\1\3\1\124\7\3\1\125\5\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\5\3\1\126\11\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\15\3\1\127\1\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\10\3\1\130\6\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\14\3\1\131\2\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\11\3\1\132\5\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\17\3\1\0\1\3\2\0"+
    "\2\3\6\0\1\133\1\3\13\0\5\3\4\0\16\3"+
    "\1\134\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\17\3\1\0\1\135\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\14\3\1\136\2\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\17\3\1\0\1\3\2\0\1\3\1\137\6\0\2\3"+
    "\13\0\5\3\4\0\13\3\1\140\3\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\13\0\5\3\4\0\4\3"+
    "\1\141\12\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\13\0\5\3\4\0\6\3\1\142\6\3\1\143\1\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\2\3\1\144\14\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\6\3\1\145\10\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\16\3\1\146\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\7\3\1\147\7\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\14\3\1\150\2\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\6\3\1\151\10\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\12\0\7\57\1\152"+
    "\1\121\50\57\1\0\5\3\4\0\1\3\1\153\15\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\10\3\1\154\6\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\17\3\1\0\1\3"+
    "\2\0\1\3\1\155\6\0\2\3\13\0\5\3\4\0"+
    "\6\3\1\156\10\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\16\3\1\157\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\13\0\5\3\4\0\4\3"+
    "\1\160\12\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\13\0\5\3\4\0\4\3\1\161\12\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\13\0\5\3\4\0\16\3"+
    "\1\162\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\1\3\1\163\15\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\13\3\1\164"+
    "\3\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\4\3\1\165\12\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\4\3\1\166"+
    "\12\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\7\3\1\167\7\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\7\3\1\170"+
    "\7\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\17\3\1\0\1\3\2\0\1\171\1\3"+
    "\6\0\2\3\13\0\5\3\4\0\6\3\1\172\10\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\11\3\1\173\5\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\14\3\1\174\2\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\17\3\1\0\1\3\2\0\1\175\1\3\6\0"+
    "\2\3\13\0\5\3\4\0\4\3\1\176\12\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\16\3\1\177\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\13\0\5\3\4\0\12\3\1\200\4\3\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\13\0\5\3\4\0\16\3"+
    "\1\201\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\2\3\1\202\14\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\7\3\1\203"+
    "\7\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\4\3\1\204\12\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\5\3\1\205"+
    "\11\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\17\3\1\0\1\3\2\0\1\3\1\206"+
    "\6\0\2\3\13\0\5\3\4\0\15\3\1\207\1\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\11\3\1\210\5\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\4\3\1\211\12\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\7\3\1\212\7\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\17\3\1\0\1\3"+
    "\2\0\1\213\1\3\6\0\2\3\13\0\5\3\4\0"+
    "\4\3\1\214\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\11\3\1\215\5\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\4\3\1\216\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\7\3\1\217\7\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\7\3\1\220\7\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\1\3\1\221\15\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\4\3\1\222\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\16\3\1\223\1\0\1\3"+
    "\2\0\2\3\6\0\2\3\13\0\5\3\4\0\14\3"+
    "\1\224\2\3\1\0\1\3\2\0\2\3\6\0\2\3"+
    "\13\0\5\3\4\0\16\3\1\225\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\10\3\1\226"+
    "\6\3\1\0\1\3\2\0\2\3\6\0\2\3\13\0"+
    "\5\3\4\0\5\3\1\227\11\3\1\0\1\3\2\0"+
    "\2\3\6\0\2\3\13\0\5\3\4\0\17\3\1\0"+
    "\1\3\2\0\2\3\6\0\1\3\1\230\13\0\5\3"+
    "\4\0\6\3\1\231\10\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\7\3\1\232\7\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\2\3\1\233\14\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\11\3\1\234\5\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\4\3\1\235\12\3\1\0\1\3\2\0\2\3"+
    "\6\0\2\3\13\0\5\3\4\0\7\3\1\236\7\3"+
    "\1\0\1\3\2\0\2\3\6\0\2\3\13\0\5\3"+
    "\4\0\17\3\1\0\1\3\2\0\1\3\1\237\6\0"+
    "\2\3\13\0\5\3\4\0\15\3\1\240\1\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\2\3\1\241\14\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\13\0\5\3\4\0\7\3\1\242\7\3\1\0"+
    "\1\3\2\0\2\3\6\0\2\3\13\0\5\3\4\0"+
    "\4\3\1\243\12\3\1\0\1\3\2\0\2\3\6\0"+
    "\2\3\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5488];
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
    "\1\0\1\11\5\1\1\11\16\1\2\11\1\1\6\11"+
    "\1\1\2\11\6\1\2\11\2\0\1\11\1\1\1\0"+
    "\25\1\1\11\4\1\6\11\1\1\1\0\30\1\1\11"+
    "\71\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[163];
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
    while (i < 170) {
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
          case 61: break;
          case 2: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.IDENTIFIER, yyline, yycolumn, yytext());
            } 
            // fall through
          case 62: break;
          case 3: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER_LIT, yyline, yycolumn, new Integer(yytext()));
            } 
            // fall through
          case 63: break;
          case 4: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DIV, yyline, yycolumn);
            } 
            // fall through
          case 64: break;
          case 5: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.TIMES, yyline, yycolumn);
            } 
            // fall through
          case 65: break;
          case 6: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.STRUCT, yyline, yycolumn);
            } 
            // fall through
          case 66: break;
          case 7: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.CIRCUMFLEX, yyline, yycolumn);
            } 
            // fall through
          case 67: break;
          case 8: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.COLON, yyline, yycolumn);
            } 
            // fall through
          case 68: break;
          case 9: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.LPAR, yyline, yycolumn);
            } 
            // fall through
          case 69: break;
          case 10: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RPAR, yyline, yycolumn);
            } 
            // fall through
          case 70: break;
          case 11: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.LCURLY_BRACKET, yyline, yycolumn);
            } 
            // fall through
          case 71: break;
          case 12: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RCURLY_BRACKET, yyline, yycolumn);
            } 
            // fall through
          case 72: break;
          case 13: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.LBRACKET, yyline, yycolumn);
            } 
            // fall through
          case 73: break;
          case 14: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RBRACKET, yyline, yycolumn);
            } 
            // fall through
          case 74: break;
          case 15: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PLUS, yyline, yycolumn);
            } 
            // fall through
          case 75: break;
          case 16: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.MINUS, yyline, yycolumn);
            } 
            // fall through
          case 76: break;
          case 17: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INFERIOR, yyline, yycolumn);
            } 
            // fall through
          case 77: break;
          case 18: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.EQ, yyline, yycolumn);
            } 
            // fall through
          case 78: break;
          case 19: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SUPERIOR, yyline, yycolumn);
            } 
            // fall through
          case 79: break;
          case 20: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.NOT, yyline, yycolumn);
            } 
            // fall through
          case 80: break;
          case 21: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.COMMA, yyline, yycolumn);
            } 
            // fall through
          case 81: break;
          case 22: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SEMI, yyline, yycolumn);
            } 
            // fall through
          case 82: break;
          case 23: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.STRING_LIT, yyline, yycolumn, yytext());
            } 
            // fall through
          case 83: break;
          case 24: 
            { System.out.println("*** " + yytext());
            } 
            // fall through
          case 84: break;
          case 25: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.IF, yyline, yycolumn);
            } 
            // fall through
          case 85: break;
          case 26: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DO, yyline, yycolumn);
            } 
            // fall through
          case 86: break;
          case 27: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.OF, yyline, yycolumn);
            } 
            // fall through
          case 87: break;
          case 28: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DOUBLE_DOT, yyline, yycolumn);
            } 
            // fall through
          case 88: break;
          case 29: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.OR, yyline, yycolumn);
            } 
            // fall through
          case 89: break;
          case 30: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.AND, yyline, yycolumn);
            } 
            // fall through
          case 90: break;
          case 31: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INFERIOR_EQ, yyline, yycolumn);
            } 
            // fall through
          case 91: break;
          case 32: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.EQUALS, yyline, yycolumn);
            } 
            // fall through
          case 92: break;
          case 33: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SUPERIOR_EQ, yyline, yycolumn);
            } 
            // fall through
          case 93: break;
          case 34: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DIFF, yyline, yycolumn);
            } 
            // fall through
          case 94: break;
          case 35: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INTEGER_LIT, yyline, yycolumn, new Integer(Integer.parseInt(yytext().substring(2),16)));
            } 
            // fall through
          case 95: break;
          case 36: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.VAR, yyline, yycolumn);
            } 
            // fall through
          case 96: break;
          case 37: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.END, yyline, yycolumn);
            } 
            // fall through
          case 97: break;
          case 38: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.NEW, yyline, yycolumn);
            } 
            // fall through
          case 98: break;
          case 39: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.ELSE, yyline, yycolumn);
            } 
            // fall through
          case 99: break;
          case 40: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.NULL, yyline, yycolumn);
            } 
            // fall through
          case 100: break;
          case 41: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.TRUE, yyline, yycolumn);
            } 
            // fall through
          case 101: break;
          case 42: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.TYPE, yyline, yycolumn);
            } 
            // fall through
          case 102: break;
          case 43: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.THEN, yyline, yycolumn);
            } 
            // fall through
          case 103: break;
          case 44: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.CASE, yyline, yycolumn);
            } 
            // fall through
          case 104: break;
          case 45: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.ARRAY, yyline, yycolumn);
            } 
            // fall through
          case 105: break;
          case 46: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.BEGIN, yyline, yycolumn);
            } 
            // fall through
          case 106: break;
          case 47: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PRINT, yyline, yycolumn);
            } 
            // fall through
          case 107: break;
          case 48: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.FALSE, yyline, yycolumn);
            } 
            // fall through
          case 108: break;
          case 49: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.WHILE, yyline, yycolumn);
            } 
            // fall through
          case 109: break;
          case 50: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.READLN, yyline, yycolumn);
            } 
            // fall through
          case 110: break;
          case 51: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.RETURN, yyline, yycolumn);
            } 
            // fall through
          case 111: break;
          case 52: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.STR, yyline, yycolumn, yytext());
            } 
            // fall through
          case 112: break;
          case 53: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.SWITCH, yyline, yycolumn);
            } 
            // fall through
          case 113: break;
          case 54: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.BOOL, yyline, yycolumn, new Boolean(yytext()));
            } 
            // fall through
          case 114: break;
          case 55: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.INT, yyline, yycolumn);
            } 
            // fall through
          case 115: break;
          case 56: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DEFAULT, yyline, yycolumn);
            } 
            // fall through
          case 116: break;
          case 57: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.DISPOSE, yyline, yycolumn);
            } 
            // fall through
          case 117: break;
          case 58: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PRINTLN, yyline, yycolumn);
            } 
            // fall through
          case 118: break;
          case 59: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.FUNCTION, yyline, yycolumn);
            } 
            // fall through
          case 119: break;
          case 60: 
            { System.out.println("*** " + yytext()); return new Symbol(Terminals.PROCEDURE, yyline, yycolumn);
            } 
            // fall through
          case 120: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
