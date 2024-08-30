package CabBookingProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CabBooking {

    String customers_Name;
    int cab_no;
    Date date;

    CabBooking()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Customer Name :");
        customers_Name=scanner.next();

        System.out.println("Enter Cab No :");
        cab_no=scanner.nextInt();

        System.out.println("Enter Booking Date dd-MM-yyyy");
        String BookDate=scanner.next();

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(BookDate);
        }catch (ParseException e)
        {
            e.printStackTrace();
        }
    }

    //availability check
    public boolean isAvailable(ArrayList<CabDetails> cabs,ArrayList<CabBooking> bookings)
    {
        int capacity=0;
        for(CabDetails cab:cabs)
        {
            if(cab.GetCabNo()==cab_no)
            {
                capacity= cab.GetCapacity();
            }
        }
        //booking check
        int booked=0;
        for(CabBooking book:bookings)
        {
            if(book.cab_no==cab_no && date.equals(date))
            {
                booked++;
            }
        }

        return booked<capacity ? true : false;
    }
}
