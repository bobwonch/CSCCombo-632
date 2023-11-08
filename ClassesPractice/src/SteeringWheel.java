
public class SteeringWheel {
	private int radius;
	private String material;
	
	
	
	public SteeringWheel(int radius, String material) {
		super();
		this.radius = radius;
		this.material = material;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "SteeringWheel radius: " + radius + ", Material:" + material;
	}
	
	

	
}
