package designpatterns.others.dependencyinjection.dao;

import designpatterns.others.dependencyinjection.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

	void mostrarNombre();
	void setConexion(IConexion conexion);
	
}
