import java.util.Scanner;
public class alphabet{
    public static void main(String[] args) {
        Scanner AD = new Scanner(System.in);
        char letter = AD.next().charAt(0);
        if(Character.isLetter(letter)){
           System.out.println("Alphabet");
        }
        else {
            System.out.println("Invalid alphabet. Try to give alphabet");
        }
        
    }
}