package controllers;

import java.util.ArrayList;
import java.util.Vector;
import models.Employee;
import models.MainModel;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    MainModel mainModel;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainModel = new MainModel();

        this.handleEvent();
    }

    /* Itt kezeljük az eseményeket */
    public void handleEvent() {

        //Exit button
        this.mainWindow.exitButton.addActionListener(e -> exit());
        //load button
        this.mainWindow.loadButton.addActionListener(e -> loadTable());
    }

    /* Ez a kilépésgomb eseménykezelője */
    public void exit() {

        System.exit(0);
    }

    public void loadTable() {

        ArrayList<Employee> employeeList = mainModel.getEmployeeList();

        for(Employee emp : employeeList) {

            Vector<String> row = new Vector<>();

            row.add(emp.id.toString());
            row.add(emp.name);
            row.add(emp.city);
            row.add(emp.salary.toString());

            this.mainWindow.tableModel.addRow(row);
        }
    }

}
