import java.util.Scanner;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Sphere: ");
		double radius_input = sc.nextDouble();


		// For Sphere with entere radius
		SurfaceArea sa = new SurfaceArea(radius_input);
		Volume vol = new Volume(radius_input);


		System.out.println("Surface Area of the Specified Sphere is: "+ sa.area());
		System.out.println("Volume of the Specified Sphere is: "+ vol.volume());

		// For Circle with specified radius
		System.out.println(" ");

		System.out.println("Enter the radius of the Circle: ");
		radius_input = sc.nextDouble();

		Area area = new Area(radius_input);
		Circumference cir = new Circumference(radius_input);


		System.out.println("Area of the Specified Circle is: "+ area.area());
		System.out.println("Circumference of the Specified Circle is: "+ cir.circcumference());




	}
}


