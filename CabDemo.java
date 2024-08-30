package CabBookingProject;

import java.util.ArrayList;
import java.util.Scanner;

public class CabDemo {

    public static void main(String[] args)
    {

        ArrayList<CabDetails> cabs=new ArrayList<CabDetails>();
        ArrayList<CabBooking> bookings=new ArrayList<CabBooking>();

        cabs.add(new CabDetails(1,true,4));
        cabs.add(new CabDetails(2,false,21));
        cabs.add(new CabDetails(3,true,5));

        for(CabDetails c:cabs)
        {
            c.CabDetailsInfo();
        }

        int userInput=1;
        while(userInput==1)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Press 1 for Cab Booking or Press 2 for Exit");
            userInput=scanner.nextInt();
            if(userInput==1){
                CabBooking booking=new CabBooking();  // new method for cab booking
                if(booking.isAvailable(cabs,bookings))
                {
                    bookings.add(booking);
                    System.out.println("Your Cab is Booked. Enjoy Journey !");
                }
                else {
                    System.out.println("Sorry, Booking is Cancelled. Choose another cab or Date");
                }
            }

        }
    }
}
