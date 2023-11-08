
public class Character {
	private String name;
	private double health;
	private double strength;
	private double speed;
	private Weapon weapon;
	
	public Character() {	
	}

	public Character(String name, double health, double strength, double speed) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void setWeapon(String name, double power) {
		this.weapon = new Weapon(name, power);
	}
	
	public Weapon getWeapon() {
		return weapon; 
	}

	public double doDamage() {
		double dmg = speed * strength * weapon.getDamage();
		return dmg;
	}
	
	public void receiveDamage(double damage) {
		health -= damage;
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	@Override
	public String toString() {
		return "Character: " + 
				name + "\nHealth:" +
				health + "\nStrength:" +
				strength + "\nSpeed:" + speed +
				"\n" + weapon +"\n";
	}	
}
