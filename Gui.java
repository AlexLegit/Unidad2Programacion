package examen;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BorderFactory;

public class Gui extends JFrame {

    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Gui frame = new Gui();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Gui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 512, 512);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(22, 93, 117));

        JLabel title = new JLabel("  Factura en Java - NetBeans - ArrayList y POO");
        title.setForeground(Color.WHITE);
        title.setBounds(10, 10, 512, 50);
        title.setBackground(new Color(22, 93, 117));
        title.setOpaque(false);
        panel.add(title);

        JPanel datosClientePanel = new JPanel();
        datosClientePanel.setBounds(10, 80, 512, 120);
        datosClientePanel.setBackground(Color.WHITE);
        datosClientePanel.setLayout(null);
        panel.add(datosClientePanel);
        
        JLabel clientes = new JLabel("Datos Del Cliente");
        clientes.setBounds(10, 10, 100, 20);
        datosClientePanel.add(clientes);

        JLabel Documento = new JLabel("Documento");
        Documento.setBounds(10, 40, 100, 20);
        datosClientePanel.add(Documento);

        JTextField txtDocumento = new JTextField();
        txtDocumento.setBounds(80, 40, 120, 20);
        datosClientePanel.add(txtDocumento);

        JLabel Nombre = new JLabel("Nombre");
        Nombre.setBounds(220, 40, 100, 20);
        datosClientePanel.add(Nombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(280, 40, 120, 20);
        datosClientePanel.add(txtNombre);

        JLabel Direccion = new JLabel("Dirección");
        Direccion.setBounds(10, 75, 100, 20);
        datosClientePanel.add(Direccion);

        JTextField txtDireccion = new JTextField();
        txtDireccion.setBounds(80, 75, 120, 20);
        datosClientePanel.add(txtDireccion);

        JLabel Telefono = new JLabel("Teléfono");
        Telefono.setBounds(220, 75, 100, 20);
        datosClientePanel.add(Telefono);

        JTextField txtTelefono = new JTextField();
        txtTelefono.setBounds(280, 75, 120, 20);
        datosClientePanel.add(txtTelefono);
        
        
        JPanel datosFacturaPanel = new JPanel();
        datosFacturaPanel.setBounds(10, 210, 512, 80);
        datosFacturaPanel.setBackground(Color.WHITE);
        datosFacturaPanel.setLayout(null);
        panel.add(datosFacturaPanel);
        
        JLabel datosFactura = new JLabel("Datos De Facturacion");
        datosFactura.setBounds(10, 10, 130, 20);
        datosFacturaPanel.add(datosFactura);

        JLabel NoFactura = new JLabel("NoFactura");
        NoFactura.setBounds(10, 40, 100, 20);
        datosFacturaPanel.add(NoFactura);

        JTextField txtNoFactura = new JTextField();
        txtNoFactura.setBounds(80, 40, 120, 20);
        datosFacturaPanel.add(txtNoFactura);

        JLabel Fecha = new JLabel("Fecha");
        Fecha.setBounds(220, 40, 100, 20);
        datosFacturaPanel.add(Fecha);

        JTextField txtFecha = new JTextField();
        txtFecha.setBounds(280, 40, 120, 20);
        datosFacturaPanel.add(txtFecha);

        JPanel verListado = new JPanel();
        verListado.setBounds(10, 300, 512, 100);
        verListado.setBackground(Color.WHITE);
        verListado.setLayout(null);
        panel.add(verListado);
        
        
        String[] columnas = {"Producto", "Cantidad", "Valor", "Sub Total"};
        Object[][] datos = {
                {"Agua", 2, 500, 1000.0},
                {"Cereal", 5, 1000, 5000.0},
                {"Leche", 2, 300, 600.0}
        };

        JTable tabla = new JTable(new DefaultTableModel(datos, columnas));
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(10, 10, 512, 90);
        verListado.add(scroll);
        panel.setVisible(true);
        
        JPanel total = new JPanel();
        total.setBounds(10, 405, 512, 100);
        total.setBackground(Color.WHITE);
        total.setLayout(null);
        panel.add(total);
        
        JLabel DatosTotal = new JLabel("SubTotal:  ");
        DatosTotal.setBounds(10, 10, 130, 20);
        total.add(DatosTotal);
        
        JLabel descuento = new JLabel("%Descuento:  ");
        descuento.setBounds(10, 30, 130, 20);
        total.add(descuento);
        
        JLabel iva = new JLabel("Iva:  ");
        iva.setBounds(10, 50, 130, 20);
        total.add(iva);
        
        JLabel totalFac = new JLabel("Total Facturacion:  ");
        totalFac.setBounds(10, 70, 130, 20);
        total.add(totalFac);
        
        
        
        
        
        
        
        
        JButton añadir = new JButton(".");
        añadir.setBounds(200, 320, 15, 15);
        panel.add(añadir);
        
        JMenuBar barra = new JMenuBar();
        JMenu lista1 = new JMenu("Más +");

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
        add(panel);
    }
}


