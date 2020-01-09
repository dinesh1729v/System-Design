package com.section2.openclosed;

public class Doctor extends Employee {
    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doc in action..." );
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
    //Doctors

    private void prescribeMedicine()
    {
        System.out.println("Prescribe Medicine");
    }
    private void  diagnosePatients()
    {
        System.out.println("Diagnosing patient");
    }
}
