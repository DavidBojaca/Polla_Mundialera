package utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class UtilsArchivos {
    // private static Scanner reader;
    private static UtilsArchivos instance;
	
    private UtilsArchivos(){
	}
	
	public static UtilsArchivos getInstance(){
		if(instance==null){
			instance=new UtilsArchivos();
		}
		return instance;
	}

    public void copia (String ficheroOriginal){
		// ficheroOriginal = Utils.URL_FOLDER + ficheroOriginal;
		try{
            // Se abre el fichero original para lectura
			FileInputStream fileInput = new FileInputStream(ficheroOriginal);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
		
			// Bucle para leer de un fichero y escribir en el otro.
			byte [] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0){
				leidos=bufferedInput.read(array);
			}

			// Cierre de los ficheros
			bufferedInput.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}


}
