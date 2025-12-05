
/**
 * Write a description of class Nunber15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Nunber15
{
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] arr = new int[5];
       for (int i = 0; i < 5; i++) {
           System.out.print("Enter number " + (i + 1) + "; ");
           arr[i] = scanner.nextInt();
        }
        System.out.println("Numbers greater than 50: ");
        for (int num : arr) {
            if (num > 50) {
                System.out.print(num + " ");
                
            }
        }
        scanner.close();
       }
   }

   
   
   