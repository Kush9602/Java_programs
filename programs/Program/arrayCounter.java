package Program;
import java.util.Random;

public class arrayCounter {
	public static void main(String[] args) {
		int freq[] = new int[7];
		
		Random dice = new Random();
		for(int i = 0; i <1000; i++) {
//			System.out.println(1 + dice.nextInt(6));
			++freq[1 + dice.nextInt(6)];
		}		
		
		System.out.println("Face\tFrequency");
		for(int face = 1;face < freq.length; face++ ) {
			System.out.println(face + "\t" + freq[face]);
		}
//		int diceDigits = dice.();
		
	}

}
