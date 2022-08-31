package Beans;

import java.util.Date;

public class Alquiler {
    
    private int idAlquiler;
    private int idPowerBank;
    private String username;
    private  Date fechaAlquiler;

    public Alquiler(int idAlquiler, int idPowerBank, String username, Date fechaAlquiler) {
        this.idAlquiler = idAlquiler;
        this.idPowerBank = idPowerBank;
        this.username = username;
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public int getIdPowerBank() {
        return idPowerBank;
    }

    public void setIdPowerBank(int idPowerBank) {
        this.idPowerBank = idPowerBank;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "idAlquiler=" + idAlquiler + ", idPowerBank=" + idPowerBank + ", username=" + username + ", fechaAlquiler=" + fechaAlquiler + '}';
    }
    
}
