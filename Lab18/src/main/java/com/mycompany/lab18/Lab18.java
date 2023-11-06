/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lab18;

/**
 *
 * @author Admin
 */
public class Lab18 {

    public static void main(String[] args) {
        try {
            DatabaseManager.initialize();

//            Patient patient = new Patient("Ross", "Colton", 29);
//            Patient patient2 = new Patient("Evander", "Kane", 30);
//            Patient patient3 = new Patient("Connor", "McDavid", 26);
//            Patient patient4 = new Patient("Roman", "Josi", 32);
//            DatabaseManager.addBook(patient);
//            DatabaseManager.addBook(patient2);
//            DatabaseManager.addBook(patient3);
//            DatabaseManager.addBook(patient4);
            Hospital hospital = Hospital.getInstance();
            
            DatabaseManager.loadPatients(hospital);
//            DatabaseManager.clear();
            mainFrame mainForm = new mainFrame();
            HospitalController hospitalController = new HospitalController(hospital, mainForm);
            mainForm.setHospitalController(hospitalController);

            hospitalController.updatePatientTextArea(hospitalController);

            mainForm.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace(); // This will print any exceptions that occur
        }
    }
}
