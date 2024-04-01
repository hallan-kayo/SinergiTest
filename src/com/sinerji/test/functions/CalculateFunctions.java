package com.sinerji.test.functions;

import java.time.LocalDate;
import java.util.List;

import com.sinerji.test.entities.Person;
import com.sinerji.test.entities.Sales;
import com.sinerji.test.entities.Seller;
import com.sinerji.test.entities.interfaces.EmployeeWithBenefits;

public class CalculateFunctions {

    //returns the total value paid (salary and benefits) to these employees in the month.
    public Double totalSalaryOnDate(List<Person> employees, int year, int month){
        Double totalSalary = 0.0;
        for(Person employee: employees){
            totalSalary += employee.baseSalaryWithBenefits(LocalDate.of(year, month, 01));
        }
        return totalSalary;
    }

    //returns the base salary value paid to these employees in the month
    public Double baseSalaryOnDate(List<Person> employees, int year, int month){
        Double totalBaseSalary = 0.0;
        for(Person employee: employees){
            totalBaseSalary += employee.getSalaryInDate(LocalDate.of(year, month, 01));
        }
        return totalBaseSalary;
    }

    //returns the total paid in benefits in the month. list only employees who receive benefits.
    public Double TotalBenefitsOnDate(List<EmployeeWithBenefits> employees, int year, int month){
        Double totalBenefits = 0.0;
        for(EmployeeWithBenefits employee: employees){
            totalBenefits += employee.getTotalBenefits(LocalDate.of(year, month, 01));
        }
        return totalBenefits;
    }

    //returns what received the highest amount in the month.
    public Person higestAmountInMonth(List<Person> employees, int year, int month){
        Person highestSalaryEmployee = null;
        Double highestSalary = Double.MIN_VALUE;
        for(Person employee: employees){
            if(employee.getSalaryInDate(LocalDate.of(year, month, 01)) > highestSalary){
                highestSalary = employee.getSalaryInDate(LocalDate.of(year, month, 01));
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }

    //returns the name of the employee who received the highest amount high in benefits per month.
    public Double higestBenefitInMonthEmployee(List<EmployeeWithBenefits> employees, int year, int month){
        Double highestBenefit = Double.MIN_VALUE;
        Double employeeName = 0.0;
        for(EmployeeWithBenefits employee: employees){
            if(employee.getTotalBenefits(LocalDate.of(year, month, 01)) > highestBenefit){
                highestBenefit = employee.getTotalBenefits(LocalDate.of(year, month, 01));
                employeeName = employee.getTotalBenefits(LocalDate.of(year, month, 01));
            }
        }
        return employeeName;
    }

    //return what else sold in the month.
    public Seller highestSoldInMonth(List<Seller> sellers, int year, int month){
        Seller bestSeller = null;
        Double highestSold = 0.0;
        for(Seller seller: sellers){
            for(Sales sale:seller.getSales()){
                if(sale.getDate().equals(LocalDate.of(year, month, 01))){
                    System.out.println(sale);
                    if(sale.getValue() > highestSold){
                        highestSold = sale.getValue();
                        bestSeller = seller;
                    }
                }
            }
        }
        return bestSeller;
    }

}
