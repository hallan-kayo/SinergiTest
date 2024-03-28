package com.sinerji.test.entities;

import java.time.LocalDate;

public class Manager extends Person{

	private Double baseSalary;
	
	public Manager() {
		this.setWorkReward(3000.0);
	}

	public Manager(String name, Double baseSalary, LocalDate hiringDate) {
		super(name, baseSalary, 0.0, hiringDate);
		this.baseSalary = baseSalary;
		this.setWorkReward(3000.0);
	}


	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + baseSalary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}

	
	
}
