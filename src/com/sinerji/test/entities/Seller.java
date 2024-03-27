package com.sinerji.test.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Seller extends Person{

	private Double salary;
	private List<Sales> sales;
	
	public Seller(String name, Double salary, Double benefit, LocalDate hiringDate) {
		super(name, salary, benefit, hiringDate);
		this.salary = salary;
		sales = new ArrayList<>();
	}

	public Seller(Double salary) {
		super();
		this.salary = salary;
	}

	public Seller() {
		super();
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List getSales() {
		return sales;
	}
	
	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + salary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}
	
	public void addSale(Sales sale) {
		this.sales.add(sale);
	}
	
	public Double salaryWithBenefits() {
		return this.salary + this.calculateBenefits();
	}
	
	private Double calculateBenefits() {
		return this.getSalary() + (this.getBenefit()*this.getQuantitySales()*this.getSalary());
	}
	
	private Integer getQuantitySales() {
		return this.sales.size();
	}
	
}
