package vista;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
/**
 * 
 * @author JuanG
 * @version 1.0
 * La clase Vista representa la interfaz gráfica de usuario para el sistema. Es una subclase de JFrame.
 * Proporciona métodos para crear y controlar los componentes de la interfaz, como menús, botones, campos de texto, etc.
 *
 */
public class Vista extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmNewMenuItemSalir;
	private JMenuItem mntmNewMenuItemNuevoTecnico;
	private JMenuItem mntmNewMenuItemListarTecnicos;
	private JMenuItem mntmNewMenuItemEliminarTecnico;
	private JMenuItem mntmNewMenuItemNuevoOrdenador;
	private JMenuItem mntmNewMenuItemListarOrdenadores;
	private JMenuItem mntmNewMenuItemActualizarOrdenador;
	private JMenuItem mntmNewMenuItemNuevaReparacion;
	private JMenuItem mntmNewMenuItemListarReparaciones;
	private JTextField textFieldNuevoTecnicoNombre;
	private JTextField textFieldNuevoTecnicoID;
	private JButton btnNewButtonAltaTecnico;
	private JLabel lblNewLabelAvisoTecnico;
	private JLabel lblNewLabel;
	private JTextField textFieldIdEliminarTecnico;
	private JLabel lblNewLabelAvisoEliminarTecnico;
	private JButton btnNewButtonEliminarTecnico;
	private JTextArea textArea;
	private JLabel lblNewLabelAvisoMostrarTecnicos;
	private JTextField textFieldNuevoOrdenadorID;
	private JTextField textFieldNuevoOrdenadorNombre;
	private JCheckBox chckbxNewCheckBoxNuevoOrdenadorArreglado;
	private JButton btnNewButtonNuevoOrdenadorAlta;
	private JLabel lblNewLabelNuevoOrdenadorAviso;
	private JTextArea textAreaNuevoOrdenadorDescripcion;
	private JTextField textFieldActualizarOrdenadorID;
	private JTextField textFieldActualizarOrdenadorNombre;
	private JCheckBox chckbxNewCheckBoxModificarOrdenadorArreglado;
	private JButton btnNewButtonOrdenadorCargar;
	private JButton btnNewButtonActualizarOrdenador;
	private JTextArea textAreaModificarOrdenadorDescripcion;
	private JLabel lblNewLabelAvisoModificarOrdenador;
	private JLabel lblNewLabelListarOrdendores;
	private JTextArea textAreaListarOrdenadores;
	private JTextField textFieldNuevaReparacionIDTecnico;
	private JTextField textFieldNuevaReparacionIDOrdenador;
	private JTextField textFieldNuevaReparacionNumHoras;
	private JTextField textFieldNuevaReparacionCoste;
	private JLabel lblNewLabelAvisoNuevaReparacion;
	private JButton btnNewButtonNuevaReparacionAlta;
	private JLabel lblNewLabelAvisoListarReparaciones;
	private JTextArea textAreaListarReparaciones;
	private JMenuItem musica;
    

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	**
	 * Create the frame.
	 */
	

    /**
     * Constructor de la clase Vista.
     * Inicializa la interfaz gráfica de usuario llamando al método vistaBarraMenu().
     */
	public Vista() {
		
		vistaBarraMenu();
	}
	

	public JMenuItem getMusica() {
		return musica;
	}


	public JMenuItem getMntmNewMenuItemSalir() {
		return mntmNewMenuItemSalir;
	}

	public JMenuItem getMntmNewMenuItemNuevoTecnico() {
		return mntmNewMenuItemNuevoTecnico;
	}

	public JMenuItem getMntmNewMenuItemListarTecnicos() {
		return mntmNewMenuItemListarTecnicos;
	}

	public JMenuItem getMntmNewMenuItemEliminarTecnico() {
		return mntmNewMenuItemEliminarTecnico;
	}

	public JMenuItem getMntmNewMenuItemNuevoOrdenador() {
		return mntmNewMenuItemNuevoOrdenador;
	}

	public JMenuItem getMntmNewMenuItemListarOrdenadores() {
		return mntmNewMenuItemListarOrdenadores;
	}

	public JMenuItem getMntmNewMenuItemActualizarOrdenador() {
		return mntmNewMenuItemActualizarOrdenador;
	}

	public JMenuItem getMntmNewMenuItemNuevaReparacion() {
		return mntmNewMenuItemNuevaReparacion;
	}

	public JMenuItem getMntmNewMenuItemListarReparaciones() {
		return mntmNewMenuItemListarReparaciones;
	}
	
	
	
	
	/**
     * Crea la vista para agregar un nuevo técnico.
     * Esta vista muestra un formulario para ingresar los detalles del nuevo técnico y un botón para dar de alta al técnico.
     */
	//vista nuevo técnico
	public void nuevoTecnico() {
		
		vistaBarraMenu();
		
		lblNewLabel = new JLabel("Nuevo técnico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(40, 42, 114, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabelAvisoTecnico = new JLabel("");
		lblNewLabelAvisoTecnico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelAvisoTecnico.setBounds(163, 216, 500, 20);
		contentPane.add(lblNewLabelAvisoTecnico);
		
		btnNewButtonAltaTecnico = new JButton("Alta");
		btnNewButtonAltaTecnico.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonAltaTecnico.setBounds(40, 216, 85, 21);
		contentPane.add(btnNewButtonAltaTecnico);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(40, 108, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(40, 145, 67, 13);
		contentPane.add(lblNewLabel_2);
		
		textFieldNuevoTecnicoID = new JTextField();
		textFieldNuevoTecnicoID.setBounds(117, 107, 96, 19);
		contentPane.add(textFieldNuevoTecnicoID);
		textFieldNuevoTecnicoID.setColumns(10);
		
		textFieldNuevoTecnicoNombre = new JTextField();
		textFieldNuevoTecnicoNombre.setBounds(117, 144, 96, 19);
		contentPane.add(textFieldNuevoTecnicoNombre);
		textFieldNuevoTecnicoNombre.setColumns(10);
	}
	
	
	//get nuevo técnico
	
	

	public JTextField getTextFieldNuevoTecnicoID() {
		return textFieldNuevoTecnicoID;
	}

	public JTextField getTextFieldNuevoTecnicoNombre() {
		return textFieldNuevoTecnicoNombre;
	}
/**
 * 
 * @return ...
 */
	public JButton getBtnNewButtonAltaTecnico() {
		return btnNewButtonAltaTecnico;
	}

	public JLabel getLblNewLabelAvisoTecnico() {
		return lblNewLabelAvisoTecnico;
	}
	

	 /**
	   * Crea la vista para eliminar un técnico existente.
	   * Esta vista muestra un formulario para ingresar el ID del técnico a eliminar.
	   */
	//ventana eliminar técnico
	public void eliminarTecnico() {
		
		vistaBarraMenu();
		
		JLabel lblNewLabel = new JLabel("Eliminar técnico");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(115, 48, 181, 25);
		contentPane.add(lblNewLabel);
		
		textFieldIdEliminarTecnico = new JTextField();
		textFieldIdEliminarTecnico.setBounds(159, 120, 96, 19);
		contentPane.add(textFieldIdEliminarTecnico);
		textFieldIdEliminarTecnico.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(115, 123, 45, 16);
		contentPane.add(lblNewLabel_1);
		
		btnNewButtonEliminarTecnico = new JButton("Eliminar");
		btnNewButtonEliminarTecnico.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonEliminarTecnico.setBounds(128, 193, 96, 21);
		contentPane.add(btnNewButtonEliminarTecnico);
		
		lblNewLabelAvisoEliminarTecnico = new JLabel("");
		lblNewLabelAvisoEliminarTecnico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelAvisoEliminarTecnico.setBounds(80, 149, 600, 24);
		contentPane.add(lblNewLabelAvisoEliminarTecnico);
	}

	//get de eliminar técnico
	public JTextField getTextFieldIdEliminarTecnico() {
		return textFieldIdEliminarTecnico;
	}

	public JLabel getLblNewLabelAvisoEliminarTecnico() {
		return lblNewLabelAvisoEliminarTecnico;
	}

	public JButton getBtnNewButtonEliminarTecnico() {
		return btnNewButtonEliminarTecnico;
	}
	
	/**
	 * Método para mostrar la vista de los técnicos.
	 * Esta vista muestra una lista de todos los técnicos registrados en el sistema.
	 */
	//vista mostrar técnico
	public void mostrarTecnicos() {

		vistaBarraMenu();
		
		JLabel lblNewLabel = new JLabel("TÉCNICOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(192, 10, 132, 27);
		contentPane.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 37, 473, 204);
		contentPane.add(textArea);
		
		lblNewLabelAvisoMostrarTecnicos = new JLabel("");
		lblNewLabelAvisoMostrarTecnicos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelAvisoMostrarTecnicos.setBounds(54, 251, 500, 27);
		contentPane.add(lblNewLabelAvisoMostrarTecnicos);
		
	}
	
	
	//Get mostrar técnicos
	public JTextArea getTextArea() {
		return textArea;
	}

	public JLabel getLblNewLabelAvisoMostrarTecnicos() {
		return lblNewLabelAvisoMostrarTecnicos;
	}
	
	
	/**
	 * Método para mostrar la vista de creación de un nuevo ordenador.
	 * Esta vista permite al usuario ingresar los datos necesarios para crear un nuevo ordenador.
	 *
	 */
	//vista nuevo ordenador
	public void vistaNuevoOrdenador() {
		
		vistaBarraMenu();
		
		JLabel lblNewLabel = new JLabel("Nuevo ordenador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(25, 40, 151, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 105, 45, 20);
		contentPane.add(lblNewLabel_1);
		
		textFieldNuevoOrdenadorID = new JTextField();
		textFieldNuevoOrdenadorID.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldNuevoOrdenadorID.setBounds(97, 106, 96, 19);
		contentPane.add(textFieldNuevoOrdenadorID);
		textFieldNuevoOrdenadorID.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 149, 75, 20);
		contentPane.add(lblNewLabel_2);
		
		textFieldNuevoOrdenadorNombre = new JTextField();
		textFieldNuevoOrdenadorNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldNuevoOrdenadorNombre.setBounds(97, 152, 96, 19);
		contentPane.add(textFieldNuevoOrdenadorNombre);
		textFieldNuevoOrdenadorNombre.setColumns(10);
		
		chckbxNewCheckBoxNuevoOrdenadorArreglado = new JCheckBox("Arreglado");
		chckbxNewCheckBoxNuevoOrdenadorArreglado.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBoxNuevoOrdenadorArreglado.setBounds(25, 217, 106, 21);
		contentPane.add(chckbxNewCheckBoxNuevoOrdenadorArreglado);
		
		btnNewButtonNuevoOrdenadorAlta = new JButton("Alta");
		btnNewButtonNuevoOrdenadorAlta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonNuevoOrdenadorAlta.setBounds(25, 276, 106, 21);
		contentPane.add(btnNewButtonNuevoOrdenadorAlta);
		
		lblNewLabelNuevoOrdenadorAviso = new JLabel("");
		lblNewLabelNuevoOrdenadorAviso.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelNuevoOrdenadorAviso.setBounds(35, 70, 500, 25);
		contentPane.add(lblNewLabelNuevoOrdenadorAviso);
		
		JLabel lblNewLabel_3 = new JLabel("Descripción:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(223, 105, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		textAreaNuevoOrdenadorDescripcion = new JTextArea();
		textAreaNuevoOrdenadorDescripcion.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textAreaNuevoOrdenadorDescripcion.setBounds(223, 149, 249, 142);
		contentPane.add(textAreaNuevoOrdenadorDescripcion);
		
	}

	public JTextField getTextFieldNuevoOrdenadorID() {
		return textFieldNuevoOrdenadorID;
	}

	public JTextField getTextFieldNuevoOrdenadorNombre() {
		return textFieldNuevoOrdenadorNombre;
	}

	public JCheckBox getChckbxNewCheckBoxNuevoOrdenadorArreglado() {
		return chckbxNewCheckBoxNuevoOrdenadorArreglado;
	}

	public JButton getBtnNewButtonNuevoOrdenadorAlta() {
		return btnNewButtonNuevoOrdenadorAlta;
	}

	public JLabel getLblNewLabelNuevoOrdenadorAviso() {
		return lblNewLabelNuevoOrdenadorAviso;
	}

	public JTextArea getTextAreaNuevoOrdenadorDescripcion() {
		return textAreaNuevoOrdenadorDescripcion;
	}
	
	/**
	 * Método para mostrar la vista de modificación de un ordenador existente.
	 * Esta vista permite al usuario editar los datos de un ordenador seleccionado.
	 * 
	 */
	
	public void vistaModificarOrdenador() {
		
		vistaBarraMenu();
		
		JLabel lblNewLabel = new JLabel("Actualizar ordenador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(31, 33, 201, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(17, 95, 35, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(17, 142, 63, 24);
		contentPane.add(lblNewLabel_2);
		
		textFieldActualizarOrdenadorID = new JTextField();
		textFieldActualizarOrdenadorID.setBounds(90, 94, 96, 19);
		contentPane.add(textFieldActualizarOrdenadorID);
		textFieldActualizarOrdenadorID.setColumns(10);
		
		textFieldActualizarOrdenadorNombre = new JTextField();
		textFieldActualizarOrdenadorNombre.setBounds(90, 147, 96, 19);
		contentPane.add(textFieldActualizarOrdenadorNombre);
		textFieldActualizarOrdenadorNombre.setColumns(10);
		
		chckbxNewCheckBoxModificarOrdenadorArreglado = new JCheckBox("Arreglado");
		chckbxNewCheckBoxModificarOrdenadorArreglado.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBoxModificarOrdenadorArreglado.setBounds(17, 219, 114, 21);
		contentPane.add(chckbxNewCheckBoxModificarOrdenadorArreglado);
		
		btnNewButtonOrdenadorCargar = new JButton("Cargar");
		btnNewButtonOrdenadorCargar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonOrdenadorCargar.setBounds(17, 300, 85, 21);
		contentPane.add(btnNewButtonOrdenadorCargar);
		
		btnNewButtonActualizarOrdenador = new JButton("Actualizar");
		btnNewButtonActualizarOrdenador.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonActualizarOrdenador.setBounds(112, 300, 114, 21);
		contentPane.add(btnNewButtonActualizarOrdenador);
		
		JLabel lblNewLabel_3 = new JLabel("Descripción:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(257, 89, 103, 24);
		contentPane.add(lblNewLabel_3);
		
		textAreaModificarOrdenadorDescripcion = new JTextArea();
		textAreaModificarOrdenadorDescripcion.setBounds(257, 114, 275, 190);
		contentPane.add(textAreaModificarOrdenadorDescripcion);
		
		lblNewLabelAvisoModificarOrdenador = new JLabel("");
		lblNewLabelAvisoModificarOrdenador.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelAvisoModificarOrdenador.setBounds(41, 67, 501, 18);
		contentPane.add(lblNewLabelAvisoModificarOrdenador);
		
	}
	
	
	
	
	public JTextField getTextFieldActualizarOrdenadorID() {
		return textFieldActualizarOrdenadorID;
	}

	public JTextField getTextFieldActualizarOrdenadorNombre() {
		return textFieldActualizarOrdenadorNombre;
	}

	public JCheckBox getChckbxNewCheckBoxModificarOrdenadorArreglado() {
		return chckbxNewCheckBoxModificarOrdenadorArreglado;
	}

	public JButton getBtnNewButtonOrdenadorCargar() {
		return btnNewButtonOrdenadorCargar;
	}

	public JButton getBtnNewButtonActualizarOrdenador() {
		return btnNewButtonActualizarOrdenador;
	}

	public JTextArea getTextAreaModificarOrdenadorDescripcion() {
		return textAreaModificarOrdenadorDescripcion;
	}

	public JLabel getLblNewLabelAvisoModificarOrdenador() {
		return lblNewLabelAvisoModificarOrdenador;
	}
	 /**
	 * Método para mostrar la vista de listado de ordenadores.
	 * Esta vista muestra una lista de todos los ordenadores existentes en el sistema.
	 */

	public void vistaListarOrdenadores() {
		
		vistaBarraMenu();
		
		lblNewLabelListarOrdendores = new JLabel("Ordenadores");
		lblNewLabelListarOrdendores.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelListarOrdendores.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelListarOrdendores.setBounds(36, 23, 600, 22);
		contentPane.add(lblNewLabelListarOrdendores);
		
		textAreaListarOrdenadores = new JTextArea();
		textAreaListarOrdenadores.setBounds(25, 56, 385, 172);
		contentPane.add(textAreaListarOrdenadores);
	}
	
	public JLabel getLblNewLabelListarOrdendores() {
		return lblNewLabelListarOrdendores;
	}

	public JTextArea getTextAreaListarOrdenadores() {
		return textAreaListarOrdenadores;
	}
	/**
	 * Método para mostrar la vista de creación de una nueva reparación.
	 * Esta vista permite al usuario ingresar los datos necesarios para registrar una nueva reparación en el sistema.
	 * Los datos pueden incluir información sobre el cliente, el ordenador, la descripción del problema, etc.
	 * Una vez que se ingresan los datos, se puede confirmar el registro de la reparación.
	 * En caso de que falten datos obligatorios o haya errores en la entrada, se muestra un mensaje de error al usuario.
	 */
	
	public void vistaNuevaReparacion() {
		
		vistaBarraMenu();
		
		JLabel lblNewLabel = new JLabel("Nueva reparación");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(37, 31, 179, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Técnico");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(37, 75, 104, 17);
		contentPane.add(lblNewLabel_1);
		
		textFieldNuevaReparacionIDTecnico = new JTextField();
		textFieldNuevaReparacionIDTecnico.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldNuevaReparacionIDTecnico.setBounds(157, 74, 96, 19);
		contentPane.add(textFieldNuevaReparacionIDTecnico);
		textFieldNuevaReparacionIDTecnico.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID Ordenador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(37, 113, 143, 22);
		contentPane.add(lblNewLabel_2);
		
		textFieldNuevaReparacionIDOrdenador = new JTextField();
		textFieldNuevaReparacionIDOrdenador.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldNuevaReparacionIDOrdenador.setBounds(157, 117, 96, 19);
		contentPane.add(textFieldNuevaReparacionIDOrdenador);
		textFieldNuevaReparacionIDOrdenador.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nº Horas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(37, 155, 80, 17);
		contentPane.add(lblNewLabel_3);
		
		textFieldNuevaReparacionNumHoras = new JTextField();
		textFieldNuevaReparacionNumHoras.setBounds(157, 156, 96, 19);
		contentPane.add(textFieldNuevaReparacionNumHoras);
		textFieldNuevaReparacionNumHoras.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Coste");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(37, 197, 80, 13);
		contentPane.add(lblNewLabel_4);
		
		textFieldNuevaReparacionCoste = new JTextField();
		textFieldNuevaReparacionCoste.setBounds(157, 196, 96, 19);
		contentPane.add(textFieldNuevaReparacionCoste);
		textFieldNuevaReparacionCoste.setColumns(10);
		
		lblNewLabelAvisoNuevaReparacion = new JLabel("");
		lblNewLabelAvisoNuevaReparacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelAvisoNuevaReparacion.setBounds(37, 254, 500, 22);
		contentPane.add(lblNewLabelAvisoNuevaReparacion);
		
		btnNewButtonNuevaReparacionAlta = new JButton("Alta");
		btnNewButtonNuevaReparacionAlta.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonNuevaReparacionAlta.setBounds(316, 223, 85, 21);
		contentPane.add(btnNewButtonNuevaReparacionAlta);
	}
	
	
	
	public JTextField getTextFieldNuevaReparacionIDTecnico() {
		return textFieldNuevaReparacionIDTecnico;
	}

	public JTextField getTextFieldNuevaReparacionIDOrdenador() {
		return textFieldNuevaReparacionIDOrdenador;
	}

	public JTextField getTextFieldNuevaReparacionNumHoras() {
		return textFieldNuevaReparacionNumHoras;
	}

	public JTextField getTextFieldNuevaReparacionCoste() {
		return textFieldNuevaReparacionCoste;
	}

	public JLabel getLblNewLabelAvisoNuevaReparacion() {
		return lblNewLabelAvisoNuevaReparacion;
	}

	public JButton getBtnNewButtonNuevaReparacionAlta() {
		return btnNewButtonNuevaReparacionAlta;
	}

	/**
	 * Método para mostrar la vista de listado de reparaciones.
	 * Esta vista muestra al usuario una lista de todas las reparaciones registradas en el sistema.
	 * Puede incluir información como el número de reparación, el estado de la reparación, etc.
	 */
	public void vistaListarReparaciones() {
		
		vistaBarraMenu();
		
		lblNewLabelAvisoListarReparaciones = new JLabel("Reparaciones");
		lblNewLabelAvisoListarReparaciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabelAvisoListarReparaciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabelAvisoListarReparaciones.setBounds(29, 10, 500, 22);
		contentPane.add(lblNewLabelAvisoListarReparaciones);
		
		textAreaListarReparaciones = new JTextArea();
		textAreaListarReparaciones.setBounds(10, 47, 416, 206);
		contentPane.add(textAreaListarReparaciones);
		
	}
	
	
	
	public JLabel getLblNewLabelAvisoListarReparaciones() {
		return lblNewLabelAvisoListarReparaciones;
	}

	public JTextArea getTextAreaListarReparaciones() {
		return textAreaListarReparaciones;
	}

	/**
	 * Método que cuando es llamado finaliza el programa
	 */
	public void finalizar() {
		System.exit(0);
	}
	/**
	 * Método para limpiar la vista y restaurar su estado inicial.
	 * Este método se utiliza para borrar cualquier contenido existente en la vista y dejarla vacía.
	 */
	//limpiar las vistas
	public void limpiarVista() {
		this.contentPane.removeAll();
		this.contentPane.updateUI();
	}
	/**
	 *
	 * Este método se encarga de crear y mostrar la barra de menú en la vista.
	 * contiene opciones y acciones que se pueden realizar en la vista.
	 */

	public void vistaBarraMenu() {
		setTitle("Taller Reparaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 497);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		

		
		JMenu mnNewMenu = new JMenu("Archivo\r\n");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItemSalir = new JMenuItem("Salir");
		mntmNewMenuItemSalir.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu.add(mntmNewMenuItemSalir);
		
		JMenu mnNewMenu_00 = new JMenu("Técnicos");
		mnNewMenu_00.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_00);
		
		mntmNewMenuItemNuevoTecnico = new JMenuItem("Nuevo técnico");
		mntmNewMenuItemNuevoTecnico.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_00.add(mntmNewMenuItemNuevoTecnico);
		
		mntmNewMenuItemListarTecnicos = new JMenuItem("Listado técnicos");
		mntmNewMenuItemListarTecnicos.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_00.add(mntmNewMenuItemListarTecnicos);
		
		mntmNewMenuItemEliminarTecnico = new JMenuItem("Eliminar técnico");
		mntmNewMenuItemEliminarTecnico.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_00.add(mntmNewMenuItemEliminarTecnico);
		
		JMenu mnNewMenu_1 = new JMenu("Ordenadores");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItemNuevoOrdenador = new JMenuItem("Nuevo ordenador");
		mntmNewMenuItemNuevoOrdenador.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItemNuevoOrdenador);
		
		mntmNewMenuItemListarOrdenadores = new JMenuItem("Listado ordenadores");
		mntmNewMenuItemListarOrdenadores.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItemListarOrdenadores);
		
		mntmNewMenuItemActualizarOrdenador = new JMenuItem("Actualiar ordenador");
		mntmNewMenuItemActualizarOrdenador.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_1.add(mntmNewMenuItemActualizarOrdenador);
		
		JMenu mnNewMenu_2 = new JMenu("Reparaciones");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_2);
		
		JMenu mnReparaciones = new JMenu("Musica");
        mnReparaciones.setFont(new Font("Segoe UI", Font.BOLD, 14));
        menuBar.add(mnReparaciones);
        
        musica = new JMenuItem("Silenciar");
        mnReparaciones.add(musica);
        
		mntmNewMenuItemNuevaReparacion = new JMenuItem("Nueva reparación");
		mntmNewMenuItemNuevaReparacion.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.add(mntmNewMenuItemNuevaReparacion);
		
		mntmNewMenuItemListarReparaciones = new JMenuItem("Listado reparaciones");
		mntmNewMenuItemListarReparaciones.setFont(new Font("Segoe UI", Font.BOLD, 14));
		mnNewMenu_2.add(mntmNewMenuItemListarReparaciones);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		  setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 500, 500);
	        contentPane = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Image image = new ImageIcon("fondo2.jpg").getImage();
	                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	            }
	        };
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	
	}

}
