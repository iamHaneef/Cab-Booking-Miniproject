package bus;

import java.util.ArrayList;
import java.util.Scanner;

public class BusMain {

    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<BusBookingService> bookings = new ArrayList<BusBookingService>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 16));
        buses.add(new Bus(3, true, 47));
        buses.add(new Bus(4, false, 50));

        for (Bus b : buses) {
            b.DisplayBusInfo();
        }

        Scanner scanner = new Scanner(System.in);
        int userInput = 1;
        while (userInput == 1) {
            System.out.println("Enter 1 for Booking : 2 for exit ");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                BusBookingService booking = new BusBookingService();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Booked Successfully");
                } else {
                    System.out.println("Sorry Booking is cancelled. choose another Bus / Date");
                }
            }
        }
    }
}
