import java.util.Scanner;
public class bill{
    public static void main(String[] args) {
      try(  Scanner AD = new Scanner(System.in);){
        int units = AD.nextInt();
        double amount = 0;
        if(units <= 100){
            amount =units * 1.50;
        }
        else if (units >100 && units <= 200){
            amount = units * 2.50 ;
        }
        else if(units > 200){
            amount = units * 4.00 ;
        }
        System.out.println("Amount =" +(int)amount);
        AD.close();
    }
}
}