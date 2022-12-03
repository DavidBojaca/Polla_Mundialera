package vista;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;


import control.Controller2;
import utils.Utils;

public class WindowF1 extends JFrame{
    private static WindowF1 instance;
    private JButton botonSaveMarcadores = new JButton("Guardar Selecciones");
    private Controller2 control;
    private PanelFase1 panelFase1 = new PanelFase1();
    private JTextField equipo1_Game1_JTF = new JTextField();
    private JTextField equipo2_Game1_JTF = new JTextField();
    private JTextField equipo1_Game2_JTF = new JTextField();
    private JTextField equipo2_Game2_JTF = new JTextField();
    private JTextField equipo1_Game3_JTF = new JTextField();
    private JTextField equipo2_Game3_JTF = new JTextField();
    private JTextField equipo1_Game4_JTF = new JTextField();
    private JTextField equipo2_Game4_JTF = new JTextField();
    private JTextField equipo1_Game5_JTF = new JTextField();
    private JTextField equipo2_Game5_JTF = new JTextField();
    private JTextField equipo1_Game6_JTF = new JTextField();
    private JTextField equipo2_Game6_JTF = new JTextField();
    private JTextField equipo1_Game7_JTF = new JTextField();
    private JTextField equipo2_Game7_JTF = new JTextField();
    private JTextField equipo1_Game8_JTF = new JTextField();
    private JTextField equipo2_Game8_JTF = new JTextField();
    private JTextField equipo1_Game9_JTF = new JTextField();
    private JTextField equipo2_Game9_JTF = new JTextField();
    private JTextField equipo1_Game10_JTF = new JTextField();
    private JTextField equipo2_Game10_JTF = new JTextField();
    private JTextField equipo1_Game11_JTF = new JTextField();
    private JTextField equipo2_Game11_JTF = new JTextField();
    private JTextField equipo1_Game12_JTF = new JTextField();
    private JTextField equipo2_Game12_JTF = new JTextField();
    private JTextField equipo1_Game13_JTF = new JTextField();
    private JTextField equipo2_Game13_JTF = new JTextField();
    private JTextField equipo1_Game14_JTF = new JTextField();
    private JTextField equipo2_Game14_JTF = new JTextField();
    private JTextField equipo1_Game15_JTF = new JTextField();
    private JTextField equipo2_Game15_JTF = new JTextField();
    private JTextField equipo1_Game16_JTF = new JTextField();
    private JTextField equipo2_Game16_JTF = new JTextField();
    private JTextField equipo1_Game17_JTF = new JTextField();
    private JTextField equipo2_Game17_JTF = new JTextField();
    private JTextField equipo1_Game18_JTF = new JTextField();
    private JTextField equipo2_Game18_JTF = new JTextField();
    private JTextField equipo1_Game19_JTF = new JTextField();
    private JTextField equipo2_Game19_JTF = new JTextField();
    private JTextField equipo1_Game20_JTF = new JTextField();
    private JTextField equipo2_Game20_JTF = new JTextField();
    private JTextField equipo1_Game21_JTF = new JTextField();
    private JTextField equipo2_Game21_JTF = new JTextField();
    private JTextField equipo1_Game22_JTF = new JTextField();
    private JTextField equipo2_Game22_JTF = new JTextField();
    private JTextField equipo1_Game23_JTF = new JTextField();
    private JTextField equipo2_Game23_JTF = new JTextField();
    private JTextField equipo1_Game24_JTF = new JTextField();
    private JTextField equipo2_Game24_JTF = new JTextField();
    private JTextField equipo1_Game25_JTF = new JTextField();
    private JTextField equipo2_Game25_JTF = new JTextField();
    private JTextField equipo1_Game26_JTF = new JTextField();
    private JTextField equipo2_Game26_JTF = new JTextField();
    private JTextField equipo1_Game27_JTF = new JTextField();
    private JTextField equipo2_Game27_JTF = new JTextField();
    private JTextField equipo1_Game28_JTF = new JTextField();
    private JTextField equipo2_Game28_JTF = new JTextField();
    private JTextField equipo1_Game29_JTF = new JTextField();
    private JTextField equipo2_Game29_JTF = new JTextField();
    private JTextField equipo1_Game30_JTF = new JTextField();
    private JTextField equipo2_Game30_JTF = new JTextField();
    private JTextField equipo1_Game31_JTF = new JTextField();
    private JTextField equipo2_Game31_JTF = new JTextField();
    private JTextField equipo1_Game32_JTF = new JTextField();
    private JTextField equipo2_Game32_JTF = new JTextField();
    private JTextField equipo1_Game33_JTF = new JTextField();
    private JTextField equipo2_Game33_JTF = new JTextField();
    private JTextField equipo1_Game34_JTF = new JTextField();
    private JTextField equipo2_Game34_JTF = new JTextField();
    private JTextField equipo1_Game35_JTF = new JTextField();
    private JTextField equipo2_Game35_JTF = new JTextField();
    private JTextField equipo1_Game36_JTF = new JTextField();
    private JTextField equipo2_Game36_JTF = new JTextField();
    private JTextField equipo1_Game37_JTF = new JTextField();
    private JTextField equipo2_Game37_JTF = new JTextField();
    private JTextField equipo1_Game38_JTF = new JTextField();
    private JTextField equipo2_Game38_JTF = new JTextField();
    private JTextField equipo1_Game39_JTF = new JTextField();
    private JTextField equipo2_Game39_JTF = new JTextField();
    private JTextField equipo1_Game40_JTF = new JTextField();
    private JTextField equipo2_Game40_JTF = new JTextField();
    private JTextField equipo1_Game41_JTF = new JTextField();
    private JTextField equipo2_Game41_JTF = new JTextField();
    private JTextField equipo1_Game42_JTF = new JTextField();
    private JTextField equipo2_Game42_JTF = new JTextField();
    private JTextField equipo1_Game43_JTF = new JTextField();
    private JTextField equipo2_Game43_JTF = new JTextField();
    private JTextField equipo1_Game44_JTF = new JTextField();
    private JTextField equipo2_Game44_JTF = new JTextField();
    private JTextField equipo1_Game45_JTF = new JTextField();
    private JTextField equipo2_Game45_JTF = new JTextField();
    private JTextField equipo1_Game46_JTF = new JTextField();
    private JTextField equipo2_Game46_JTF = new JTextField();
    private JTextField equipo1_Game47_JTF = new JTextField();
    private JTextField equipo2_Game47_JTF = new JTextField();
    private JTextField equipo1_Game48_JTF = new JTextField();
    private JTextField equipo2_Game48_JTF = new JTextField();

    public static WindowF1 getInstance(){
		if(instance == null){
			instance = new WindowF1();
		}
		return instance;
	}
    
    public WindowF1 (){
        this.setBounds(10, 10, 1850, 900);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents() {
        this.botonSaveMarcadores.setBounds(1170, 15, 250, 30);
        botonSaveMarcadores.setFont(new Font("Helvetivca", Font.PLAIN, 18));
        botonSaveMarcadores.setForeground(Color.BLACK);
        this.add(botonSaveMarcadores);
        
        this.equipo1_Game1_JTF.setBounds(248, 110, 25, 25);
        fontColorWhite_JTF(equipo1_Game1_JTF);
        add(equipo1_Game1_JTF);
        this.equipo2_Game1_JTF.setBounds(302, 110, 25, 25);
        fontColorWhite_JTF(equipo2_Game1_JTF);
        add(equipo2_Game1_JTF);

        this.equipo1_Game2_JTF.setBounds(248, 160, 25, 25);
        fontColorWhite_JTF(equipo1_Game2_JTF);
        add(equipo1_Game2_JTF);
        this.equipo2_Game2_JTF.setBounds(302, 160, 25, 25);
        fontColorWhite_JTF(equipo2_Game2_JTF);
        add(equipo2_Game2_JTF);

        this.equipo1_Game3_JTF.setBounds(248, 210, 25, 25);
        fontColorWhite_JTF(equipo1_Game3_JTF);
        add(equipo1_Game3_JTF);
        this.equipo2_Game3_JTF.setBounds(302, 210, 25, 25);
        fontColorWhite_JTF(equipo2_Game3_JTF);
        add(equipo2_Game3_JTF);

        this.equipo1_Game4_JTF.setBounds(248, 260, 25, 25);
        fontColorWhite_JTF(equipo1_Game4_JTF);
        add(equipo1_Game4_JTF);
        this.equipo2_Game4_JTF.setBounds(302, 260, 25, 25);
        fontColorWhite_JTF(equipo2_Game4_JTF);
        add(equipo2_Game4_JTF);

        this.equipo1_Game5_JTF.setBounds(248, 310, 25, 25);
        fontColorWhite_JTF(equipo1_Game5_JTF);
        add(equipo1_Game5_JTF);
        this.equipo2_Game5_JTF.setBounds(302, 310, 25, 25);
        fontColorWhite_JTF(equipo2_Game5_JTF);
        add(equipo2_Game5_JTF);

        this.equipo1_Game6_JTF.setBounds(248, 360, 25, 25);
        fontColorWhite_JTF(equipo1_Game6_JTF);
        add(equipo1_Game6_JTF);
        this.equipo2_Game6_JTF.setBounds(302, 360, 25, 25);
        fontColorWhite_JTF(equipo2_Game6_JTF);
        add(equipo2_Game6_JTF);

        this.equipo1_Game7_JTF.setBounds(248, 410, 25, 25);
        fontColorWhite_JTF(equipo1_Game7_JTF);
        add(equipo1_Game7_JTF);
        this.equipo2_Game7_JTF.setBounds(302, 410, 25, 25);
        fontColorWhite_JTF(equipo2_Game7_JTF);
        add(equipo2_Game7_JTF);

        this.equipo1_Game8_JTF.setBounds(248, 460, 25, 25);
        fontColorWhite_JTF(equipo1_Game8_JTF);
        add(equipo1_Game8_JTF);
        this.equipo2_Game8_JTF.setBounds(302, 460, 25, 25);
        fontColorWhite_JTF(equipo2_Game8_JTF);
        add(equipo2_Game8_JTF);
 
        this.equipo1_Game9_JTF.setBounds(248, 510, 25, 25);
        fontColorWhite_JTF(equipo1_Game9_JTF);
        add(equipo1_Game9_JTF);
        this.equipo2_Game9_JTF.setBounds(302, 510, 25, 25);
        fontColorWhite_JTF(equipo2_Game9_JTF);
        add(equipo2_Game9_JTF);
 
        this.equipo1_Game10_JTF.setBounds(248, 560, 25, 25);
        fontColorWhite_JTF(equipo1_Game10_JTF);
        add(equipo1_Game10_JTF);
        this.equipo2_Game10_JTF.setBounds(302, 560, 25, 25);
        fontColorWhite_JTF(equipo2_Game10_JTF);
        add(equipo2_Game10_JTF);
 
        this.equipo1_Game11_JTF.setBounds(248, 610, 25, 25);
        fontColorWhite_JTF(equipo1_Game11_JTF);
        add(equipo1_Game11_JTF);
        this.equipo2_Game11_JTF.setBounds(302, 610, 25, 25);
        fontColorWhite_JTF(equipo2_Game11_JTF);
        add(equipo2_Game11_JTF);
 
        this.equipo1_Game12_JTF.setBounds(248, 660, 25, 25);
        fontColorWhite_JTF(equipo1_Game12_JTF);
        add(equipo1_Game12_JTF);
        this.equipo2_Game12_JTF.setBounds(302, 660, 25, 25);
        fontColorWhite_JTF(equipo2_Game12_JTF);
        add(equipo2_Game12_JTF);
 
        this.equipo1_Game13_JTF.setBounds(678, 110, 25, 25);
        fontColorWhite_JTF(equipo1_Game13_JTF);
        add(equipo1_Game13_JTF);
        this.equipo2_Game13_JTF.setBounds(730, 110, 25, 25);
        fontColorWhite_JTF(equipo2_Game13_JTF);
        add(equipo2_Game13_JTF);
 
        this.equipo1_Game14_JTF.setBounds(678, 160, 25, 25);
        fontColorWhite_JTF(equipo1_Game14_JTF);
        add(equipo1_Game14_JTF);
        this.equipo2_Game14_JTF.setBounds(730, 160, 25, 25);
        fontColorWhite_JTF(equipo2_Game14_JTF);
        add(equipo2_Game14_JTF);
 
        this.equipo1_Game15_JTF.setBounds(678, 210, 25, 25);
        fontColorWhite_JTF(equipo1_Game15_JTF);
        add(equipo1_Game15_JTF);
        this.equipo2_Game15_JTF.setBounds(730, 210, 25, 25);
        fontColorWhite_JTF(equipo2_Game15_JTF);
        add(equipo2_Game15_JTF);
 
        this.equipo1_Game16_JTF.setBounds(678, 260, 25, 25);
        fontColorWhite_JTF(equipo1_Game16_JTF);
        add(equipo1_Game16_JTF);
        this.equipo2_Game16_JTF.setBounds(730, 260, 25, 25);
        fontColorWhite_JTF(equipo2_Game16_JTF);
        add(equipo2_Game16_JTF);
 
        this.equipo1_Game17_JTF.setBounds(678, 310, 25, 25);
        fontColorWhite_JTF(equipo1_Game17_JTF);
        add(equipo1_Game17_JTF);
        this.equipo2_Game17_JTF.setBounds(730, 310, 25, 25);
        fontColorWhite_JTF(equipo2_Game17_JTF);
        add(equipo2_Game17_JTF);
 
        this.equipo1_Game18_JTF.setBounds(678, 360, 25, 25);
        fontColorWhite_JTF(equipo1_Game18_JTF);
        add(equipo1_Game18_JTF);
        this.equipo2_Game18_JTF.setBounds(730, 360, 25, 25);
        fontColorWhite_JTF(equipo2_Game18_JTF);
        add(equipo2_Game18_JTF);
 
        this.equipo1_Game19_JTF.setBounds(678, 410, 25, 25);
        fontColorWhite_JTF(equipo1_Game19_JTF);
        add(equipo1_Game19_JTF);
        this.equipo2_Game19_JTF.setBounds(730, 410, 25, 25);
        fontColorWhite_JTF(equipo2_Game19_JTF);
        add(equipo2_Game19_JTF);
 
        this.equipo1_Game20_JTF.setBounds(678, 460, 25, 25);
        fontColorWhite_JTF(equipo1_Game20_JTF);
        add(equipo1_Game20_JTF);
        this.equipo2_Game20_JTF.setBounds(730, 460, 25, 25);
        fontColorWhite_JTF(equipo2_Game20_JTF);
        add(equipo2_Game20_JTF);
 
        this.equipo1_Game21_JTF.setBounds(678, 510, 25, 25);
        fontColorWhite_JTF(equipo1_Game21_JTF);
        add(equipo1_Game21_JTF);
        this.equipo2_Game21_JTF.setBounds(730, 510, 25, 25);
        fontColorWhite_JTF(equipo2_Game21_JTF);
        add(equipo2_Game21_JTF);
 
        this.equipo1_Game22_JTF.setBounds(678, 560, 25, 25);
        fontColorWhite_JTF(equipo1_Game22_JTF);
        add(equipo1_Game22_JTF);
        this.equipo2_Game22_JTF.setBounds(730, 560, 25, 25);
        fontColorWhite_JTF(equipo2_Game22_JTF);
        add(equipo2_Game22_JTF);
 
        this.equipo1_Game23_JTF.setBounds(678, 610, 25, 25);
        fontColorWhite_JTF(equipo1_Game23_JTF);
        add(equipo1_Game23_JTF);
        this.equipo2_Game23_JTF.setBounds(730, 610, 25, 25);
        fontColorWhite_JTF(equipo2_Game23_JTF);
        add(equipo2_Game23_JTF);
 
        this.equipo1_Game24_JTF.setBounds(678, 660, 25, 25);
        fontColorWhite_JTF(equipo1_Game24_JTF);
        add(equipo1_Game24_JTF);
        this.equipo2_Game24_JTF.setBounds(730, 660, 25, 25);
        fontColorWhite_JTF(equipo2_Game24_JTF);
        add(equipo2_Game24_JTF);
 
        this.equipo1_Game25_JTF.setBounds(1108, 110, 25, 25);
        fontColorWhite_JTF(equipo1_Game25_JTF);
        add(equipo1_Game25_JTF);
        this.equipo2_Game25_JTF.setBounds(1160, 110, 25, 25);
        fontColorWhite_JTF(equipo2_Game25_JTF);
        add(equipo2_Game25_JTF);
 
        this.equipo1_Game26_JTF.setBounds(1108, 160, 25, 25);
        fontColorWhite_JTF(equipo1_Game26_JTF);
        add(equipo1_Game26_JTF);
        this.equipo2_Game26_JTF.setBounds(1160, 160, 25, 25);
        fontColorWhite_JTF(equipo2_Game26_JTF);
        add(equipo2_Game26_JTF);
 
        this.equipo1_Game27_JTF.setBounds(1108, 210, 25, 25);
        fontColorWhite_JTF(equipo1_Game27_JTF);
        add(equipo1_Game27_JTF);
        this.equipo2_Game27_JTF.setBounds(1160, 210, 25, 25);
        fontColorWhite_JTF(equipo2_Game27_JTF);
        add(equipo2_Game27_JTF);
 
        this.equipo1_Game28_JTF.setBounds(1108, 260, 25, 25);
        fontColorWhite_JTF(equipo1_Game28_JTF);
        add(equipo1_Game28_JTF);
        this.equipo2_Game28_JTF.setBounds(1160, 260, 25, 25);
        fontColorWhite_JTF(equipo2_Game28_JTF);
        add(equipo2_Game28_JTF);
 
        this.equipo1_Game29_JTF.setBounds(1108, 310, 25, 25);
        fontColorWhite_JTF(equipo1_Game29_JTF);
        add(equipo1_Game29_JTF);
        this.equipo2_Game29_JTF.setBounds(1160, 310, 25, 25);
        fontColorWhite_JTF(equipo2_Game29_JTF);
        add(equipo2_Game29_JTF);
 
        this.equipo1_Game30_JTF.setBounds(1108, 360, 25, 25);
        fontColorWhite_JTF(equipo1_Game30_JTF);
        add(equipo1_Game30_JTF);
        this.equipo2_Game30_JTF.setBounds(1160, 360, 25, 25);
        fontColorWhite_JTF(equipo2_Game30_JTF);
        add(equipo2_Game30_JTF);
 
        this.equipo1_Game31_JTF.setBounds(1108, 410, 25, 25);
        fontColorWhite_JTF(equipo1_Game31_JTF);
        add(equipo1_Game31_JTF);
        this.equipo2_Game31_JTF.setBounds(1160, 410, 25, 25);
        fontColorWhite_JTF(equipo2_Game31_JTF);
        add(equipo2_Game31_JTF);
 
        this.equipo1_Game32_JTF.setBounds(1108, 460, 25, 25);
        fontColorWhite_JTF(equipo1_Game32_JTF);
        add(equipo1_Game32_JTF);
        this.equipo2_Game32_JTF.setBounds(1160, 460, 25, 25);
        fontColorWhite_JTF(equipo2_Game32_JTF);
        add(equipo2_Game32_JTF);
 
        this.equipo1_Game33_JTF.setBounds(1108, 510, 25, 25);
        fontColorWhite_JTF(equipo1_Game33_JTF);
        add(equipo1_Game33_JTF);
        this.equipo2_Game33_JTF.setBounds(1160, 510, 25, 25);
        fontColorWhite_JTF(equipo2_Game33_JTF);
        add(equipo2_Game33_JTF);
 
        this.equipo1_Game34_JTF.setBounds(1108, 550, 25, 25);
        fontColorWhite_JTF(equipo1_Game34_JTF);
        add(equipo1_Game34_JTF);
        this.equipo2_Game34_JTF.setBounds(1160, 550, 25, 25);
        fontColorWhite_JTF(equipo2_Game34_JTF);
        add(equipo2_Game34_JTF);
 
        this.equipo1_Game35_JTF.setBounds(1108, 610, 25, 25);
        fontColorWhite_JTF(equipo1_Game35_JTF);
        add(equipo1_Game35_JTF);
        this.equipo2_Game35_JTF.setBounds(1160, 610, 25, 25);
        fontColorWhite_JTF(equipo2_Game35_JTF);
        add(equipo2_Game35_JTF);
 
        this.equipo1_Game36_JTF.setBounds(1108, 660, 25, 25);
        fontColorWhite_JTF(equipo1_Game36_JTF);
        add(equipo1_Game36_JTF);
        this.equipo2_Game36_JTF.setBounds(1160, 660, 25, 25);
        fontColorWhite_JTF(equipo2_Game36_JTF);
        add(equipo2_Game36_JTF);
 
        this.equipo1_Game37_JTF.setBounds(1538, 110, 25, 25);
        fontColorWhite_JTF(equipo1_Game37_JTF);
        add(equipo1_Game37_JTF);
        this.equipo2_Game37_JTF.setBounds(1590, 110, 25, 25);
        fontColorWhite_JTF(equipo2_Game37_JTF);
        add(equipo2_Game37_JTF);
 
        this.equipo1_Game38_JTF.setBounds(1538, 160, 25, 25);
        fontColorWhite_JTF(equipo1_Game38_JTF);
        add(equipo1_Game38_JTF);
        this.equipo2_Game38_JTF.setBounds(1590, 160, 25, 25);
        fontColorWhite_JTF(equipo2_Game38_JTF);
        add(equipo2_Game38_JTF);
 
        this.equipo1_Game39_JTF.setBounds(1538, 210, 25, 25);
        fontColorWhite_JTF(equipo1_Game39_JTF);
        add(equipo1_Game39_JTF);
        this.equipo2_Game39_JTF.setBounds(1590, 210, 25, 25);
        fontColorWhite_JTF(equipo2_Game39_JTF);
        add(equipo2_Game39_JTF);
 
        this.equipo1_Game40_JTF.setBounds(1538, 260, 25, 25);
        fontColorWhite_JTF(equipo1_Game40_JTF);
        add(equipo1_Game40_JTF);
        this.equipo2_Game40_JTF.setBounds(1590, 260, 25, 25);
        fontColorWhite_JTF(equipo2_Game40_JTF);
        add(equipo2_Game40_JTF);
 
        this.equipo1_Game41_JTF.setBounds(1538, 310, 25, 25);
        fontColorWhite_JTF(equipo1_Game41_JTF);
        add(equipo1_Game41_JTF);
        this.equipo2_Game41_JTF.setBounds(1590, 310, 25, 25);
        fontColorWhite_JTF(equipo2_Game41_JTF);
        add(equipo2_Game41_JTF);
 
        this.equipo1_Game42_JTF.setBounds(1538, 360, 25, 25);
        fontColorWhite_JTF(equipo1_Game42_JTF);
        add(equipo1_Game42_JTF);
        this.equipo2_Game42_JTF.setBounds(1590, 360, 25, 25);
        fontColorWhite_JTF(equipo2_Game42_JTF);
        add(equipo2_Game42_JTF);
 
        this.equipo1_Game43_JTF.setBounds(1538, 410, 25, 25);
        fontColorWhite_JTF(equipo1_Game43_JTF);
        add(equipo1_Game43_JTF);
        this.equipo2_Game43_JTF.setBounds(1590, 410, 25, 25);
        fontColorWhite_JTF(equipo2_Game43_JTF);
        add(equipo2_Game43_JTF);
 
        this.equipo1_Game44_JTF.setBounds(1538, 460, 25, 25);
        fontColorWhite_JTF(equipo1_Game44_JTF);
        add(equipo1_Game44_JTF);
        this.equipo2_Game44_JTF.setBounds(1590, 460, 25, 25);
        fontColorWhite_JTF(equipo2_Game44_JTF);
        add(equipo2_Game44_JTF);
 
        this.equipo1_Game45_JTF.setBounds(1538, 510, 25, 25);
        fontColorWhite_JTF(equipo1_Game45_JTF);
        add(equipo1_Game45_JTF);
        this.equipo2_Game45_JTF.setBounds(1590, 510, 25, 25);
        fontColorWhite_JTF(equipo2_Game45_JTF);
        add(equipo2_Game45_JTF);
 
        this.equipo1_Game46_JTF.setBounds(1538, 560, 25, 25);
        fontColorWhite_JTF(equipo1_Game46_JTF);
        add(equipo1_Game46_JTF);
        this.equipo2_Game46_JTF.setBounds(1590, 560, 25, 25);
        fontColorWhite_JTF(equipo2_Game46_JTF);
        add(equipo2_Game46_JTF);
 
        this.equipo1_Game47_JTF.setBounds(1538, 610, 25, 25);
        fontColorWhite_JTF(equipo1_Game47_JTF);
        add(equipo1_Game47_JTF);
        this.equipo2_Game47_JTF.setBounds(1590, 610, 25, 25);
        fontColorWhite_JTF(equipo2_Game47_JTF);
        add(equipo2_Game47_JTF);
 
        this.equipo1_Game48_JTF.setBounds(1538, 660, 25, 25);
        fontColorWhite_JTF(equipo1_Game48_JTF);
        add(equipo1_Game48_JTF);
        this.equipo2_Game48_JTF.setBounds(1590, 660, 25, 25);
        fontColorWhite_JTF(equipo2_Game48_JTF);
        add(equipo2_Game48_JTF);
 


        this.panelFase1.setBounds(0, 0, 1850, 870);
        this.setBackground(Color.LIGHT_GRAY);
        this.add(panelFase1);
    }

    public void fontColorWhite_JTF(JTextField text){
        text.setFont(new Font("Helvetivca", Font.BOLD, 18));
        text.setForeground(Color.BLACK);
    }

    public void setController(Controller2 control) {
        this.control = control;
        this.botonSaveMarcadores.setActionCommand(Utils.SAVE_MARCADORES);
        this.botonSaveMarcadores.addActionListener(this.control);
    }

    public PanelFase1 getPanelFase1() {
        return panelFase1;
    }

    public HashMap<String, Integer> ResultadosEquipo1(){
        HashMap<String, Integer> mapResultadosEquipo1 = new HashMap<>();
        mapResultadosEquipo1.put("1", Integer.valueOf(getEquipo1_Game1_JTF().getText()));
        mapResultadosEquipo1.put("2", Integer.valueOf(getEquipo1_Game2_JTF().getText()));
        mapResultadosEquipo1.put("3", Integer.valueOf(getEquipo1_Game3_JTF().getText()));
        mapResultadosEquipo1.put("4", Integer.valueOf(getEquipo1_Game4_JTF().getText()));
        mapResultadosEquipo1.put("5", Integer.valueOf(getEquipo1_Game5_JTF().getText()));
        mapResultadosEquipo1.put("6", Integer.valueOf(getEquipo1_Game6_JTF().getText()));
        mapResultadosEquipo1.put("7", Integer.valueOf(getEquipo1_Game7_JTF().getText()));
        mapResultadosEquipo1.put("8", Integer.valueOf(getEquipo1_Game8_JTF().getText()));
        mapResultadosEquipo1.put("9", Integer.valueOf(getEquipo1_Game9_JTF().getText()));
        mapResultadosEquipo1.put("10", Integer.valueOf(getEquipo1_Game10_JTF().getText()));  
        mapResultadosEquipo1.put("11", Integer.valueOf(getEquipo1_Game11_JTF().getText()));  
        mapResultadosEquipo1.put("12", Integer.valueOf(getEquipo1_Game12_JTF().getText()));  
        mapResultadosEquipo1.put("13", Integer.valueOf(getEquipo1_Game13_JTF().getText()));  
        mapResultadosEquipo1.put("14", Integer.valueOf(getEquipo1_Game14_JTF().getText()));  
        mapResultadosEquipo1.put("15", Integer.valueOf(getEquipo1_Game15_JTF().getText()));  
        mapResultadosEquipo1.put("16", Integer.valueOf(getEquipo1_Game16_JTF().getText()));  
        mapResultadosEquipo1.put("17", Integer.valueOf(getEquipo1_Game17_JTF().getText()));  
        mapResultadosEquipo1.put("18", Integer.valueOf(getEquipo1_Game18_JTF().getText()));  
        mapResultadosEquipo1.put("19", Integer.valueOf(getEquipo1_Game19_JTF().getText()));  
        mapResultadosEquipo1.put("20", Integer.valueOf(getEquipo1_Game20_JTF().getText()));  
        mapResultadosEquipo1.put("21", Integer.valueOf(getEquipo1_Game21_JTF().getText()));  
        mapResultadosEquipo1.put("22", Integer.valueOf(getEquipo1_Game22_JTF().getText()));  
        mapResultadosEquipo1.put("23", Integer.valueOf(getEquipo1_Game23_JTF().getText()));  
        mapResultadosEquipo1.put("24", Integer.valueOf(getEquipo1_Game24_JTF().getText()));  
        mapResultadosEquipo1.put("25", Integer.valueOf(getEquipo1_Game25_JTF().getText()));  
        mapResultadosEquipo1.put("26", Integer.valueOf(getEquipo1_Game26_JTF().getText()));  
        mapResultadosEquipo1.put("27", Integer.valueOf(getEquipo1_Game27_JTF().getText()));  
        mapResultadosEquipo1.put("28", Integer.valueOf(getEquipo1_Game28_JTF().getText()));  
        mapResultadosEquipo1.put("29", Integer.valueOf(getEquipo1_Game29_JTF().getText()));  
        mapResultadosEquipo1.put("30", Integer.valueOf(getEquipo1_Game30_JTF().getText()));  
        mapResultadosEquipo1.put("31", Integer.valueOf(getEquipo1_Game31_JTF().getText()));  
        mapResultadosEquipo1.put("32", Integer.valueOf(getEquipo1_Game32_JTF().getText()));  
        mapResultadosEquipo1.put("33", Integer.valueOf(getEquipo1_Game33_JTF().getText()));  
        mapResultadosEquipo1.put("34", Integer.valueOf(getEquipo1_Game34_JTF().getText()));  
        mapResultadosEquipo1.put("35", Integer.valueOf(getEquipo1_Game35_JTF().getText()));  
        mapResultadosEquipo1.put("36", Integer.valueOf(getEquipo1_Game36_JTF().getText()));  
        mapResultadosEquipo1.put("37", Integer.valueOf(getEquipo1_Game37_JTF().getText()));  
        mapResultadosEquipo1.put("38", Integer.valueOf(getEquipo1_Game38_JTF().getText()));  
        mapResultadosEquipo1.put("39", Integer.valueOf(getEquipo1_Game39_JTF().getText()));  
        mapResultadosEquipo1.put("40", Integer.valueOf(getEquipo1_Game40_JTF().getText()));  
        mapResultadosEquipo1.put("41", Integer.valueOf(getEquipo1_Game41_JTF().getText()));  
        mapResultadosEquipo1.put("42", Integer.valueOf(getEquipo1_Game42_JTF().getText()));  
        mapResultadosEquipo1.put("43", Integer.valueOf(getEquipo1_Game43_JTF().getText()));  
        mapResultadosEquipo1.put("44", Integer.valueOf(getEquipo1_Game44_JTF().getText()));  
        mapResultadosEquipo1.put("45", Integer.valueOf(getEquipo1_Game45_JTF().getText()));  
        mapResultadosEquipo1.put("46", Integer.valueOf(getEquipo1_Game46_JTF().getText()));  
        mapResultadosEquipo1.put("47", Integer.valueOf(getEquipo1_Game47_JTF().getText()));  
        mapResultadosEquipo1.put("48", Integer.valueOf(getEquipo1_Game48_JTF().getText()));  
        return mapResultadosEquipo1;
    }

    public HashMap<String, Integer> ResultadosEquipo2(){
        HashMap<String, Integer> mapResultadosEquipo2 = new HashMap<>();
        mapResultadosEquipo2.put("1", Integer.valueOf(getEquipo2_Game1_JTF().getText()));
        mapResultadosEquipo2.put("2", Integer.valueOf(getEquipo2_Game2_JTF().getText()));
        mapResultadosEquipo2.put("3", Integer.valueOf(getEquipo2_Game3_JTF().getText()));
        mapResultadosEquipo2.put("4", Integer.valueOf(getEquipo2_Game4_JTF().getText()));
        mapResultadosEquipo2.put("5", Integer.valueOf(getEquipo2_Game5_JTF().getText()));
        mapResultadosEquipo2.put("6", Integer.valueOf(getEquipo2_Game6_JTF().getText()));
        mapResultadosEquipo2.put("7", Integer.valueOf(getEquipo2_Game7_JTF().getText()));
        mapResultadosEquipo2.put("8", Integer.valueOf(getEquipo2_Game8_JTF().getText()));
        mapResultadosEquipo2.put("9", Integer.valueOf(getEquipo2_Game9_JTF().getText()));
        mapResultadosEquipo2.put("10", Integer.valueOf(getEquipo2_Game10_JTF().getText()));  
        mapResultadosEquipo2.put("11", Integer.valueOf(getEquipo2_Game11_JTF().getText()));  
        mapResultadosEquipo2.put("12", Integer.valueOf(getEquipo2_Game12_JTF().getText()));  
        mapResultadosEquipo2.put("13", Integer.valueOf(getEquipo2_Game13_JTF().getText()));  
        mapResultadosEquipo2.put("14", Integer.valueOf(getEquipo2_Game14_JTF().getText()));  
        mapResultadosEquipo2.put("15", Integer.valueOf(getEquipo2_Game15_JTF().getText()));  
        mapResultadosEquipo2.put("16", Integer.valueOf(getEquipo2_Game16_JTF().getText()));  
        mapResultadosEquipo2.put("17", Integer.valueOf(getEquipo2_Game17_JTF().getText()));  
        mapResultadosEquipo2.put("18", Integer.valueOf(getEquipo2_Game18_JTF().getText()));  
        mapResultadosEquipo2.put("19", Integer.valueOf(getEquipo2_Game19_JTF().getText()));  
        mapResultadosEquipo2.put("20", Integer.valueOf(getEquipo2_Game20_JTF().getText()));  
        mapResultadosEquipo2.put("21", Integer.valueOf(getEquipo2_Game21_JTF().getText()));  
        mapResultadosEquipo2.put("22", Integer.valueOf(getEquipo2_Game22_JTF().getText()));  
        mapResultadosEquipo2.put("23", Integer.valueOf(getEquipo2_Game23_JTF().getText()));  
        mapResultadosEquipo2.put("24", Integer.valueOf(getEquipo2_Game24_JTF().getText()));  
        mapResultadosEquipo2.put("25", Integer.valueOf(getEquipo2_Game25_JTF().getText()));  
        mapResultadosEquipo2.put("26", Integer.valueOf(getEquipo2_Game26_JTF().getText()));  
        mapResultadosEquipo2.put("27", Integer.valueOf(getEquipo2_Game27_JTF().getText()));  
        mapResultadosEquipo2.put("28", Integer.valueOf(getEquipo2_Game28_JTF().getText()));  
        mapResultadosEquipo2.put("29", Integer.valueOf(getEquipo2_Game29_JTF().getText()));  
        mapResultadosEquipo2.put("30", Integer.valueOf(getEquipo2_Game30_JTF().getText()));  
        mapResultadosEquipo2.put("31", Integer.valueOf(getEquipo2_Game31_JTF().getText()));  
        mapResultadosEquipo2.put("32", Integer.valueOf(getEquipo2_Game32_JTF().getText()));  
        mapResultadosEquipo2.put("33", Integer.valueOf(getEquipo2_Game33_JTF().getText()));  
        mapResultadosEquipo2.put("34", Integer.valueOf(getEquipo2_Game34_JTF().getText()));  
        mapResultadosEquipo2.put("35", Integer.valueOf(getEquipo2_Game35_JTF().getText()));  
        mapResultadosEquipo2.put("36", Integer.valueOf(getEquipo2_Game36_JTF().getText()));  
        mapResultadosEquipo2.put("37", Integer.valueOf(getEquipo2_Game37_JTF().getText()));  
        mapResultadosEquipo2.put("38", Integer.valueOf(getEquipo2_Game38_JTF().getText()));  
        mapResultadosEquipo2.put("39", Integer.valueOf(getEquipo2_Game39_JTF().getText()));  
        mapResultadosEquipo2.put("40", Integer.valueOf(getEquipo2_Game40_JTF().getText()));  
        mapResultadosEquipo2.put("41", Integer.valueOf(getEquipo2_Game41_JTF().getText()));  
        mapResultadosEquipo2.put("42", Integer.valueOf(getEquipo2_Game42_JTF().getText()));  
        mapResultadosEquipo2.put("43", Integer.valueOf(getEquipo2_Game43_JTF().getText()));  
        mapResultadosEquipo2.put("44", Integer.valueOf(getEquipo2_Game44_JTF().getText()));  
        mapResultadosEquipo2.put("45", Integer.valueOf(getEquipo2_Game45_JTF().getText()));  
        mapResultadosEquipo2.put("46", Integer.valueOf(getEquipo2_Game46_JTF().getText()));  
        mapResultadosEquipo2.put("47", Integer.valueOf(getEquipo2_Game47_JTF().getText()));  
        mapResultadosEquipo2.put("48", Integer.valueOf(getEquipo2_Game48_JTF().getText()));  
        return mapResultadosEquipo2;
    }

    public JTextField getEquipo1_Game1_JTF() {
        validar(equipo1_Game1_JTF);
        return equipo1_Game1_JTF;
    }

    public JTextField getEquipo2_Game1_JTF() {
        validar(equipo2_Game1_JTF);
        return equipo2_Game1_JTF;
    }

    public JTextField getEquipo1_Game2_JTF() {
        validar(equipo1_Game2_JTF);
        return equipo1_Game2_JTF;
    }

    public JTextField getEquipo2_Game2_JTF() {
        validar(equipo2_Game2_JTF);
        return equipo2_Game2_JTF;
    }

    public JTextField getEquipo1_Game3_JTF() {
        validar(equipo1_Game3_JTF);
        return equipo1_Game3_JTF;
    }

    public JTextField getEquipo2_Game3_JTF() {
        validar(equipo2_Game3_JTF);
        return equipo2_Game3_JTF;
    }

    public JTextField getEquipo1_Game4_JTF() {
        validar(equipo1_Game4_JTF);
        return equipo1_Game4_JTF;
    }

    public JTextField getEquipo2_Game4_JTF() {
        validar(equipo2_Game4_JTF);
        return equipo2_Game4_JTF;
    }

    public JTextField getEquipo1_Game5_JTF() {
        validar(equipo1_Game5_JTF);
        return equipo1_Game5_JTF;
    }

    public JTextField getEquipo2_Game5_JTF() {
        validar(equipo2_Game5_JTF);
        return equipo2_Game5_JTF;
    }

    public JTextField getEquipo1_Game6_JTF() {
        validar(equipo1_Game6_JTF);
        return equipo1_Game6_JTF;
    }

    public JTextField getEquipo2_Game6_JTF() {
        validar(equipo2_Game6_JTF);
        return equipo2_Game6_JTF;
    }

    public JTextField getEquipo1_Game7_JTF() {
        validar(equipo1_Game7_JTF);
        return equipo1_Game7_JTF;
    }

    public JTextField getEquipo2_Game7_JTF() {
        validar(equipo2_Game7_JTF);
        return equipo2_Game7_JTF;
    }

    public JTextField getEquipo1_Game8_JTF() {
        validar(equipo1_Game8_JTF);
        return equipo1_Game8_JTF;
    }

    public JTextField getEquipo2_Game8_JTF() {
        validar(equipo2_Game8_JTF);
        return equipo2_Game8_JTF;
    }

    public JTextField getEquipo1_Game9_JTF() {
        validar(equipo1_Game9_JTF);
        return equipo1_Game9_JTF;
    }

    public JTextField getEquipo2_Game9_JTF() {
        validar(equipo2_Game9_JTF);
        return equipo2_Game9_JTF;
    }

    public JTextField getEquipo1_Game10_JTF() {
        validar(equipo1_Game10_JTF);
        return equipo1_Game10_JTF;
    }

    public JTextField getEquipo2_Game10_JTF() {
        validar(equipo2_Game10_JTF);
        return equipo2_Game10_JTF;
    }

    public JTextField getEquipo1_Game11_JTF() {
        validar(equipo1_Game11_JTF);
        return equipo1_Game11_JTF;
    }

    public JTextField getEquipo2_Game11_JTF() {
        validar(equipo2_Game11_JTF);
        return equipo2_Game11_JTF;
    }

    public JTextField getEquipo1_Game12_JTF() {
        validar(equipo1_Game12_JTF);
        return equipo1_Game12_JTF;
    }

    public JTextField getEquipo2_Game12_JTF() {
        validar(equipo2_Game12_JTF);
        return equipo2_Game12_JTF;
    }

    public JTextField getEquipo1_Game13_JTF() {
        validar(equipo1_Game13_JTF);
        return equipo1_Game13_JTF;
    }

    public JTextField getEquipo2_Game13_JTF() {
        validar(equipo2_Game13_JTF);
        return equipo2_Game13_JTF;
    }

    public JTextField getEquipo1_Game14_JTF() {
        validar(equipo1_Game14_JTF);
        return equipo1_Game14_JTF;
    }

    public JTextField getEquipo2_Game14_JTF() {
        validar(equipo2_Game14_JTF);
        return equipo2_Game14_JTF;
    }

    public JTextField getEquipo1_Game15_JTF() {
        validar(equipo1_Game15_JTF);
        return equipo1_Game15_JTF;
    }

    public JTextField getEquipo2_Game15_JTF() {
        validar(equipo2_Game15_JTF);
        return equipo2_Game15_JTF;
    }

    public JTextField getEquipo1_Game16_JTF() {
        validar(equipo1_Game16_JTF);
        return equipo1_Game16_JTF;
    }

    public JTextField getEquipo2_Game16_JTF() {
        validar(equipo2_Game16_JTF);
        return equipo2_Game16_JTF;
    }

    public JTextField getEquipo1_Game17_JTF() {
        validar(equipo1_Game17_JTF);
        return equipo1_Game17_JTF;
    }

    public JTextField getEquipo2_Game17_JTF() {
        validar(equipo2_Game17_JTF);
        return equipo2_Game17_JTF;
    }

    public JTextField getEquipo1_Game18_JTF() {
        validar(equipo1_Game18_JTF);
        return equipo1_Game18_JTF;
    }

    public JTextField getEquipo2_Game18_JTF() {
        validar(equipo2_Game18_JTF);
        return equipo2_Game18_JTF;
    }

    public JTextField getEquipo1_Game19_JTF() {
        validar(equipo1_Game19_JTF);
        return equipo1_Game19_JTF;
    }

    public JTextField getEquipo2_Game19_JTF() {
        validar(equipo2_Game19_JTF);
        return equipo2_Game19_JTF;
    }

    public JTextField getEquipo1_Game20_JTF() {
        validar(equipo1_Game20_JTF);
        return equipo1_Game20_JTF;
    }

    public JTextField getEquipo2_Game20_JTF() {
        validar(equipo2_Game20_JTF);
        return equipo2_Game20_JTF;
    }

    public JTextField getEquipo1_Game21_JTF() {
        validar(equipo1_Game21_JTF);
        return equipo1_Game21_JTF;
    }

    public JTextField getEquipo2_Game21_JTF() {
        validar(equipo2_Game21_JTF);
        return equipo2_Game21_JTF;
    }

    public JTextField getEquipo1_Game22_JTF() {
        validar(equipo1_Game22_JTF);
        return equipo1_Game22_JTF;
    }

    public JTextField getEquipo2_Game22_JTF() {
        validar(equipo2_Game22_JTF);
        return equipo2_Game22_JTF;
    }

    public JTextField getEquipo1_Game23_JTF() {
        validar(equipo1_Game23_JTF);
        return equipo1_Game23_JTF;
    }

    public JTextField getEquipo2_Game23_JTF() {
        validar(equipo2_Game23_JTF);
        return equipo2_Game23_JTF;
    }

    public JTextField getEquipo1_Game24_JTF() {
        validar(equipo1_Game24_JTF);
        return equipo1_Game24_JTF;
    }

    public JTextField getEquipo2_Game24_JTF() {
        validar(equipo2_Game24_JTF);
        return equipo2_Game24_JTF;
    }

    public JTextField getEquipo1_Game25_JTF() {
        validar(equipo1_Game25_JTF);
        return equipo1_Game25_JTF;
    }

    public JTextField getEquipo2_Game25_JTF() {
        validar(equipo2_Game25_JTF);
        return equipo2_Game25_JTF;
    }

    public JTextField getEquipo1_Game26_JTF() {
        validar(equipo1_Game26_JTF);
        return equipo1_Game26_JTF;
    }

    public JTextField getEquipo2_Game26_JTF() {
        validar(equipo2_Game26_JTF);
        return equipo2_Game26_JTF;
    }

    public JTextField getEquipo1_Game27_JTF() {
        validar(equipo1_Game27_JTF);
        return equipo1_Game27_JTF;
    }

    public JTextField getEquipo2_Game27_JTF() {
        validar(equipo2_Game27_JTF);
        return equipo2_Game27_JTF;
    }

    public JTextField getEquipo1_Game28_JTF() {
        validar(equipo1_Game28_JTF);
        return equipo1_Game28_JTF;
    }

    public JTextField getEquipo2_Game28_JTF() {
        validar(equipo2_Game28_JTF);
        return equipo2_Game28_JTF;
    }

    public JTextField getEquipo1_Game29_JTF() {
        validar(equipo1_Game29_JTF);
        return equipo1_Game29_JTF;
    }

    public JTextField getEquipo2_Game29_JTF() {
        validar(equipo2_Game29_JTF);
        return equipo2_Game29_JTF;
    }

    public JTextField getEquipo1_Game30_JTF() {
        validar(equipo1_Game30_JTF);
        return equipo1_Game30_JTF;
    }

    public JTextField getEquipo2_Game30_JTF() {
        validar(equipo2_Game30_JTF);
        return equipo2_Game30_JTF;
    }

    public JTextField getEquipo1_Game31_JTF() {
        validar(equipo1_Game31_JTF);
        return equipo1_Game31_JTF;
    }

    public JTextField getEquipo2_Game31_JTF() {
        validar(equipo2_Game31_JTF);
        return equipo2_Game31_JTF;
    }

    public JTextField getEquipo1_Game32_JTF() {
        validar(equipo1_Game32_JTF);
        return equipo1_Game32_JTF;
    }

    public JTextField getEquipo2_Game32_JTF() {
        validar(equipo2_Game32_JTF);
        return equipo2_Game32_JTF;
    }

    public JTextField getEquipo1_Game33_JTF() {
        validar(equipo1_Game33_JTF);
        return equipo1_Game33_JTF;
    }

    public JTextField getEquipo2_Game33_JTF() {
        validar(equipo2_Game33_JTF);
        return equipo2_Game33_JTF;
    }

    public JTextField getEquipo1_Game34_JTF() {
        validar(equipo1_Game34_JTF);
        return equipo1_Game34_JTF;
    }

    public JTextField getEquipo2_Game34_JTF() {
        validar(equipo2_Game34_JTF);
        return equipo2_Game34_JTF;
    }

    public JTextField getEquipo1_Game35_JTF() {
        validar(equipo1_Game35_JTF);
        return equipo1_Game35_JTF;
    }

    public JTextField getEquipo2_Game35_JTF() {
        validar(equipo2_Game35_JTF);
        return equipo2_Game35_JTF;
    }

    public JTextField getEquipo1_Game36_JTF() {
        validar(equipo1_Game36_JTF);
        return equipo1_Game36_JTF;
    }

    public JTextField getEquipo2_Game36_JTF() {
        validar(equipo2_Game36_JTF);
        return equipo2_Game36_JTF;
    }

    public JTextField getEquipo1_Game37_JTF() {
        validar(equipo1_Game37_JTF);
        return equipo1_Game37_JTF;
    }

    public JTextField getEquipo2_Game37_JTF() {
        validar(equipo2_Game37_JTF);
        return equipo2_Game37_JTF;
    }

    public JTextField getEquipo1_Game38_JTF() {
        validar(equipo1_Game38_JTF);
        return equipo1_Game38_JTF;
    }

    public JTextField getEquipo2_Game38_JTF() {
        validar(equipo2_Game38_JTF);
        return equipo2_Game38_JTF;
    }

    public JTextField getEquipo1_Game39_JTF() {
        validar(equipo1_Game39_JTF);
        return equipo1_Game39_JTF;
    }

    public JTextField getEquipo2_Game39_JTF() {
        validar(equipo2_Game39_JTF);
        return equipo2_Game39_JTF;
    }

    public JTextField getEquipo1_Game40_JTF() {
        validar(equipo1_Game40_JTF);
        return equipo1_Game40_JTF;
    }

    public JTextField getEquipo2_Game40_JTF() {
        validar(equipo2_Game40_JTF);
        return equipo2_Game40_JTF;
    }

    public JTextField getEquipo1_Game41_JTF() {
        validar(equipo1_Game41_JTF);
        return equipo1_Game41_JTF;
    }

    public JTextField getEquipo2_Game41_JTF() {
        validar(equipo2_Game41_JTF);
        return equipo2_Game41_JTF;
    }

    public JTextField getEquipo1_Game42_JTF() {
        validar(equipo1_Game42_JTF);
        return equipo1_Game42_JTF;
    }

    public JTextField getEquipo2_Game42_JTF() {
        validar(equipo2_Game42_JTF);
        return equipo2_Game42_JTF;
    }

    public JTextField getEquipo1_Game43_JTF() {
        validar(equipo1_Game43_JTF);
        return equipo1_Game43_JTF;
    }

    public JTextField getEquipo2_Game43_JTF() {
        validar(equipo2_Game43_JTF);
        return equipo2_Game43_JTF;
    }

    public JTextField getEquipo1_Game44_JTF() {
        validar(equipo1_Game44_JTF);
        return equipo1_Game44_JTF;
    }

    public JTextField getEquipo2_Game44_JTF() {
        validar(equipo2_Game44_JTF);
        return equipo2_Game44_JTF;
    }

    public JTextField getEquipo1_Game45_JTF() {
        validar(equipo1_Game45_JTF);
        return equipo1_Game45_JTF;
    }

    public JTextField getEquipo2_Game45_JTF() {
        validar(equipo2_Game45_JTF);
        return equipo2_Game45_JTF;
    }

    public JTextField getEquipo1_Game46_JTF() {
        validar(equipo1_Game46_JTF);
        return equipo1_Game46_JTF;
    }

    public JTextField getEquipo2_Game46_JTF() {
        validar(equipo2_Game46_JTF);
        return equipo2_Game46_JTF;
    }

    public JTextField getEquipo1_Game47_JTF() {
        validar(equipo1_Game47_JTF);
        return equipo1_Game47_JTF;
    }

    public JTextField getEquipo2_Game47_JTF() {
        validar(equipo2_Game47_JTF);
        return equipo2_Game47_JTF;
    }

    public JTextField getEquipo1_Game48_JTF() {
        validar(equipo1_Game48_JTF);
        return equipo1_Game48_JTF;
    }

    public JTextField getEquipo2_Game48_JTF() {
        validar(equipo2_Game48_JTF);
        return equipo2_Game48_JTF;
    }

    public void validar(JTextField texto){
        if(texto.getText().isEmpty()){
            texto.setText("99");
        }
    }
}
