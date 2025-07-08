
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        int DateOfYear = inputScanner.nextInt();
        int currentYear=LocalDate.now().getYear();
        int age=currentYear-DateOfYear;
        System.out.println(age);
       


        
    }
}
    
    

