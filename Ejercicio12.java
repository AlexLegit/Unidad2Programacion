package unidad2Ejercicio12;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ejercicio12 extends JFrame {

	
	public Ejercicio12() {
        setTitle("Ventana de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.componentes();
        
    }

    public void componentes() {
    	
    	//this.Login();
    	
    	this.Registro();
        
    }
    public void Login() {
    	JPanel login = new JPanel();
        login.setSize(400,512);
        login.setLayout(null);
        login.setBackground(Color.gray);

        JLabel title = new JLabel("Bienvenido al Incio de Sesion");
		title.setHorizontalAlignment(JLabel.CENTER);
        title.setBackground(Color.CYAN);
        title.setBounds(100, 10, 190, 40);
        title.setOpaque(true);
        login.add(title);

        JLabel usuario = new JLabel("Usuario");
        usuario.setHorizontalAlignment(JLabel.CENTER);
        usuario.setBackground(Color.CYAN);
        usuario.setBounds(140, 80, 100, 30);
        usuario.setOpaque(true);
        login.add(usuario);

        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(150, 130, 80, 30);
        login.add(usuarioField);

        JLabel contraseña = new JLabel("Contraseña");
        contraseña.setHorizontalAlignment(JLabel.CENTER);
        contraseña.setBackground(Color.cyan);
        contraseña.setBounds(120, 170, 130, 30);
        contraseña.setOpaque(true);
        login.add(contraseña);

        JPasswordField contraseñaField = new JPasswordField();
        contraseñaField.setBounds(150, 220, 80, 30);
        login.add(contraseñaField);

        JButton acceder = new JButton("Entrar");
        acceder.setHorizontalAlignment(JLabel.CENTER);
        acceder.setBounds(150, 270, 80, 30);
        login.add(acceder);

        login.setSize(400, 500);
        add(login);
        
    }
    
	public void Registro() {

		
		JPanel Registro = new JPanel();
		Registro.setSize(400,512);
		Registro.setLayout(null);
		Registro.setBackground(Color.CYAN);
		
		 JLabel title = new JLabel("ORDENAR");
			title.setHorizontalAlignment(JLabel.CENTER);
			title.setFont(new Font("SignPainter", Font.BOLD, 30));
	        title.setBackground(Color.CYAN);
	        title.setBounds(100, 10, 190, 40);
	        title.setOpaque(true);
	        Registro.add(title);
	        
	        JLabel usuario = new JLabel("Nombre del Comprador:");
	        usuario.setFont(new Font("Agency FB", Font.BOLD, 15));
	        usuario.setBounds(5, 80, 400, 60);
	        Registro.add(usuario);
	        
	        JTextField usuarioField = new JTextField();
	        usuarioField.setBounds(10, 120, 300, 20);
	        Registro.add(usuarioField);
	        
	        JCheckBox tipo1 = new JCheckBox("Dulce");
	        tipo1.setBounds(10, 140, 70, 35);
	        tipo1.setOpaque(false);
	        tipo1.setBackground(Color.green);
	        Registro.add(tipo1);
	        
	        JCheckBox tipo2 = new JCheckBox("Salada");
	        tipo2.setBounds(100, 140, 70, 35);
	        tipo2.setOpaque(false);
	        tipo2.setBackground(Color.green);
	        Registro.add(tipo2);
	        
	        JLabel seleccion = new JLabel("Seleccione sus Preferencias");
	        seleccion.setFont(new Font("Agency FB", Font.BOLD, 15));
	        seleccion.setBounds(10, 150, 300, 60);
	        Registro.add(seleccion);
	        
	        JCheckBox opcion1 = new JCheckBox("Nutella y Fresas");
	        opcion1.setBounds(10, 200, 120, 35);
	        opcion1.setOpaque(false);
	        opcion1.setBackground(Color.green);
	        Registro.add(opcion1);
	        
	        JCheckBox opcion2 = new JCheckBox("MermeladaF y QuesoC");
	        opcion2.setBounds(170, 200, 160, 35);
	        opcion2.setOpaque(false);
	        opcion2.setBackground(Color.green);
	        Registro.add(opcion2);
	        
	        JLabel seleccion2 = new JLabel("Mas Opciones:");
	        seleccion2.setFont(new Font("Agency FB", Font.BOLD, 15));
	        seleccion2.setBounds(10, 220, 300, 60);
	        Registro.add(seleccion2);
	        
	        String Opciones[] = {"Fresas Solas","Solo Chocolate","Solo Queso","Queso Chocolate","Fresas Queso"};
			
			JComboBox<Object> opciones1 = new JComboBox<Object>(Opciones);
			opciones1.setBounds(10, 270, 350, 20); 
			Registro.add(opciones1);
			
			//seleccion del menu superior de la ventana
			JMenuBar barra = new JMenuBar(); 
			JMenu lista1 = new JMenu("Mas + ");
			
			JMenuItem option1 = new JMenuItem("Abrir");
			JMenuItem option2 = new JMenuItem("Nuevo");
			JMenuItem option3 = new JMenuItem("Editar");
			JMenuItem option4 = new JMenuItem("Eliminar");
			
			barra.add(lista1);
			lista1.add(option1);
			lista1.add(option2);
			lista1.add(option3);
			lista1.add(option4);
			
			this.setJMenuBar(barra);
	        add(Registro);
	        setSize(400, 512);
		
	}
	
	//public void
}