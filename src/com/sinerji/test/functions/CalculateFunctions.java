package com.sinerji.test.functions;

import java.time.LocalDate;
import java.util.List;

import com.sinerji.test.entities.Person;
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
        Double totalSalary = 0.0;
        for(Person employee: employees){
            totalSalary += employee.getSalaryInDate(LocalDate.of(year, month, 01));
        }
        return totalSalary;
    }

    //returns the total paid in benefits in the month. list only employees who receive benefits.
    public Double TotalBenefitsOnDate(List<EmployeeWithBenefits> employees, int year, int month){
        Double totalBenefits = 0.0;
        for(EmployeeWithBenefits employee: employees){
            totalBenefits += employee.getTotalBenefits(LocalDate.of(year, month, 01));
        }
        return totalBenefits;
    }


}
