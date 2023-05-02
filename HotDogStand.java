
// Import at top
import java.util.Scanner;
import java.awt.Point;
/**
 * HotDogStand.java - Hotdog Sales
 * 
 * <p>Problem Statement: Track sales for a group of hot dog stands.
 * </p>
 * <p> Instance variables: <br />
 *     Int hotdogId  = Id of the hot dog stands <br />
 *     Int hotdogSold = Amount of hot dogs sold <br />
 *     static int totalHotdogSold = Total amount of hog solds sold <br />
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 10, Homework 2
 */

public class HotDogStand {
    // Instance variables
    private int hotdogId;
    private int hotdogSold; 
    private static int totalHotdogSold = 0;

    /**
     * <p> Constructor for the instance variables </p>
     * <p>Pre-condition - hotdogSold and totalHotdogSold must be initialized <br/>
     *  Post-condition: HotDogStand is initializd with given variables </p>
     */
    public HotDogStand(int newHotdogId, int newHotdogSold) {
        hotdogId = newHotdogId;
        hotdogSold = newHotdogSold;
        totalHotdogSold += newHotdogSold;
    }

    /**
     * <p> Increment hot dog sales </p>
     * <p> Pre-condition - hotdogSold and totalHotdogSold must be initialized <br/>
     * Post-condition - Increments the amounts </p>
     */
    public void justSold() {
        hotdogSold++;
        totalHotdogSold++;
    }

    /**
     * <p> Getter for the amount of hot dogs sold </p>
     * <p> Pre-condition - hotdogSold must be an initalized variable <br/>
     * Post-condition - Return the amount sold </p>
     * @return amount of hot dogs sold
     */
    public int getHotDogSold() {
        return hotdogSold;
    }

    /**
     * <p> Compares all instance variables as a test for equality </p>
     * <p> Pre-condition - hotdogId and hotdogSold must be an initalized variable <br/>
     * Post-condition - Return true if hotdogID and hotdogSold are equal to their parts </p>
     * @param another For the hotdogId and hotdogSold 
     * @return true if the object has the same hotdogId and hotdogSold as the object
     *          passed as a parameter
     */
    public boolean equals(HotDogStand another) {
        return ((hotdogId == another.hotdogId) && hotdogSold == another.hotdogSold);
    }

    /**
     * Produces a string of provided information
     * <p> Pre-condition - hotdogId and hotdogSold must be initalized variables <br/>
     * Post-condition - Return the information in a string </p>
     * @returns a string of the Id and hot dogs sold
     */
    public String toString() {
        return "Hot dog stand ID: " + hotdogId + ", Hot dogs sold: " + hotdogSold;
    }

    /**
     * <p> Getter for the amount of hot dogs sold total </p>
     * <p> Pre-condition - totalHotdogSold must be an initalized variable <br/>
     * Post-condition - Return the total amount sold </p>
     * @return amount of total hot dogs sold
     */
    public static int getTotalHotDogSold() {
        return totalHotdogSold;
    }
} // end of Temperature class
