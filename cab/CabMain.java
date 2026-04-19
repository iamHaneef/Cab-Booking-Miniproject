package cab;

import java.util.ArrayList;
import java.util.Scanner;

public class CabMain {

    public static void main(String[] args) {

        ArrayList<Cab> cabs = new ArrayList<Cab>();
        ArrayList<CabBookingService> bookings = new ArrayList<CabBookingService>();

        cabs.add(new Cab(1, true, 4));
        cabs.add(new Cab(2, false, 21));
        cabs.add(new Cab(3, true, 5));

        for (Cab c : cabs) {
            c.CabDetailsInfo();
        }

        int userInput = 1;
        while (userInput == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Press 1 for Cab Booking or Press 2 for Exit");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                CabBookingService booking = new CabBookingService();
                if (booking.isAvailable(cabs, bookings)) {
                    bookings.add(booking);
                    System.out.println("Your Cab is Booked. Enjoy Journey !");
                } else {
                    System.out.println("Sorry, Booking is Cancelled. Choose another cab or Date");
                }
            }
        }
    }
}
