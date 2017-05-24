package toiletseat;

import java.util.Scanner;

/**
 * Toilet seat problem at the office.
 */

public class ToiletSeat {
	public static void main(String[] args) {
		//Take in string with scanner.
		Scanner in = new Scanner(System.in);
		String data= in.next();
		in.close();

		char[] array = data.toCharArray();

		//All seats up.
		seatsUp(array);
		
		//All seats down.
		seatsDown(array);
		
		//Any seat change.
		seatChanges(array);
	}

	private static void seatsUp(char[] array) {
		int counter = 0;	

		if((array[0] == 'D' && array[1] == 'U') || (array[0] == 'D' && array[1] == 'D')){
			counter++;
		}
		
		if(array[0] == 'U' && array[1] == 'D'){
			counter +=2;
		}
		
		for(int i = 2; i < array.length; i++){
			if(array[i] == 'D'){
				counter += 2;
			}
		}

		System.out.println(counter);
	}

	private static void seatsDown(char[] array) {
		int counter = 0;	

		if((array[0] == 'U' && array[1] == 'D') || (array[0] == 'U' && array[1] == 'U')){
			counter++;
		}
		
		if(array[0] == 'D' && array[1] == 'U'){
			counter += 2;
		}
		
		for(int i = 2; i < (array.length); i++){
			if(array[i] == 'U'){
				counter += 2;
			}
		}

		System.out.println(counter);
	}

	private static void seatChanges(char[] array) {
		int counter = 0;
		
		for(int i = 1; i < array.length; i++){
			if(array[i-1] != array[i]){
				counter++;
			}
		}
		
		System.out.println(counter);
	}
}
