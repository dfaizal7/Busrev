package BusResrv;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1, true, 23));
        buses.add(new Bus(2, false, 14));
        buses.add(new Bus(3, true, 4));
        for (Bus bs : buses) {
            bs.dispbuses();
        }
        int UserOpt = 1;
        while (UserOpt == 1) {
            System.out.print("Enter 1 to book or 2 to exit");
            Scanner scan = new Scanner(System.in);
            UserOpt = scan.nextInt();
            if (UserOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(buses, bookings)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Thanks for your visit");
                }
            }
        }
    }
}
