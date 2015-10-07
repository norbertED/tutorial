package aioi.de;

public class Hello {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		hello.sayHello("norbert");

	}

	public String sayHello(String name) {
		
		return "Hello " + name.trim();
	}
	
}
