package org.com.model;

public class SelectOption {

	private String year;
	private String month;

	public SelectOption() {

	}

	public SelectOption(String year, String month) {

		this.year = year;
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "SelectOption [year=" + year + ", month=" + month + "]";
	}
}
