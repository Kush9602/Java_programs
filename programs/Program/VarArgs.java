// its a variable of argument method used to perform operation in 'n' numbers of variable. Here we used to calculate the average of 'n' numbers.
package Program;

public class VarArgs {

	public static void main(String[] args) {
		int array[] = {12,23,34,564,232,1};
		System.out.println("Average: "+ average(array));

	}
	
	static double average(int...numbers) {

		double total = 0;
//		iterate over the array "numbers" and calculate the total.
		for(int iter:numbers) 
			total += iter;
		
		return total/numbers.length;
	}

}
