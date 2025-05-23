package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
	public void getDetails(){
		System.out.println("Nombre del doctor: "+ this.name);
		System.out.println("de apellidos "+ this.surname);
		System.out.println("Cuya especialización es: "+this.specialization);
		System.out.println("###---------------###");
	}
}
