package car.components.light;
import car.Interfaces.ILight;
public class yellow_light implements ILight{
    public String n = "\n yellow_light";
	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.print(n);
	}
    
	public String toString() {
		return n;
	}
}
