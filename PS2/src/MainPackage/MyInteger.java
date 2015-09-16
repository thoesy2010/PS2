package MainPackage;

public class MyInteger {

	//public static void main(String[] args) {

// }

	private int value;

	public int getValue() {
		return value;
	}

	public MyInteger(int value2) {
		this.value = value2;
	}


	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if ((value % 2 != 0)) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isOdd(int b) {
		if ((b % 2 == 1) || (b % 2 == -1)) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int c) {
		for (int i = 2; i < c; i++) {
			if (c % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger myInteger) {

		return myInteger.isEven(myInteger.getValue());
	}

	public static boolean isOdd(MyInteger myInteger) {

		return myInteger.isOdd(myInteger.getValue());
	}

	public static boolean isPrime(MyInteger myInteger) {

		return myInteger.isPrime(myInteger.getValue());
	}
	
	public boolean equals(int z){
		if(z == value){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger myInteger){
		return myInteger.equals(myInteger.getValue());
	}
	
	public static int parselnt(char[] c){
		return parselnt(new String(c));
	}
	
	public static int parselnt(String s){
		return Integer.parseInt(s);
	}
	
	
	
	
}
