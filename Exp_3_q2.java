import java.util.Scanner;
public class Book {
    static String[][] bookings = new String[10][4]; 
    static int bookingCount = 0;
    static int flag;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Book Conference Room");
            System.out.println("2. Check Availability");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                if (bookingCount >= 10) {
                    System.out.println("Booking limit reached.");
                    continue;
                }
                System.out.print("Enter date (YYYY-MM-DD): ");
                String date = scanner.nextLine();
                System.out.print("Enter start time (HH:MM): ");
                String startTime = scanner.nextLine();
                System.out.print("Enter end time (HH:MM): ");
                String endTime = scanner.nextLine();
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                for (int i = 0; i < bookingCount; i++) {
                    if (bookings[i][0]==date && bookings[i][1]==startTime && bookings[i][2]==endTime) {
                        flag=0;
                    }
                }
                flag=1;
                if (flag==1) {
                    bookings[bookingCount][0] = date;
                    bookings[bookingCount][1] = startTime;
                    bookings[bookingCount][2] = endTime;
                    bookings[bookingCount][3] = name;
                    bookingCount++;
                    System.out.println("Booking confirmed for " + name);
                } else {
                    System.out.println("Sorry, the room is already booked for this time slot.");
                }
            } else if (choice == 2) {
                System.out.print("Enter date (YYYY-MM-DD): ");
                String date = scanner.nextLine();
                System.out.print("Enter start time (HH:MM): ");
                String startTime = scanner.nextLine();
                System.out.print("Enter end time (HH:MM): ");
                String endTime = scanner.nextLine();
                if (flag==1) {
                    System.out.println("The room is available.");
                } else {
                    System.out.println("The room is already booked.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
