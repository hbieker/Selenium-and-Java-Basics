public class Parent {

	public static void main(String[] args) {
		
		//print line
		System.out.println("I'm learning Java");
		
		//add numbers
		int a=2;
		int b=3;
		int sum = a+b;
		System.out.println(sum);
		
		//+ sign concatenates
		System.out.println("sum is" + " " + sum);
		
		//5 pages in a web app. Assume header on each page is always the same
		//Make sure header is displayed as expected on each page
		//Same code is used 5 times and is repetitive. This is where we 
		//can create an object from a class. 
		
		
		//Creating an object called m from the Methods class
		Methods m = new Methods();
		
		//Calling a method from that object
		//object.methodname
		
		//This will read the ValidateHeader method from the Methods class
		//m.ValidateHeader();
		
		//This will return the return string value from the Methods class
	    System.out.println(m.ValidateHeader());
	}

}
