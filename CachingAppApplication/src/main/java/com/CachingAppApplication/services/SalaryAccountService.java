package com.CachingAppApplication.services;

import com.CachingAppApplication.entities.Employee;
import com.CachingAppApplication.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
