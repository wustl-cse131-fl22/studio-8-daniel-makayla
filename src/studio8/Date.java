package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year; 
	private boolean holiday;
	/**
	 * Constructor
	 * @param month
	 * @param day 
	 * @param year
	 * @param holiday
	 */
	public Date(int month, int day, int year, boolean holiday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	
	@Override
	public String toString() {
		return "Date: " + month + "/" + day + "/" + year + " holiday=" + holiday;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}


	public static void main(String[] args) {
		Date day = new Date(12, 1, 2004, false);
		Date day2 = new Date(11,11, 2003, false);
		Date day3 = new Date(10,11, 2004, false);
		Date day4 = new Date(11,17, 2021, false);
		Date day5 = new Date(11,17, 2022, false);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(day2);
		list.add(day2);
		list.add(day3);
		list.add(day4);
		list.add(day);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(day2);
		set.add(day2);
		
		System.out.println(set);

    }

}
