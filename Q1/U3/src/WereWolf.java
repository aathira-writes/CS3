
public class WereWolf extends Monster {
	private int speed;
	private int age;
	
	public WereWolf() {
		speed = 100;
		age = 18;
	}
	
	public WereWolf(String name) {
		super(name);
		speed = 100;
		age = 18;
	}
	
	public WereWolf(String name, int age) {
		super(name);
		this.age = age;
		speed = 100;
	}
	
	public WereWolf(String name, int age, int speed) {
		super(name);
		this.age = age;
		this.speed = 100;
	}
	 public String toString() {
		 return "my name is: " + super.toString() + "My speed is: " + speed + "\n My age is: " + age;
	 }
}
