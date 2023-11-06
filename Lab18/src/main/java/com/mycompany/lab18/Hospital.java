package com.mycompany.lab18;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private static Hospital libraryObject;
    private List<Patient> patients;
    private List<HospitalObserver> observers;

    private Hospital() {
        patients = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static Hospital getInstance() {
        if (libraryObject == null) {
            libraryObject = new Hospital();
        }
        return libraryObject;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
        notifyPatientRemoved(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void registerObserver(HospitalObserver observer) {
        observers.add(observer);
    }

    public void unregisterObserver(HospitalObserver observer) {
        observers.remove(observer);
    }

    private void notifyPatientRemoved(Patient patient) {
        for (HospitalObserver observer : observers) {
            observer.updatePatientRemoved(patient);
        }
    }

    public static Hospital getLibraryObject() {
        return libraryObject;
    }

    public static void setLibraryObject(Hospital libraryObject) {
        Hospital.libraryObject = libraryObject;
    }

    public List<HospitalObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<HospitalObserver> observers) {
        this.observers = observers;
    }

    void setPatients(ArrayList<Patient> patients) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
