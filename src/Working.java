
public class Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str = new String("Martin Nganga");
//      System.out.println(multiadd(2, 3));
//      System.out.println(Str.substring(1, 5));
//		for(int i = Str.length() - 1; i >= 0; i--){
//			System.out.print(Str.charAt(i));
			int i = 1;
			while (i <= 6) {
			System.out.print(2*i + " ");
			i = i + 1;
			}
			System.out.println("");
			
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
	
	// xe −x + 1 − e −x
	
	public static double multiadd(double x, double e){
		double result = x * Math.exp(-x) + Math.pow((1 - Math.exp(-x)), 0.5);
		return result;
	}

}
