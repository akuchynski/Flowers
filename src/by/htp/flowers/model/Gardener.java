package by.htp.flowers.model;

public class Gardener {

	public String name;

	public Gardener(String name) {
		this.name = name;
	}

	public void informAboutFlowerState(Flower flower) {

		if (flower != null) {
			System.out.println("Flower title: " + flower.title);
			System.out.println("Flower color: " + flower.color);
			
			System.out.println("Bud size: " + flower.bud.size);
			System.out.println("Bud color: " + flower.bud.color);

			if (flower.bud.petal != null) {
				this.informAboutFlowerPetals(flower.bud.petal);
			}
		}
	}

	public void informAboutFlowerPetals(Petal[] petals) {
		System.out.println("Flower petals count: " + getPetalsCount(petals) + "\n");
		System.out.println("==========Info about petals==========" + "\n");

		for (Petal petal : petals) {
			if (petal != null) {
				System.out.println("petal size: " + petal.size);
				System.out.println("petal shape: " + petal.shape);
				System.out.println("petal color: " + petal.color);
				System.out.println("_____________________________________" + "\n");
			}
		}
	}
	
	public int getPetalsCount(Petal[] petals){
		int count = 0;
		for(Petal petal: petals){
			if(petal != null){
				count++;
			}
		}
		return count;
	}
}
