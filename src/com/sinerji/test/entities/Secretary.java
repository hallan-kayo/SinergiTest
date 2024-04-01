package com.sinerji.test.entities;

import java.time.LocalDate;

import com.sinerji.test.entities.interfaces.EmployeeWithBenefits;

public class Secretary extends Person implements EmployeeWithBenefits{
	
	private Double baseSalary;

	public Secretary() {
		this.setWorkReward(1000.0);
	}

	public Secretary(String name, Double baseSalary, Double benefit, LocalDate hiringDate) {
		super(name, baseSalary, benefit, hiringDate);
		this.baseSalary = baseSalary;
		this.setWorkReward(1000.0);
	}
	
	@Override
	public Double baseSalaryWithBenefits(LocalDate date) {
		return this.getSalaryInDate(date) + (this.getSalaryInDate(date)*this.getBenefit());
	}

	@Override
	public Double getTotalBenefits(LocalDate date){
		return this.getSalaryInDate(date)*this.getBenefit();
	}
	

	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + baseSalary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}

	
	
	
}
