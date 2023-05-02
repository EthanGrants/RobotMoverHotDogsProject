// Import at top
import java.util.Scanner;
import java.awt.Point;
/**
 * RobotMover.java - Complete and test a RobotMover class
 * 
 * <p>Problem Statement: To modify the location and direction of the Robots
 * </p>
 * <p> Instance variables: <br />
 *     Point   Location  = Location the axis <br />
 *     Heading Direction = North, East, South, and West. Direction robot is facing. <br />
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 10, Homework 1
 */

public class RobotMover {
    // Instance variables
    private Point location;
    private Heading direction; 
    // Identify which direction robot is facing 
    /**
     * <p> No-argument constructor setting the cardinal directions for direction </p>
     * </p> Pre-condition - location and direction must be initalized variables 
     * </p> Post-condition - Sets heading to cardinal directions
     */
    public enum Heading {
        NORTH, EAST, SOUTH, WEST; }

    // Set robot facing north and current location to (0,0)
    /**
     * <p> Constructor for the instance variables </p>
     * <p> Pre-condition - direction and location must be initialized variables <br/>
     *  Post-condition - Set location to (0,0) and direction to NORTH </p>
     */
    public RobotMover() {
        location = new Point (0,0);
        direction = Heading.NORTH;
    }

    // Change the direction but not the location
    /**
     * <p> Turn left without changing location </p>
     * <p> Pre-condition - direction must be an initalized variables <br/>
     * Post-condition - Changes direction to the left </p>
     */
    public void turnLeft() {
        switch(direction) {
            case NORTH:
                direction = Heading.WEST;
                break;
            case EAST:
                direction = Heading.NORTH;
                break;
            case SOUTH:
                direction = Heading.EAST;
                break;
            case WEST:
                direction = Heading.SOUTH;
                break;
        }
    }

    /**
     * <p> Turn right without changing location </p>
     * <p> Pre-condition - direction must be an initalized variables <br/>
     *  Post-condition - Changes direction to the right </p>
     */
    public void turnRight() {
        switch(direction) {
            case NORTH:
                direction = Heading.EAST;
                break;
            case EAST:
                direction = Heading.SOUTH;
                break;
            case SOUTH:
                direction = Heading.WEST;
                break;
            case WEST:
                direction = Heading.NORTH;
                break;
        }
    }

    /**
     * <p> Move robot one unit </p>
     * </p> Pre-condition - direction and location must be initalized variables <br/> 
     * Post-condition - Changes location one unit </p>
     */
    public void move() {
        switch(direction) {
            case NORTH:
                location.translate(0,1);
                break;
            case EAST:
                location.translate(1,0);
                break;
            case SOUTH:
                location.translate(0,-1);
                break;
            case WEST:
                location.translate(-1,0);
                break;
        }
    }

    /**
     * <p> Getter for the coordinates of the location </p>
     * <p> Pre-condition - location must be an initalized variable <br/>
     * Post-condition - Return the location </p>
     * @return coordinates of the location
     */
    public Point getLocation() {
        return location;
    }

    /**
     * <p> Getter for the cardinal direction </p>
     * <p> Pre-condition - direction must be an initalized variable <br/>
     * Post-condition - Return the direction as a string </p>
     * @return cardinal direction
     */
    public String getDirection() {
        return direction.toString();
    }

    /**
     * <p> Produces a string of provided information </p>
     * <p> Pre-condition - location and direction must be initalized variables <br/>
     * Post-condition - Return the information in a string </p>
     * @returns a string of the coordinates and cardinal direction
     */
    public String toString() {
        return "Location: (" + location.x + "," + location.y + "), Direction: " + direction + "\n";
    }

    /**
     * <p> Compares all instance variables as a test for equality </p>
     * <p> Pre-condition - direction and location must be an initalized variable <br/>
     * Post-condition - Return true if location and direction are equal to their parts </p>
     * @param another For the location and direction 
     * @return true if the object has the same location and direction as the object
     *          passed as a parameter
     */
    public boolean equals(RobotMover another) {
        return getLocation().equals(another.getLocation()) && getDirection().equals(another.getDirection());
    }
} // end of Temperature class
