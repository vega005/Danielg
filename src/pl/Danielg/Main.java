package pl.Danielg;

public class Main {
  public static void main(String[] args) {
    double cztery = 4;
    System.out.println(cztery * szereg(150000));
  }

  private static double szereg(int argument) {
    double wynik = 0;
    for (int n = 1; n <= argument; n++) {
      wynik += (Math.pow(-1, n - 1)) / (2 * n - 1);
      //System.out.println(wynik);
    }
    return wynik;
  }
}
