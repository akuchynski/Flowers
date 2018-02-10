package by.htp.flowers.model;

public class Flower {

	public String title;
	public String color;
	public Petal[] petal;
	
	Bud bud = new Bud(10, "white");
	
	public Flower() {

	}
	

	public Flower(String title, String color) {
		this.title = title;
		this.color = color;
	}
	
	
	public void bloom(int petalCount) {
		

		bud.size = 20;
		
		if (petalCount > 0) {
			petal = new Petal[petalCount];

			for (int i = 0; i < petalCount; i++) {
				petal[i] = new Petal(4, "oval", "white");
			}
			System.out.println();
		}
	}

	public void litleFade() {
		
		this.color = "brown";
		for (int i = 0; i < this.petal.length; i += 3) {
			this.petal[i] = null;
		}
		
		bud.color = this.color;
		
	}

	public void totalFade() {
		
		this.color = "black";
		for (int i = 0; i < this.petal.length; i++) {
			if (this.petal[i] != null)
				this.petal[i] = null;
		}
		
		bud.color = this.color;
		bud.size = 15;
		
	}

}
