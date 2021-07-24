package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {

//		try {
//			
//			int arr[] = new int[5];
//			
//			System.out.println(arr[6]);
//			
//		int a = 5;
//		int b = 0;
//		int c = a/b;
//		
//		System.out.println(c);
//
//	} catch (ArithmeticException e) {
//		System.out.println(e.getMessage() + " occured, Please check your code again!!");
//	} catch (ArrayIndexOutOfBoundsException f) {
//		System.out.println(f.getMessage() + " index should be betwwen 0 to n");
//	}catch (IllegalArgumentException e) {
//		System.out.println(" Hey");
//	}finally {
//		System.out.println("Sorry for the Inconvinience");
//	}
//		System.out.println("Very important code");
//		
		fun1();
	}
	
	static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		
		System.out.println(c);\
		
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException(" danger was coming");
	}

}
