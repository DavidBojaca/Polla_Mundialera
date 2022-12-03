package modelo;

import java.util.ArrayList;

import modelo.Partidos.PartidoSegundaFase;
import modelo.Partidos.PartidoPrimeraFase;


public class Polla  {
    //private Persona jugador;
    private int id;
    private Operations ope;

    private int puntaje;
   

    private ArrayList<PartidoPrimeraFase> listaPartidosFase1 = new ArrayList<PartidoPrimeraFase>();
    private ArrayList<PartidoSegundaFase> listapartidosFase2 = new ArrayList<PartidoSegundaFase>();


   
    public Polla() {
        
    }

     /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }


    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @return the listapartidos
     */
    public ArrayList<PartidoSegundaFase> getListapartidosFase2() {
        return listapartidosFase2;
    }

    /**
     * @param listapartidosFase2 the listapartidos to set
     */
    public void setListapartidosFase2(ArrayList<PartidoSegundaFase> listapartidosdFase2) {
        this.listapartidosFase2 = listapartidosFase2;
    }


    /**
     * @return the listaPartidosFase1
     */
    public ArrayList<PartidoPrimeraFase> getListaPartidosFase1() {
        return listaPartidosFase1;
    }


    /**
     * @param listaPartidosFase1 the listaPartidosFase1 to set
     */
    public void setListaPartidosFase1(ArrayList<PartidoPrimeraFase> listaPartidosFase1) {
        this.listaPartidosFase1 = listaPartidosFase1;
    }
    

    public void adicionarPartidoFase2(PartidoSegundaFase partido) {
        listapartidosFase2.add(partido);
    }

    public void adicionarPartidoFase1(PartidoPrimeraFase partido) {
        listaPartidosFase1.add(partido);
    }


    public PartidoPrimeraFase encontarPartidoF1(int id) {
        PartidoPrimeraFase partidoF1 = null;
        for (int i = 0; i < listaPartidosFase1.size(); i++) {
            if ( id == listaPartidosFase1.get(i).getIdPartido()) {
                partidoF1 = listaPartidosFase1.get(i);
                break;
            }
        }
        if (partidoF1==null) {
            System.out.println("No se encontro un id valido ");
           return null;
        }else {
            return partidoF1;
        }
       
    }


    public ArrayList<Team> listaTeams(){
       return ope.getTeams();
    }




   





}
