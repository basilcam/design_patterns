package net.basilcam.composite;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Steve Ballsmer", 30, LocalDate.of(1980, Month.JUNE, 11));
        Designer designer = new Designer("Paul Rand", 666, LocalDate.of(2021, Month.AUGUST, 20), 85_000);
        Engineer engineer = new Engineer("Bill Nye", 420, LocalDate.of(2018, Month.APRIL, 22), 60, 2080);
        manager.addEmployee(designer);
        manager.addEmployee(engineer);

        manager.printDetails();
    }
}
