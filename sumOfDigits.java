// Print the sum of Digits in the given number like(123453223)
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        try(Scanner AD = new Scanner(System.in);){
            int num = AD.nextInt();
            int sumOfDigits = 0;
            while(num !=0){
                  sumOfDigits += num %10;
                  num /= 10;
            }
            System.err.println(sumOfDigits);

        }
    }
    
}
