package modelo;

/**
 * 
 * @author JuanG
 * @version 1.0
 * La clase Reparacion representa una reparación realizada por un técnico en un ordenador.
 */
public class Reparacion {
	private int id_ordenador;
	private String id_tecnico;
	private double horas;
	private double coste;
	
	
	public Reparacion(int id_ordenador, String id_tecnico, double horas, double coste) {
		this.id_ordenador = id_ordenador;
		this.id_tecnico = id_tecnico;
		this.horas = horas;
		this.coste = coste;
	}
	/**
	 * Obtiene el identificador del técnico que realizó la reparación.
	 * 
	 * @return el identificador del técnico
	 */
	
	
	public String getId_tecnico() {
		return id_tecnico;
	}
	/**
	 * Obtiene el identificador del ordenador al que se realizó la reparación.
	 * 
	 * @return el identificador del ordenador
	 */


	public int getId_ordenador() {
		return id_ordenador;
	}

	/**
	 * Devuelve una representación en forma de cadena de la reparación.
	 * 
	 * @return una cadena que representa la reparación, incluyendo el identificador del técnico,
	 *         el identificador del ordenador, las horas empleadas y el coste asociado
	 */

	@Override
	public String toString() {
		return "Técnico ID: "+this.id_tecnico+";Ordenador ID: "+this.id_ordenador+";Horas: "+this.horas+";Coste:"+this.coste;
	}
	
}
