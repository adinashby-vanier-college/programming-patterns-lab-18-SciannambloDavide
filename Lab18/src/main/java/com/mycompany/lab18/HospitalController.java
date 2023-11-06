package com.mycompany.lab18;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class HospitalController {

    private Hospital model;
    private mainFrame view;

    public HospitalController(Hospital model, mainFrame view) {
        this.model = model;
        this.view = view;
    }

    //control model object
    public void setPatientAge(int age, int index) {
        model.getPatients().get(index).setAge(age);
    }

    public int getPatientAge(int index) {
        return model.getPatients().get(index).getAge();
    }

    public void setAuthorFName(String fname, int index) {
        model.getPatients().get(index).setfName(fname);
    }

    public String getAuthorFName(int index) {
        return model.getPatients().get(index).getfName();
    }

    public void setPatientLName(String lname, int index) {
        model.getPatients().get(index).setlName(lname);
    }

    public String getPatientLName(int index) {
        return model.getPatients().get(index).getlName();
    }

    public Hospital getHospitalModel() {
        return model;
    }

    public void setHospitalModel(Hospital model) {
        this.model = model;
    }

    public void setHospitalPatients(ArrayList<Patient> books) {
        model.setPatients(books);
    }

    public ArrayList<Patient> getHospitalPatients() {
        return (ArrayList<Patient>) model.getPatients();
    }

    public void setView(mainFrame view) {
        this.view = view;
    }

    public void addPatient(String fname, String lname, int age) {
        Patient newPatient = new Patient(fname, lname, age);
        model.addPatient(newPatient);

    }
    public void updatePatientTextArea(HospitalController hospitalController) {
        StringBuilder booksDisplay = new StringBuilder();
        
        for (Patient patient : hospitalController.getHospitalPatients()) {
            booksDisplay.append(patient.toString());
            booksDisplay.append("\n"); // Add a newline to separate each book's information
        }

        String[] bookArray = booksDisplay.toString().split("\n");
        view.patientList.setListData(bookArray);
    }

}
