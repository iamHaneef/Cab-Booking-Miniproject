package CabBookingProject;

public class CabDetails {

    private int Cab_No;
    private boolean AC;
    private int Cap_capaciy;

    CabDetails(int No,boolean Ac,int capacity)
    {
        //initilization
        this.Cab_No=No;
        this.AC=Ac;
        this.Cap_capaciy=capacity;
    }
    // get and set method for value getting

    public int GetCabNo()
    {
        return Cab_No;
    }
    public boolean isAC()
    {
        return AC;
    }
    public void SetAc(boolean val)
    {
        AC=val;
    }
    public int GetCapacity()
    {
        return Cap_capaciy;
    }
    public void SetCapacity(int val)
    {
        Cap_capaciy=val;
    }

    public void CabDetailsInfo()
    {
        System.out.println(" ");
        System.out.println("Cab No : "+Cab_No+" || Ac Status : "+AC+ " || Capacity :"+Cap_capaciy );
    }

}
