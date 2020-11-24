import java.util.Map;

class Test	{

	Test(int a)	{
		
	}
	
	
}



public class HashcodeAndEquals {
	
	static Test t1 = new Test(10);
	static Test t2 = new Test(10);
	
	public static void main(String[] args) {
		/*
		 * String s1 = "ABC"; String s2 = "ABC";
		 * 
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s1.equals(s2));
		 */
		
		System.out.println(t1.equals(t2));
		
		
	
		
	}

}
