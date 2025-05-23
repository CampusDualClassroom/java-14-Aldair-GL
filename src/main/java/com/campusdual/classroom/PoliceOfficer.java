package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails(){
		System.out.println("Nombre del oficial: "+ this.name);
		System.out.println("de apellidos "+ this.surname);
		System.out.println("Cuyo escuadrón es: "+this.squad);
		System.out.println("###---------------###");
	}
}
