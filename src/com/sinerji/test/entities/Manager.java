package com.sinerji.test.entities;

import java.time.LocalDate;

public class Manager extends Person{

	private Double salary;

	
	public Manager(String name, Double salary, LocalDate hiringDate) {
		super(name, salary, 0.0, hiringDate);
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + salary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}

	
	
}
