import java.util.Arrays;

public class EmployeeDetailsArray {
    public static void main(String[] args) {
        String[][] employees=new String[5][2];
        employees[0][0] = "Rs.50000";
        employees[0][1] = "Anand";
        employees[1][0] = "Rs.66000";
        employees[1][1] = "Bharat";
        employees[2][0] = "Rs.70000";
        employees[2][1] = "Ram";
        employees[3][0] = "Rs.55000";
        employees[3][1] = "Dinesh";
        employees[4][0] = "Rs.83000";
        employees[4][1] = "Suresh";
        System.out.println("Employee Details:");
        for (String[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }

    }
    
}
