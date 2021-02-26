/**
 * main method of the class. implements the Command interface.
 */
public class PickupCommand implements Command{
    private Robot robot;

    /**
     * PickupCommand method. sets the robot.
     * @param robot robot that is used.
     */
    public PickupCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * execute method. calls a method in the robot class.
     */
    public void execute() {
        robot.pickup();
    }
}
