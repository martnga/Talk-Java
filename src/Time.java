
public class Time {
	int hour, minute;
	double second;
	
	public Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}
	
	//example of overloading
	public Time(int hour, int minute, double second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
			 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t1 = new Time();
		t1.hour = 11;
		t1.minute = 8;
		t1.second = 3.14159;
		 printTime(t1);  //if you print objects directly you get object type and a unique hexadecimal code
		
		// another way to do the same thing
		Time t2 = new Time(11, 8, 3.14159);
		 printTime(t2);

	}
	
	public static void printTime(Time t){
		System.out.println(t.hour + ":" + t.minute + ":"  + t.second);
	}

}
