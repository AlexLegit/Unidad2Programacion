package unidad2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ventana1 extends JFrame {


	public Ventana1() {
        setTitle("Ventana de Usuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.componentes();
    }

    public void componentes() {
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
}

