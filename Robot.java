/**
 * main method of the class.
 */
public class Robot {
	
    /**
     * The Robot method sets up and outputs name of the robot
     * @param name that is used
     */
    public Robot(String name) {
    	this.name = name;
    	System.out.println("Welcome, my name is "+name+", I'm a friendly robot");
    }

    /**
     * The pickup void method outputs the text indicating that the robot is using pick up
     */
    public void pickup() {
    	System.out.println("Oh treasure, picking it up!");
    	return;
    }

    /**
     * The jump void method outputs the text indicating that the robot is using jump
     */
    public void jump() {
    	System.out.println("Oh no a hazard, I'm jumping over it.");
    	return;
    }

    /**
     * The fire void method outputs the text indicating that the robot is using fire
     */
    public void fire() {
    	System.out.println("Bad guys! Fire my blow torch at them.");
    	return;
    }

    /**
     * The heal void method outputs the text indicating that the robot is using heal
     */
    public void heal() {
    	System.out.println("Thanks for healing my wounds.");
    	return;
    }
}
