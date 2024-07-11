import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                    updateClient();
                    break;
                case 3:
                    deleteClient();
                    break;
                case 4:
                    addEmployee();
                    break;
                case 5:
                    updateEmployee();
                    break;
                case 6:
                    deleteEmployee();
                    break;
                case 7:
                    addPet();
                    break;
                case 8:
                    updatePet();
                    break;
                case 9:
                    deletePet();
                    break;
                case 10:
                    makeBooking();
                    break;
                case 11:
                    viewClients();
                    break;
                case 12:
                    viewBookings();
                    break;
                case 13:
                    viewCareProfile();
                    break;
                case 14:
                    updateFeedingInstructions();
                    break;
                case 15:
                    updateMedicationList();
                    break;
                case 16:
                    printCareInstructions();
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
        System.out.println("2. Update Client");
        System.out.println("3. Delete Client");
        System.out.println("4. Add Employee");
        System.out.println("5. Update Employee");
        System.out.println("6. Delete Employee");
        System.out.println("7. Add Pet");
        System.out.println("8. Update Pet");
        System.out.println("9. Delete Pet");
        System.out.println("10. Make Booking");
        System.out.println("11. View Clients");
        System.out.println("12. View Bookings");
        System.out.println("13. View Care Profile");
        System.out.println("14. Update Feeding Instructions");
        System.out.println("15. Update Medication List");
        System.out.println("16. Print Care Instructions");
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
        clients.add(new Client(name, phone, address, new ArrayList<Pet>(), new ArrayList<Booking>()));
        System.out.println("Client added successfully.");
    }

    private static void updateClient() {
        System.out.print("Enter client name to update: ");
        String name = scanner.nextLine();
        Client client = clients.stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
        if (client == null) {
            System.out.println("Client not found.");
            return;
        }
        System.out.print("Enter new phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter new address: ");
        String address = scanner.nextLine();
        client.setPhoneNumber(phone);
        client.setAddress(address);
        System.out.println("Client updated successfully.");
    }

    private static void deleteClient() {
        System.out.print("Enter client name to delete: ");
        String name = scanner.nextLine();
        clients.removeIf(c -> c.getName().equals(name));
        System.out.println("Client deleted successfully.");
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee role: ");
        String role = scanner.nextLine();
        System.out.print("Enter employee contact information: ");
        String contact = scanner.nextLine();
        employees.add(new Employee(name, role, contact, new ArrayList<Pet>()));
        System.out.println("Employee added successfully.");
    }

    private static void updateEmployee() {
        System.out.print("Enter employee name to update: ");
        String name = scanner.nextLine();
        Employee employee = employees.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }
        System.out.print("Enter new role: ");
        String role = scanner.nextLine();
        System.out.print("Enter new contact information: ");
        String contact = scanner.nextLine();
        employee.setRole(role);
        employee.setContactInfo(contact);
        System.out.println("Employee updated successfully.");
    }

    private static void deleteEmployee() {
        System.out.print("Enter employee name to delete: ");
        String name = scanner.nextLine();
        employees.removeIf(e -> e.getName().equals(name));
        System.out.println("Employee deleted successfully.");
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
        System.out.print("Enter pet condition: ");
        String condition = scanner.nextLine();

        Pet pet = new Pet(name, type, age, breed, condition, null);
        pets.add(pet);
        client.getPets().add(pet);
        System.out.println("Pet added successfully.");
    }

    private static void updatePet() {
        System.out.print("Enter pet name to update: ");
        String name = scanner.nextLine();
        Pet pet = pets.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }
        System.out.print("Enter new type: ");
        String type = scanner.nextLine();
        System.out.print("Enter new age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter new condition: ");
        String condition = scanner.nextLine();
        pet.setType(type);
        pet.setAge(age);
        pet.setBreed(breed);
        pet.setCondition(condition);
        System.out.println("Pet updated successfully.");
    }

    private static void deletePet() {
        System.out.print("Enter pet name to delete: ");
        String name = scanner.nextLine();
        pets.removeIf(p -> p.getName().equals(name));
        System.out.println("Pet deleted successfully.");
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
        Booking booking = new Booking(bookingDate, selectedPets, new ArrayList<Service>(), client);
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

    private static void viewCareProfile() {
        System.out.print("Enter pet name to view care profile: ");
        String petName = scanner.nextLine();
        Pet pet = pets.stream().filter(p -> p.getName().equals(petName)).findFirst().orElse(null);
        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }
        CareProfile careProfile = pet.getCareProfile();
        if (careProfile == null) {
            System.out.println("No care profile found for this pet.");
        } else {
            System.out.println(careProfile);
        }
    }

    private static void updateFeedingInstructions() {
        System.out.print("Enter pet name to update feeding instructions: ");
        String petName = scanner.nextLine();
        Pet pet = pets.stream().filter(p -> p.getName().equals(petName)).findFirst().orElse(null);
        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }
        if (pet.getCareProfile() == null) {
            pet.setCareProfile(new CareProfile(pet, null, new ArrayList<MedicationInstruction>()));
        }
        System.out.print("Enter new food type: ");
        String foodType = scanner.nextLine();
        System.out.print("Enter new feeding schedule: ");
        String feedingSchedule = scanner.nextLine();
        System.out.print("Enter new quantity: ");
        String quantity = scanner.nextLine();

        FeedingInstruction feedingInstruction = new FeedingInstruction(foodType, feedingSchedule, quantity);
        pet.getCareProfile().setFeedingInstruction(feedingInstruction);
        System.out.println("Feeding instructions updated successfully.");
    }

    private static void updateMedicationList() {
        System.out.print("Enter pet name to update medication list: ");
        String petName = scanner.nextLine();
        Pet pet = pets.stream().filter(p -> p.getName().equals(petName)).findFirst().orElse(null);
        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }
        if (pet.getCareProfile() == null) {
            pet.setCareProfile(new CareProfile(pet, null, new ArrayList<MedicationInstruction>()));
        }
        System.out.print("Enter medication name: ");
        String medicationName = scanner.nextLine();
        System.out.print("Enter medication description: ");
        String medicationDescription = scanner.nextLine();
        System.out.print("Enter dosage: ");
        String dosage = scanner.nextLine();
        System.out.print("Enter application method: ");
        String applicationMethod = scanner.nextLine();
        System.out.print("Enter schedule: ");
        String schedule = scanner.nextLine();

        Medication medication = new Medication(medicationName, medicationDescription);
        MedicationInstruction medicationInstruction = new MedicationInstruction(medication, dosage, applicationMethod, schedule);
        pet.getCareProfile().getMedicationInstructions().add(medicationInstruction);
        System.out.println("Medication list updated successfully.");
    }

    private static void printCareInstructions() {
        System.out.print("Enter pet name to print care instructions: ");
        String petName = scanner.nextLine();
        Pet pet = pets.stream().filter(p -> p.getName().equals(petName)).findFirst().orElse(null);
        if (pet == null) {
            System.out.println("Pet not found.");
            return;
        }
        CareProfile careProfile = pet.getCareProfile();
        if (careProfile == null) {
            System.out.println("No care profile found for this pet.");
        } else {
            System.out.println("Care Instructions for " + pet.getName() + ":");
            System.out.println(careProfile.getFeedingInstruction());
            System.out.println(careProfile.getMedicationInstructions());
        }
    }
}



