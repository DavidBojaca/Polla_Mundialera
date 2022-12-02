package launcher;

import control.Controller;

import modelo.Operations;
import vista.Window;

public class Main {
    public static void main(String[] args) {
        Window v = new Window();
        Operations m = new Operations(v);
        Controller c = new Controller(m, v);

        
    }
}
