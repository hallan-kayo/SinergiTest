package com.sinerji.test.main;

import java.time.LocalDate;

import com.sinerji.test.entities.Sales;
import com.sinerji.test.entities.Secretary;
import com.sinerji.test.entities.Seller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Secretary s1 = new Secretary("halan", 7000.0, 0.2, LocalDate.of(2018, 12, 1));
		
		//System.out.println("salario " + s1.getSalary()*s1.getBenefit());
		//System.out.println("salario com benecifio: " + s1.salaryWithBenefits());
		
		Seller sel1 = new Seller("halan", 7000.0, 0.3, LocalDate.of(2018, 12, 1));
		
		Sales sale1 = new Sales(3000.0,LocalDate.of(2021, 07, 1));
		Sales sale2 = new Sales(7000.0,LocalDate.of(2020, 07, 1));
		Sales sale3 = new Sales(5600.0,LocalDate.of(2019, 07, 1));
		Sales sale4 = new Sales(10000.0,LocalDate.of(2022, 07, 1));
		Sales sale5 = new Sales(300.0,LocalDate.of(2022, 07, 1));
		sel1.addSale(sale1);
		sel1.addSale(sale2);
		sel1.addSale(sale3);
		sel1.addSale(sale4);
		sel1.addSale(sale5);
		
	
	}

}
