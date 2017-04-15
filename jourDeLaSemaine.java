import java.util.Random;
import java.util.Scanner;

class MonthCAI{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] monthString = {
            "janvier", "fevrier", "mars", "avril", "mai", "juin",
            "juillet", "aout", "septembre", "octobre", "novembre", "decembre"
        };
        
        int month = rand.nextInt(12);
        System.out.println("Question:" + monthString[month]);

        while(true){
            System.out.print("Which month?:");
            int m = stdIn.nextInt();

            if(m == month + 1) break;
            System.out.println("Incorrect.");
        }
        System.out.println("Correct!");
    }
}
