package com.sinerji.test.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.sinerji.test.entities.Manager;
import com.sinerji.test.entities.Person;
import com.sinerji.test.entities.Sales;
import com.sinerji.test.entities.Secretary;
import com.sinerji.test.entities.Seller;
import com.sinerji.test.entities.interfaces.EmployeeWithBenefits;
import com.sinerji.test.functions.CalculateFunctions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Secretary sec1 = new Secretary("Jorge Carvalho", 7000.0, 0.2, LocalDate.of(2018, 01, 01));
		sec1.setWorkReward(1000.0);
		Secretary sec2 = new Secretary("Maria Souza", 7000.0, 0.2, LocalDate.of(2015, 12, 01));
		sec1.setWorkReward(1000.0);

		Seller ana = new Seller("Ana Silva", 12000.0, 0.3, LocalDate.of(2021, 12, 01));
		ana.setWorkReward(1800.0);
		Seller joao = new Seller("João Mendes", 12000.0, 0.3, LocalDate.of(2021, 12, 01));
		joao.setWorkReward(1800.0);

		Manager man1 = new Manager("Juliana Alves", 20000.0, LocalDate.of(2017, 07, 01));
		man1.setWorkReward(3000.0);
		Manager man2 = new Manager("Bento Albino", 20000.0, LocalDate.of(2014, 03, 01));
		man2.setWorkReward(3000.0);

		Sales sale1 = new Sales(5200.0, LocalDate.of(2021, 12, 01));
		sale1.setSeller(ana);
		Sales sale2 = new Sales(4000.0, LocalDate.of(2022, 01, 01));
		sale1.setSeller(ana);
		Sales sale3 = new Sales(4200.0, LocalDate.of(2022, 02, 01));
		sale1.setSeller(ana);
		Sales sale4 = new Sales(5850.0, LocalDate.of(2022, 03, 01));
		sale1.setSeller(ana);
		Sales sale5 = new Sales(7000.0, LocalDate.of(2022, 04, 01));
		sale1.setSeller(ana);
		ana.addSale(sale1);
		ana.addSale(sale2);
		ana.addSale(sale3);
		ana.addSale(sale4);
		ana.addSale(sale5);

		Sales sale6 = new Sales(3400.0, LocalDate.of(2021, 12, 01));
		sale1.setSeller(joao);
		Sales sale7 = new Sales(7700.0, LocalDate.of(2022, 01, 01));
		sale1.setSeller(joao);
		Sales sale8 = new Sales(5000.0, LocalDate.of(2022, 02, 01));
		sale1.setSeller(joao);
		Sales sale9 = new Sales(5900.0, LocalDate.of(2022, 03, 01));
		sale1.setSeller(joao);
		Sales sale10 = new Sales(6500.0, LocalDate.of(2022, 04, 01));
		sale1.setSeller(joao);
		joao.addSale(sale6);
		joao.addSale(sale7);
		joao.addSale(sale8);
		joao.addSale(sale9);
		joao.addSale(sale10);

		List<Person> employees = new ArrayList();
		employees.add(sec1);
		employees.add(sec2);
		employees.add(ana);
		employees.add(joao);
		employees.add(man1);
		employees.add(man2);

		List<EmployeeWithBenefits> employeesWithBenefits = new ArrayList<>();
		employeesWithBenefits.add(sec1);
		employeesWithBenefits.add(sec2);
		employeesWithBenefits.add(ana);
		employeesWithBenefits.add(joao);


		// System.out.println("Secretary --------------------------------");

		// System.out.println("Base Salary: " + sec2.getBaseSalary());

		// System.out.println("Total Benefits:" +sec2.getTotalBenefits(LocalDate.of(2022, 03, 01)));

		// System.out.println("Years worked: " +sec2.yearsWorked(LocalDate.of(2022, 03, 01)));

		// System.out.println("Salary in especific Year:" + sec2.getSalaryInDate(LocalDate.of(2022, 03, 01)));

		// System.out.println("Salary with benefits: " + sec2.baseSalaryWithBenefits(LocalDate.of(2022,03,01)));

		// System.out.println("\nManager ---------------------------------");

		// System.out.println("Base Salary: " + man2.getBaseSalary());
		// System.out.println("years worked: " +man2.yearsWorked(LocalDate.of(2022,03,01)));

		// System.out.println("Salary in especific Year: " + man2.getSalaryInDate(LocalDate.of(2022, 03, 01)));

		
		// System.out.println("------------------------------------------------------------------\n\n");
		
		// System.out.println("Seller ---------------------------------");
		// System.out.println("years worked:" +ana.yearsWorked(LocalDate.of(2022, 03, 01)));

		// System.out.println("Base Salary: " + ana.getBaseSalary());
		// System.out.println("Benefits in month: " + ana.calculateMonthlyBenefits(LocalDate.of(2022, 03, 01)));

		// System.out.println("Total Benefits " +ana.getTotalBenefits(LocalDate.of(2022, 03, 01)));

		// System.out.println("Salary in especific Year: " + ana.getSalaryInDate(LocalDate.of(2022, 03, 01)));
		
		// System.out.println( "Salary with benefits: " + ana.baseSalaryWithBenefits(LocalDate.of(2022, 03, 01)));



		System.out.println("------------------------------------------------------------------\n\n");

		CalculateFunctions calculate = new CalculateFunctions();
		
		System.out.println("Total salary in date ---------------------------------");

		System.out.println("total: " + calculate.totalSalaryOnDate(employees, 2022, 03));

		System.out.println("Base salary in date ---------------------------------");

		System.out.println("base Salary: " + calculate.baseSalaryOnDate(employees, 2022, 03));

		System.out.println("Total Benefits in date ---------------------------------");

		System.out.println("total Benefits: " + calculate.TotalBenefitsOnDate(employeesWithBenefits, 2022, 03));


		System.out.println("employee with highest salary  ---------------------------------");

		System.out.println(calculate.higestAmountInMonth(employees, 2022, 03));

		System.out.println("employee with highest benefit  ---------------------------------");

		System.out.println(calculate.higestBenefitInMonthEmployee(employeesWithBenefits, 2022, 03));

		List<Seller> sellers = new ArrayList();
		sellers.add(ana);
		sellers.add(joao);

		System.out.println("best seller in date  ---------------------------------");

		System.out.println(calculate.highestSoldInMonth(sellers, 2022, 3));
	}

}
