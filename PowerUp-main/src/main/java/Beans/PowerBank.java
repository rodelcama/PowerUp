package Beans;

public class PowerBank {
    
    private int idPowerBank;
    private String capacidad;
    private String marca;
    private boolean cargado;

    public PowerBank(int idPowerBank, String capacidad, String marca, boolean cargado) {
        this.idPowerBank = idPowerBank;
        this.capacidad = capacidad;
        this.marca = marca;
        this.cargado = cargado;
    }

    public int getIdPowerBank() {
        return idPowerBank;
    }

    public void setIdPowerBank(int idPowerBank) {
        this.idPowerBank = idPowerBank;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCargado() {
        return cargado;
    }

    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }

    @Override
    public String toString() {
        return "PowerBank{" + "idPowerBank=" + idPowerBank + ", capacidad=" + capacidad + ", marca=" + marca + ", cargado=" + cargado + '}';
    }
    
    
    
}
