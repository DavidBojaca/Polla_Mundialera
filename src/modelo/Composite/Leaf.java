package modelo.Composite;


import modelo.Polla;
import modelo.Operations;
import modelo.Partidos.PartidoPrimeraFase;
import modelo.Perfiles.Login;

public class Leaf extends Component{
    private Login admin;
    private Polla miPolla;
    private Operations ope ;
    private int puntaje = miPolla.getPuntaje();
    private PartidoPrimeraFase partido;
    private PartidoPrimeraFase partidoAdmin;
    public Leaf(int id) {
         partido = ope.encontarPartidoF1(id);
    }

    @Override
    public int execute(int numpart) {

        partidoAdmin= admin.getMipolla().encontarPartidoF1(numpart);

        if(partidoAdmin.getMarcadorT1()==partido.getMarcadorT1()){
            puntaje+=3;
        }

        if (numpart==48) {
            for (int i = 1; i < 32 ; i++) {
                if(miPolla.listaTeams().get(i).getPosicionUsr()==admin.getMipolla().listaTeams().get(i).getPosicionUsr()){
                    puntaje+=5;
                }
            }
        }
        return puntaje;
    }

    @Override
    public int execute() {
        
        return 0;
    }
    
}
