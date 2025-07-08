
import java.time.LocalDate;
import java.util.Scanner;


public class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your date of birth:");
        String dateOfBirth = inputScanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        int YearOfBirth = birthDate.getYear();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - YearOfBirth;
        System.out.println("Your age is: " + age + " years");
        inputScanner.close();

        
       

        
    }
}
    

