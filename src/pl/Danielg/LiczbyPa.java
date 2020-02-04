package pl.Danielg;

public class LiczbyPa {
  public static void main(String[] args) {
     pazysteLiczby(100);
    pazysteLiczby2(50, 40);
    final int dwa = 2;
    for (int i = 1; i <= 100; i++) {
      int wynik = dwa * i;
       System.out.println(wynik);
    }
  }

  static void pazysteLiczby(int ileWykonan) {
    final int dwa = 2;
    for (int i = 1; i <= ileWykonan; i++) {
      int score = dwa * i;
      System.out.println(score);
    }
  }

  static void pazysteLiczby2(int gorna, int dolna) {
    if (dolna < gorna) {
      for (int i = dolna; i <= gorna; i++) {
        if (i % 2 == 0) {
          System.out.println(i);
        }
      }
    } else {
      System.out.println("Nic z tego.");
    }
  }
}
