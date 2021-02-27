/**
 * main method of the class. implements the Command interface.
 */
public class JumpCommand implements Command{
    private Robot robot;

    /**
     * The JumpCommand sets up the robot
     * @param robot that is used
     */
    public JumpCommand(Robot robot) {
        this.robot = robot;
    }
    
    /**
     * Executes the method and calls jump() from Robot class
     */
    public void execute() {
        robot.jump();
    }
}
