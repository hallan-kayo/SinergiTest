package com.sinerji.test.entities;

import java.time.LocalDate;

public class Secretary extends Person{
	
	private Double salary;

	public Secretary() {
	}

	public Secretary(String name, Double salary, Double benefit, LocalDate hiringDate) {
		super(name, salary, benefit, hiringDate);
		this.salary = salary;
	}
	
	public Double salaryWithBenefits() {
		return (this.getSalary()+(this.getSalary()*this.getBenefit()));
	}

	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + salary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}

	
	
	
}
