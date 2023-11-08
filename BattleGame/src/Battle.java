import java.util.Random;

public class Battle {
	static Random random = new Random();
	public static void main(String[] args) {
		Character goodGuy = new Character ("Trebor", 100.0, 
											8.0, 0.7);
		goodGuy.setWeapon("Sword", 5);
		
		Character monster = new Character("Owl Bear", 100.0, 9.0, 0.4);
		monster.setWeapon("Claws", 8);	

		Weapon arrow = new RangedWeapon("Arrow", 3, 20);
		System.out.println(arrow);
		
//		double damage;
//
//		while (!monster.isDead()&&!goodGuy.isDead()) {
//			double turn = random.nextInt(1,3);
//			if(turn == 1) {
//				damage = goodGuy.doDamage();
//				monster.receiveDamage(damage);
//				System.out.println("The good guy did " + damage + 
//						            " damage to the monster");
//			}
//			else {
//				damage = monster.doDamage();
//				goodGuy.receiveDamage(damage);
//				System.out.println("The monster did " + damage + 
//			            " damage to the good guy");
//			}
//				
//		}
//		if(goodGuy.isDead()) {
//			System.out.println("The monster destroyed the good guy!");
//		}
//		else
//		{
//			System.out.println("The good guy destroyed the monster!");
//		}
	}
}
