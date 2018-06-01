package animalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> Animals = new ArrayList<Animal>();
		Animal Bess = new Cow();
		Animal Kess = new Cow();
		Animal Mickey = new Pig();
		Animal Timmy = new Chicken();
		Animal Tony = new Chicken();
		Animal Tim = new Turkey();
		Animals.add(Bess);
		Animals.add(Kess);
		Animals.add(Timmy);
		Animals.add(Tony);
		Animals.add(Mickey);
		Animals.add(Tim);
		for(int i = 0; i < Animals.size(); i++) {
			Animals.get(i).makeNoise();
		}
	}
}
