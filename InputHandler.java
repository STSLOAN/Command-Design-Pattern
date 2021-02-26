import java.util.HashMap;

/**
 * main method of the class. stores the private HashMap 'commands'
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * InputHandler method. stores strings in the hashmap 
     * along with their respective commands.
     * @param robot the robot that will be doing the commands
     */
    public InputHandler(Robot robot) {
        commands =  new HashMap<>();

        commands.put("pickup", new PickupCommand(robot));
        commands.put("jump", new JumpCommand(robot));
        commands.put("fire", new FireCommand(robot));
        commands.put("heal", new HealCommand(robot));
    }

    /**
     * inputEntered method. executes a command based on the string entered
     * @param data the string used to determine which command gets called
     */
    public void inputEntered(String data) {
        commands.get(data).execute();
    }
}