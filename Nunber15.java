
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
        
        for (int a = 0; a < 5; a++) {
            System.out.print("Enter number " + (a + 1) + ": ");
            arr[a] = scanner.nextInt();
        }
        System.out.println("Numbers greater than 50:");
        boolean found = false;  
        
        for (int num : arr) {
            if (num > 50) {
                System.out.print(num + " ");
                found = true; 
            }
        }
        if (!found) {
            System.out.println("None of the numbers are greater than 50.");
        } else {
            System.out.println(); 
        }
        scanner.close();
    }
   }
