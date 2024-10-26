
public class Main {

	public static void main(String[] args) {
	
		int age = 65;
		//verifico se lìeta è maggiore o uguale a 65
		if(age >=65) {
			System.out.println("Sei un pensionato");
		//se fallilsco il primo if verifico se l'eta è maggiore o uguale a 18
		}else if(age >=18) {
			System.out.println("Sei maggiorenne");
		//se fallisco entrambi gli if di sopra allora stampo Sei minorenne
		}else {
			System.out.println("Sei minorenne");
		}
		
	}

}
