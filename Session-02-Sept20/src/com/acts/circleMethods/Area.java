
public class Area {
double radius;

	public Area(double radius){
		this.radius = radius;
	}



	double area(){
		// Usig PI from math lib
		return Math.PI *(Math.pow(radius, 2));
	}


}
