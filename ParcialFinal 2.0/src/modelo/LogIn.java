package modelo;

import java.util.HashMap;
import java.util.Map; 
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class LogIn {
    public HashMap<String,String> usuarios = new HashMap<>();

    public void crearUsuario(){
        String nombre;
        String clave;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario: ");
        clave = JOptionPane.showInputDialog("Ingrese su clave: ");

        if(nombre!=null && clave!=null){
            usuarios.put(nombre, clave);
            JOptionPane.showMessageDialog(null, "Se ha creado el usuario exitosamente");
        }
    }

    public boolean ingresar(){
        String nombre;
        String clave;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario: ");
        clave = JOptionPane.showInputDialog("Ingrese su clave: ");

        if(usuarios.containsKey(nombre)&& usuarios.containsValue(clave)){
            JOptionPane.showMessageDialog(null,"Ha ingresado correctamente");
            return true;
            
        } else {
            JOptionPane.showMessageDialog(null, "La información ingresada es incorrecta");
            return false;
        }
        
    }
}
