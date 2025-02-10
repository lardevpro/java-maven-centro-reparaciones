package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import modelo.Ordenador;
import modelo.Tecnico;
import vista.Musica;
import vista.Vista;
import modelo.Reparacion;
/**
 * 
 * La clase Controlador actúa como intermediario entre la vista y el modelo.
 * Responde a las interacciones del usuario y actualiza la vista y el modelo en consecuencia.
 *
 * @author JuanG
 * @version 1.0
 */
public class Controlador implements ActionListener {
	private Vista vista;
	private Musica musica;
	private List<Tecnico> tecnicos;
	private List<Ordenador> ordenadores;
	private List<Reparacion> reparaciones;

	/**
	 * Constructo que recibe como parámetro un objeto vista e inicia los atributos privados de la clase
	 * tambien activa la música y activa los escuchadores de las opciones del barra del menu
	 * @param vista objeto que pertencea a la clase vista la cual controla el usuario
	 */
	public Controlador(Vista vista) {
		this.vista = vista;
		this.tecnicos = new ArrayList<>();
		this.ordenadores = new ArrayList<>();
		this.reparaciones = new ArrayList<>();
		this.musica = new Musica("musica.wav");
		musica.play();
		// activar barramenu
		this.barraMenu();

	}

	/**
	 * Metodo que hace la vista visible
	 */
	public void iniciarVista() {

		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.getMntmNewMenuItemSalir()) {
			// finalizar programa
			vista.finalizar();

		} else if (e.getSource() == vista.getMntmNewMenuItemNuevoTecnico()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.nuevoTecnico();
			// activación menú barra
			this.barraMenu();
			// acciones ventana nuevo técnico
			vista.getBtnNewButtonAltaTecnico().addActionListener(this);
		}

		else if (e.getSource() == vista.getBtnNewButtonAltaTecnico()) {

			if (vista.getTextFieldNuevoTecnicoID().getText().equals("")) {
				vista.getLblNewLabelAvisoTecnico().setForeground(Color.red);
				vista.getLblNewLabelAvisoTecnico().setText("Error, rellene el campo 'ID'");
			} else if (vista.getTextFieldNuevoTecnicoNombre().getText().equals("")) {
				vista.getLblNewLabelAvisoTecnico().setForeground(Color.red);
				vista.getLblNewLabelAvisoTecnico().setText("Error, rellene el campo 'Nombre");
			} else {
				boolean id_tecnico_ok = true;
				String id_tecnico = vista.getTextFieldNuevoTecnicoID().getText();

				for (Tecnico tecnico : tecnicos) {
					if (tecnico.getId().equals(id_tecnico))
						id_tecnico_ok = false;
				}

				if (id_tecnico_ok) {
					vista.getLblNewLabelAvisoTecnico().setForeground(Color.GREEN);
					vista.getLblNewLabelAvisoTecnico().setText("");
					String id = vista.getTextFieldNuevoTecnicoID().getText();
					String nombre = vista.getTextFieldNuevoTecnicoNombre().getText();

					tecnicos.add(new Tecnico(id, nombre));
					vista.getLblNewLabelAvisoTecnico().setText("Nuevo técnico registrado");
				} else {
					vista.getLblNewLabelAvisoTecnico().setForeground(Color.red);
					vista.getLblNewLabelAvisoTecnico().setText("Error, el ID tecnico ya está ocupado.");
				}
			}
		} else if (e.getSource() == vista.getMntmNewMenuItemSalir()) {
			vista.finalizar();

		} else if (e.getSource() == vista.getMntmNewMenuItemListarTecnicos()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.mostrarTecnicos();
			// activación menú barra
			this.barraMenu();
			if (tecnicos.size() == 0) {
				vista.getLblNewLabelAvisoMostrarTecnicos().setForeground(Color.red);
				vista.getLblNewLabelAvisoMostrarTecnicos()
						.setText("AVISO, aun no hay técnicos registrados en el programa.");
			} else {
				String cadena = "";
				for (Tecnico tecnico : tecnicos) {
					cadena += tecnico;
				}
				vista.getTextArea().setText(cadena);
			}
		} else if (e.getSource() == vista.getMntmNewMenuItemEliminarTecnico()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.eliminarTecnico();
			// activación menú barra
			this.barraMenu();
			// activar boton eliminar
			vista.getBtnNewButtonEliminarTecnico().addActionListener(this);
			if (tecnicos.size() == 0) {
				vista.getLblNewLabelAvisoEliminarTecnico().setForeground(Color.red);
				vista.getLblNewLabelAvisoEliminarTecnico()
						.setText("AVISO, aun no hay técnicos registrados en el programa.");
				vista.getBtnNewButtonEliminarTecnico().setEnabled(false);
			}
		} else if (e.getSource() == vista.getBtnNewButtonEliminarTecnico()) {

			if (tecnicos.size() == 0) {
				vista.getLblNewLabelAvisoEliminarTecnico().setForeground(Color.red);
				vista.getLblNewLabelAvisoEliminarTecnico()
						.setText("AVISO, aun no hay técnicos registrados en el programa.");
				vista.getBtnNewButtonEliminarTecnico().setEnabled(false);
			} else if (vista.getTextFieldIdEliminarTecnico().getText().equals("")) {
				vista.getLblNewLabelAvisoEliminarTecnico().setForeground(Color.red);
				vista.getLblNewLabelAvisoEliminarTecnico().setText("Error, debe rellenar el campo con un 'ID'.");
			} else {
				String id = vista.getTextFieldIdEliminarTecnico().getText();
				boolean tecnico_libre = true;

				for (Reparacion reparacion : reparaciones) {
					if (reparacion.getId_tecnico().equals(id)) {
						tecnico_libre = false;
					}
				}

				if (tecnico_libre) {
					int pos = 0;
					boolean bandera_esta = false;
					for (int i = 0; i < tecnicos.size(); i++) {
						if (id.equals(tecnicos.get(i).getId())) {
							pos = i;
							bandera_esta = true;
						}
					}
					if (bandera_esta) {
						tecnicos.remove(pos);
						vista.getLblNewLabelAvisoEliminarTecnico().setForeground(Color.GREEN);
						vista.getLblNewLabelAvisoEliminarTecnico()
								.setText("Registro de técnico eliminado correctamente");
						vista.getBtnNewButtonEliminarTecnico().setEnabled(false);
					} else {
						vista.getLblNewLabelAvisoEliminarTecnico().setForeground(Color.RED);
						vista.getLblNewLabelAvisoEliminarTecnico().setText("Error,'ID' no registrado en el programa.");
					}

				} else {
					vista.getLblNewLabelAvisoEliminarTecnico().setForeground(Color.RED);
					vista.getLblNewLabelAvisoEliminarTecnico()
							.setText("No se puede eliminar registro, tiene trabajo pendiente.");
				}

			}
		} else if (e.getSource() == vista.getMntmNewMenuItemNuevoOrdenador()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.vistaNuevoOrdenador();
			// activación menú barra
			this.barraMenu();
			// activar boton alta
			vista.getBtnNewButtonNuevoOrdenadorAlta().addActionListener(this);
			vista.getTextFieldNuevoOrdenadorID().setEnabled(false);
			int id = Ordenador.getIds();
			vista.getTextFieldNuevoOrdenadorID().setText("" + id);

		} else if (e.getSource() == vista.getBtnNewButtonNuevoOrdenadorAlta()) {
			if (vista.getTextFieldNuevoOrdenadorNombre().getText().equals("")) {
				vista.getLblNewLabelNuevoOrdenadorAviso().setForeground(Color.RED);
				vista.getLblNewLabelNuevoOrdenadorAviso().setText("Error, se debe rellenar el campo 'Nombre.' ");
			} else if (vista.getTextAreaNuevoOrdenadorDescripcion().getText().equals("")) {
				vista.getLblNewLabelNuevoOrdenadorAviso().setForeground(Color.RED);
				vista.getLblNewLabelNuevoOrdenadorAviso().setText("Error, debe rellenar el campor 'Descripción' .");
			} else {
				String nombre = vista.getTextFieldNuevoOrdenadorNombre().getText();
				String descripcion = vista.getTextAreaNuevoOrdenadorDescripcion().getText();
				boolean arreglado = vista.getChckbxNewCheckBoxNuevoOrdenadorArreglado().isSelected();
				ordenadores.add(new Ordenador(nombre, descripcion, arreglado));
				vista.getLblNewLabelNuevoOrdenadorAviso().setForeground(Color.GREEN);
				vista.getLblNewLabelNuevoOrdenadorAviso().setText("Ordenador registrado correctamente ");
				vista.getTextFieldNuevoOrdenadorNombre().setText("");
				vista.getTextAreaNuevoOrdenadorDescripcion().setText("");
				int id = Ordenador.getIds();
				vista.getTextFieldNuevoOrdenadorID().setText("" + id);
			}
			vista.getChckbxNewCheckBoxNuevoOrdenadorArreglado().setSelected(false);
		} else if (e.getSource() == vista.getMntmNewMenuItemActualizarOrdenador()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.vistaModificarOrdenador();
			// activación menú barra
			this.barraMenu();
			// activar boton cargar
			vista.getBtnNewButtonOrdenadorCargar().addActionListener(this);
			vista.getTextFieldActualizarOrdenadorNombre().setEnabled(false);
			vista.getTextAreaModificarOrdenadorDescripcion().setEnabled(false);
			vista.getChckbxNewCheckBoxModificarOrdenadorArreglado().setEnabled(false);
			vista.getBtnNewButtonOrdenadorCargar().setEnabled(false);
			vista.getBtnNewButtonActualizarOrdenador().setEnabled(false);
			if (ordenadores.size() == 0) {
				vista.getLblNewLabelAvisoModificarOrdenador().setForeground(Color.RED);
				vista.getLblNewLabelAvisoModificarOrdenador()
						.setText("AVISO¡¡ aun NO hay ordenadores registrado en el programa.");
			} else {
				vista.getTextFieldActualizarOrdenadorID().setEnabled(true);
				vista.getBtnNewButtonOrdenadorCargar().setEnabled(true);
				vista.getLblNewLabelAvisoModificarOrdenador()
						.setText("Introduzca el ID del ordenador que desea modificar.");
			}

		} else if (e.getSource() == vista.getBtnNewButtonOrdenadorCargar()) {
			int id = Integer.parseInt(vista.getTextFieldActualizarOrdenadorID().getText());
			int pos = 0;
			boolean bandera_esta = false;
			for (int i = 0; i < ordenadores.size(); i++) {
				if (ordenadores.get(i).getId() == id) {
					pos = i;
					bandera_esta = true;
				}
			}
			if (bandera_esta) {
				vista.getLblNewLabelAvisoModificarOrdenador().setText("");
				vista.getTextFieldActualizarOrdenadorID().setText("" + ordenadores.get(pos).getId());
				vista.getTextFieldActualizarOrdenadorNombre().setText(ordenadores.get(pos).getNombre());
				vista.getTextAreaModificarOrdenadorDescripcion().setText(ordenadores.get(pos).getDescripcion());
				vista.getChckbxNewCheckBoxModificarOrdenadorArreglado().setSelected(ordenadores.get(pos).isArreglado());
				vista.getTextFieldActualizarOrdenadorNombre().setEnabled(true);
				vista.getTextAreaModificarOrdenadorDescripcion().setEnabled(true);
				vista.getChckbxNewCheckBoxModificarOrdenadorArreglado().setEnabled(true);
				vista.getBtnNewButtonOrdenadorCargar().setEnabled(true);
				vista.getBtnNewButtonActualizarOrdenador().setEnabled(true);
				vista.getBtnNewButtonActualizarOrdenador().addActionListener(this);
			} else {
				vista.getLblNewLabelAvisoModificarOrdenador().setForeground(Color.RED);
				vista.getLblNewLabelAvisoModificarOrdenador()
						.setText("Error, ese ID no está registrado en el programa.");
			}

		} else if (e.getSource() == vista.getBtnNewButtonActualizarOrdenador()) {
			int pos = 0;
			int id = Integer.parseInt(vista.getTextFieldActualizarOrdenadorID().getText());
			String nombre = vista.getTextFieldActualizarOrdenadorNombre().getText();
			String descripcion = vista.getTextAreaModificarOrdenadorDescripcion().getText();
			boolean arreglado = vista.getChckbxNewCheckBoxModificarOrdenadorArreglado().isSelected();

			if (nombre.equals("")) {
				vista.getLblNewLabelAvisoModificarOrdenador().setForeground(Color.RED);
				vista.getLblNewLabelAvisoModificarOrdenador().setText("Error, debe rellenar el campo 'Nombre'.");
			} else if (descripcion.equals("")) {
				vista.getLblNewLabelAvisoModificarOrdenador().setForeground(Color.RED);
				vista.getLblNewLabelAvisoModificarOrdenador().setText("Error, debe rellenar el campo 'Descripción'.");
			} else {

				for (int i = 0; i < ordenadores.size(); i++) {
					if (id == ordenadores.get(i).getId()) {
						pos = i;
					}
				}
				ordenadores.get(pos).setArreglado(arreglado);
				ordenadores.get(pos).setDescripcion(descripcion);
				ordenadores.get(pos).setNombre(nombre);
				vista.getLblNewLabelAvisoModificarOrdenador().setForeground(Color.green);
				vista.getLblNewLabelAvisoModificarOrdenador()
						.setText("Registro de ordenador modificado correctamente.");
				vista.getBtnNewButtonActualizarOrdenador().setEnabled(false);
				vista.getTextFieldActualizarOrdenadorNombre().setEnabled(false);
				vista.getTextAreaModificarOrdenadorDescripcion().setEnabled(false);
				vista.getChckbxNewCheckBoxModificarOrdenadorArreglado().setEnabled(false);
				vista.getBtnNewButtonOrdenadorCargar().setEnabled(false);
				vista.getTextFieldActualizarOrdenadorID().setEnabled(false);

			}
		} else if (e.getSource() == vista.getMntmNewMenuItemListarOrdenadores()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.vistaListarOrdenadores();
			// activación menú barra
			this.barraMenu();
			if (ordenadores.size() == 0) {
				vista.getLblNewLabelListarOrdendores().setForeground(Color.RED);
				vista.getLblNewLabelListarOrdendores().setText("AVISO¡¡ aun no hay ordenandores registrados.");
			} else {
				String cadena = "";
				for (Ordenador ordenador : ordenadores) {
					cadena += ordenador + "\n";
				}
				vista.getTextAreaListarOrdenadores().setText(cadena);

			}

		} else if (e.getSource() == vista.getMntmNewMenuItemNuevaReparacion()) {
			// reset de pantalla
			vista.limpiarVista();
			vista.vistaNuevaReparacion();
			// activación menú barra
			this.barraMenu();
			vista.getBtnNewButtonNuevaReparacionAlta().addActionListener(this);
		} else if (e.getSource() == vista.getBtnNewButtonNuevaReparacionAlta()) {
			vista.getLblNewLabelAvisoNuevaReparacion().setText("");
			if (vista.getTextFieldNuevaReparacionIDTecnico().getText().equals("")) {
				vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
				vista.getLblNewLabelAvisoNuevaReparacion().setText("Error, debe rellenar el campo 'ID técnico' .");
			} else if (vista.getTextFieldNuevaReparacionIDOrdenador().getText().equals("")) {
				vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
				vista.getLblNewLabelAvisoNuevaReparacion().setText("Error, debe rellenar el campo 'ID ordenador' .");
			} else if (vista.getTextFieldNuevaReparacionNumHoras().getText().equals("")) {
				vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
				vista.getLblNewLabelAvisoNuevaReparacion().setText("Error, debe rellenar el campo 'Nº Horas' .");
			} else if (vista.getTextFieldNuevaReparacionCoste().getText().equals("")) {
				vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
				vista.getLblNewLabelAvisoNuevaReparacion().setText("Error, debe rellenar el campo 'Coste' .");
			} else {
				vista.getLblNewLabelAvisoNuevaReparacion().setText("");
				int id_ordenador = Integer.parseInt(vista.getTextFieldNuevaReparacionIDOrdenador().getText());
				String id_tecnico = vista.getTextFieldNuevaReparacionIDTecnico().getText();
				boolean bandera_Idtecnico = false;
				boolean bandera_Idordenador = false;
				boolean bandera_ordenador_sin_tecnico = true;
				int pos_tecnico = 0;
				int pos_id_ordenador = 0;
				int pos_id_tecnico = 0;
				for (int i = 0; i < ordenadores.size(); i++) {
					if (ordenadores.get(i).getId() == id_ordenador) {
						pos_id_ordenador = i;
						bandera_Idordenador = true;
					}
				}
				for (int i = 0; i < tecnicos.size(); i++) {
					if (tecnicos.get(i).getId().equals(id_tecnico)) {
						bandera_Idtecnico = true;
						pos_id_tecnico = i;
					}
				}
				for (int i = 0; i < reparaciones.size(); i++) {
					if (reparaciones.get(i).getId_ordenador() == id_ordenador) {
						bandera_ordenador_sin_tecnico = false;
						pos_tecnico = i;
					}
				}
				if (bandera_Idtecnico && bandera_Idordenador && bandera_ordenador_sin_tecnico) {
					boolean hora_ok = false;
					boolean coste_ok = false;
					double horas = 0;
					double coste = 0;
					try {
						horas = Double.parseDouble(vista.getTextFieldNuevaReparacionNumHoras().getText());
						hora_ok = true;
					} catch (Exception e1) {
						vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
						vista.getLblNewLabelAvisoNuevaReparacion()
								.setText("Error, el campo 'Nº Horas' debe ser numérico.");
					}

					try {
						coste = Double.parseDouble(vista.getTextFieldNuevaReparacionCoste().getText());
						coste_ok = true;
					} catch (Exception e1) {
						vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
						vista.getLblNewLabelAvisoNuevaReparacion()
								.setText("Error, el campo 'Coste' debe ser numérico.");
					}
					if (coste_ok && hora_ok) {
						reparaciones.add(new Reparacion(id_ordenador, id_tecnico, horas, coste));
						vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.GREEN);
						vista.getLblNewLabelAvisoNuevaReparacion().setText("Nueva reparación registrada con éxito.");
					}

				} else if (bandera_Idtecnico == false) {
					vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
					vista.getLblNewLabelAvisoNuevaReparacion()
							.setText("Error, el ID del técnico no se encuentra registrado. ");
				} else if (bandera_Idordenador == false) {
					vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
					vista.getLblNewLabelAvisoNuevaReparacion()
							.setText("Error, el ID del ordenador no se encuentra registrado. ");
				} else if (bandera_ordenador_sin_tecnico == false) {
					vista.getLblNewLabelAvisoNuevaReparacion().setForeground(Color.RED);
					vista.getLblNewLabelAvisoNuevaReparacion().setText("DENEGADO,ordenador ID: " + id_ordenador
							+ " asignado al agente ID: " + reparaciones.get(pos_tecnico).getId_tecnico());

				}

			}
		} else if (e.getSource() == vista.getMntmNewMenuItemListarReparaciones()) {
			vista.limpiarVista();
			vista.vistaListarReparaciones();
			// activación menú barra
			this.barraMenu();
			if (reparaciones.size() == 0) {
				vista.getLblNewLabelAvisoListarReparaciones().setForeground(Color.RED);
				vista.getLblNewLabelAvisoListarReparaciones().setText("AVISO¡¡¡ no hay reparaciones  en el registro.");
			} else {
				String cadena = "";
				for (Reparacion reparacion : reparaciones) {
					cadena += reparacion + "\n";
				}
				vista.getTextAreaListarReparaciones().setText(cadena);
			}

		} else if (e.getSource() == vista.getMusica()) {
			if (musica.isPlaying()) {
				musica.stop();
				vista.getMusica().setText("activar");
			} else {
				musica.play();
				vista.getMusica().setText("desactivar");
			}

		}
	}
	/**
	 * Asocia los eventos de acción a los elementos del menú de la vista.
	 * Agrega el controlador como ActionListener a cada elemento del menú
	 */

	public void barraMenu() {
		vista.getMntmNewMenuItemNuevoTecnico().addActionListener(this);
		vista.getMntmNewMenuItemListarTecnicos().addActionListener(this);
		vista.getMntmNewMenuItemSalir().addActionListener(this);
		vista.getMntmNewMenuItemEliminarTecnico().addActionListener(this);
		vista.getMntmNewMenuItemNuevoOrdenador().addActionListener(this);
		vista.getMntmNewMenuItemListarOrdenadores().addActionListener(this);
		vista.getMntmNewMenuItemNuevoOrdenador().addActionListener(this);
		vista.getMntmNewMenuItemActualizarOrdenador().addActionListener(this);
		vista.getMntmNewMenuItemNuevaReparacion().addActionListener(this);
		vista.getMntmNewMenuItemListarReparaciones().addActionListener(this);
		vista.getMusica().addActionListener(this);

	}

}
