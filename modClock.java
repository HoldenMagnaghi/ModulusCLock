import java.util.Scanner;


public class modClock
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int startHour;
		int startMinutes;
		int futureHour;
		int futureMinutes;
		int totalHour = 12;
		int totalMinutes = 60;
		int finalHour;
		int finalMinutes;

		System.out.println("Enter starting hour- ");
		startHour = input.nextInt();

		System.out.println("Enter starting minutes- ");
		startMinutes = input.nextInt();

		System.out.println("Enter future hours- ");
		futureHour = input.nextInt();

		System.out.println("Enter future Minutes- ");
		futureMinutes = input.nextInt();

	  	finalHour = startHour + futureHour;
	  	finalMinutes = startMinutes + futureMinutes;
	  	finalHour += finalMinutes / 60;
	  	finalMinutes = finalMinutes % 60;

	  	// Convert zero o'clock to twelve o'clock
		if (futureHour == 0){
		  futureHour = 12;
}
	  	System.out.println("Futre time = "+finalHour+":"+finalMinutes+" O'Clock");


	}
}



