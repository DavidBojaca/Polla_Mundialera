package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import modelo.Composite.Composite;
import modelo.Composite.Leaf;
import modelo.Partidos.PartidoPrimeraFase;
import modelo.Partidos.PartidoSegundaFase;
import modelo.Perfiles.Login;
import utils.Utils;
import vista.Window;
import vista.WindowF1;

public class Operations {
    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Partido> partidos = new ArrayList<>();
    private Window window = null;
    private WindowF1 windowFase1 = null;
    private Polla mipolla;
    private Login log;
    
    public Operations(Window window, WindowF1 windowFase1){
        this.window = window;
        this.windowFase1 = windowFase1;
    }
    
    public void init(){
        if (teams.isEmpty()) {
            createTeams();
            updateUI();
        }
    }

    public void initFase1(){
        System.out.println("Hola");
        if (partidos.isEmpty()) {
            crearPartidos();
            updateUIFase1();
        }
    }

    public void guardarSeleccionesPosiciones(){
        HashMap<String, Integer> positions = window.Positions();

        for (Entry<String, Integer> map : positions.entrySet()) {
            for (Team team : teams) {
                if (map.getKey().equals(team.getNombre())) {
                    team.setPosicionUsr(map.getValue());
                }
            }
        }
    }

    public void guardarSeleccionesMarcadores(){
        HashMap<String, Integer> resultadosEquipo1 = windowFase1.ResultadosEquipo1();
        HashMap<String, Integer> resultadosEquipo2 = windowFase1.ResultadosEquipo2();

        for (Partido partido : partidos) {
            for (Entry<String, Integer> mapEquipo1 : resultadosEquipo1.entrySet()) {
                for (Entry<String, Integer> mapEquipo2 : resultadosEquipo2.entrySet()) {
                    String idPartido = partido.getId() +"";
                    if (mapEquipo1.getKey().equals(idPartido) && mapEquipo2.getKey().equals(idPartido)) {
                        partido.setGolesEquipo1(mapEquipo1.getValue());
                        partido.setGolesEquipo2(mapEquipo2.getValue());
                        System.out.println("ID: " +partido.getId() + "  " + partido.getEquipo1() + " " + partido.getGolesEquipo1() + " VS " 
                                                                          + partido.getEquipo2() + " " + partido.getGolesEquipo2());
                    }
                }
            }
        }

    }

    public void createTeams(){
        teams.add(new Team("Ecuador", 80, 100, Context.getInstance().getEcuador(), "A",1));
        teams.add(new Team("Qatar", 80, 150, Context.getInstance().getQatar(), "A",2));
        teams.add(new Team("Holanda", 80, 200, Context.getInstance().getHolanda(), "A",3));
        teams.add(new Team("Senegal", 80, 250, Context.getInstance().getSenegal(), "A",4));
        teams.add(new Team("Gales", 400, 100, Context.getInstance().getGales(), "B",5));
        teams.add(new Team("Inglaterra", 400, 150, Context.getInstance().getInglaterra(), "B",6));
        teams.add(new Team("Iran", 400, 200, Context.getInstance().getIran(), "B",7));
        teams.add(new Team("USA", 400, 250, Context.getInstance().getUsa(), "B",8));
        teams.add(new Team("Arabia Saudi", 720, 100, Context.getInstance().getArabia_Saudi(), "C",9));
        teams.add(new Team("Argentina", 720, 150, Context.getInstance().getArgentina(), "C",10));
        teams.add(new Team("Mexico", 720, 200, Context.getInstance().getMexico(), "C",11));
        teams.add(new Team("Polonia", 720, 250, Context.getInstance().getPolonia(), "C",12));
        teams.add(new Team("Australia", 80, 370, Context.getInstance().getAustralia(), "D",13));
        teams.add(new Team("Dinamarca", 80, 420, Context.getInstance().getDinamarca(), "D",14));
        teams.add(new Team("Francia", 80, 470, Context.getInstance().getFrancia(), "D",15));
        teams.add(new Team("Tunez", 80, 520, Context.getInstance().getTunez(), "D",16));
        teams.add(new Team("Alemania", 400, 370, Context.getInstance().getAlemania(), "E",17));
        teams.add(new Team("Costa Rica", 400, 420, Context.getInstance().getCosta_Rica(), "E",18));
        teams.add(new Team("España", 400, 470, Context.getInstance().getEspaña(), "E",19));
        teams.add(new Team("Japon", 400, 520, Context.getInstance().getJapon(), "E",20));
        teams.add(new Team("Belgica", 720, 370, Context.getInstance().getBelgica(), "F",21));
        teams.add(new Team("Canada", 720, 420, Context.getInstance().getCanada(), "F",22));
        teams.add(new Team("Croacia", 720, 470, Context.getInstance().getCroacia(), "F",23));
        teams.add(new Team("Marruecos", 720, 520, Context.getInstance().getMarruecos(), "F",24));
        teams.add(new Team("Brazil", 240, 640, Context.getInstance().getBrazil(), "G",25));
        teams.add(new Team("Camerun", 240, 690, Context.getInstance().getCamerun(), "G",26));
        teams.add(new Team("Serbia", 240, 740, Context.getInstance().getSerbia(), "G",27));
        teams.add(new Team("Suiza", 240, 790, Context.getInstance().getSuiza(), "G",28));
        teams.add(new Team("Ghana", 560, 640, Context.getInstance().getGhana(), "H",29));
        teams.add(new Team("Corea", 560, 690, Context.getInstance().getKorea(), "H",30));
        teams.add(new Team("Portugal", 560, 740, Context.getInstance().getPortugal(), "H",31));
        teams.add(new Team("Uruguay", 560, 790, Context.getInstance().getUruguay(), "H",32));
    }

    public void crearPartidos(){
        partidos.add(new Partido(1, "Qatar", Context.getInstance().getQatar(), 200, 100, "Ecuador", Context.getInstance().getEcuador(), 330, 100));
        partidos.add(new Partido(2, "Inglaterra", Context.getInstance().getInglaterra(), 200, 150, "Iran", Context.getInstance().getIran(), 330, 150));
        partidos.add(new Partido(3, "Senegal", Context.getInstance().getSenegal(), 200, 200, "Holanda", Context.getInstance().getHolanda(), 330, 200));
        partidos.add(new Partido(4, "USA", Context.getInstance().getUsa(), 200, 250, "Gales", Context.getInstance().getGales(), 330, 250));
        partidos.add(new Partido(5, "Argentina", Context.getInstance().getArgentina(), 200, 300, "Arabia", Context.getInstance().getArabia_Saudi(), 330, 300));
        partidos.add(new Partido(6, "Dinamarca", Context.getInstance().getDinamarca(), 200, 350, "Tunez", Context.getInstance().getTunez(), 330, 350));
        partidos.add(new Partido(7, "Mexico", Context.getInstance().getMexico(), 200, 400, "Polonia", Context.getInstance().getPolonia(), 330, 400));
        partidos.add(new Partido(8, "Francia", Context.getInstance().getFrancia(), 200, 450, "Australia", Context.getInstance().getAustralia(), 330, 450));
        partidos.add(new Partido(9, "Marruecos", Context.getInstance().getMarruecos(), 200, 500, "Croacia", Context.getInstance().getCroacia(), 330, 500));
        partidos.add(new Partido(10, "Alemania", Context.getInstance().getAlemania(), 200, 550, "Japon", Context.getInstance().getJapon(), 330, 550));
        partidos.add(new Partido(11, "España", Context.getInstance().getEspaña(), 200, 600, "Costa Rica", Context.getInstance().getCosta_Rica(), 330, 600));
        partidos.add(new Partido(12, "Belgica", Context.getInstance().getBelgica(), 200, 650, "Canada", Context.getInstance().getCanada(), 330, 650));
        partidos.add(new Partido(13, "Suiza", Context.getInstance().getSuiza(), 630, 100, "Camerun", Context.getInstance().getCamerun(), 760, 100));
        partidos.add(new Partido(14, "Uruguay", Context.getInstance().getUruguay(), 630, 150, "Corea", Context.getInstance().getKorea(), 760, 150));
        partidos.add(new Partido(15, "Portugal", Context.getInstance().getPortugal(), 630, 200, "Ghana", Context.getInstance().getGhana(), 760, 200));
        partidos.add(new Partido(16, "Brasil", Context.getInstance().getBrazil(), 630, 250, "Serbia", Context.getInstance().getSerbia(), 760, 250));
        partidos.add(new Partido(17, "Gales", Context.getInstance().getGales(), 630, 300, "Iran", Context.getInstance().getIran(), 760, 300));
        partidos.add(new Partido(18, "Qatar", Context.getInstance().getQatar(), 630, 350, "Senegal", Context.getInstance().getSenegal(), 760, 350));
        partidos.add(new Partido(19, "Holanda", Context.getInstance().getHolanda(), 630, 400, "Ecuador", Context.getInstance().getEcuador(), 760, 400));
        partidos.add(new Partido(20, "Inglaterra", Context.getInstance().getInglaterra(), 630, 450, "USA", Context.getInstance().getUsa(), 760, 450));
        partidos.add(new Partido(21, "Tunez", Context.getInstance().getTunez(), 630, 500, "Australia", Context.getInstance().getAustralia(), 760, 500));
        partidos.add(new Partido(22, "Polonia", Context.getInstance().getPolonia(), 630, 550, "Arabia", Context.getInstance().getArabia_Saudi(), 760, 550));
        partidos.add(new Partido(23, "Francia", Context.getInstance().getFrancia(), 630, 600, "Dinamarca", Context.getInstance().getDinamarca(), 760, 600));
        partidos.add(new Partido(24, "Argentina", Context.getInstance().getArgentina(), 630, 650, "Mexico", Context.getInstance().getMexico(), 760, 650));
        partidos.add(new Partido(25, "Japon", Context.getInstance().getJapon(), 1060, 100, "Costa Rica", Context.getInstance().getCosta_Rica(), 1190, 100));
        partidos.add(new Partido(26, "Belgica", Context.getInstance().getBelgica(), 1060, 150, "Marruecos", Context.getInstance().getMarruecos(), 1190, 150));
        partidos.add(new Partido(27, "Croacia", Context.getInstance().getCroacia(), 1060, 200, "Canada", Context.getInstance().getCanada(), 1190, 200));
        partidos.add(new Partido(28, "España", Context.getInstance().getEspaña(), 1060, 250, "Alemania", Context.getInstance().getAlemania(), 1190, 250));
        partidos.add(new Partido(29, "Camerun", Context.getInstance().getCamerun(), 1060, 300, "Serbia", Context.getInstance().getCamerun(), 1190, 300));
        partidos.add(new Partido(30, "Corea", Context.getInstance().getKorea(), 1060, 350, "Ghana", Context.getInstance().getGhana(), 1190, 350));
        partidos.add(new Partido(31, "Brasil", Context.getInstance().getBrazil(), 1060, 400, "Suiza", Context.getInstance().getSuiza(), 1190, 400));
        partidos.add(new Partido(32, "Portugal", Context.getInstance().getPortugal(), 1060, 450, "Uruguay", Context.getInstance().getUruguay(), 1190, 450));
        partidos.add(new Partido(33, "Ecuador", Context.getInstance().getEcuador(), 1060, 500, "Senegal", Context.getInstance().getSenegal(), 1190, 500));
        partidos.add(new Partido(34, "Holanda", Context.getInstance().getHolanda(), 1060, 550, "Qatar", Context.getInstance().getQatar(), 1190, 550));
        partidos.add(new Partido(35, "Gales", Context.getInstance().getGales(), 1060, 600, "Inglaterra", Context.getInstance().getInglaterra(), 1190, 600));
        partidos.add(new Partido(36, "Iran", Context.getInstance().getIran(), 1060, 650, "USA", Context.getInstance().getUsa(), 1190, 650));
        partidos.add(new Partido(37, "Australia", Context.getInstance().getAustralia(), 1490, 100, "Dinamarca", Context.getInstance().getDinamarca(), 1620, 100));
        partidos.add(new Partido(38, "Tunez", Context.getInstance().getTunez(), 1490, 150, "Francia", Context.getInstance().getFrancia(), 1620, 150));
        partidos.add(new Partido(39, "Arabia", Context.getInstance().getArabia_Saudi(), 1490, 200, "Mexico", Context.getInstance().getMexico(), 1620, 200));
        partidos.add(new Partido(40, "Polonia", Context.getInstance().getPolonia(), 1490, 250, "Argentina", Context.getInstance().getPolonia(), 1620, 250));
        partidos.add(new Partido(41, "Canada", Context.getInstance().getCanada(), 1490, 300, "Marruecos", Context.getInstance().getMarruecos(), 1620, 300));
        partidos.add(new Partido(42, "Croacia", Context.getInstance().getCroacia(), 1490, 350, "Belgica", Context.getInstance().getBelgica(), 1620, 350));
        partidos.add(new Partido(43, "Costa Rica", Context.getInstance().getCosta_Rica(), 1490, 400, "Alemania", Context.getInstance().getAlemania(), 1620, 400));
        partidos.add(new Partido(44, "Japon", Context.getInstance().getJapon(), 1490, 450, "España", Context.getInstance().getEspaña(), 1620, 450));
        partidos.add(new Partido(45, "Corea", Context.getInstance().getKorea(), 1490, 500, "Portugal", Context.getInstance().getPortugal(), 1620, 500));
        partidos.add(new Partido(46, "Ghana", Context.getInstance().getGhana(), 1490, 550, "Uruguay", Context.getInstance().getUruguay(), 1620, 550));
        partidos.add(new Partido(47, "Camerun", Context.getInstance().getCamerun(), 1490, 600, "Brasil", Context.getInstance().getBrazil(), 1620, 600));
        partidos.add(new Partido(48, "Serbia", Context.getInstance().getSerbia(), 1490, 650, "Suiza", Context.getInstance().getSuiza(), 1620, 650));

    }
    public void updateUI() {
        window.getPanelBackground().getTeams().addAll(teams);
        window.repaint();
    }

    public void updateUIFase1() {
        windowFase1.getPanelFase1().getPartidos().addAll(partidos);
        windowFase1.repaint();
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public void setWindowFase1(WindowF1 windowFase1) {
        this.windowFase1 = windowFase1;
    }
     /**
     * @return the teams
     */
    public ArrayList<Team> getTeams() {
        return teams;
    }

    /**
     * @param teams the teams to set
     */
    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
        System.out.println();
    }


    public Team encontarEquipo(int id) {
        Team equipo = null;
        for (int i = 0; i < teams.size(); i++) {
            if ( id ==teams.get(i).getId()) {
                equipo= teams.get(i);
                break;
            }
        }
        if (equipo==null) {
            System.out.println("No se encontro un id valido ");
           return null;
        }else {
            return equipo;
        }
       
    }


    public PartidoPrimeraFase encontarPartidoF1(int id) {
        PartidoPrimeraFase partidoF1 = null;
        for (int i = 0; i < mipolla.getListaPartidosFase1().size(); i++) {
            if ( id ==mipolla.getListaPartidosFase1().get(i).getIdPartido()) {
                partidoF1 = mipolla.getListaPartidosFase1().get(i);
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



    public PartidoSegundaFase encontarPartidoF2(int id) {
        PartidoSegundaFase partidoF2 = null;
        for (int i = 0; i < mipolla.getListapartidosFase2().size(); i++) {
            if ( id ==mipolla.getListaPartidosFase1().get(i).getIdPartido()) {
                partidoF2 = mipolla.getListapartidosFase2().get(i);
                break;
            }
        }
        if (partidoF2==null) {
            System.out.println("No se encontro un id valido ");
           return null;
        }else {
            return partidoF2;
        }
       
    }

    
    public void guardarPartidoFase1(PartidoPrimeraFase Partido) {
        mipolla.adicionarPartidoFase1(Partido);
    }


    public void guardarPartidoFase2(PartidoSegundaFase Partido) {
        mipolla.adicionarPartidoFase2(Partido);
    }



    public void descalificarEquipo( int id) {
        for (int i = 0; i < teams.size(); i++) {
            if ( id ==teams.get(i).getId()) {
                teams.get(i).setEstado(false);
                break;
            }
        } 
    }

    

    public Team ganadorFase1(PartidoPrimeraFase partido) {
        Team ganador= null;
        if(partido.getMarcadorT1()>partido.getMarcadorT2()){
            ganador =partido.getTeam1();
        }else if(partido.getMarcadorT1()<partido.getMarcadorT2()){
            ganador =partido.getTeam2();
        }
        return ganador;
    }


    public Team ganadorFase2(PartidoSegundaFase partido) {
        Team ganador= null;
        if(partido.getMarcadorT1()>partido.getMarcadorT2()){
            ganador =partido.getTeam1();
        }else if(partido.getMarcadorT1()<partido.getMarcadorT2()){
            ganador =partido.getTeam2();
        }
        return ganador;
    }


    

    public void setMarcadorF1(int id,int marcadorT1, int marcadorT2){
        for (int i = 0; i < mipolla.getListaPartidosFase1().size(); i++) {
            if (id == mipolla.getListaPartidosFase1().get(i).getIdPartido() ) {
                mipolla.getListaPartidosFase1().get(i).setMarcadorT1(marcadorT1);
                mipolla.getListaPartidosFase1().get(i).setMarcadorT2(marcadorT2);
            }
        }

    }

    public void setMarcadorF2(int id,int marcadorT1, int marcadorT2){
        for (int i = 0; i < mipolla.getListapartidosFase2().size(); i++) {
            if (id == mipolla.getListapartidosFase2().get(i).getIdPartido() ) {
                mipolla.getListapartidosFase2().get(i).setMarcadorT1(marcadorT1);
                mipolla.getListapartidosFase2().get(i).setMarcadorT2(marcadorT2);
            }
        }

    }

    
    public static Composite primeraFase() {
        Composite calificacion = new Composite();
        Leaf partido1 = new Leaf(1);
        Leaf partido2 = new Leaf(2);
        Leaf partido3 = new Leaf(3);
        Leaf partido4 = new Leaf(4);
        Leaf partido5 = new Leaf(5);
        Leaf partido6 = new Leaf(6);
        Leaf partido7 = new Leaf(7);
        Leaf partido8 = new Leaf(8);
        Leaf partido9 = new Leaf(9);
        Leaf partido10 = new Leaf(10);
        Leaf partido11= new Leaf(11);
        Leaf partido12 = new Leaf(12);
        Leaf partido13 = new Leaf(13);
        Leaf partido14 = new Leaf(14);
        Leaf partido15 = new Leaf(15);
        Leaf partido16 = new Leaf(16);
        Leaf partido17 = new Leaf(17);
        Leaf partido18 = new Leaf(18);
        Leaf partido19 = new Leaf(19);
        Leaf partido20 = new Leaf(20);
        Leaf partido21 = new Leaf(21);
        Leaf partido22 = new Leaf(22);
        Leaf partido23 = new Leaf(23);
        Leaf partido24 = new Leaf(24);
        Leaf partido25 = new Leaf(25);
        Leaf partido26 = new Leaf(26);
        Leaf partido27 = new Leaf(27);
        Leaf partido28 = new Leaf(28);
        Leaf partido29 = new Leaf(29);
        Leaf partido30 = new Leaf(30);
        Leaf partido31 = new Leaf(31);
        Leaf partido32 = new Leaf(32);
        Leaf partido33 = new Leaf(33);
        Leaf partido34 = new Leaf(34);
        Leaf partido35 = new Leaf(35);
        Leaf partido36 = new Leaf(36);
        Leaf partido37 = new Leaf(37);
        Leaf partido38 = new Leaf(38);
        Leaf partido39 = new Leaf(39);
        Leaf partido40 = new Leaf(40);
        Leaf partido41 = new Leaf(41);
        Leaf partido42 = new Leaf(42);
        Leaf partido43 = new Leaf(43);
        Leaf partido44 = new Leaf(44);
        Leaf partido45 = new Leaf(45);
        Leaf partido46 = new Leaf(46);
        Leaf partido47 = new Leaf(47);
        Leaf partido48 = new Leaf(48);
      
        calificacion.partidos.add(partido1);
        calificacion.partidos.add(partido2);
        calificacion.partidos.add(partido3);
        calificacion.partidos.add(partido4);
        calificacion.partidos.add(partido5);
        calificacion.partidos.add(partido6);
        calificacion.partidos.add(partido7);
        calificacion.partidos.add(partido8);
        calificacion.partidos.add(partido9);
        calificacion.partidos.add(partido10);
        calificacion.partidos.add(partido11);
        calificacion.partidos.add(partido12);
        calificacion.partidos.add(partido13);
        calificacion.partidos.add(partido14);
        calificacion.partidos.add(partido15);
        calificacion.partidos.add(partido16);
        calificacion.partidos.add(partido17);
        calificacion.partidos.add(partido18);
        calificacion.partidos.add(partido19);
        calificacion.partidos.add(partido20);
        calificacion.partidos.add(partido21);
        calificacion.partidos.add(partido22);
        calificacion.partidos.add(partido23);
        calificacion.partidos.add(partido24);
        calificacion.partidos.add(partido25);
        calificacion.partidos.add(partido26);
        calificacion.partidos.add(partido27);
        calificacion.partidos.add(partido28);
        calificacion.partidos.add(partido29);
        calificacion.partidos.add(partido30);
        calificacion.partidos.add(partido31);
        calificacion.partidos.add(partido32);
        calificacion.partidos.add(partido33);
        calificacion.partidos.add(partido34);
        calificacion.partidos.add(partido35);
        calificacion.partidos.add(partido36);
        calificacion.partidos.add(partido37);
        calificacion.partidos.add(partido38);
        calificacion.partidos.add(partido39);
        calificacion.partidos.add(partido40);
        calificacion.partidos.add(partido41);
        calificacion.partidos.add(partido42);
        calificacion.partidos.add(partido43);
        calificacion.partidos.add(partido44);
        calificacion.partidos.add(partido45);
        calificacion.partidos.add(partido46);
        calificacion.partidos.add(partido47);
        calificacion.partidos.add(partido48);

        calificacion.execute();
        
        
        return calificacion;
    }




    public void crearTxt() {
        try {
            String name = log.getUser();
            String ruta = "F:\\github\\Parcial final\\parcial\\src\\Plantillas\\";
            String contenido = name+",";
            File file = new File("ruta"+name+".txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            for (int i = 0; i < mipolla.getListaPartidosFase1().size(); i++) {
                PartidoPrimeraFase mipartido =mipolla.getListaPartidosFase1().get(i);
                contenido+=  (
                mipartido.getIdPartido()+","+
                mipartido.getTeam1().getNombre()+","+
                mipartido.getMarcadorT1()+","+
                mipartido.getTeam2().getNombre()+","+
                mipartido.getMarcadorT2()+","
                );

            }

            for (int i = 0; i < teams.size(); i++) {
                contenido+=  (teams.get(i).getNombre()+","+teams.get(i).getPosicionUsr()+",");

            }

            bw.write(contenido);
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void verPuntaje() {
        JOptionPane.showMessageDialog(null, "El puntaje del usuario "+ log.getUser()+":"+ log.getMipolla().getPuntaje());
    }

    public void iniciarAdmin() {
        Random rmd = new Random();
        Login admin= new Login("admin", "123");
        ArrayList<Partido> copiaPartidos = new ArrayList<>();
        copiaPartidos.addAll(partidos);
        for (int i = 1; i < 48; i++) {
            admin.getOpe().crearPartidos();

            for (int j = 0; j < copiaPartidos.size(); j++) {
                admin.getOpe().(copiaPartidos.get(i).setGolesEquipo1(rmd.nextInt(6)));
            }
            
    }
        }

    public void cambiarMarcador(PartidoPrimeraFase,) {
        
    }


    public Team buscarNombre(String nombre) {
        Team equipo = null;
        for (int i = 0; i < teams.size(); i++) {
            if ( nombre.equals(teams.get(i).getNombre()) ) {
                equipo= teams.get(i);
                break;
            }
        }
        if (equipo==null) {
            System.out.println("No se encontro un id valido ");
           return null;
        }else {
            return equipo;
        }
    }
        
}
