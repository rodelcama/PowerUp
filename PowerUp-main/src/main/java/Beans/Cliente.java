package Beans;

import java.util.Date;

public class Cliente {
    
    private String identificacion;
    private String password;
    private String nombres;
    private String apellidos;
    private String email;
    private boolean nuevo;
    private int numeroTC;
    

    public Cliente(String identificacion, String password, String nombres, String apellidos, String email, boolean nuevo, int numeroTC) {
        this.identificacion = identificacion;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.nuevo = nuevo;
        this.numeroTC = numeroTC;
        
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public int getNumeroTC() {
        return numeroTC;
    }

    public void setNumeroTC(int numeroTC) {
        this.numeroTC = numeroTC;
    }

    

    @Override
    public String toString() {
        return "Cliente{" + "identificacion=" + identificacion + ", password=" + password + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", nuevo=" + nuevo + ", numeroTC=" + numeroTC + '}';
    }
    
}
