
public class RangedWeapon extends Weapon{
	private int range;

	

	public RangedWeapon(String name, double damage, int range ) {
		super(name, damage);
		this.range = range;
	}

	@Override
	public String toString() {
		return "RangedWeapon range:" + range  + super.toString();
	}

}
