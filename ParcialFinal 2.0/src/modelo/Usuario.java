package modelo;

public class Usuario {
    public String nombre; 
    public String clave; 

    public Usuario(String nombre, String clave){
        this.nombre = nombre; 
        this.clave = clave;
    }

    /**
     * Devuelve el nombre de un usuario 
     * @return
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * Modifica el nombre de un usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    /**
     * Devuelve la clave de un usuario 
     * @return 
     */
    public String getClave() {
        return clave;
    }
 
    /**
     * Modifica la clave de un usuario
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
