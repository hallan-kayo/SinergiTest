package com.sinerji.test.entities.interfaces;

import java.time.LocalDate;

/**
 * EmployeeWithBenefits
 */
public interface EmployeeWithBenefits {

    public Double baseSalaryWithBenefits(LocalDate date);

    public Double getTotalBenefits(LocalDate date);
}