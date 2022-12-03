package modelo.Composite;

import java.util.ArrayList;

import modelo.Polla;

public class Composite extends Component{
    
    public ArrayList<Component> partidos = new ArrayList<Component>();
    private int puntaje;

    public Composite(){
        
    }

    @Override
    public int execute() {
        
        for (int i = 0; i < partidos.size(); i++){
            puntaje += partidos.get(i).execute(i+1);
        }
        return puntaje;
    }

    @Override
    public int execute(int numpar) {
        
        return 0;
    }
}
