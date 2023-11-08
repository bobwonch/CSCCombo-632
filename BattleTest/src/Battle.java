import java.util.Random;

public class Battle {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		Character warrior = new Character("Warrior",15, 100, 0.5);
		Character monster = new Character("Owl Bear", 17, 110, 0.3);
		warrior.setWeapon("Sword", 7);
		monster.setWeapon("Claws", 8);
		
			
		while(!warrior.isDead()&&!monster.isDead()) {
			int turn = random.nextInt(1,3);
			if(turn == 1) {
				double dmg =warrior.doDamage();
				monster.recieveDamage(dmg);
				System.out.println("The Warrior did " + dmg + 
						" damage to the Owl Bear");
			}
			else{
				double dmg =monster.doDamage();
				warrior.recieveDamage(dmg);
				System.out.println("The Monster did " + dmg + 
						" damage to the Warrior");
			}	
			
		}
		if(monster.isDead()) {
			System.out.println("The Monster was defeated!");
		}
		else {
			System.out.println("The Warrior was defeated!");
		}
		
	}

}
