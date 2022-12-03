package modelo.Composite;

public abstract class Component {
    int puntaje;

    public Component(){
       
    }

    public abstract int execute(int numpar);
    public abstract int execute();
}
