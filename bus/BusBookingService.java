package bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BusBookingService {

    String PassangerName;
    int BusNo;
    Date date;

    public BusBookingService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of Passenger's :");
        PassangerName = scanner.next();

        System.out.println("Enter Bus No : ");
        BusNo = scanner.nextInt();

        System.out.println("Enter Date dd-MM-yyyy");
        String DateFormat = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(DateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<BusBookingService> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.GetBusNo() == BusNo) {
                capacity = bus.GetCapacity();
            }
        }

        int booked = 0;
        for (BusBookingService book : bookings) {
            if (book.BusNo == BusNo && book.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
