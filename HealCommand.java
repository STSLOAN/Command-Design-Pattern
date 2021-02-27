/**
 * main method of the class. implements the Command interface.
 */
public class HealCommand implements Command{
    private Robot robot;
    
    /**
     * The HealCommand sets up the robot
     * @param robot that is used
     */
    public HealCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Executes the method and calls heal() from Robot class
     */
    public void execute() {
        robot.heal();
    }
}
