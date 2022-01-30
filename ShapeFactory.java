package ram;
public class ShapeFactory{
public interface Car {
	   void draw( );
	}
public class Audi implements Car {


	   public void draw() {
	      System.out.println("Inside Audi::draw() method.");
	   }
	}
public class BMW implements Car {

	  
	   public void draw() {
	      System.out.println("Inside BMW::draw() method.");
	   }
	}
public class Benz implements Car {

	   
	   public void draw() {
	      System.out.println("Inside benz::draw() method.");
	   }
	}
public Car getCar(String CarType){
    if(CarType == null){
       return null;
    }		
    if(CarType.equalsIgnoreCase("BMW")){
       return new BMW();
       
    } else if(CarType.equalsIgnoreCase("Audi")){
       return new Audi();
       
    } else if(CarType.equalsIgnoreCase("Benz")){
       return new Benz();
    }
    
    return null;
 }
public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

   
    Car shape1 = shapeFactory.getCar("BMW");

    shape1.draw();

    
    Car shape2 = shapeFactory.getCar("Audi");

   
    shape2.draw();

    
    Car shape3 = shapeFactory.getCar("Benz");

  
    shape3.draw();
 }
}
