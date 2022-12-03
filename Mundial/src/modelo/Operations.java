package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import vista.Window;
import vista.WindowF1;

public class Operations {
    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Partido> partidos = new ArrayList<>();
    private Window window = null;
    private WindowF1 windowFase1 = null;
    
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
        teams.add(new Team("Ecuador", 80, 100, Context.getInstance().getEcuador(), "A"));
        teams.add(new Team("Qatar", 80, 150, Context.getInstance().getQatar(), "A"));
        teams.add(new Team("Holanda", 80, 200, Context.getInstance().getHolanda(), "A"));
        teams.add(new Team("Senegal", 80, 250, Context.getInstance().getSenegal(), "A"));
        teams.add(new Team("Gales", 400, 100, Context.getInstance().getGales(), "B"));
        teams.add(new Team("Inglaterra", 400, 150, Context.getInstance().getInglaterra(), "B"));
        teams.add(new Team("Iran", 400, 200, Context.getInstance().getIran(), "B"));
        teams.add(new Team("USA", 400, 250, Context.getInstance().getUsa(), "B"));
        teams.add(new Team("Arabia Saudi", 720, 100, Context.getInstance().getArabia_Saudi(), "C"));
        teams.add(new Team("Argentina", 720, 150, Context.getInstance().getArgentina(), "C"));
        teams.add(new Team("Mexico", 720, 200, Context.getInstance().getMexico(), "C"));
        teams.add(new Team("Polonia", 720, 250, Context.getInstance().getPolonia(), "C"));
        teams.add(new Team("Australia", 80, 370, Context.getInstance().getAustralia(), "D"));
        teams.add(new Team("Dinamarca", 80, 420, Context.getInstance().getDinamarca(), "D"));
        teams.add(new Team("Francia", 80, 470, Context.getInstance().getFrancia(), "D"));
        teams.add(new Team("Tunez", 80, 520, Context.getInstance().getTunez(), "D"));
        teams.add(new Team("Alemania", 400, 370, Context.getInstance().getAlemania(), "E"));
        teams.add(new Team("Costa Rica", 400, 420, Context.getInstance().getCosta_Rica(), "E"));
        teams.add(new Team("España", 400, 470, Context.getInstance().getEspaña(), "E"));
        teams.add(new Team("Japon", 400, 520, Context.getInstance().getJapon(), "E"));
        teams.add(new Team("Belgica", 720, 370, Context.getInstance().getBelgica(), "F"));
        teams.add(new Team("Canada", 720, 420, Context.getInstance().getCanada(), "F"));
        teams.add(new Team("Croacia", 720, 470, Context.getInstance().getCroacia(), "F"));
        teams.add(new Team("Marruecos", 720, 520, Context.getInstance().getMarruecos(), "F"));
        teams.add(new Team("Brazil", 240, 640, Context.getInstance().getBrazil(), "G"));
        teams.add(new Team("Camerun", 240, 690, Context.getInstance().getCamerun(), "G"));
        teams.add(new Team("Serbia", 240, 740, Context.getInstance().getSerbia(), "G"));
        teams.add(new Team("Suiza", 240, 790, Context.getInstance().getSuiza(), "G"));
        teams.add(new Team("Ghana", 560, 640, Context.getInstance().getGhana(), "H"));
        teams.add(new Team("Corea", 560, 690, Context.getInstance().getKorea(), "H"));
        teams.add(new Team("Portugal", 560, 740, Context.getInstance().getPortugal(), "H"));
        teams.add(new Team("Uruguay", 560, 790, Context.getInstance().getUruguay(), "H"));
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

}
