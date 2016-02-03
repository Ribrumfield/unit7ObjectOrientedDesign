
public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }

    public boolean equals( Object other )
    {
        if( this.getClass() == other.getClass())
        {
            //since both objects are instances of IDCard it is ok to cast other to an IDCard refrence
            IDCard otherIDCard = (IDCard) other;

            boolean isEqual = super.equals( otherIDCard);
            return isEqual && idNumber.equals( otherIDCard.idNumber);
        }
        return false;
    }

    public String format()
    {
        String card = super.format();

        return card;
    }
}
