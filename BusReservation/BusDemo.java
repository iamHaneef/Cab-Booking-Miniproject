package BusReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args)
    {
        ArrayList<BusDetail> buses=new ArrayList<BusDetail>();
        ArrayList<BusBooking> bookings=new ArrayList<BusBooking>();

        buses.add(new BusDetail(1,true,2));
        buses.add(new BusDetail(2,false,16));
        buses.add(new BusDetail(3,true,47));
        buses.add(new BusDetail(4,false,50));

        for(BusDetail b:buses)
        {
            b.DisplayBusInfo();
        }

        Scanner scanner=new Scanner(System.in);
        int userInput=1;
        while(userInput==1)
        {
            System.out.println("Enter 1 for Booking : 2 for exit ");
            userInput=scanner.nextInt();
            if(userInput==1)
            {
                BusBooking booking=new BusBooking(); // create new object

                if(booking.isAvailable(bookings,buses))
                {
                    bookings.add(booking);
                    System.out.println("Booked Successfully");
                }
                else{
                    System.out.println("Sorry Booking is cancelled. choose another Bus / Date");
                }
            }


        }
    }
}
