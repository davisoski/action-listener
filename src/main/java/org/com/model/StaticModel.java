package org.com.model;

public class StaticModel {

	private int value1;
	private int value2;
	private int value3;
	private int total;
	
	public StaticModel() {
		
	}



	public int getValue1() {
		return value1;
	}



	public void setValue1(int value1) {
		this.value1 = value1;
	}



	public int getValue2() {
		return value2;
	}



	public void setValue2(int value2) {
		this.value2 = value2;
	}



	public int getValue3() {
		return value3;
	}



	public void setValue3(int value3) {
		this.value3 = value3;
	}



	



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return "StaticModel [value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + ", total=" + total + "]";
	}

	
	
}
