package Beans;

import java.util.Date;

public class Alquiler {
    
    private int idAlquiler;
    private int idPowerBank;
    private String identificacion;
    private  Date tiempoAlquiler;

    public Alquiler(int idAlquiler, int idPowerBank, String identificacion, Date tiempoAlquiler) {
        this.idAlquiler = idAlquiler;
        this.idPowerBank = idPowerBank;
        this.identificacion = identificacion;
        this.tiempoAlquiler = tiempoAlquiler;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getTiempoAlquiler() {
        return tiempoAlquiler;
    }

    public void setTiempoAlquiler(Date tiempoAlquiler) {
        this.tiempoAlquiler = tiempoAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "idAlquiler=" + idAlquiler + ", idPowerBank=" + idPowerBank + ", identificacion=" + identificacion + ", tiempoAlquiler=" + tiempoAlquiler + '}';
    }
    
}
