import java.time.LocalDate;
import java.util.*;

public class Application {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Client> clients = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static List<Service> services = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addClient();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    addPet();
                    break;
                case 4:
                    makeBooking();
                    break;
                case 5:
                    viewClients();
                    break;
                case 6:
                    viewBookings();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nYYC Pet Resort Management System");
        System.out.println("1. Add Client");
        System.out.println("2. Add Employee");
        System.out.println("3. Add Pet");
        System.out.println("4. Make Booking");
        System.out.println("5. View Clients");
        System.out.println("6. View Bookings");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addClient() {
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter client address: ");
        String address = scanner.nextLine();
        clients.add(new Client(name, phone, address, new ArrayList<>(), new ArrayList<>()));
        System.out.println("Client added successfully.");
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee role: ");
        String role = scanner.nextLine();
        System.out.print("Enter employee contact information: ");
        String contact = scanner.nextLine();
        employees.add(new Employee(name, role, contact, new ArrayList<>(), null, new ArrayList<>()));
        System.out.println("Employee added successfully.");
    }

    private static void addPet() {
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();
        Client client = clients.stream().filter(c -> c.getName().equals(clientName)).findFirst().orElse(null);
        if (client == null) {
            System.out.println("Client not found.");
            return;
        }

        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet type: ");
        String type = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter pet breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter pet status: ");
        String status = scanner.nextLine();

        Pet pet = new Pet(name, type, age, breed, status, null, null, new ArrayList<>(), new ArrayList<>());
        pets.add(pet);
        client.getPets().add(pet);
        System.out.println("Pet added successfully.");
    }

    private static void makeBooking() {
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();
        Client client = clients.stream().filter(c -> c.getName().equals(clientName)).findFirst().orElse(null);
        if (client == null) {
            System.out.println("Client not found.");
            return;
        }
        
        System.out.print("Enter booking date (yyyy-mm-dd): ");
        String dateStr = scanner.nextLine();
        LocalDate bookingDate = LocalDate.parse(dateStr);
        
        // Select pets for booking
        List<Pet> selectedPets = selectPetsForBooking(client);

        // Create booking
        Booking booking = new Booking(bookingDate, selectedPets, new ArrayList<>(), client);
        bookings.add(booking);
        client.getBookings().add(booking);
        System.out.println("Booking made successfully.");
    }

    private static List<Pet> selectPetsForBooking(Client client) {
        List<Pet> availablePets = client.getPets();
        List<Pet> selectedPets = new ArrayList<>();
        
        System.out.println("Select pets for booking (Enter pet names, separated by comma): ");
        String petNames = scanner.nextLine();
        String[] names = petNames.split(",");
        
        for (String name : names) {
            for (Pet pet : availablePets) {
                if (pet.getName().trim().equalsIgnoreCase(name.trim())) {
                    selectedPets.add(pet);
                    break;
                }
            }
        }
        
        return selectedPets;
    }

    private static void viewClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
    }

    private static void viewBookings() {
        for (Booking booking : bookings) {
            System.out.println("\nBooking Date: " + booking.getBookingDate());
            System.out.println("Client: " + booking.getClient().getName());
            System.out.println("Pets:");
            for (Pet pet : booking.getPets()) {
                System.out.println("  - " + pet.getName());
            }
            System.out.println("Services: " + booking.getServices());
            System.out.println();
        }
    }
}
