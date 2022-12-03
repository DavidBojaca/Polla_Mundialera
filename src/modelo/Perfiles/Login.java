package modelo.Perfiles;

import modelo.Operations;
import modelo.Polla;

public class Login {
    private String user;
    private String pasword;
    private Polla mipolla;
    private Operations ope;
    

    /**
     * @param user
     * @param pasword
     */
    public Login(String user, String pasword) {
        this.user = user;
        this.pasword = pasword;
        mipolla= new Polla();
    }


    /**
     * @return the ope
     */
    public Operations getOpe() {
        return ope;
    }

    /**
     * @param ope the ope to set
     */
    public void setOpe(Operations ope) {
        this.ope = ope;
    }
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    /**
     * @return the pasword
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    /**
     * @return the mipolla
     */
    public Polla getMipolla() {
        return mipolla;
    }
    /**
     * @param mipolla the mipolla to set
     */
    public void setMipolla(Polla mipolla) {
        this.mipolla = mipolla;
    }
    

}
