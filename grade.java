// import java.util.*;
import java.util.Scanner;
public class grade{
    public static void main(String[] args){
       try( Scanner AD = new Scanner(System.in);){
        int mark = AD.nextInt();
        if(mark >=90){
            System.out.println("Grade A");
        }
         else if(mark >= 75){
            System.out.println("Grade B");
        }
         else if(mark >=60){
            System.out.println("Grade C");
        }
         else if(mark < 60 ){
            System.out.println("Grade D");
        }
    }
}
}