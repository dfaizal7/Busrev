package BusResrv;

public class Bus {
    int BUS_no;
    boolean AC;
    int Capacity;

    public Bus(int no, boolean ac, int capacity) {
        this.BUS_no = no ;
        this.AC = ac;
        this.Capacity = capacity;
    }
    public void dispbuses(){
        System.out.println("BUS NO : " + BUS_no + " AC : "+ AC + " Capacity :" + Capacity);
    }
    public int getBusNO (){
        return BUS_no;
    }
    public int getCapacity(){
        return Capacity;
    }
}
