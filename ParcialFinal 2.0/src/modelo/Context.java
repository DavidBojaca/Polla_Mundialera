package modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

import utils.Utils;

public class Context {
    private static Context instance;
    private ImageIcon imageBackground = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_BACKGROUND));
    private ImageIcon ecuador = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_ECUADOR));
    private ImageIcon holanda = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_HOLANDA));
    private ImageIcon qatar = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_QATAR));
    private ImageIcon senegal = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_SENEGAL));
    private ImageIcon gales = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_GALES));
    private ImageIcon inglaterra = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_INGLATERRA));
    private ImageIcon iran = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_IRAN));
    private ImageIcon usa = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_USA));
    private ImageIcon arabia_Saudi = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_ARABIA));
    private ImageIcon argentina = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_ARGENTINA));
    private ImageIcon mexico = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_MEXICO));
    private ImageIcon polonia = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_POLONIA));
    private ImageIcon australia = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_AUSTRALIA));
    private ImageIcon dinamarca = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_DINAMARCA));
    private ImageIcon francia = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_FRANCIA));
    private ImageIcon tunez = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_TUNEZ));
    private ImageIcon alemania = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_ALEMANIA));
    private ImageIcon costa_Rica = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_COSTA_RICA));
    private ImageIcon españa = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_ESPAÑA));
    private ImageIcon japon = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_JAPON));
    private ImageIcon belgica = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_BELGICA));
    private ImageIcon canada = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_CANADA));
    private ImageIcon croacia = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_CROACIA));
    private ImageIcon marruecos = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_MARRUECOS));
    private ImageIcon brazil = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_BRAZIL));
    private ImageIcon camerun = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_CAMERUN));
    private ImageIcon serbia = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_SERBIA));
    private ImageIcon suiza = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_SUIZA));
    private ImageIcon ghana = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_GHANA));
    private ImageIcon korea = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_KOREA));
    private ImageIcon portugal = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_PORTUGAL));
    private ImageIcon uruguay = new ImageIcon(getClass().getResource(Utils.URL_FOLDER_URUGUAY));
	
    private Context(){
	}

    public static Context getInstance(){
		if(instance == null){
			instance = new Context();
		}
		return instance;
	}

    public Image getImageBackground() {
        return imageBackground.getImage();
    }

    public void setImageBackground(ImageIcon image) {
        this.imageBackground = image;
    }

    	
	public Image getEcuador() {
        return ecuador.getImage();
    }

    public Image getHolanda() {
        return holanda.getImage();
    }

    public Image getQatar() {
        return qatar.getImage();
    }

    public Image getSenegal() {
        return senegal.getImage();
    }

    public Image getGales() {
        return gales.getImage();
    }

    public Image getInglaterra() {
        return inglaterra.getImage();
    }

    public Image getIran() {
        return iran.getImage();
    }

    public Image getUsa() {
        return usa.getImage();
    }

    public Image getArabia_Saudi() {
        return arabia_Saudi.getImage();
    }

    public Image getArgentina() {
        return argentina.getImage();
    }

    public Image getMexico() {
        return mexico.getImage();
    }

    public Image getPolonia() {
        return polonia.getImage();
    }

    public Image getAustralia() {
        return australia.getImage();
    }

    public Image getDinamarca() {
        return dinamarca.getImage();
    }

    public Image getFrancia() {
        return francia.getImage();
    }

    public Image getTunez() {
        return tunez.getImage();
    }

    public Image getAlemania() {
        return alemania.getImage();
    }

    public Image getCosta_Rica() {
        return costa_Rica.getImage();
    }

    public Image getEspaña() {
        return españa.getImage();
    }

    public Image getJapon() {
        return japon.getImage();
    }

    public Image getBelgica() {
        return belgica.getImage();
    }

    public Image getCanada() {
        return canada.getImage();
    }

    public Image getCroacia() {
        return croacia.getImage();
    }

    public Image getMarruecos() {
        return marruecos.getImage();
    }

    public Image getBrazil() {
        return brazil.getImage();
    }

    public Image getCamerun() {
        return camerun.getImage();
    }

    public Image getSerbia() {
        return serbia.getImage();
    }

    public Image getSuiza() {
        return suiza.getImage();
    }

    public Image getGhana() {
        return ghana.getImage();
    }

    public Image getKorea() {
        return korea.getImage();
    }

    public Image getPortugal() {
        return portugal.getImage();
    }

    public Image getUruguay() {
        return uruguay.getImage();
    }
}
