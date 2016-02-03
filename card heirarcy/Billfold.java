public class Billfold
{
    public String card1;
    public String card2;
    
    public Billfold()
    {
       
    }
    
    public void addCard(String newCard)
    {
        if( card1 == null)
        {
            card1 = newCard;
        }
        else if (card2 == null)
        {
            card2 = newCard;
        }
        else
        {
            
        }
    }
    
    public String formatCards()
    {
        String cards = card1 + card2;
        
        return cards;
    }
}
