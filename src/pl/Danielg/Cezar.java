package pl.Danielg;

public class Cezar {
  public static void main(String[] args) {
    String szyfrowanie = code(pl.Danielg.Rekurencja.poprosOhaslo(), 3);//przypisanie do zmiennej metody code w ktorej wywoluje sie klase rekurencja, wpisuaje haslo
    System.out.println(szyfrowanie);//koduje i wyswietla ////stworzenie zmiennej o ile ma sie przeniesc kodowany znak
  }

  public static String code(String message, int przeniesienie) {//stworzenie metody code z argumentem message, ktora za zadanie kodowac podana wiadomosc
    StringBuilder stringBuilder = new StringBuilder(message);//stworzenie StringB ktory ma dzialac na podanej wiadomosci
    for (int i = 0; i < stringBuilder.length(); i++) {//stworzenie petli ktora bedzie sie powtarzac do o 1 mniej dlugosci SB (wiadomosci)
      int c = stringBuilder.charAt(i);//zmienna ktora znaleziony znak w SB otrzyma jego pozycje na tablicy unicode
      if (c + przeniesienie > 127) {//jezeli pozycja znaku + przeniesienie jest mniejsze od pozycji znaku na 127
        c = 46 + (przeniesienie - 127 + c);//wtedy do pozycji znaku przypisuje pozycje o jeden mnijesza znaku od ktorego chce zaczac plus wartosc przeniesienia - max dlugosc alfabetu + pozycja c
      } else {
        c += przeniesienie;//w przeciwnym razie  pozycja znaku plus przeniesienie
      }
      stringBuilder.setCharAt(i, (char) c);//wartosc znaku c zmieniony na char
    }
    return stringBuilder.toString();//zwrot SB w stringu
  }
}

