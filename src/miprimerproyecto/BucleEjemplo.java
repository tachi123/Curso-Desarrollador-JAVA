package miprimerproyecto;

public class BucleEjemplo {

	public static void main(String[] args) {
		
		int unNum = 10;
		
		System.out.println("Ciclo WHILE: Disminuye");
		
		while(unNum > 0) {
			System.out.println(unNum);
			unNum--; // unNum = unNum - 1;
		}
	
		for(unNum = 10; unNum > 0; unNum--) {
			System.out.println(unNum);
		}
		
		System.out.println("Ciclo FOR: Aumentar");
		
		for(int otroNum = 0; otroNum < 10; otroNum++) {
			System.out.println(otroNum);
		}
		
		
	}

}
