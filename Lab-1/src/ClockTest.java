
public class ClockTest {

	public static void main(String[] args) {

		Clock clock1 = new Clock();
		Clock clock2 = new Clock();
		
		clock1.setTime(9, 30, 30);
		
		System.out.println(clock1.getHours() + " hours " + clock1.getMinutes() + " minutes " + clock1.getSeconds() + " seconds ");
		clock1.printTime();
		clock2.makeCopy(clock1);
		clock1.incrementSeconds();
		System.out.println();
		clock1.printTime();
		System.out.println();
		clock1.incrementMinutes();
		clock1.printTime();
		clock1.incrementHours();
		System.out.println();
		clock1.printTime();
		System.out.println();
		System.out.println(clock1.equals(clock2));
		System.out.println(clock1.equals(clock2.getCopy()));
		System.out.println(clock1);
		System.out.println(clock2);
	}
	

}
