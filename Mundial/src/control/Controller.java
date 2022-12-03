package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operations;
import utils.Utils;
import vista.Window;
import vista.WindowF1;

public class Controller implements ActionListener{
    private Operations model;
    private Window view;

    public Controller(Operations model, Window view){
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // view2 = new WindowF1();
        if (e.getActionCommand().equals(Utils.INIT)) {
            model.init();
        } 
        if (e.getActionCommand().equals(Utils.INIT_FASE1)) {
            try {
                model.initFase1();
            } catch (Exception f) {
            }
        } 
        if (e.getActionCommand().equals(Utils.SAVE_SEL)) {
            model.guardarSeleccionesPosiciones();
        } 
        if (e.getActionCommand().equals(Utils.FASE1)) {

        } 
    }
}
