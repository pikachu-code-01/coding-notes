// import java.time.Month;
import java.util.Scanner;
public class month{
    public static void main(String[] args) {
        Scanner AD = new Scanner (System.in);
        int month = AD.nextInt();
        // System.out.println(Month.of(month));

        // Rule Switch is used 
        // Rule switch does not need the break statement because it terminate code after print
        // In rule switch need to skip means create a empty case which is want to skip

        switch(month) {
            case 1 ->  System.out.println("January");
            case 2 ->  System.out.println("February");
            case 3 ->  System.out.println("March");
            case 4 ->  System.out.println("April");
            case 5 ->  System.out.println("May");
            case 6 ->  System.out.println("June");
            case 7 ->  System.out.println("July");
            case 8 ->  System.out.println("August");
            case 9 ->  System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default->  System.out.println("Invalid Month");
        }
    }
}
// import java.time.Month;
//  if (month >= 1 && month <= 12) {
//             Month m = Month.of(month);
//             System.out.println(m.name());  // Prints month name in uppercase
//             System.out.println(m.getValue() + " = " + m);  // m.toString() returns capitalized name
//         } else {
//             System.out.println("Invalid month");
//         }


//         sc.close();
//     }
