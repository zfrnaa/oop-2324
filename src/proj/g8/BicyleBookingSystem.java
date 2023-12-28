package proj.g8;

import java.util.ArrayList;
import java.util.Scanner;

public class BicyleBookingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        boolean isCustomer = confirmUser(scanner);

        while (isCustomer) {
            int choice = displayMenu(scanner);

            switch (choice) {
                case 1:
                    createObjects(scanner, customers, bicycles, bookings);
                    break;
                case 2:
                    displayObjectsMenu(scanner, customers, bicycles, bookings);
                    break;
                case 3:
                    searchCustomerByName(scanner, customers);
                    break;
                case 4:
                    updateCustomerInformation(scanner, customers);
                    break;
                case 5:
                    removeBicycle(scanner, bicycles);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.next().toLowerCase();
            isCustomer = continueChoice.equals("yes");
        }

        System.out.println("End of Program");
    }

    private static boolean confirmUser(Scanner scanner) {
        System.out.print("Are you a customer? (yes/no): ");
        String response = scanner.next().toLowerCase();
        return response.equals("yes");
    }

    private static int displayMenu(Scanner scanner) {
        System.out.println("************************************");
        System.out.println("Menu:");
        System.out.println("1. Create");
        System.out.println("2. Display Objects");
        System.out.println("3. Search for a Customer by Name");
        System.out.println("4. Update Customer Information");
        System.out.println("5. Remove Bicycle");
        System.out.println("************************************");

        System.out.print("Enter your choice (1-5): ");
        return scanner.nextInt();

    }

    private static void createObjects(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bicycle> bicycles, ArrayList<Booking> bookings) {
        System.out.println("Enter object details:");

        System.out.print("Customer Name: ");
        String customerName = scanner.next();
        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        Customer customer = new Customer(customerId, customerName);
        customers.add(customer);

        System.out.print("Bicycle Model: ");
        String bicycleModel = scanner.next();
        System.out.print("Bicycle ID: ");
        int bicycleId = scanner.nextInt();
        Bicycle bicycle = new Bicycle(bicycleId, bicycleModel);
        bicycles.add(bicycle);

        System.out.print("Booking ID: ");
        int bookingId = scanner.nextInt();
        System.out.print("Booking Date: ");
        String bookingDate = scanner.next();
        Booking booking = new Booking(bookingId, bookingDate, customer, bicycle);
        bookings.add(booking);

        System.out.println("Objects created successfully!");
    }

    private static void displayObjectsMenu(Scanner scanner, ArrayList<Customer> customers, ArrayList<Bicycle> bicycles, ArrayList<Booking> bookings) {
        System.out.println("Choose object to display:");
        System.out.println("1. Customers");
        System.out.println("2. Bicycles");
        System.out.println("3. Bookings");

        int displayChoice = scanner.nextInt();

        switch (displayChoice) {
            case 1:
                System.out.println("Customers:");
                for (Customer customer : customers) {
                    System.out.println(customer);
                }
                break;
            case 2:
                System.out.println("Bicycles:");
                for (Bicycle bicycle : bicycles) {
                    System.out.println(bicycle);
                }
                break;
            case 3:
                System.out.println("Bookings:");
                for (Booking booking : bookings) {
                    System.out.println(booking);
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    private static void searchCustomerByName(Scanner scanner, ArrayList<Customer> customers) {
        System.out.print("Enter customer name to search: ");
        String customerName = scanner.next();

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                System.out.println("Customer found:");
                System.out.println(customer);
                return;
            }
        }

        System.out.println("Customer not found.");
    }

    private static void updateCustomerInformation(Scanner scanner, ArrayList<Customer> customers) {
        System.out.print("Enter customer name to update: ");
        String customerName = scanner.next();

        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                System.out.print("Enter updated customer name: ");
                String updatedName = scanner.next();
                customer.setName(updatedName);
                System.out.println("Customer information updated successfully.");
                return;
            }
        }

        System.out.println("Customer not found.");
    }

    private static void removeBicycle(Scanner scanner, ArrayList<Bicycle> bicycles) {
        System.out.print("Enter bicycle model to remove: ");
        String bicycleModel = scanner.next();

        for (Bicycle bicycle : bicycles) {
            if (bicycle.getModel().equalsIgnoreCase(bicycleModel)) {
                bicycles.remove(bicycle);
                System.out.println("Bicycle removed successfully.");
                return;
            }
        }

        System.out.println("Bicycle not found.");
    }
}

class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}

class Bicycle {
    private int id;
    private String model;

    public Bicycle(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Bicycle [id=" + id + ", model=" + model + "] 🚲";
    }
}

class Booking {
    private int id;
    private String date;
    private Customer customer;
    private Bicycle bicycle;

    public Booking(int id, String date, Customer customer, Bicycle bicycle) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.bicycle = bicycle;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", date=" + date + ", customer=" + customer + ", bicycle=" + bicycle + "]";
    }
}
