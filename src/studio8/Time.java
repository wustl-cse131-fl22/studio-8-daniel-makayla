package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean display24Format; 
	
	

	public Time(int hour, int minute, boolean displayFormat) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.display24Format = displayFormat;
	}
	



	@Override
	public String toString() {
		if(minute<10) {
			return "Time : " + hour + ":0" + minute + " display24Format= " + display24Format ;
		}
		return "Time : " + hour + ":" + minute + " display24Format= " + display24Format ;
	}




	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}




	public static void main(String[] args) {
		Time time = new Time(12, 8, false);
		Time time2 = new Time(12, 2, false);
		time2.equals(time);
		
		System.out.println(time2.equals(time));
 
    	
    }

}