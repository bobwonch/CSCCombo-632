import java.util.ArrayList;
import java.util.List;

public class Farm {

	public static void main(String[] args) {
		
		List<Animal> anim = new ArrayList<>();
		Animal[] animals = new Animal[5];
		
		animals[0] = new Cat(1,2,"Grey");
		anim.add(new Cat(1,2,"Grey"));
		animals[1] = new Cat(2,1,"Orange");
		anim.add(new Cat(2,1,"Orange"));
		animals[2] = new Horse(6,12,37);
		anim.add(new Horse(6,12,37));
		animals[3] = new Dog(1,2,false);
		anim.add(new Dog(1,2,false));
		animals[4] = new Horse(10,12,41);
		anim.add(new Horse(10,12,41));
		
		for(int i =0; i< animals.length; i++) {
			System.out.println(animals[i].getHeigth());
			if(animals[i] instanceof Cat) {
				System.out.println(((Cat)animals[i]).getColor());
			}
			if(animals[i] instanceof Horse) {
				System.out.println(((Horse)animals[i]).getSpeed());
			}
			if(animals[i] instanceof Dog) {
				System.out.println(((Dog)animals[i]).isDrool());
			}
		}
		
		for(Animal ani : animals) {
			System.out.println(ani.makeNoise());
		}

	}

}
