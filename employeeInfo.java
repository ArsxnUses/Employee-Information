import java.util.Scanner;

public class employeeInfo{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        employee employee1 = new employee();
        employee employee2 = new employee();
        employee employee3 = new employee();

        System.out.println("Welcome to Employee Information");
        System.out.println("Please enter the name of employee #1");
        employee1.assignName(keyboard.nextLine());
        System.out.println("Please enter the ID of empoyee #1");
        employee1.assignIDNumber(keyboard.nextInt());
        keyboard.nextLine(); // Necessary for consuming the whitespace / next line so it works properly
        System.out.println("Please enter the department of employee #1");
        employee1.assignDepartment(keyboard.nextLine());
        System.out.println("Please enter the position of employee #1");
        employee1.assignPosition(keyboard.nextLine());
        System.out.println("Please enter the hiring date of employee #1 (mm/dd/yyyy)");
        employee1.assignDateHired(keyboard.nextLine());

        System.out.println("Welcome to Employee Information");
        System.out.println("Please enter the name of employee #2");
        employee2.assignName(keyboard.nextLine());
        System.out.println("Please enter the ID of employee #2");
        employee2.assignIDNumber(keyboard.nextInt());
        keyboard.nextLine(); // Necessary for consuming the whitespace / next line so it works properly
        System.out.println("Please enter the department of employee #2");
        employee2.assignDepartment(keyboard.nextLine());
        System.out.println("Please enter the position of employee #2");
        employee2.assignPosition(keyboard.nextLine());
        System.out.println("Please enter the hiring date of employee #2 (mm/dd/yyyy)");
        employee2.assignDateHired(keyboard.nextLine());

        System.out.println("Welcome to Employee Information");
        System.out.println("Please enter the name of employee #3");
        employee3.assignName(keyboard.nextLine());
        System.out.println("Please enter the ID of employee #3");
        employee3.assignIDNumber(keyboard.nextInt());
        keyboard.nextLine(); // Necessary for consuming the whitespace / next line so it works properly
        System.out.println("Please enter the department of employee #3");
        employee3.assignDepartment(keyboard.nextLine());
        System.out.println("Please enter the position of employee #3");
        employee3.assignPosition(keyboard.nextLine());
        System.out.println("Please enter the hiring date of employee #3 (mm/dd/yyyy)");
        employee3.assignDateHired(keyboard.nextLine());
        
        System.out.println("\nDisplaying information on Employee #1");
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee ID " + employee1.getIDNumber());
        System.out.println("Employee Department " + employee1.getDepartment());
        System.out.println("Employee Position " + employee1.getPosition());
        System.out.println("Employee Date of Hire (mm/dd/yyyy): " + employee1.getDateHired());

        System.out.println("\nDisplaying information on Employee #1");
        System.out.println("Employee Name: " + employee2.getName());
        System.out.println("Employee ID " + employee2.getIDNumber());
        System.out.println("Employee Department " + employee2.getDepartment());
        System.out.println("Employee Position " + employee2.getPosition());
        System.out.println("Employee Date of Hire (mm/dd/yyyy): " + employee2.getDateHired());

        System.out.println("\nDisplaying information on Employee #1");
        System.out.println("Employee Name: " + employee3.getName());
        System.out.println("Employee ID " + employee3.getIDNumber());
        System.out.println("Employee Department " + employee3.getDepartment());
        System.out.println("Employee Position " + employee3.getPosition());
        System.out.println("Employee Date of Hire (mm/dd/yyyy): " + employee3.getDateHired());
        
        keyboard.close();
    }
}