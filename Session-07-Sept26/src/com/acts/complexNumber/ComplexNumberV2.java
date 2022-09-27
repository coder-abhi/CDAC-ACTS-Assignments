package classwork;

public class ComplexNumberV2 {
	private int real;
	private int img;
	private static int count = 0;
	
	public ComplexNumberV2() {
		System.out.println("Inside Parameterless Constructor");
		real = 0;
		img = 0;
		count++;
	}
	public ComplexNumberV2 (int a, int b) { 
		System.out.println("Inside Parameterized Constructor");
		real = a;
		img = b;
		count++;
	}
	
	public int getReal() {
		System.out.println("Inside getter");
		return real;
	}
	public void setReal(int real2) {
		System.out.println("Inside Setter");
		real = real2;
	}
	public int getImg() {
		System.out.println("Inside getter");
		return img;
	}
	public void setImg(int img2) {
		System.out.println("Inside Setter");
		img = img2;
	}
	public static ComplexNumberV2 add(ComplexNumberV2 a, ComplexNumberV2 b) {
		ComplexNumberV2 y = new ComplexNumberV2();
		y.setReal(a.getReal()+b.getReal());
		y.setImg(a.getImg()+b.getImg());
		return y;

	}
	public String getString() {
		return ("Complex Number= "+ real + " + "  + img+ "i");
	}
	 public static int getCount() {
		 return count;
		 
	 }

}
