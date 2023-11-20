import java.util.Scanner;

public class HeureBerlin {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		final int DIVIDER = 5;
		final int MAX_HOURS = 23;
		final int MIN_HOURS = 0;
		final int MAX_MINUTE = 59;
		final int MIN_MINUTE = 0;
		final char BIG_X = 'X';
		final char SMALL_X = 'x';
		final char BIG_O = '0';
		final char SMALL_O = 'o';
		
		int heures = 0;
		int minutes = 0;
		int bigX = 0;
		int smallX = 0;
		int bigO = 0;
		int smallO = 0;
		
		do {
			System.out.println("Entrez une heure");
			heures = sc1.nextInt();
		}
		while(heures < MIN_HOURS || heures > MAX_HOURS);
		
		do {
			System.out.println("Entrez des minutes");
			minutes = sc1.nextInt();
		}
		while(minutes < MIN_MINUTE || minutes > MAX_MINUTE);
		sc1.close();
		
		bigX = (heures - smallX) / DIVIDER;
		smallX = heures % DIVIDER;
		bigO = (minutes - smallO) / DIVIDER;
		smallO = minutes % DIVIDER;
		
		System.out.println("");
		for(int i = 0; i<bigX; i++) {
			System.out.print(BIG_X);		
		}
		System.out.println("");
		for(int i = 0; i<smallX; i++) {
			System.out.print(SMALL_X);		
		}
		System.out.println("");
		for(int i = 0; i<bigO; i++) {
			System.out.print(BIG_O);		
		}
		System.out.println("");
		for(int i = 0; i<smallO; i++) {
			System.out.print(SMALL_O);		
		}
		System.out.println("");
	}
}
