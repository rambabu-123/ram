package ram;

public interface VehicleInterface {
	void color();
	void milage();
}
abstract class Car implements VehicleInterface{
	
	
}
abstract class Bike implements VehicleInterface{
	
}
class Maruthi extends Car{	


@Override
public void color() {
	System.out.println("red");
	
}

@Override
public void milage() {
	System.out.println("35");
	
}
}
class Mahindra extends Car{
	public void color() {
		System.out.println("white");	
	}


	public void milage() {
		System.out.println("30");		
	}
}
class Ns160 extends Bike{


	public void color() {
		System.out.println("black");	
	}

	
	public void milage() {
		System.out.println("50");	
	}
}
class KTM extends Bike{


	public void color() {
		System.out.println("orange");	
	}

	
	public void milage() {
		System.out.println("45");		
	}	

public class VehicalInterfaceTest {

	public static void main(String[] args) {
		Maruthi c = new Maruthi();
		c.color();
		c.milage();
	}

}
}
