import java.util.Scanner;

class Person {
    String name;
    int age;
    String nationality;
    String address;
    String cnic;

    public Person() {
        System.out.println("I am a person");
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter nationality: ");
        nationality = scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();


        while (true) {
            System.out.print("Enter CNIC (exactly 13 digits): ");
            cnic = scanner.nextLine();
            if (cnic.length() == 13) {
                break;
            } else {
                System.out.println("Error: CNIC must be exactly 13 digits.");
            }
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Address: " + address);
        System.out.println("CNIC: " + cnic);
    }
}

class Employee extends Person {
    String companyName;
    String companyLocation;
    int yearsWorked;

    public Employee() {
        super();
        System.out.println("I am an Employee");
    }

    public void inputEmployeeDetails() {
        inputDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter company name: ");
        companyName = scanner.nextLine();
        System.out.print("Enter company location (city): ");
        companyLocation = scanner.nextLine();
        System.out.print("Enter number of years worked: ");
        yearsWorked = scanner.nextInt();
    }

    public void displayEmployeeDetails() {
        displayDetails();
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Years Worked: " + yearsWorked);
    }
}

class Manager extends Employee {
    String[] employeesUnderSupervision;

    public Manager() {
        super();
        System.out.println("I am a Manager");
        employeesUnderSupervision = new String[5];
    }

    public void inputEmployeeNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names of employees working under the manager's supervision:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            employeesUnderSupervision[i] = scanner.nextLine();
        }
    }

    public void displayEmployeesUnderSupervision() {
        System.out.println("Employees working under manager's supervision:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ": " + employeesUnderSupervision[i]);
        }
    }
}

public class Inheritance_101 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.inputEmployeeDetails();//it containts the function of the base class for
                                 // taking inffo of person and the empoyees
        m.inputEmployeeNames();
        m.displayEmployeeDetails();
        m.displayEmployeesUnderSupervision();
    }
}
