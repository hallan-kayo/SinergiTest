package com.sinerji.test.entities;

import java.time.LocalDate;

public class Sales {

	private Double value;
	private LocalDate date;
	private Seller seller;
	
	public Sales() {
		super();
	}
	
	
	public Sales(Double value, LocalDate date) {
		super();
		this.value = value;
		this.date = date;
	}
	
	public Sales(Double value, LocalDate date, Seller seller) {
		super();
		this.value = value;
		this.date = date;
		this.seller = seller;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public Seller getSeller() {
		return this.seller;
	}
	
	public void setSeller(Seller seller) {
		this.seller = seller;
	}


	@Override
	public String toString() {
		return "Sales [value=" + value + ", date=" + date + ", seller=" + seller + "]";
	}
	
	
	
}
