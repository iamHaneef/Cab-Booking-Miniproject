package bus;

public class Bus {

    private int BusNo;
    private boolean Ac;
    private int capacity;

    public Bus(int No, boolean Ac, int capacity) {
        this.BusNo = No;
        this.Ac = Ac;
        this.capacity = capacity;
    }

    public int GetCapacity() {
        return capacity;
    }

    public void SetCapacity(int val) {
        capacity = val;
    }

    public int GetBusNo() {
        return BusNo;
    }

    public boolean isAc() {
        return Ac;
    }

    public void SetAc(boolean val) {
        Ac = val;
    }

    public void DisplayBusInfo() {
        System.out.println("BusNO : " + BusNo + " || AC status : " + Ac + " || Capacity : " + capacity);
    }
}
