package com.sinerji.test.entities;

import java.time.LocalDate;

public class Secretary extends Person{
	
	private Double baseSalary;

	public Secretary() {
		this.setWorkReward(1000.0);
	}

	public Secretary(String name, Double baseSalary, Double benefit, LocalDate hiringDate) {
		super(name, baseSalary, benefit, hiringDate);
		this.baseSalary = baseSalary;
		this.setWorkReward(1000.0);
	}
	
	public Double salaryWithBenefits(int year) {
		return this.getSalaryInYear(year) + (this.getSalaryInYear(year)*this.getBenefit());
	}
	

	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + baseSalary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}

	
	
	
}
