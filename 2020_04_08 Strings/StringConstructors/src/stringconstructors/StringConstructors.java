package stringconstructors;

public class StringConstructors 
{
   public static void main(String[] args)
   {
      char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
      String s = new String("hello");

      // use String constructors
      String s1 = new String(); // parameterless constructor - creates an empty string
      String s2 = new String(s); // copy constructor for String
      String s3 = new String(charArray); // creates a string from a character array
      String s4 = new String(charArray, 6, 3); // creates a string from a character array, starting at a specific index,
                                                // and will copy the number of characters specified after the index.

      System.out.printf(
         "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4); 
   } 
} // end class StringConstructors