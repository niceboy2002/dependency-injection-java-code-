package car.components.light;

import car.Interfaces.ILight;

public class white_light implements ILight {
	public String n = "\n white_light";
	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.print(n);
	}

	public String toString() {
		return n;
	}
}
