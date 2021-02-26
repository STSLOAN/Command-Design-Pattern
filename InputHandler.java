import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Robot robot) {
        commands =  new HashMap<>();

        commands.put("pickup", new PickupCommand(robot));
        commands.put("jump", new JumpCommand(robot));
        commands.put("fire", new FireCommand(robot));
        commands.put("heal", new HealCommand(robot));
    }

    public void inputEntered(String data) {
        commands.get(data).execute();
    }
}