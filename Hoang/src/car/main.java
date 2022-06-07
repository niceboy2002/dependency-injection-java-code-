package car;
import car.Interfaces.*;
import car.components.engine.*;
import car.components.light.*;


public class main {
    public static void main(String[] args) {
    	ILight yellow = new yellow_light(); // tu interface goi class yellow_light 
    	ILight white = new white_light();   
    	IEngine gasoline = new gasoline_engine();
    	IEngine electric = new electric_engine();
    	
    	// tao lop new car
    	Car newcar = new Car(white,electric);
    	
    	//tao lop old car
    	Car oldcar = new Car(yellow,gasoline); // dung khung class car de tao  class oldcar   (nhu kieu tro choi lap rap xe)
    	
    	System.out.print(newcar.toString());
    	System.out.print(oldcar.toString());
    }

}

/*
 * da hinh composition (tach ra nhieu thuoc tinh  vd: white_light , yellow_light)
 * 
 * 
 * dependency injection
 * 
 *  */
 