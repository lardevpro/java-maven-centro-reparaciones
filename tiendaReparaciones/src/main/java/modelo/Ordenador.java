package modelo;
/**
 * @author JuanG
 * @version 1.0
 * La clase Ordenador representa un ordenador en el sistema.
 */
public class Ordenador {
	private static int ids = 1;
	private int id;
	private String nombre;
	private String descripcion;
	private boolean arreglado;
	
	public Ordenador(String nombre, String descripcion, boolean arreglado) {
		this.id = ids;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.arreglado = arreglado;
		ids++;
	}
	/**
	 * Obtiene el valor del contador de identificadores.
	 * 
	 * @return el valor actual del contador de identificadores
	 */
	public static int getIds() {
		return ids;
	}
	/**
	 * Obtiene el nombre del ordenador.
	 * 
	 * @return el nombre del ordenador
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre del ordenador.
	 * 
	 * @param nombre el nombre del ordenador a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtiene la descripción del ordenador.
	 * 
	 * @return la descripción del ordenador
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Establece la descripción del ordenador.
	 * 
	 * @param descripcion la descripción del ordenador a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Verifica si el ordenador está arreglado.
	 * 
	 * @return true si el ordenador está arreglado, false en caso contrario
	 */
	public boolean isArreglado() {
		return arreglado;
	}
	/**
	 * Establece el estado de arreglado del ordenador.
	 * 
	 * @param arreglado el estado de arreglado a establecer
	 */
	public void setArreglado(boolean arreglado) {
		this.arreglado = arreglado;
	}
	/**
	 * Obtiene el identificador único del ordenador.
	 * 
	 * @return el identificador del ordenador
	 */
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return id + ";" + nombre + ";" + descripcion + ";"+ arreglado;
	}
}
