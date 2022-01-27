package net.basilcam.composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Manager implements Employee {
    private static final int PAY_PER_EMPLOYEE_USD = 20_000;

    private final BaseEmployee baseEmployee;
    private final List<Employee> employees;

    public Manager(String name, int id, LocalDate startdate) {
        baseEmployee = new BaseEmployee(name, id, startdate);
        employees = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.baseEmployee.getName();
    }

    @Override
    public int getId() {
        return this.baseEmployee.getId();
    }

    @Override
    public LocalDate getStartDate() {
        return this.baseEmployee.getStartDate();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public long getSalaryUsd() {
        return (long) this.employees.size() * PAY_PER_EMPLOYEE_USD;
    }

    @Override
    public void printDetails() {
        System.out.printf("engineer %s (%d) has worked here since %s, manages %d employees, and makes %s per year\n",
                getName(),
                getId(),
                getStartDate().toString(),
                this.employees.size(),
                getSalaryUsd());
        this.employees.forEach(Employee::printDetails);
    }
}
