/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab18;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Controller {

   private ArrayList<HospitalController> libraryControllers;
    private mainFrame mainFormView;
    private static Controller controllerObject;

    private Controller() {

    }

    private Controller(ArrayList<HospitalController> libraryControllers, mainFrame mainFormView) {
        this.libraryControllers = libraryControllers;
        this.mainFormView = mainFormView;

    }

    public static Controller getInstance() {
        // create object if it's not already created
        if (controllerObject == null) {
            controllerObject = new Controller();
        }

        // returns the singleton object
        return controllerObject;
    }

    public static Controller getInstance(ArrayList<HospitalController> libraryControllers, mainFrame mainFormView) {
        // create object if it's not already created
        if (controllerObject == null) {
            controllerObject = new Controller(libraryControllers, mainFormView);
        }

        // returns the singleton object
        return controllerObject;
    }

    public void setLibrarysControllers(ArrayList<HospitalController> libraryControllers) {
        this.libraryControllers = libraryControllers;
    }

    public ArrayList<HospitalController> getLibrarysControllers() {
        return libraryControllers;
    }

    public void setMainFormView(mainFrame mainFormView) {
        this.mainFormView = mainFormView;
    }

}
