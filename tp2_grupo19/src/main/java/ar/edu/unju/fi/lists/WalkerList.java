package ar.edu.unju.fi.lists;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Walker;

public class WalkerList {
	
	//region Attributes
	private List<Walker> paseadores; // Container
	// endregion
	
	// region Constructor	
	public WalkerList() {
		this.paseadores = new ArrayList<Walker>();
		this.paseadores.add(new Walker("Juan Pérez", 8, 0, 10, 0));
		this.paseadores.add(new Walker("María Rodríguez", 15, 0, 17, 0));
		this.paseadores.add(new Walker("Carlos Gómez", 10, 0, 12, 0));
		this.paseadores.add(new Walker("Lucía Hernández", 13, 0, 15, 0));
		this.paseadores.add(new Walker("Diego Torres", 18, 0, 20, 0));
		this.paseadores.add(new Walker("Ana Martínez", 9, 0, 11, 0));
	}
	//endregion

	// region Getters and Setters
	public List<Walker> getPaseadores() {
		return paseadores;
	}

	public void setPaseadores(List<Walker> paseadores) {
		this.paseadores = paseadores;
	}	
	// endregion
	
}
