package com.sinerji.test.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Seller extends Person{

	private Double baseSalary;
	private List<Sales> sales;
	
	public Seller(String name, Double baseSalary, Double benefit, LocalDate hiringDate) {
		super(name, baseSalary, benefit, hiringDate);
		this.baseSalary = baseSalary;
		this.setWorkReward(1800.0);
		sales = new ArrayList<>();
	}

	public Seller(Double baseSalary) {
		super();
		this.baseSalary = baseSalary;
		this.setWorkReward(1800.0);
		sales = new ArrayList<>();
	}

	public Seller() {
		this.setWorkReward(1800.0);
		sales = new ArrayList<>();
	}

	public List getSales() {
		return sales;
	}
	
	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + baseSalary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}
	
	public void addSale(Sales sale) {
		this.sales.add(sale);
	}
	
	public Double baseSalaryWithBenefits(LocalDate date) {
		return this.getSalaryInYear(date.getYear()) + this.calculateMonthlyBenefits(date);
	}
	
	private Double calculateMonthlyBenefits(LocalDate date) {
		Double benefits = 0.0;
		for(Sales sale: sales) {
			if(sale.getDate().equals(date))
				benefits += sale.getValue()*this.getBenefit();
			
		}
		return benefits;
	}
	
	private Integer getQuantitySales() {
		return this.sales.size();
	}
	
}
