package com.sinerji.test.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.sinerji.test.entities.interfaces.EmployeeWithBenefits;

public class Seller extends Person implements EmployeeWithBenefits{

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

	public List<Sales> getSales() {
		return sales;
	}
	
	public void addSale(Sales sale) {
		this.sales.add(sale);
	}
	
	@Override
	public Double baseSalaryWithBenefits(LocalDate date) {
		return this.getSalaryInDate(date) + this.calculateMonthlyBenefits(date) +
		 (this.getSalaryInDate(date)*this.getBenefit());
	}
	
	public Double calculateMonthlyBenefits(LocalDate date) {
		Double benefits = 0.0;
		for(Sales sale: sales) {
			if(sale.getDate().equals(date))
				benefits += sale.getValue()*this.getBenefit();
				
			}
		return benefits;
	}

	@Override
	public Double getTotalBenefits(LocalDate date){
		return this.calculateMonthlyBenefits(date) + (this.getSalaryInDate(date)-this.getBaseSalary());
	}
	
	@Override
	public String toString() {
		return "Name=" + getName() +", Salary=" + baseSalary + ", Benefit=" + getBenefit()
				+ ", HiringDate=" + getHiringDate();
	}

}
