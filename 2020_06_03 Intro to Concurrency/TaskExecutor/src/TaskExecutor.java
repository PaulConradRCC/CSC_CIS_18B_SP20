// Fig. 23.4: TaskExecutor.java
// Using an ExecutorService to execute Runnables.
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.ArrayList;

public class TaskExecutor
{
   public static void main(String[] args)
   {
      // create and name each runnable
      ArrayList<PrintTask> tasks = new ArrayList<PrintTask>();
      
      for(int i=0;i<1000;i++)
      {
          tasks.add(new PrintTask("task #"+i));
      }
       
      System.out.println("Starting Executor");

      // create ExecutorService to manage threads
      ExecutorService executorService = Executors.newCachedThreadPool();

      // start the 1000 PrintTasks
      for(int i=0;i<1000;i++) executorService.execute(tasks.get(i)); // start tasks	

      // shut down ExecutorService--it decides when to shut down threads
      executorService.shutdown(); 

      System.out.printf("Tasks started, main ends.%n%n");
   } 
} // end class TaskExecutor


/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/