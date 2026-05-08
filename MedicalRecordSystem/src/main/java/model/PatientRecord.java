package model;

public class PatientRecord {

    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;
    private String diagnosis;
    private String treatment;

    public PatientRecord(int patientId,
                         String name,
                         int age,
                         String medicalHistory,
                         String diagnosis,
                         String treatment) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }
}