public class employeedetails {
    public class EmployeeDetailsArray {
    public static void main(String[] args) {
        String[][] employees=new String[5][2];
        employees[0][0] = "10000";
        employees[0][1] = "Anand";
        employees[1][0] = "15000";
        employees[1][1] = "Bharat";
        employees[2][0] = "20000";
        employees[2][1] = "Ram";
        employees[3][0] = "25000";
        employees[3][1] = "Dinesh";
        employees[4][0] = "30000";
        employees[4][1] = "Suresh";
        System.out.println("Employee Details:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("salary: " + employees[i][0] + ", Name: " + employees[i][1]);
        }

    }
    
}
    
    }
    

