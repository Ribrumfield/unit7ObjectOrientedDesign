import java.util.Scanner;

public class FillInQuestion extends Question
{
   //override the setText method to extract the answer from the question text
   /*
    * For example, given
    * "The inventor of java
    */
   public void setText( String questionText )
   {
       Scanner parser = new Scanner( questionText );
       parser.useDelimiter("_");
       String question = parser.next();
       String answer = parser.next();
       question += "______" + parser.next();
       
       // we have to explicily state we want to inkove the superclass' setText method
       super.setText( question );
       // we dont have to specify anything before setAnswer, but we could use super if we wanted
       this.setAnswer( answer );
   }
}
