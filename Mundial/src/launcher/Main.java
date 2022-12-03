package launcher;

import control.Controller;
import control.Controller2;
import modelo.Operations;
import vista.Window;
import vista.WindowF1;

public class Main {
    public static void main(String[] args) {
        WindowF1 view2 = WindowF1.getInstance();
        Window v = new Window();
        Operations m = new Operations(v, view2);
        Controller c = new Controller(m, v);

        Controller2 controller2 = new Controller2(m, view2);

        
    }
}
