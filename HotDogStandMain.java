
// Import at top
import java.util.Scanner;
import java.awt.Point;
/** HotDogStandMain.java - Hotdog sales
 * <p>Problem Statement: Track sales for a group of hot dog stands.
 * </p>
 * 
 * <p>Algorithm: <br />
 * 1. Import java.util.Scanner <br />
 * 2. Create class <br /
 * 3. Create 3 hot dog stand objects, with id's of (1,5),(2,10), and (3,15)  <br /
 * 4. Create 3 for loops with the amounts being sold of 23,24, and 25  <br /
 * 5. Have a System.out.println for each hot dog stand  <br /
 * 6. Have a System.out.println for the total hot dogs sold, referencing the getter  <br /
 * 7. Compile and test  <br /
 * </p>
 *   @author Ethan Grant
 *   @version Module 10, Homework 2
 */

public class HotDogStandMain {
    public static void main(String[] args) 
    {
        {
            // Create hot dog stands, first is the id, second is initial hotdogs sold
            HotDogStand standOne = new HotDogStand(1,5);
            HotDogStand standTwo = new HotDogStand(2,10);
            HotDogStand standThree = new HotDogStand(3,15);

            // Amount of hot dogs sold during the day
            for(int i = 0; i < 23; i++) {
                standOne.justSold();
            }
            for(int i = 0; i < 24; i++) {
                standTwo.justSold();
            }
            for(int i = 0; i < 25; i++) {
                standThree.justSold();
            }
            // Print out information 
            System.out.println(standOne);
            System.out.println(standTwo);
            System.out.println(standThree);
            System.out.println("Total hot dogs sold by all stands: " + HotDogStand.getTotalHotDogSold());
        }
    }
}