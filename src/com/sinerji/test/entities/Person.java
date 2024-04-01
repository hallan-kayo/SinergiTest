/**
 * 
 */
package com.sinerji.test.entities;

import java.time.LocalDate;

/**
 * 
 */
public class Person {

	private String name;
	private Double baseSalary;
	private Double benefit = 0.0;
	private LocalDate hiringDate;
	private Double workReward;
	
	public Person() {
		this.workReward = 0.0;
	}

	public Person(String name, Double salary, Double benefit, LocalDate hiringDate) {
		this.name = name;
		this.baseSalary = salary;
		this.benefit = benefit;
		this.hiringDate = hiringDate;
		this.workReward = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double salary) {
		this.baseSalary = salary;
	}

	public Double getBenefit() {
		return benefit;
	}

	public void setBenefit(Double benefit) {
		this.benefit = benefit;
	}

	public LocalDate getHiringDate() {
		return hiringDate;
	}

	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}
	
	public Double getWorkReward() {
		return workReward;
	}

	public void setWorkReward(Double workReward) {
		this.workReward = workReward;
	}

	protected Integer yearsWorked(int year) {
		return year - this.hiringDate.getYear();
	}
	
	public Double getSalaryInYear(int year) {
		return this.baseSalary + (this.getWorkReward()*yearsWorked(year));
	}

	public Double baseSalaryWithBenefits(LocalDate date) {
		return this.getBaseSalary();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + baseSalary + ", benefit=" + benefit + ", hiringDate=" + hiringDate
				+ "]";
	}
	
}
