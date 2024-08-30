package BusReservation;

public class BusDetail {

    private int BusNo;
    private boolean Ac;
    private int capacity;

    BusDetail(int No,boolean Ac,int capacity)
    {
        this.BusNo=No;
        this.Ac=Ac;
        this.capacity=capacity;
    }

    // set and get method for call and store
    public int GetCapacity()  //accessor
    {
        return capacity;
    }
    public void SetCapacity(int val)     //mutator
    {
        capacity=val;
    }

    public int GetBusNo()
    {
        return BusNo;
    }

    public boolean isAc()
    {
        return Ac;
    }
    public void SetAc(boolean val)
    {
        Ac=val;
    }

    public void DisplayBusInfo()
    {
        System.out.println("BusNO : "+ BusNo +"|| AC status : "+Ac+" ||Capacity : "+capacity);
    }


}
