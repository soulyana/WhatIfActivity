import java.util.Scanner;

public class SalesReport {
    public static void main(String args[]) {
        int customerNum;
        String name, taxCode;
        double amount, tax = 0.00, total, subtotal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter customer number: ");
        customerNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter customer name: ");
        name = scan.nextLine();

        System.out.println("Enter sales amount: ");
        amount = scan.nextDouble();

        System.out.println("Enter tax code: ");
        taxCode = scan.next();

        switch(taxCode.toUpperCase()) {
            case "NRM": tax = 0.06;
                        break;
            case "NPF": tax = 0.00;
                        break;
            case "BIZ": tax = 0.45;
                        break;

        }

        subtotal = amount * tax;
        total = amount + subtotal;

        System.out.println("Customer ID: " + customerNum);
        System.out.println("Customer Name: " + name);
        System.out.println("Sales Amount: $" + amount);
        System.out.println("Tax Code: " + taxCode.toUpperCase());
        System.out.println("Total Amount Due: $" + total);
    }

}
