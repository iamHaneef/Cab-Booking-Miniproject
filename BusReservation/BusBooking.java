package BusReservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BusBooking {

    String PassangerName;
    int BusNo;
    Date date;

    BusBooking()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name of Passenger's :");
        PassangerName=scanner.next();

        System.out.println("Enter Bus No : ");
        BusNo=scanner.nextInt();

        System.out.println("Enter Date dd-MM-yyyy");
        String DateFormat= scanner.next();

        //create new object for String to Date
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=dateFormat.parse(DateFormat);
        }catch (ParseException e)
        {
            e.printStackTrace();
        }


    }

    public boolean isAvailable(ArrayList<BusBooking> bookings,ArrayList<BusDetail> buses)
    {
        int capacity=0;
        for(BusDetail bus:buses)
        {
            if(bus.GetBusNo() == BusNo)
            {
                capacity=bus.GetCapacity();
            }
        }

        int booked=0;
        for(BusBooking book:bookings)
        {
            if(book.BusNo==BusNo && date.equals(date))
            {
                booked++;
            }
        }

        return booked<capacity ? true : false;
    }


}
