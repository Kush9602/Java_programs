package Program;

public class TimePackage {
	public static void main(String[] args) {
		timeClasses timeObject = new timeClasses();
		
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toNormal());
		
		timeObject.setTime(24,23,22);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toNormal());
		
		
	}

}
