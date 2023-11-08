
public class Weapon {
	private String name;
	private double damage;
	
	public Weapon(String name, double damage) {
		super();
		this.name = name;
		this.damage = damage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Weapon:" + name + "\nDamage:" + damage + "\n";
	}
	
	

}
