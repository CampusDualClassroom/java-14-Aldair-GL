package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails(){
		System.out.println("Nombre del profesor: "+ this.name);
		System.out.println("de apellidos "+ this.surname);
		System.out.println("Cuya area es: "+this.area);
		System.out.println("###---------------###");
	}
}
