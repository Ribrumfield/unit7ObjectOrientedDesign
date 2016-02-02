public class Billfold
{
    public Card card1;
    public Card card2;
    
    public Billfold()
    {
       
    }
    
    public void addCard(Card Card)
    {
        if( card1 == null)
        {
            card1 = Card;
        }
        else if (card2 == null)
        {
            card2 = Card;
        }
        else
        {
            
        }
    }
    
    public String formatCards()
    {
        Card cards = card1  card2;
        
        return cards;
    }
}
