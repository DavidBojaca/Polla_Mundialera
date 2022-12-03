package vista;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import control.Controlador;
import utils.Utils;

public class Ventana extends JFrame{
    public JTextField nombre = new JTextField();
    public JTextField clave = new JTextField();
    public JTextField nombre2 = new JTextField();
    public JTextField clave2 = new JTextField();
    private JLabel lbl = new JLabel("Nombre de usuario: ");
    private JLabel lbl1 = new JLabel("Clave del usuario: ");
    private JLabel lbl2 = new JLabel("Nombre de usuario: ");
    private JLabel lbl3 = new JLabel("Clave del usuario: ");
    public JLabel titulo = new JLabel("Ingresar "); 
    public JButton btn = new JButton("Ingresar");
    public JButton btn2 = new JButton("Crear");
    Font fuente = new Font("Helvetivca", Font.BOLD, 24);
    private Panel pnl = new Panel();
    private Controlador c;
    
    public Ventana(){
        this.setBounds(10, 10, 1200, 900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents(){

        this.pnl.setBounds(0,0,1200,900);
        this.add(pnl);

        this.btn.setBounds(200,700,200,30);
        this.add(btn);

        this.btn2.setBounds(600,700,200,30);
        this.add(btn2);

        this.nombre.setBounds(250, 300, 300, 30);
        //nombre.setVisible(true);
        this.add(nombre);

        this.clave.setBounds(250, 400, 300, 30);
        //clave.setVisible(true);
        this.add(clave); 

        this.nombre2.setBounds(650, 300, 300, 30);
        //nombre.setVisible(true);
        this.add(nombre2);

        this.clave2.setBounds(650, 400, 300, 30);
        //clave.setVisible(true);
        this.add(clave2);

        this.lbl.setBounds(100, 300, 200, 50);
        this.lbl.setFont(new java.awt.Font("Helvetivca", Font.BOLD, 10));
        lbl.setForeground(Color.WHITE);
        this.add(lbl);

        this.lbl1.setBounds(100, 400, 200, 50);
        this.lbl1.setFont(new java.awt.Font("Helvetica", Font.BOLD, 10));
        lbl1.setForeground(Color.WHITE);
        this.add(lbl1); 

        this.lbl2.setBounds(600, 300, 200, 50);
        this.lbl2.setFont(new java.awt.Font("Helvetica", Font.BOLD, 10));
        lbl2.setForeground(Color.WHITE);
        this.add(lbl2); 

        this.lbl3.setBounds(600, 400, 200, 50);
        this.lbl3.setFont(new java.awt.Font("Helvetica", Font.BOLD, 10));
        lbl3.setForeground(Color.WHITE);
        this.add(lbl3); 

        this.titulo.setBounds(200, 100, 200, 100);
        this.titulo.setFont(fuente);
        titulo.setForeground(Color.WHITE);
        this.add(titulo);


    }
    public void setControlador(Controlador control) {
        this.c = control;
        this.btn.setActionCommand(utils.Utils.INGRESAR);
        //this.btn.addActionListener(this.c);

        this.btn2.setActionCommand(utils.Utils.CREAR);
        //this.btn2.addActionListener(this.c);

    }

    public Panel getPanel(){
        return pnl;
    }

}
