import java.util.Scanner;
public class Vowel{
    public static void main(String[] args) {
        try(Scanner AD = new Scanner(System.in);){
        char ch = AD.next().charAt(0);
        char newCh = Character.toUpperCase(ch);
        if(newCh == 'A' || newCh == 'E'|| newCh == 'I'|| newCh == 'O' || newCh == 'U')
        {
          System.out.println("Vowel");
        }
        else if (Character.isLetter(newCh)){
            System.out.println("Consonet");
        }
        else {
            System.out.println("Not a letter");
        }
      }
  }
}
