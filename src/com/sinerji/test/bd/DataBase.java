package com.sinerji.test.bd;

import java.time.LocalDate;

import com.sinerji.test.entities.Manager;
import com.sinerji.test.entities.Person;
import com.sinerji.test.entities.Sales;
import com.sinerji.test.entities.Secretary;
import com.sinerji.test.entities.Seller;

public class DataBase {

	public void fillDataBase() {
		Secretary sec1 = new Secretary("Jorge Carvalho", 7000.0, 0.2, LocalDate.of(2018,01, 01));
		Secretary sec2 = new Secretary("Maria Souza", 7000.0, 0.2, LocalDate.of(2015,12, 01));
		
		Seller ana = new Seller("Ana Silva", 12000.0, 0.3, LocalDate.of(2021,12, 01));
		Seller joao = new Seller("João Mendes", 12000.0, 0.3, LocalDate.of(2021,12, 01));
		
		Manager Man1 = new Manager("Juliana Alves", 20000.0, LocalDate.of(2017,07, 01));
		Manager Man2 = new Manager("Bento Albino", 20000.0, LocalDate.of(2014,03, 01));
		
		Sales sale1 = new Sales(5200.0, LocalDate.of(2021,12, 01));
		Sales sale2 = new Sales(4000.0, LocalDate.of(2022,01, 01));
		Sales sale3 = new Sales(4200.0, LocalDate.of(2022,02, 01));
		Sales sale4 = new Sales(5850.0, LocalDate.of(2022,03, 01));
		Sales sale5 = new Sales(7000.0, LocalDate.of(2022,04, 01));
		ana.addSale(sale1);
		ana.addSale(sale2);
		ana.addSale(sale3);
		ana.addSale(sale4);
		ana.addSale(sale5);
		
		
		Sales sale6 = new Sales(3400.0, LocalDate.of(2021,12, 01));
		Sales sale7 = new Sales(7700.0, LocalDate.of(2022,01, 01));
		Sales sale8 = new Sales(5000.0, LocalDate.of(2022,02, 01));
		Sales sale9 = new Sales(5900.0, LocalDate.of(2022,03, 01));
		Sales sale10 = new Sales(6500.0, LocalDate.of(2022,04, 01));
		joao.addSale(sale1);
		joao.addSale(sale2);
		joao.addSale(sale3);
		joao.addSale(sale4);
		joao.addSale(sale5);
	}
}
