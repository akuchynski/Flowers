package by.htp.flowers.model;

public class Flower {

	public String title;
	public String color;
//	public Petal[] petal; ---> in Bud.java
	
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
			bud.petal = new Petal[petalCount];

			for (int i = 0; i < petalCount; i++) {
				bud.petal[i] = new Petal(4, "oval", "white");
			}
			System.out.println();
		}
	}

	public void litleFade() {
		
		this.color = "brown";
		for (int i = 0; i < this.bud.petal.length; i += 3) {
			this.bud.petal[i] = null;
		}
		
		bud.color = this.color;
		
	}

	public void totalFade() {
		
		this.color = "black";
		for (int i = 0; i < this.bud.petal.length; i++) {
			if (this.bud.petal[i] != null)
				this.bud.petal[i] = null;
		}
		
		bud.color = this.color;
		bud.size = 15;
		
	}

}
