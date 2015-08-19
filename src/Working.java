
public class Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit = new String("banana");
//      System.out.println(multiadd(2, 3));
//      System.out.println(Str.substring(1, 5));
//		for(int i = Str.length() - 1; i >= 0; i--){
//		System.out.print(Str.charAt(i));
//      Printtable(5);
		int index = 0;
		int count = 0;
		while (index < fruit.length()) {
		if (fruit.charAt(index) == 'a' ) {
		count++;
		}
		index++;
		}
		System.out.println(count);
		}
	
	public static boolean divisors(int x, int y){
		return (x % y == 0);
	}
	
	
	public static int fibonacci(int x){
		if(x == 0 || x == 1){
	      return 1;
		}else{
		return fibonacci(x-1) + fibonacci(x-2);
		}
	}
	
	public static void Multitable(int x){
		int i = 1;
		while (i <= 5) {
		System.out.print(x * i + " ");
		i = i + 1;
		}
		System.out.println("");
		
	}
	
	public static void Printtable(int x){
		int i = 1;
		while (i <= x) {
		Multitable(i);
		i = i + 1;
		}
		
	}
	
	
	
	// xe −x + 1 − e −x
	
	public static double multiadd(double x, double e){
		double result = x * Math.exp(-x) + Math.pow((1 - Math.exp(-x)), 0.5);
		return result;
	}

}
