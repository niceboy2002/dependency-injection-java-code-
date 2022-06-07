package car;
import java.util.*;
import car.Interfaces.*;
import car.components.*;


public  class Car   {  // thuoc tinh
	  public ILight lights;
	  public IEngine engines;
	
	
	public Car(ILight lights, IEngine engines) {
		this.lights = lights;
		this.engines = engines;
	}



	public Car() {
		// TODO Auto-generated constructor stub
	}

	
     
	public ILight getLights() {
		return lights;
	}

	public void setLights(ILight lights) {
		this.lights = lights;
	}

	public IEngine getEngines() {
		return engines;
	}

	public void setEngines(IEngine engines) {
		this.engines = engines;
	}

	

	
	@Override
	public String toString() {
		return "Car [Light=" + this.lights + ", Engine=" + this.engines + "]";
	}

    // ta tuong tuong no la 1 cai khun xuong suon de tao ra hai class moi
      
}
