package Beans;

public class Cliente {
    
    private String username;
    private String password;
    private String nombres;
    private String apellidos;
    private String email;
    private boolean activo;

    public Cliente(String username, String password, String nombres, String apellidos, String email, boolean activo) {
        this.username = username;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.activo = activo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "username=" + username + ", password=" + password + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", activo=" + activo + '}';
    }
    
    
    
    
}
