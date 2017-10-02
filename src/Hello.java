
public class Hello {

	public static main(String[] args) 
	{
		Hello hello = new Hello();
		hello.methodA();
		hello.methodB();
		hello.methodC();
	}

	public void methodA(void ) {
		System.out.println("Hello A!");
	}

	public void methodB() {
		System.out.println("Keith is awesome. Carmen is less awesome.");
	}


	public void methodC() { 
		for(int i = 0; i < 10; i++){
			System.out.println("today is monday :(");
		}
	}

}
