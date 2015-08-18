
public class Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(divisors(25, 3));
	}
	
	public static int fibonacci(int x){
		if(x == 0 || x == 1){
	      return 1;
		}else{
		return fibonacci(x-1) + fibonacci(x-2);
		}
	}
	
	public static boolean divisors(int x, int y){
		return (x % y == 0);
	}

}
