package Program;

public class timeClasses {
	
	private int hours = 0;
	private int minute = 0;
	private int seconds = 0;
	
	public void setTime(int hours, int minute, int seconds) {
		this.hours = ((hours>0 && hours < 24)?hours:00);
		this.minute = ((minute>0 && minute < 60)?minute:00);
		this.seconds =((seconds>0 && seconds < 24)?seconds:00);
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d",hours, minute, seconds);
	}
	
	public String toNormal() {
		return String.format("%d:%02d:%02d %s",((hours==0||hours==12)?12:hours%12), minute, seconds, ((hours<12)?"AM":"PM"));
	}
	

}
