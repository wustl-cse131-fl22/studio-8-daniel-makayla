package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	
	public Date date;
	public Time time;
	

	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}
	


	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}



	@Override
	public String toString() {
		return "Appointment "+ date + ", "+ time;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
