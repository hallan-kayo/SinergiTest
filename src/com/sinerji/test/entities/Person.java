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
	private Double salary;
	private Double benefit = 0.0;
	private LocalDate hiringDate;
	
	public Person() {
	}

	public Person(String name, Double salary, Double benefit, LocalDate hiringDate) {
		this.name = name;
		this.salary = salary;
		this.benefit = benefit;
		this.hiringDate = hiringDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", benefit=" + benefit + ", hiringDate=" + hiringDate
				+ "]";
	}
	
	
	
}
