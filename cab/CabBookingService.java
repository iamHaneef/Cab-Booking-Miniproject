package cab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CabBookingService {

    String customers_Name;
    int cab_no;
    Date date;

    public CabBookingService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name :");
        customers_Name = scanner.next();

        System.out.println("Enter Cab No :");
        cab_no = scanner.nextInt();

        System.out.println("Enter Booking Date dd-MM-yyyy");
        String BookDate = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(BookDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Cab> cabs, ArrayList<CabBookingService> bookings) {
        int capacity = 0;
        for (Cab cab : cabs) {
            if (cab.GetCabNo() == cab_no) {
                capacity = cab.GetCapacity();
            }
        }
        
        int booked = 0;
        for (CabBookingService book : bookings) {
            if (book.cab_no == cab_no && book.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
