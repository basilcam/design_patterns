package net.basilcam.composite;

import java.time.LocalDate;

public interface Employee {
    String getName();
    int getId();
    LocalDate getStartDate();
    void printDetails();
}
