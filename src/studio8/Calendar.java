package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Calendar {
	
	private LinkedList appointnment;
	


	public Calendar(LinkedList appointnment) {
		super();
		this.appointnment = appointnment;
	}



	@Override
	public int hashCode() {
		return Objects.hash(appointnment);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(appointnment, other.appointnment);
	}



	@Override
	public String toString() {
		return "Calendar [appointnment=" + appointnment + "]";
	}

	public void add(Appointment object ) {
		(this.appointnment).add(object);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time = new Time(12, 8, false);
		Date day2 = new Date(12, 1, 2004, false);
		Appointment day = new Appointment (day2, time);
		LinkedList<Appointment> calender = new LinkedList<Appointment>();
		calender.add(day);
		
		System.out.println(calender);
		

	}

}
