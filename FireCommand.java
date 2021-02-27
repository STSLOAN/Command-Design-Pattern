/**
 * main method of the class. implements the Command interface.
 */
public class FireCommand implements Command{
    private Robot robot;
    
    /**
     * The FireCommand sets up the robot
     * @param robot that is used
     */
    public FireCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Executes the method and calls fire() from Robot class
     */
    public void execute() {
        robot.fire();
    }
}
