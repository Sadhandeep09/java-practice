
public class ExecutionFlow {

	public ExecutionFlow() {
		System.out.println("0-Constructor");
	}

	public ExecutionFlow(int i) {
		System.out.println("1-Constructor");
	}

	{
		System.out.println("non-static block");
	}

	static {
		System.out.println("static block");
	}

	public static void staticMethod() {
		System.out.println("static method");
	}

	public void method() {
		System.out.println("non-static method");
	}

	public static void main(String[] args) {

		ExecutionFlow e = new ExecutionFlow();
		e.method();

	}

}
