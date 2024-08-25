package BusResrv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    String name;
    int BUS_no;
    Date date;

    Booking(){//Constructor get automatically called when obj is of func is created
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        name = scan.next();
        System.out.println("enter bus no :");
        BUS_no = scan.nextInt();
        System.out.println("Enter Date in dd-mm-yyyy ");
        String dateInput = scan.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Bus> buses , ArrayList<Booking> bookings){
        int capacity = 0;
        for(Bus bs : buses){
            if(bs.getBusNO() == BUS_no)
                capacity = bs.getCapacity();
        }
        int booked = 0;
        for(Booking b : bookings) {
            if(b.BUS_no == BUS_no && b.date.equals(date)) {
                booked++;
            }
        }

        return booked<capacity?true:false;
    }
}
