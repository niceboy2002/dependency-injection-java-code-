package car.components.engine;
import car.Interfaces.IEngine;

public class electric_engine implements IEngine {
	public String n = "\n electric_engine";
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.print(n);
	}

	public String toString() {
		return n;
	}
}
