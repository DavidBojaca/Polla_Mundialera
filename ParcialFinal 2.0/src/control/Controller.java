package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Operations;
import modelo.LogIn;
import utils.Utils;
import vista.Window;
import vista.WindowF1;

public class Controller implements ActionListener{
    private Operations model;
    private Window view;
    private WindowF1 view2;
    private LogIn log;

    public Controller(Operations model, Window view){
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(Utils.CREAR)) {
            log.crearUsuario();
        }
        if  (e.getActionCommand().equals(Utils.INGRESAR)) {
           log.ingresar(); 
           if (log.ingresar() == true){
            view.setVisible(true);
           }else {
            view.setVisible(false);
           } 
        }
        if (e.getActionCommand().equals(Utils.INIT)) {
            model.init();
        } 
        if (e.getActionCommand().equals(Utils.SAVE_SEL)) {
            model.guardarSelecciones();
        } 
        if (e.getActionCommand().equals(Utils.FASE1)) {
            view2 = new WindowF1();
            this.view2.setController(this);
        } 
    }
}
