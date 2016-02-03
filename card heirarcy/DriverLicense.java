public class DriverLicense extends Card
{
    private String DL;
    
    public DriverLicense(String n, String CardNumber)
    {
       super(n);
       
    }
    public boolean equals( Object other )
    {
        if( this.getClass() == other.getClass())
        {
            //since both objects are instances of IDCard it is ok to cast other to an IDCard refrence
            DriverLicense otherDriverLicense = (DriverLicense) other;

            boolean isEqual = super.equals( otherDriverLicense);
            return isEqual && DL.equals( otherDriverLicense.DL);
        }
        return false;
    }
    public String format()
    {
        String card = super.format();
        
        return card;
    }
}
