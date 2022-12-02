package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;


import control.Controller;
import utils.Utils;

public class WindowF1 extends JFrame{
    private JButton botonInit = new JButton("Generar equipos");
    private Controller control;
    private PanelBackground panelBackground = new PanelBackground();
 

    public WindowF1 (){
        this.setBounds(10, 10, 1700, 900);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents() {
        this.botonInit.setBounds(430, 15, 200, 30);
        botonInit.setFont(new Font("Helvetivca", Font.PLAIN, 18));
        botonInit.setForeground(Color.BLACK);
        this.add(botonInit);
        

        this.panelBackground.setBounds(0, 0, 1700, 870);
        this.setBackground(Color.LIGHT_GRAY);
        this.add(panelBackground);


    }

    public void fontColorWhiteJL(JLabel label){
        label.setFont(new Font("Helvetivca", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
    }

    public void fontColorWhiteJTF(JTextField text){
        text.setFont(new Font("Helvetivca", Font.BOLD, 20));
        text.setForeground(Color.BLACK);
    }

    public void setController(Controller control) {
        this.control = control;
        this.botonInit.setActionCommand(Utils.INIT);
        this.botonInit.addActionListener(this.control);
    }

    public PanelBackground getPanelBackground() {
        return panelBackground;
    }

}
