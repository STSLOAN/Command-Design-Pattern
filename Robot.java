public class Robot {
    
    public Robot(String name) {
    	this.name = name;
    	System.out.println("Welcome, my name is "+name+", I'm a friendly robot");
    }

    public void pickup() {
    	System.out.println("Oh treasure, picking it up!");
    	
    	return;
    }

    public void jump() {
    	System.out.println("Oh no a hazard, I'm jumping over it.");
    	
    	return;
    }

    public void fire() {
    	System.out.println("Bad guys! Fire my blow torch at them.");
    	
    	return;
    }

    public void heal() {
    	System.out.println("Thanks for healing my wounds.");
        
    	return;
    }
}
