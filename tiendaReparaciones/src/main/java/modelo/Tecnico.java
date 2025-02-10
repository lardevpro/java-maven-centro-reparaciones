package modelo;

/**
 * 
 * @author JuanG
 * @version 1.0
 * La clase Tecnico representa a un técnico en el sistema.
 */

public class Tecnico {
	private String id;
	private String nombre;

	
	
	public Tecnico(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return this.id+";"+this.nombre+"\n";
	}
	
	
}
