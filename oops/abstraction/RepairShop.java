package oops.abstraction;

public class RepairShop {
	
	public static void repaircar(Car car) {
		System.out.println("Car is Repaired");
	}

	public static void main(String[] args) {
		
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		repaircar(audi);
		repaircar(wagonR);

	}

}
