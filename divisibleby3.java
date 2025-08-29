// Print the number divisible by 3 from 1 to n
import java.util.Scanner;
public class divisibleby3 {
    public static void main(String[] args) {
      try(  Scanner AD = new Scanner(System.in);){
        int n = AD.nextInt();
        for(int i = 1 ; i <=n ; i++){
            if(i % 3 == 0){
                System.out.print(i+" ");
            }
        }
    }

    }
}
