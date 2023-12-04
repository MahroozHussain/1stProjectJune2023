package variousConcepts;

public class W3Mahrooz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String firstName = "Mahrooz";
		String lastName = "Hussain";
		
		// System.out.println(firstName + "  " +lastName);
		
		System.out.println("Mahrooz is learning Java");
		
		System.out.println(firstName.concat(lastName));
		
		
		
		String txt = "Hello Everybody";
		System.out.println(txt.indexOf("e"));
		System.out.println(txt.indexOf("o"));
		System.out.println(txt.indexOf("v"));
		System.out.println(txt.indexOf("b"));
		
		Math.random();
		
		//int x = 10;
		//int y = 9;
		//System.out.println(x > y);
		
		
		int x = 50;
		int y = 40;
		
		if (x == y) {
			System.out.println("1");
	    }else if (x > y){
		System.out.println("2");
	    }else{
	    System.out.println("3");
	    }
		
		
		int day = 4;
		
		switch (day) {
		
		case 1:
			System.out.println("Saturday");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		  default:
			System.out.println("Weekend");  
		}
		
		
		
//		int i = 4;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while (i < 10);
		
		
//		for (int i = 0; i < 15; i++) {
//			System.out.println("Yes");
//		}
//		
		
//		String[] cars = {"Volvo", "BMW", "Ford"};
//		for (String i : cars) {
//			System.out.println(i);
//		}
		
		
		for (int i = 0; i < 10; i++) {
			if (i == 8) {
				continue;
			}
			System.out.println(i);
		}
		
	    //String[] cars = {"Volvo", "BMW", "Ford"};
		//Cars[1] = "Opel";
		//System.out.println(cars[1]);
	}
	
	
	//static void myMethod() {
		//System.out.println("I just got executed!");
	//}
	
	//public static void main(String[] args) {
		//myMethod();
	}


//try {
//	int[] myNumbers = {1, 2, 3};
//	System.out.println(myNumbers[10]);
//} catch (Exception e) {
//	System.out.println("Something went wrong.");
//}
}
