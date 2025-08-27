// import java.time.Month;
import java.util.Scanner;
public class month{
    public static void main(String[] args) {
        Scanner AD = new Scanner (System.in);
        int month = AD.nextInt();
        // System.out.println(Month.of(month));

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");
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
