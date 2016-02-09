import java.util.Collections;
import java.util.ArrayList;

public class Person implements Comparable<Person>
{
   private String name;
   private double value;
   
   public String getName() 
   {
      return name;
   }
   
   public int compareTo( Person otherPerson)
   {
       if (this.value < otherPerson.value )
       {
           return -1;
       }
       else if ( this.value > otherPerson.value)
       {
           return 1;
       }
       else
       {
           return 0;
       }
   }
}
