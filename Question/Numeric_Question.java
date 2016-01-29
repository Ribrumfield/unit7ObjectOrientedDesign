
public class Numeric_Question extends Question
{
    private double answer;
    
    public void setAnswer( double correctResponse)
    {
        this.answer = correctResponse;        
    }
    
    public boolean checkAnswer( String response )
    {
        double reponseAsDouble = Double.parseDouble( response );
        return Math.abs(reponseAsDouble - answer ) <= 0.01;
    }   
}
