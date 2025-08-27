import java.util.Scanner;
public class atm{
public static void main(String[] args){ 
    Scanner AD = new Scanner(System.in);
    double balance=AD.nextInt();
    double amount = AD.nextInt();
    boolean transmit = false;
    if(amount % 100 != 0){
        System.out.println("Multiples of hundred only approved");
        transmit= false;
    }
    else if (balance < amount){
        System.out.println("Insufficient Balance");
        transmit= false;
    }
    else {
        balance -= amount;
        System.out.println("Successfully Transferd");
         transmit = true;
    }
    if(transmit){
        System.out.println("Want to check bank balance.If Yes means press 1 and the charges are 3.70 rupees, If no means 2.");
        int checkBalance =AD.nextInt();
        if (checkBalance == 1){
            balance -= 3.70;
            System.out.println("Balace ="+balance);
        }
            else{
                System.out.println("Thank You");
            }
        }

        }
        
    }




