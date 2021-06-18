package Program;

public class multiArray {

	public static void main(String[] args) {
//		int row = 1;
		int[][] array = {{1,2,3,4,5},{6,7,8,9}};
//		System.out.print(array[row].length);
		System.out.println("My Array:");
		arrayDisplay(array);

	}
	
	public static void arrayDisplay(int myArray[][]) {
		for(int row = 0; row<myArray.length;row++) {
			for(int column = 0; column<myArray[row].length;column++) {
				System.out.print(myArray[row][column]+ "\t");
			}
			System.out.println();
		}
	}

}
