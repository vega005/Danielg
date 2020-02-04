package pl.Danielg;

import java.util.Scanner;

public class Haslo {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    String password; 
    int passwordStrength = 0; 
    do {
      System.out.println("Podaj hasło: "); 
      password = scanner.nextLine(); 
      passwordStrength = checkPasswordStrength(password); 
      System.out.println("Siła Twojego hasła to: " + passwordStrength); 
      System.out.println("Długość Twojgo hasła: " + password.length()); 
    } while (password.length() < 8 || passwordStrength < 3); 
    System.out.println("Podałes prawidłowe hasło.");
  }

  public static int checkPasswordStrength(String password) { 
    int length = password.length();
    boolean hasNumber = false; 
    boolean hasBigLetter = false;
    boolean hasSpecial = false;
    boolean hasSmallLetter = false;
    for (int i = 0; i < length; i++) { 
      char character = password.charAt(i);
      if (Character.isDigit(character)) {
        hasNumber = true;
      }
      if (Character.isAlphabetic(character)){
        char bigChar = Character.toUpperCase(character);
        if (bigChar == character){
          hasBigLetter = true;
        }else {
          hasSmallLetter = true; 
        }
      }
      if (!Character.isDigit(character) && !Character.isAlphabetic(character)){
        hasSpecial = true;
      }
    }
    int strenth = 0; 
    if (hasNumber){
      strenth++;
    }
    if (hasBigLetter){
      strenth++;
    }
    if (hasSmallLetter){
      strenth++;
    }
    if (hasSpecial){
      strenth++;
    }
    System.out.println(hasBigLetter +"-" + hasNumber + "-" + hasSmallLetter + "-" + hasSpecial);
    return strenth; 
  }
}
