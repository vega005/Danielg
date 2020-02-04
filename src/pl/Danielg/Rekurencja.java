package pl.Danielg;

import java.util.Scanner;

public class Rekurencja {
  public static void main(String[] args) {
    poprosOhaslo();
  }

  public static String poprosOhaslo(){ //dodac komentarze
    Scanner scanner = new Scanner(System.in); //tworzenie obiektu scanera
    String password; // utworzenie zmiennej haslo
    int passwordStrength = 0; // utworzenie zmiennej liczacej sile hasla
    System.out.println("Podaj hasło: " );// wyswietla prosbe o podanie hasla
    password = scanner.nextLine();//przypisanie do zmiennej haslo obiektu scanera
    passwordStrength = Haslo.checkPasswordStrength(password);//przypisanie do zmiennej silaHasla klasy Haslo z wywolaniem metody sprawwdzenia sily hasla po jego wpisaniu
    if (passwordStrength >= 3 && password.length() > 8){//warunek sprawdzajacy czy sila hasla jest wieksza badz rowna 3 i dlugosci 8
      System.out.println("Haslo jest wystarczajaco mocne:" + " " + passwordStrength);// wyswietlenie informacji ,ze haslo jest wystarczajaco sile
    }else {
      poprosOhaslo();//jesli nie jest to Rekurencyjnie uruchom ta metode ponownie
    }
    //System.out.println(passwordStrength);//wyswietl zebrana sile hasla
    return password;//zwroc haslo
  }
}
