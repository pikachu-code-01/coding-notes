import java.util.Scanner;
public class noOfvowels{
    public static void main(String[] args) {
      try(  Scanner AD = new Scanner(System.in);){
        String l = AD.nextLine();
        l=l.toUpperCase();
        int count = 0;
        for(int i = 1 ;i <l.length();i++){
            char si =l.charAt(i);
            if(si=='A'|| si == 'E'||si == 'I'|| si == 'O'||si == 'U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
}