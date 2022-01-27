package net.basilcam.composite;

import java.time.LocalDate;

public class Engineer implements Employee {
    private final BaseEmployee baseEmployee;
    private final double hourlyPayUsd;
    private final double hoursPerYear;

    public Engineer(String name, int id, LocalDate startDate, double hourlyPayUsd, long hoursPerYear) {
        baseEmployee = new BaseEmployee(name, id, startDate);
        this.hourlyPayUsd = hourlyPayUsd;
        this.hoursPerYear = hoursPerYear;
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

    public double getHourlyPayUsd() {
        return this.hourlyPayUsd;
    }

    public double getHoursPerYear() {
        return this.hoursPerYear;
    }

    @Override
    public void printDetails() {
        System.out.printf("engineer %s (%d) has worked here since %s and makes %f per hour\n",
                getName(),
                getId(),
                getStartDate().toString(),
                this.hourlyPayUsd);
    }
}
