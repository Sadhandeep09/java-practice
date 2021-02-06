
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello-World");
		System.out.println("world is beautiful");

		String s1 = "Hello";
		s1 = s1 + null;
		System.out.println(s1);

		String x = "XYZ";
		String y = "ABC";
		x = y;
		String z = y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

		System.out.println(x + y);

	}

}
