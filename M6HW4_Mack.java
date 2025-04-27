import java.util.Scanner;

class M6CW1_MackA { 

    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        System.out.println("Method Project");

        Scanner in = new Scanner(System.in);
        String keep_going = "yes";

        while (keep_going.equalsIgnoreCase("yes")) {
            displayMenu();
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = in.next();
            System.out.println();
        }

        System.out.println("Program has terminated!");
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("1) M6HW1");
        System.out.println("2) M6HW2");
        System.out.println("3) M6HW3");
        System.out.println("4) Exit");
        System.out.println();
        System.out.print("Selection: ");

        Scanner in = new Scanner(System.in);

        switch (in.nextInt()) {
            case 1:
                getM6HW1();
                displayMenu();
                break;
            case 2:
                getM6HW2();
                displayMenu();
                break;
            case 3:
                getM6HW3();
                displayMenu();
                break;
            case 4:
                System.out.println("Exiting the program");
                break;
            default:
                System.out.println("Unrecognized option.. Try again");
                displayMenu();
        }
    }

    public static void getM6HW1() {
        // M6HW1 - Gross Pay Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYou picked M6HW1");

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();

        double grossPay = rate * hours;

        System.out.println("\n--- Gross Pay Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Hourly Rate: $" + rate);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Gross Pay: $" + grossPay);
    }

    public static void getM6HW2() {
        // M6HW2 - Water Bill Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYou picked M6HW2");

        System.out.print("Enter homeowner's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter last month's meter reading (in gallons): ");
        int previous = scanner.nextInt();

        System.out.print("Enter this month's meter reading (in gallons): ");
        int current = scanner.nextInt();

        int usage = current - previous;
        double charge = 50.00 + (usage * 0.20);

        System.out.println("\n--- Water Bill Details ---");
        System.out.println("Homeowner: " + name);
        System.out.println("Previous Reading: " + previous);
        System.out.println("Current Reading: " + current);
        System.out.println("Water Usage: " + usage + " gallons");
        System.out.println("Total Charge: $" + charge);
    }

    public static void getM6HW3() {
        // M6HW3 - Commission Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nYou picked M6HW3");

        System.out.print("Enter salesperson's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of widgets sold: ");
        int sold = scanner.nextInt();

        System.out.print("Enter number of widgets returned: ");
        int returned = scanner.nextInt();

        int netWidgets = sold - returned;
        double commission = 500 + (netWidgets * 0.10); // base salary + commission

        System.out.println("\n--- Commission Details ---");
        System.out.println("Salesperson: " + name);
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.println("Total Pay (Base + Commission): $" + commission);
    }
}
