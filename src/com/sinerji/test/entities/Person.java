/**
 * 
 */
package com.sinerji.test.entities;

import java.time.LocalDate;
import java.time.Period;

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

	public Integer yearsWorked(LocalDate date) {
		Period periodo = Period.between(this.getHiringDate(),date);
		return periodo.getYears();
	}
	
	public Double getSalaryInDate(LocalDate date) {
		return this.getBaseSalary() + (this.getWorkReward()*yearsWorked(date));
	}

	public Double baseSalaryWithBenefits(LocalDate date) {
		return this.getSalaryInDate(date);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + baseSalary + ", benefit=" + benefit + ", hiringDate=" + hiringDate
				+ "]";
	}
	
}
