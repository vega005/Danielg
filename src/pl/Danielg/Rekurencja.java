package pl.Danielg;

import java.util.Scanner;

public class Rekurencja {
  public static void main(String[] args) {
    poprosOhaslo();
  }

  public static String poprosOhaslo(){ 
    Scanner scanner = new Scanner(System.in); 
    String password; 
    int passwordStrength = 0; 
    System.out.println("Podaj hasło: " );
    password = scanner.nextLine();
    passwordStrength = Haslo.checkPasswordStrength(password);
    if (passwordStrength >= 3 && password.length() > 8){
      System.out.println("Haslo jest wystarczajaco mocne:" + " " + passwordStrength);
    }else {
      poprosOhaslo();
    }
    //System.out.println(passwordStrength);
    return password;
  }
}
