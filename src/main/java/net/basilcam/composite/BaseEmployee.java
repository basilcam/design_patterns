package net.basilcam.composite;

import java.time.LocalDate;

public class BaseEmployee {
    private final String name;
    private final int id;
    private final LocalDate startDate;

    public BaseEmployee(String name, int id, LocalDate startDate) {
        this.name = name;
        this.id = id;
        this.startDate = startDate;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }
}
