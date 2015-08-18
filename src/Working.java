
public class Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(fibonacci(5));
	}
	
	public static int fibonacci(int x){
		if(x == 0 || x == 1){
	      return 1;
		}else{
		return fibonacci(x-1) + fibonacci(x-2);
		}
	}

}
