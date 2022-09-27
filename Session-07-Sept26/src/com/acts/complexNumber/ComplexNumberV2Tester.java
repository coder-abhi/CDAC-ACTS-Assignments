package classwork;

public class ComplexNumberV2Tester {

	public static void main(String[] args) {
		ComplexNumberV2 c1 = new ComplexNumberV2(10,20);
				System.out.println("1st Complex Number");
		System.out.println(c1.getString());
		ComplexNumberV2 c2 = new ComplexNumberV2(20,30);
				System.out.println("2st Complex Number");
		System.out.println(c2.getString());
		ComplexNumberV2 result = new ComplexNumberV2();
		result = ComplexNumberV2.add(c1, c2);
		System.out.println("Resultant Complex Number :");
		System.out.println(result.getString());
		System.out.println("Total no of objects created: "+ ComplexNumberV2.getCount());


	}

}
