/*
 * Yama 
 * 09/10/2019
 * Counting the numbers that user choose.
 */

package creatingforloops;
import java.util.Scanner;
/**
 *
 * @author ayyam8774
 */
public class CreatingForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        
        System.out.println("--- Boring Counting Program ---");
        System.out.println("");
        
        
        System.out.println("Prease enter your choice.");
        System.out.println("");
        System.out.println("1 → Counting from 0 to 10 by 1");
        System.out.println("2 → Counting from 100 to 0 by 10");
        System.out.println("3 → Counting from 50 to 500 by 50");
        System.out.println("4 → Counting from 6000 to 1000 by 1000");
        System.out.println("Prease enter your choice.");
        
        choice = keyedInput.nextInt();
        
        System.out.println("");
        System.out.println("-------------------------------------");
        
        if ( choice == 1 )
            {
                System.out.println("You have chosen to count from 0 to 10 by 1:");
                for ( int i = 0; i <= 10; i = i + 1 )
                    {
                        System.out.println(i);
                    }
            }
        
        if ( choice == 2 )
            {
                System.out.println("You have chosen to count from 100 to 0 by 10:");
                for ( int i = 100; i >= 0; i = i - 10 )
                    {
                        System.out.println(i);
                    }
            }
        
        if ( choice == 3 )
            {
                System.out.println("You have chosen to count from 50 to 500 by 50:");
                for ( int i = 50; i <= 500; i = i + 50 )
                    {
                        System.out.println(i);
                    }
            }
        
        if ( choice == 4 )
            {
                System.out.println("You have chosen to count from 6000 to 1000 by 1000:");
                for ( int i = 6000; i >= 1000; i = i - 1000 )
                    {
                        System.out.println(i);
                    }
                    
            }
    }
    
}
