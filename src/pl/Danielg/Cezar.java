package pl.Danielg;

public class Cezar {
  public static void main(String[] args) {
    String szyfrowanie = code(pl.Danielg.Rekurencja.poprosOhaslo(), 3); 
    System.out.println(szyfrowanie);
  }

  public static String code(String message, int przeniesienie) {
    StringBuilder stringBuilder = new StringBuilder(message);
    for (int i = 0; i < stringBuilder.length(); i++) {
      int c = stringBuilder.charAt(i);
      if (c + przeniesienie > 127) {
        c = 46 + (przeniesienie - 127 + c);
      } else {
        c += przeniesienie;
      }
      stringBuilder.setCharAt(i, (char) c);
    }
    return stringBuilder.toString();
  }
}
