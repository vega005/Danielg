package pl.Danielg;

import java.util.Scanner;

public class Haslo {
  public static void main(String[] args) { // wymysl haslo,a program ma sprawdzic czy haslo jest silne
    Scanner scanner = new Scanner(System.in); //przepatrzec kod i ktore jest miejsce najtrudniejsze
    String password; // stworzenie zmiennej haslo
    int passwordStrength = 0; //stworzenie zmiennej sumujacej sile hasla
    do {
      System.out.println("Podaj hasło: "); //wyswietlenie napisu
      password = scanner.nextLine(); // przypisanie do zmiennej haslo obiektu scanera
      passwordStrength = checkPasswordStrength(password); // przypisanie do zmiennej liczacej sile hasla metody sprawdzajacej haslo
      System.out.println("Siła Twojego hasła to: " + passwordStrength); //wyswietlenie napisu i zmiennej liczacej sile hasla
      System.out.println("Długość Twojgo hasła: " + password.length()); //wyswietlenie napisu i zmiennej z dlugoscia wpisanego hasla
    } while (password.length() < 8 || passwordStrength < 3); //sprawdzanie warunku czy dlugosc hasla jest 8lub wiecej i czy sila hasla jest 3lub wicej
    System.out.println("Podałes prawidłowe hasło.");//wyswietlenie napisu
  }

  public static int checkPasswordStrength(String password) { //stwordzenie metody sprawdzajacej sile hasla. Jest w public zeby inne klasy mialy doniej dostep
    int length = password.length();//stworzenie zmiennej z dluoscia podanego hasla
    boolean hasNumber = false; //stworzenie zmiennej czyMaNumer domyslnie na NIE
    boolean hasBigLetter = false;//stworzenie zmiennej czyMaDuzaLitere domyslnie na NIE
    boolean hasSpecial = false;//stworzenie zmiennej czyMaZnakSpecjalny domyslnie na NIE
    boolean hasSmallLetter = false;//stworzenie zmiennej czyMaMalaLitere domyslnie na NIE
    for (int i = 0; i < length; i++) { //stworzenie petli ktora bedzie sie powtarzac do o 1 mniej dlugosci podanego hasla
      char character = password.charAt(i);//stworzenie zmiennej ktora sprawdza znak na kazdym miejscu dlugosci hasla/kazdego przejscia petli
      if (Character.isDigit(character)) {//warunek sprawdza czy haslo posiada liczbe na ktorymkolwiek przejsciu petli
        hasNumber = true;//jesli haslo posiada to zmienna podaje TAK
      }
      if (Character.isAlphabetic(character)){//warunek sprawdza czy haslo posiada litere na ktorymkolwiek przejsciu petli
        char bigChar = Character.toUpperCase(character);//stworzenie zmiennej ktora zmienia wszystkie litery hasla na duze
        if (bigChar == character){//warunek sprawdza czy w ktores miejsce dlugosci hasla jest rowne zmiennej z duzymi literami
          hasBigLetter = true;//jesli jest to zmienna wielkiej litery daje TAK
        }else {//jezeli warunek sie nie spelni
          hasSmallLetter = true; // zmienna malej litery da TAK
        }
      }
      if (!Character.isDigit(character) && !Character.isAlphabetic(character)){//warunek sprawdza,ze jesli znak w hasle nie jest liczba ani litera
        hasSpecial = true;//zmienna znaku specjalnego daje TAK
      }
    }
    int strenth = 0; //zmienna zlicza siłe hasła
    if (hasNumber){//warunek, ze jesli hasNumber  zwroci true
      strenth++;//zmienna sily hasla zwieksza sie o jeden
    }
    if (hasBigLetter){//warunek, ze jesli hasBigLetter  zwroci true
      strenth++;//zmienna sily hasla zwieksza sie o jeden
    }
    if (hasSmallLetter){//warunek, ze jesli hasSmallLetter  zwroci true
      strenth++;//zmienna sily hasla zwieksza sie o jeden
    }
    if (hasSpecial){//warunek, ze jesli hasSpecial  zwroci true
      strenth++;//zmienna sily hasla zwieksza sie o jeden
    }
    System.out.println(hasBigLetter +"-" + hasNumber + "-" + hasSmallLetter + "-" + hasSpecial);//wyswietla false lub true w zaleznosci od tego czy spelnia warunek
    return strenth; //zwraca zebrane warunki true
  }
}
