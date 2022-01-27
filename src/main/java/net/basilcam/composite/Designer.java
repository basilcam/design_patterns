package net.basilcam.composite;

import java.time.LocalDate;

public class Designer implements Employee {
    private final BaseEmployee baseEmployee;
    private final long salaryUsd;

    Designer(String name, int id, LocalDate startDate, long salaryUsd) {
        this.baseEmployee = new BaseEmployee(name, id, startDate);
        this.salaryUsd = salaryUsd;
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

    @Override
    public void printDetails() {
        System.out.printf("designer %s (%d) has worked here since %s and makes %d USD per year\n",
                getName(),
                getId(),
                getStartDate().toString(),
                this.salaryUsd);
    }
}
