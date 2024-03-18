package unidad2Ejercicio12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Ejercicio12 extends JFrame {

	
	public Ejercicio12() {
        setTitle("Ventana de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.componentes();
        
    }

    public void componentes() {
    	
    	//this.Login();
    	
    	//this.Registro();
    	
    	//this.Figuras();
    	
    	//this.paint(getGraphics());
    	
    	//this.Calculador();
    	
    	this.Lista();
    	
    	//this.Userlogin();
        
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
	
	public void Figuras() {
		
		setVisible(true);
		setTitle("Figuras Con Dibujos" );
		setSize(1024,512);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		}

	public void paint(Graphics g) {
	

		
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;


		g2d.drawRect(750, 260, 100, 100);
		g2d.drawRect(700, 220, 100, 100);
		g2d.drawLine(850, 360, 800, 320);
		g2d.drawLine(850, 260, 800, 220);
		g2d.drawLine(750, 360, 700, 320);
		g2d.drawLine(700, 220, 750, 260);
	}
	
	public void Calculador() {
		
		setVisible(true);
		setTitle("Calculadora" );
		setSize(310,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.botones();
		}

	public void botones() {

		JPanel botones=new JPanel();
		botones.setSize(this.getWidth(),this.getHeight());
		botones.setLocation(0,0);
		botones.setLayout(new BorderLayout());
		botones.setBackground(Color.gray);

		JLabel input = new JLabel("20.00", 4);
		input.setOpaque(true);
		input.setBackground(Color.white);
		input.setFont(new Font("SingPainter", Font.BOLD, 40));
		botones.add(input, BorderLayout.NORTH);

		JPanel botonesPanel = new JPanel();
		botonesPanel.setLayout(new GridLayout(4, 3));
		botonesPanel.setBackground(Color.RED);
		botones.add(botonesPanel, BorderLayout.CENTER);

		String botonTxt[] = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", ".", "="};

		for (int i = 0; i < botonTxt.length; i++) {
		botonesPanel.add(new JButton(botonTxt[i]));
		}

		JPanel accionPanel = new JPanel();
		accionPanel.setLayout(new GridLayout(6, 1));
		accionPanel.setBackground(Color.GREEN);
		botones.add(accionPanel, BorderLayout.EAST);

		String accionTxt[] = {"DEL", "+", "-", "*", "/", "CE"};

		for (int i = 0; i < accionTxt.length; i++) {
		accionPanel.add(new JButton(accionTxt[i]));
		}

		add(botones);
		
	
		
	}
		
	public void Userlogin() {

		
		JPanel login = new JPanel();
		login.setLayout(new BorderLayout());
		login.setBackground(new Color(13, 61, 131));

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(getClass().getResource("/userIcon.png")));
		login.add(img, BorderLayout.NORTH);

		JLabel img2 = new JLabel("");
		img2.setIcon(new ImageIcon(getClass().getResource("/candado.png")));
		login.add(img2, BorderLayout.CENTER);

		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(null);
		contentPanel.setBackground(new Color(13, 61, 131));
		login.add(contentPanel, BorderLayout.SOUTH);

		JLabel user = new JLabel("User Login");
		user.setBounds(280, 20, 200, 40);
		user.setFont(new Font("signPainter", Font.BOLD, 30));
		user.setForeground(Color.white);
		contentPanel.add(user);

		JLabel title = new JLabel("My account", SwingConstants.CENTER);
		title.setBounds(220, 80, 250, 100);
		title.setFont(new Font("signPainter", Font.BOLD, 40));
		title.setForeground(Color.YELLOW);
		contentPanel.add(title);

		JLabel usuario = new JLabel("Enter your username", SwingConstants.CENTER);
		usuario.setBounds(170, 170, 180, 30);
		usuario.setFont(new Font("signPainter", Font.BOLD, 12));
		usuario.setForeground(Color.white);
		contentPanel.add(usuario);

		JTextField usuarioField = new JTextField();
		usuarioField.setBounds(200, 200, 280, 30);
		contentPanel.add(usuarioField);

		JLabel contraseña = new JLabel("Enter your password", SwingConstants.CENTER);
		contraseña.setBounds(120, 250, 280, 30);
		contraseña.setFont(new Font("signPainter", Font.BOLD, 12));
		contraseña.setForeground(Color.white);
		contentPanel.add(contraseña);

		JPasswordField contraseñaField = new JPasswordField();
		contraseñaField.setBounds(200, 280, 280, 30);
		contraseñaField.setOpaque(true);
		contentPanel.add(contraseñaField);

		JButton acceder = new JButton("Acceder");
		acceder.setBounds(270, 320, 140, 50);
		acceder.setBackground(Color.YELLOW);
		contentPanel.add(acceder);

		JLabel cuenta = new JLabel("Don't have an account?", SwingConstants.CENTER);
		cuenta.setBounds(250, 380, 180, 30);
		cuenta.setForeground(Color.WHITE);
		contentPanel.add(cuenta);

		JButton registro = new JButton("Sign up");
		registro.setBounds(250, 420, 180, 30);
		registro.setBackground(Color.YELLOW);
		contentPanel.add(registro);

		JPanel login2 = new JPanel();
		login2.setBounds(100, 80, 500, 300);
		login2.setLayout(null);
		login2.setBackground(new Color(13, 54, 113));
		contentPanel.add(login2);

		this.add(login);
	
		
		
	}
		
	public void Lista() {
		
		
		JPanel admin = new JPanel();
		admin.setSize(this.getWidth(), this.getHeight());
		admin.setLocation(0,0);
		admin.setLayout(null);
		admin.setBackground(Color.cyan);
		
		JLabel usuario = new JLabel("Usuarios");
		usuario.setBounds(350, 20, 400, 100);
		usuario.setFont(new Font("SignPainter", Font.BOLD, 80));
		admin.add(usuario);
		
		JLabel widget = new JLabel("Listado",0);
		widget.setBounds(40, 120, 300, 40);
		widget.setFont(new Font("SignPainter", Font.BOLD, 40));
		widget.setForeground(Color.white);
		admin.add(widget);
		
		JLabel widgettext = new JLabel("11",0);
		widgettext.setBounds(40, 160, 300, 40);
		widgettext.setFont(new Font("SignPainter", Font.BOLD, 30));
		widgettext.setForeground(Color.white);
		admin.add(widgettext);
		
		JLabel widget2 = new JLabel("");
		widget2.setBounds(40, 120, 300, 80);
		widget2.setOpaque(true);
		widget2.setBackground(Color.blue);
		admin.add(widget2); 
		
		JButton agregar = new JButton("Añadir");
		agregar.setBounds(900, 200, 80, 40);
		agregar.setBackground(Color.cyan);
		admin.add(agregar);
		
		JButton descargar = new JButton("Descargar");
		descargar.setBounds(750, 200, 100, 40);
		descargar.setBackground(Color.cyan);
		admin.add(descargar);
		
		
		String titles[] = {"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"};
		String data[][] = {
				
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"},
				{"No. Control","Nombre","Apellidos","Correo electrónico","Semestre","Carrera"}
				
		};
		
		JTable table = new JTable(data,titles);
		
		JScrollPane table_scroll = new JScrollPane(table);
		table_scroll.setBounds(40, 260, 920, 380);
		admin.add(table_scroll);
		this.add(admin);
	}
}
