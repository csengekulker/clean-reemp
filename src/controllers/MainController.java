package controllers;

import java.util.ArrayList;
import java.util.Vector;

import models.Employee;
import models.MainModel;
import views.MainWindow;

public class MainController {
    MainWindow mainwindow;
    MainModel mainModel;
    public MainController() {
        this.mainwindow = new MainWindow();
        this.mainModel = new MainModel();
        this.handleEvent();
    }
    /* Itt kezeljük az eseményeket */
    public void handleEvent() {
        //Exit button
        this.mainwindow.a
        .addActionListener(e -> button1());
        this.mainwindow.button2 //load button
        .addActionListener(e -> button2());
    }
    /* Ez a kilépésgomb eseménykezelője */
    public void button1() {
        System.out.println("Kilépés...");
    }
    public void button2() {
        System.out.println("Betöltés");
        ArrayList<Employee> employeeList = mainModel.getEmployeeList();
        for(Employee emp : employeeList) {
            Vector<String> row = new Vector<>();
            row.add(emp.id.toString());
            row.add(emp.name);
            row.add(emp.city);
            row.add(emp.salary.toString());
            this.mainwindow.model.addRow(row);
        }
    }

}
