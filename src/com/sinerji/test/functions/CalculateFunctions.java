package com.sinerji.test.functions;

import java.time.LocalDate;
import java.util.List;

import com.sinerji.test.entities.Person;

public class CalculateFunctions {

    //returns the total valuepaid (salary and benefits) to these employees in the month.
    public Double totalSalaryOnDate(List<Person> employees, int year, int month){
        Double totalSalary = 0.0;
        for(Person employee: employees){
            totalSalary += employee.baseSalaryWithBenefits(LocalDate.of(year, month, 01));
        }
        return totalSalary;
    }
}
