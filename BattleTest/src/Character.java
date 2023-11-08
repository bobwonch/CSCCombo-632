public class Character {
	private String name;
	private int strength;
	private int health;
	private double speed;
	private Weapon weapon;
	
	public Character() {
		
	}
	public Character(String name, int strength, 
						int health, double speed) {
		super();
		this.name = name;
		this.strength = strength;
		this.health = health;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(String name, int damage) {
		this.weapon = new Weapon(name, damage);
	}
	public double doDamage() {
		double damage = speed * strength * weapon.getDamage();
		return damage;		
	}
	
	public void recieveDamage(double damage) {
		health -= damage;
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	@Override
	public String toString() {
		return "Character:" + name + "\nStrength:" 
				+ strength + "\nHealth=" + health 
				+ "\nSpeed=" + speed + "\n" + weapon + "\n";
	}	
}
