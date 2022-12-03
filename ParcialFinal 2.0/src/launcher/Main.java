package launcher;

//import control.Controlador;
import control.Controller;
import modelo.Operations;
import vista.Window;
import vista.Ventana; 
import modelo.LogIn;

public class Main {
    public static void main(String[] args) {

        //Ventana view = new Ventana();
        //LogIn log = new LogIn();
        //Controlador control = new Controlador(log, view);

        Window v = new Window();
        Operations m = new Operations(v);
        Controller c = new Controller(m, v);
    }
}
