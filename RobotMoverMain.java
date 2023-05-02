// Import at top
import java.util.Scanner;
import java.awt.Point;
/** RobotMoverMain.java - Complete and test a RobotMover class
 * <p>Problem Statement: To modify the location and direction of the Robots
 * </p>
 * 
 * <p>Algorithm: <br />
 * 1. Import java.util.Scanner <br />
 * 2. Create class <br /
 * 3. Create two robot objects <br /
 * 4. Move the first object two units to the north and display current location <br /
 * 5. Turn it to the right and move it two units and then display location <br /
 * 6. Turn it left and move it two units and then display location <br /
 * 7. With the second robot object, turn it left two times and then move it once,
 *    displaying location <br /
 * 8. Turn it right and move it twice, displaying its location <br /
 * 9. Turn it right and move it once, displaying its location. <br /
 * 10.Compile and test. <br /
 *      
 * </p>
 *   @author Ethan Grant
 *   @version Module 10, Homework 1
 */

public class RobotMoverMain {
    public static void main(String[] args) 
    {
        {
            // Create robot object
            RobotMover robotOne = new RobotMover();
            RobotMover robotTwo = new RobotMover();

            // Move two units to the north
            robotOne.move();
            robotOne.move();
            System.out.print(robotOne.toString());

            // Turn right and move 2 units
            robotOne.turnRight();
            robotOne.move();
            robotOne.move();
            System.out.print(robotOne.toString());

            // Turn left and move 2 units
            robotOne.turnLeft();
            robotOne.move();
            robotOne.move();
            System.out.print(robotOne.toString());

            // Turn left twice and move once
            robotTwo.turnLeft();
            robotTwo.turnLeft();
            robotTwo.move();
            System.out.print(robotTwo.toString());

            // Turn right and move twice
            robotTwo.turnRight();
            robotTwo.move();
            robotTwo.move();
            System.out.print(robotTwo.toString());

            // turn right once more and move once
            robotTwo.turnRight();
            robotTwo.move();
            System.out.print(robotTwo.toString());

        }
    }
}