package start_end_index_lastindex;

public class Start_end_index_lastIndex {
    public static void main(String[] args) {
      
      String[] strings = {"started", "starting", "ended", "ending"};

      // test method startsWith
      for (String string : strings)
      {
         if (string.startsWith("st"))
            System.out.printf("\"%s\" starts with \"st\"\n", string);
      } 

      System.out.println();

      // test method startsWith starting from position 2 of string
      for (String string : strings)
      {
         if (string.startsWith("art", 2)) 
            System.out.printf(
               "\"%s\" starts with \"art\" at position 2\n", string);
      } 

      System.out.println();

      // test method endsWith
      for (String string : strings)
      {
         if (string.endsWith("ed"))
            System.out.printf("\"%s\" ends with \"ed\"\n", string);
      }
      
    //////////////////////////////////////////////////////////////////////
    
    //                          11111111112222222222333333333
    //                012345678901234567890123456789012345678
    String letters = "abcdefghijklmabcdefghijklmnopqrstuvwxyz";

      // test indexOf to locate a character in a string
      System.out.printf(
         "'c' is located at index %d\n", letters.indexOf('c'));
      System.out.printf(
         "'a' is located at index %d\n", letters.indexOf('a', 1));
      System.out.printf(
         "'$' is located at index %d\n\n", letters.indexOf('$'));

      // test lastIndexOf to find a character in a string
      System.out.printf("Last 'c' is located at index %d\n",
         letters.lastIndexOf('c'));
      System.out.printf("Last 'a' is located at index %d\n",
         letters.lastIndexOf('a', 25));
      System.out.printf("Last '$' is located at index %d\n\n",
         letters.lastIndexOf('$'));

      // test indexOf to locate a substring in a string
      System.out.printf("\"def\" is located at index %d\n", 
         letters.indexOf("def"));
      System.out.printf("\"def\" is located at index %d\n",
         letters.indexOf("def", 7));
      System.out.printf("\"hello\" is located at index %d\n\n",
         letters.indexOf("hello"));

      // test lastIndexOf to find a substring in a string
      System.out.printf("Last \"def\" is located at index %d\n",
         letters.lastIndexOf("def"));
      System.out.printf("Last \"def\" is located at index %d\n",
         letters.lastIndexOf("def", 25));
      System.out.printf("Last \"hello\" is located at index %d\n",
         letters.lastIndexOf("hello"));
    }
}
