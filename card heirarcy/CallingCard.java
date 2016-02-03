public class CallingCard extends Card
{
    private String CC;

    public CallingCard(String n, String CardNumber)
    {  
        super(n);
        
    }
    public boolean equals( Object other )
    {
        if( this.getClass() == other.getClass())
        {
            //since both objects are instances of IDCard it is ok to cast other to an IDCard refrence
            CallingCard otherCallingCard = (CallingCard) other;

            boolean isEqual = super.equals( otherCallingCard);
            return isEqual && CC.equals( otherCallingCard.CC);
        }
        return false;
    }
    public String format()
    {
        String card = super.format();
        
        return card;
    }
}
