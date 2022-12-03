package vista;

import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;


import control.Controller;
import utils.Utils;

public class Window extends JFrame{
    private JButton botonInit = new JButton("Generar equipos");
    // private JButton botonFase1 = new JButton("Fase 1");
    private JButton botonSaveSel = new JButton("Guardar Selecciones");
    private Controller control;
    private PanelBackground panelBackground = new PanelBackground();
    private JLabel grupoA_JL = new JLabel("Grupo A:");
    private JLabel ecuador_JL = new JLabel("Ecuador");
    private JLabel qatar_JL = new JLabel("Qatar");
    private JLabel holanda_JL = new JLabel("Holanda");
    private JLabel senegal_JL = new JLabel("Senegal");
    private JTextField ecuador_JTF = new JTextField();
    private JTextField qatar_JTF = new JTextField();
    private JTextField holanda_JTF = new JTextField();
    private JTextField senegal_JTF = new JTextField();
    private JLabel grupoB_JL = new JLabel("Grupo B:");
    private JLabel gales_JL = new JLabel("Gales");
    private JLabel inglaterra_JL = new JLabel("Inglaterra");
    private JLabel iran_JL = new JLabel("Iran");
    private JLabel usa_JL = new JLabel("USA");
    private JTextField gales_JTF = new JTextField();
    private JTextField inglaterra_JTF = new JTextField();
    private JTextField iran_JTF = new JTextField();
    private JTextField usa_JTF = new JTextField();
    private JLabel grupoC_JL = new JLabel("Grupo C:");
    private JLabel arabia_JL = new JLabel("Arabia S.");
    private JLabel argentina_JL = new JLabel("Argentina");
    private JLabel mexico_JL = new JLabel("Mexico");
    private JLabel polonia_JL = new JLabel("Polonia");
    private JTextField arabia_JTF = new JTextField();
    private JTextField argentina_JTF = new JTextField();
    private JTextField mexico_JTF = new JTextField();
    private JTextField polonia_JTF = new JTextField();
    private JLabel grupoD_JL = new JLabel("Grupo D:");
    private JLabel australia_JL = new JLabel("Australia");
    private JLabel dinamarca_JL = new JLabel("Dinamarca");
    private JLabel francia_JL = new JLabel("Francia");
    private JLabel tunez_JL = new JLabel("Tunez");
    private JTextField australia_JTF = new JTextField();
    private JTextField dinamarca_JTF = new JTextField();
    private JTextField francia_JTF = new JTextField();
    private JTextField tunez_JTF = new JTextField();
    private JLabel grupoE_JL = new JLabel("Grupo E:");
    private JLabel alemania_JL = new JLabel("Alemania");
    private JLabel costa_rica_JL = new JLabel("Costa Rica");
    private JLabel españa_JL = new JLabel("España");
    private JLabel japon_JL = new JLabel("Japon");
    private JTextField alemania_JTF = new JTextField();
    private JTextField costa_rica_JTF = new JTextField();
    private JTextField españa_JTF = new JTextField();
    private JTextField japon_JTF = new JTextField();
    private JLabel grupoF_JL = new JLabel("Grupo F:");
    private JLabel belgica_JL = new JLabel("Belgica");
    private JLabel canada_JL = new JLabel("Canada");
    private JLabel croacia_JL = new JLabel("Croacia");
    private JLabel marruecos_JL = new JLabel("Marruecos");
    private JTextField belgica_JTF = new JTextField();
    private JTextField canada_JTF = new JTextField();
    private JTextField croacia_JTF = new JTextField();
    private JTextField marruecos_JTF = new JTextField();
    private JLabel grupoG_JL = new JLabel("Grupo G:");
    private JLabel brazil_JL = new JLabel("Brazil");
    private JLabel camerun_JL = new JLabel("Camerun");
    private JLabel serbia_JL = new JLabel("Serbia");
    private JLabel suiza_JL = new JLabel("Suiza");
    private JTextField brazil_JTF = new JTextField();
    private JTextField camerun_JTF = new JTextField();
    private JTextField serbia_JTF = new JTextField();
    private JTextField suiza_JTF = new JTextField();
    private JLabel grupoH_JL = new JLabel("Grupo H:");
    private JLabel ghana_JL = new JLabel("Ghana");
    private JLabel corea_JL = new JLabel("Corea");
    private JLabel portugal_JL = new JLabel("Portugal");
    private JLabel uruguay_JL = new JLabel("Uruguay");
    private JTextField ghana_JTF = new JTextField();
    private JTextField corea_JTF = new JTextField();
    private JTextField portugal_JTF = new JTextField();
    private JTextField uruguay_JTF = new JTextField();


    public Window (){
        this.setBounds(10, 10, 1700, 900);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents() {
        this.botonInit.setBounds(430, 15, 200, 30);
        botonInit.setFont(new Font("Helvetivca", Font.PLAIN, 18));
        botonInit.setForeground(Color.BLACK);
        this.add(botonInit);

        // this.botonFase1.setBounds(1570, 15, 120, 30);
        // botonFase1.setFont(new Font("Helvetivca", Font.PLAIN, 18));
        // botonFase1.setForeground(Color.BLACK);
        // this.add(botonFase1);

        this.botonSaveSel.setBounds(1170, 15, 250, 30);
        botonSaveSel.setFont(new Font("Helvetivca", Font.PLAIN, 18));
        botonSaveSel.setForeground(Color.BLACK);
        this.add(botonSaveSel);
        
        this.grupoA_JL.setBounds(160, 60, 120, 30);
        fontColorWhiteJL(grupoA_JL);
        add(grupoA_JL);
        this.ecuador_JL.setBounds(140, 110, 120, 30);
        fontColorWhiteJL(ecuador_JL);
        add(ecuador_JL);
        this.qatar_JL.setBounds(140, 160, 120, 30);
        fontColorWhiteJL(qatar_JL);
        add(qatar_JL);
        this.holanda_JL.setBounds(140, 210, 120, 30);
        fontColorWhiteJL(holanda_JL);
        add(holanda_JL);
        this.senegal_JL.setBounds(140, 260, 120, 30);
        fontColorWhiteJL(senegal_JL);
        add(senegal_JL);
        this.ecuador_JTF.setBounds(280, 110, 30, 30);
        fontColorWhiteJTF(ecuador_JTF);
        add(ecuador_JTF);
        this.qatar_JTF.setBounds(280, 160, 30, 30);
        fontColorWhiteJTF(qatar_JTF);
        add(qatar_JTF);
        this.holanda_JTF.setBounds(280, 210, 30, 30);
        fontColorWhiteJTF(holanda_JTF);
        add(holanda_JTF);
        this.senegal_JTF.setBounds(280, 260, 30, 30);
        fontColorWhiteJTF(senegal_JTF);
        add(senegal_JTF);

        this.grupoB_JL.setBounds(480, 60, 120, 30);
        fontColorWhiteJL(grupoB_JL);
        add(grupoB_JL);
        this.gales_JL.setBounds(460, 110, 120, 30);
        fontColorWhiteJL(gales_JL);
        add(gales_JL);
        this.inglaterra_JL.setBounds(460, 160, 120, 30);
        fontColorWhiteJL(inglaterra_JL);
        add(inglaterra_JL);
        this.iran_JL.setBounds(460, 210, 120, 30);
        fontColorWhiteJL(iran_JL);
        add(iran_JL);
        this.usa_JL.setBounds(460, 260, 120, 30);
        fontColorWhiteJL(usa_JL);
        add(usa_JL);
        this.gales_JTF.setBounds(600, 110, 30, 30);
        fontColorWhiteJTF(gales_JTF);
        add(gales_JTF);
        this.inglaterra_JTF.setBounds(600, 160, 30, 30);
        fontColorWhiteJTF(inglaterra_JTF);
        add(inglaterra_JTF);
        this.iran_JTF.setBounds(600, 210, 30, 30);
        fontColorWhiteJTF(iran_JTF);
        add(iran_JTF);
        this.usa_JTF.setBounds(600, 260, 30, 30);
        fontColorWhiteJTF(usa_JTF);
        add(usa_JTF);

        this.grupoC_JL.setBounds(800, 60, 120, 30);
        fontColorWhiteJL(grupoC_JL);
        add(grupoC_JL);
        this.arabia_JL.setBounds(780, 110, 120, 30);
        fontColorWhiteJL(arabia_JL);
        add(arabia_JL);
        this.argentina_JL.setBounds(780, 160, 120, 30);
        fontColorWhiteJL(argentina_JL);
        add(argentina_JL);
        this.mexico_JL.setBounds(780, 210, 120, 30);
        fontColorWhiteJL(mexico_JL);
        add(mexico_JL);
        this.polonia_JL.setBounds(780, 260, 120, 30);
        fontColorWhiteJL(polonia_JL);
        add(polonia_JL);
        this.arabia_JTF.setBounds(910, 110, 30, 30);
        fontColorWhiteJTF(arabia_JTF);
        add(arabia_JTF);
        this.argentina_JTF.setBounds(910, 160, 30, 30);
        fontColorWhiteJTF(argentina_JTF);
        add(argentina_JTF);
        this.mexico_JTF.setBounds(910, 210, 30, 30);
        fontColorWhiteJTF(mexico_JTF);
        add(mexico_JTF);
        this.polonia_JTF.setBounds(910, 260, 30, 30);
        fontColorWhiteJTF(polonia_JTF);
        add(polonia_JTF);

        this.grupoD_JL.setBounds(160, 330, 120, 30);
        fontColorWhiteJL(grupoD_JL);
        add(grupoD_JL);
        this.australia_JL.setBounds(140, 380, 120, 30);
        fontColorWhiteJL(australia_JL);
        add(australia_JL);
        this.dinamarca_JL.setBounds(140, 430, 130, 30);
        fontColorWhiteJL(dinamarca_JL);
        add(dinamarca_JL);
        this.francia_JL.setBounds(140, 480, 120, 30);
        fontColorWhiteJL(francia_JL);
        add(francia_JL);
        this.tunez_JL.setBounds(140, 530, 120, 30);
        fontColorWhiteJL(tunez_JL);
        add(tunez_JL);
        this.australia_JTF.setBounds(280, 380, 30, 30);
        fontColorWhiteJTF(australia_JTF);
        add(australia_JTF);
        this.dinamarca_JTF.setBounds(280, 430, 30, 30);
        fontColorWhiteJTF(dinamarca_JTF);
        add(dinamarca_JTF);
        this.francia_JTF.setBounds(280, 480, 30, 30);
        fontColorWhiteJTF(francia_JTF);
        add(francia_JTF);
        this.tunez_JTF.setBounds(280, 530, 30, 30);
        fontColorWhiteJTF(tunez_JTF);
        add(tunez_JTF);

        this.grupoE_JL.setBounds(480, 330, 120, 30);
        fontColorWhiteJL(grupoE_JL);
        add(grupoE_JL);
        this.alemania_JL.setBounds(460, 380, 120, 30);
        fontColorWhiteJL(alemania_JL);
        add(alemania_JL);
        this.costa_rica_JL.setBounds(460, 430, 120, 30);
        fontColorWhiteJL(costa_rica_JL);
        add(costa_rica_JL);
        this.españa_JL.setBounds(460, 480, 120, 30);
        fontColorWhiteJL(españa_JL);
        add(españa_JL);
        this.japon_JL.setBounds(460, 530, 120, 30);
        fontColorWhiteJL(japon_JL);
        add(japon_JL);
        this.alemania_JTF.setBounds(600, 380, 30, 30);
        fontColorWhiteJTF(alemania_JTF);
        add(alemania_JTF);
        this.costa_rica_JTF.setBounds(600, 430, 30, 30);
        fontColorWhiteJTF(costa_rica_JTF);
        add(costa_rica_JTF);
        this.españa_JTF.setBounds(600, 480, 30, 30);
        fontColorWhiteJTF(españa_JTF);
        add(españa_JTF);
        this.japon_JTF.setBounds(600, 530, 30, 30);
        fontColorWhiteJTF(japon_JTF);
        add(japon_JTF);

        this.grupoF_JL.setBounds(800, 330, 120, 30);
        fontColorWhiteJL(grupoF_JL);
        add(grupoF_JL);
        this.belgica_JL.setBounds(780, 380, 120, 30);
        fontColorWhiteJL(belgica_JL);
        add(belgica_JL);
        this.canada_JL.setBounds(780, 430, 120, 30);
        fontColorWhiteJL(canada_JL);
        add(canada_JL);
        this.croacia_JL.setBounds(780, 480, 120, 30);
        fontColorWhiteJL(croacia_JL);
        add(croacia_JL);
        this.marruecos_JL.setBounds(780, 530, 120, 30);
        fontColorWhiteJL(marruecos_JL);
        add(marruecos_JL);
        this.belgica_JTF.setBounds(910, 380, 30, 30);
        fontColorWhiteJTF(belgica_JTF);
        add(belgica_JTF);
        this.canada_JTF.setBounds(910, 430, 30, 30);
        fontColorWhiteJTF(canada_JTF);
        add(canada_JTF);
        this.croacia_JTF.setBounds(910, 480, 30, 30);
        fontColorWhiteJTF(croacia_JTF);
        add(croacia_JTF);
        this.marruecos_JTF.setBounds(910, 530, 30, 30);
        fontColorWhiteJTF(marruecos_JTF);
        add(marruecos_JTF);

        this.grupoG_JL.setBounds(320, 600, 120, 30);
        fontColorWhiteJL(grupoG_JL);
        add(grupoG_JL);
        this.brazil_JL.setBounds(300, 650, 120, 30);
        fontColorWhiteJL(brazil_JL);
        add(brazil_JL);
        this.camerun_JL.setBounds(300, 700, 120, 30);
        fontColorWhiteJL(camerun_JL);
        add(camerun_JL);
        this.serbia_JL.setBounds(300, 750, 120, 30);
        fontColorWhiteJL(serbia_JL);
        add(serbia_JL);
        this.suiza_JL.setBounds(300, 800, 120, 30);
        fontColorWhiteJL(suiza_JL);
        add(suiza_JL);
        this.brazil_JTF.setBounds(440, 650, 30, 30);
        fontColorWhiteJTF(brazil_JTF);
        add(brazil_JTF);
        this.camerun_JTF.setBounds(440, 700, 30, 30);
        fontColorWhiteJTF(camerun_JTF);
        add(camerun_JTF);
        this.serbia_JTF.setBounds(440, 750, 30, 30);
        fontColorWhiteJTF(serbia_JTF);
        add(serbia_JTF);
        this.suiza_JTF.setBounds(440, 800, 30, 30);
        fontColorWhiteJTF(suiza_JTF);
        add(suiza_JTF);

        this.grupoH_JL.setBounds(640, 600, 120, 30);
        fontColorWhiteJL(grupoH_JL);
        add(grupoH_JL);
        this.ghana_JL.setBounds(620, 650, 120, 30);
        fontColorWhiteJL(ghana_JL);
        add(ghana_JL);
        this.corea_JL.setBounds(620, 700, 120, 30);
        fontColorWhiteJL(corea_JL);
        add(corea_JL);
        this.portugal_JL.setBounds(620, 750, 120, 30);
        fontColorWhiteJL(portugal_JL);
        add(portugal_JL);
        this.uruguay_JL.setBounds(620, 800, 120, 30);
        fontColorWhiteJL(uruguay_JL);
        add(uruguay_JL);
        this.ghana_JTF.setBounds(760, 650, 30, 30);
        fontColorWhiteJTF(ghana_JTF);
        add(ghana_JTF);
        this.corea_JTF.setBounds(760, 700, 30, 30);
        fontColorWhiteJTF(corea_JTF);
        add(corea_JTF);
        this.portugal_JTF.setBounds(760, 750, 30, 30);
        fontColorWhiteJTF(portugal_JTF);
        add(portugal_JTF);
        this.uruguay_JTF.setBounds(760, 800, 30, 30);
        fontColorWhiteJTF(uruguay_JTF);
        add(uruguay_JTF);

        this.panelBackground.setBounds(0, 0, 1700, 870);
        this.setBackground(Color.LIGHT_GRAY);
        this.add(panelBackground);


    }

    public HashMap<String, Integer> Positions(){
        HashMap<String, Integer> hashPosition = new HashMap<>();
        hashPosition.put("Ecuador", Integer.valueOf(getEcuador_JTF().getText()));
        hashPosition.put("Qatar", Integer.valueOf(getQatar_JTF().getText()));
        hashPosition.put("Holanda", Integer.valueOf(getHolanda_JTF().getText()));
        hashPosition.put("Senegal", Integer.valueOf(getSenegal_JTF().getText()));
        hashPosition.put("Gales", Integer.valueOf(getGales_JTF().getText()));
        hashPosition.put("Inglaterra", Integer.valueOf(getInglaterra_JTF().getText()));
        hashPosition.put("Iran", Integer.valueOf(getIran_JTF().getText()));
        hashPosition.put("USA", Integer.valueOf(getUsa_JTF().getText()));
        hashPosition.put("Arabia Saudi", Integer.valueOf(getArabia_JTF().getText()));
        hashPosition.put("Argentina", Integer.valueOf(getArgentina_JTF().getText()));
        hashPosition.put("Mexico", Integer.valueOf(getMexico_JTF().getText()));
        hashPosition.put("Polonia", Integer.valueOf(getPolonia_JTF().getText()));
        hashPosition.put("Australia", Integer.valueOf(getAustralia_JTF().getText()));
        hashPosition.put("Dinamarca", Integer.valueOf(getDinamarca_JTF().getText()));
        hashPosition.put("Francia", Integer.valueOf(getFrancia_JTF().getText()));
        hashPosition.put("Tunez", Integer.valueOf(getTunez_JTF().getText()));
        hashPosition.put("Alemania", Integer.valueOf(getAlemania_JTF().getText()));
        hashPosition.put("Costa Rica", Integer.valueOf(getCosta_rica_JTF().getText()));
        hashPosition.put("España", Integer.valueOf(getEspaña_JTF().getText()));
        hashPosition.put("Japon", Integer.valueOf(getJapon_JTF().getText()));
        hashPosition.put("Belgica", Integer.valueOf(getBelgica_JTF().getText()));
        hashPosition.put("Canada", Integer.valueOf(getCanada_JTF().getText()));
        hashPosition.put("Croacia", Integer.valueOf(getCroacia_JTF().getText()));
        hashPosition.put("Marruecos", Integer.valueOf(getMarruecos_JTF().getText()));
        hashPosition.put("Brazil", Integer.valueOf(getBrazil_JTF().getText()));
        hashPosition.put("Camerun", Integer.valueOf(getCamerun_JTF().getText()));
        hashPosition.put("Serbia", Integer.valueOf(getSerbia_JTF().getText()));
        hashPosition.put("Suiza", Integer.valueOf(getSuiza_JTF().getText()));
        hashPosition.put("Ghana", Integer.valueOf(getGhana_JTF().getText()));
        hashPosition.put("Corea", Integer.valueOf(getCorea_JTF().getText()));
        hashPosition.put("Portugal", Integer.valueOf(getPortugal_JTF().getText()));
        hashPosition.put("Uruguay", Integer.valueOf(getUruguay_JTF().getText()));
        return hashPosition;
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
        // this.botonFase1.setActionCommand(Utils.FASE1);
        // this.botonFase1.addActionListener(this.control);
        this.botonSaveSel.setActionCommand(Utils.SAVE_SEL);
        this.botonSaveSel.addActionListener(this.control);
    }

    public PanelBackground getPanelBackground() {
        return panelBackground;
    }
    public JTextField getEcuador_JTF() {
        validar(ecuador_JTF);
        return ecuador_JTF;
    }
    public JTextField getQatar_JTF() {
        validar(qatar_JTF);
        return qatar_JTF;
    }
    public JTextField getHolanda_JTF() {
        validar(holanda_JTF);
        return holanda_JTF;
    }
    public JTextField getSenegal_JTF() {
        validar(senegal_JTF);
        return senegal_JTF;
    }
    public JTextField getGales_JTF() {
        validar(gales_JTF);
        return gales_JTF;
    }
    public JTextField getInglaterra_JTF() {
        validar(inglaterra_JTF);
        return inglaterra_JTF;
    }
    public JTextField getIran_JTF() {
        validar(iran_JTF);
        return iran_JTF;
    }
    public JTextField getUsa_JTF() {
        validar(usa_JTF);
        return usa_JTF;
    }
    public JTextField getArabia_JTF() {
        validar(arabia_JTF);
        return arabia_JTF;
    }
    public JTextField getArgentina_JTF() {
        validar(argentina_JTF);
        return argentina_JTF;
    }
    public JTextField getMexico_JTF() {
        validar(mexico_JTF);
        return mexico_JTF;
    }
    public JTextField getPolonia_JTF() {
        validar(polonia_JTF);
        return polonia_JTF;
    }
    public JTextField getAustralia_JTF() {
        validar(australia_JTF);
        return australia_JTF;
    }
    public JTextField getDinamarca_JTF() {
        validar(dinamarca_JTF);
        return dinamarca_JTF;
    }
    public JTextField getFrancia_JTF() {
        validar(francia_JTF);
        return francia_JTF;
    }
    public JTextField getTunez_JTF() {
        validar(tunez_JTF);
        return tunez_JTF;
    }
    public JTextField getAlemania_JTF() {
        validar(alemania_JTF);
        return alemania_JTF;
    }
    public JTextField getCosta_rica_JTF() {
        validar(costa_rica_JTF);
        return costa_rica_JTF;
    }
    public JTextField getEspaña_JTF() {
        validar(españa_JTF);
        return españa_JTF;
    }
    public JTextField getJapon_JTF() {
        validar(japon_JTF);
        return japon_JTF;
    }
    public JTextField getBelgica_JTF() {
        validar(belgica_JTF);
        return belgica_JTF;
    }
    public JTextField getCanada_JTF() {
        validar(canada_JTF);
        return canada_JTF;
    }
    public JTextField getCroacia_JTF() {
        validar(croacia_JTF);
        return croacia_JTF;
    }
    public JTextField getMarruecos_JTF() {
        validar(marruecos_JTF);
        return marruecos_JTF;
    }
    public JTextField getBrazil_JTF() {
        validar(brazil_JTF);
        return brazil_JTF;
    }
    public JTextField getCamerun_JTF() {
        validar(camerun_JTF);
        return camerun_JTF;
    }
    public JTextField getSerbia_JTF() {
        validar(serbia_JTF);
        return serbia_JTF;
    }
    public JTextField getSuiza_JTF() {
        validar(suiza_JTF);
        return suiza_JTF;
    }
    public JTextField getGhana_JTF() {
        validar(ghana_JTF);
        return ghana_JTF;
    }
    public JTextField getCorea_JTF() {
        validar(corea_JTF);
        return corea_JTF;
    }
    public JTextField getPortugal_JTF() {
        validar(portugal_JTF);
        return portugal_JTF;
    }
    public JTextField getUruguay_JTF() {
        validar(uruguay_JTF);
        return uruguay_JTF;
    }

    public void validar(JTextField texto){
        if(texto.getText().isEmpty()){
            texto.setText("0");
        }
        if (Integer.valueOf(texto.getText()) < 1 || Integer.valueOf(texto.getText()) > 4) {     
            texto.setText("0");
        }
    }
}
