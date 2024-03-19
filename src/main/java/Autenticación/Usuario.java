package Autenticación;

public class Usuario {
    private String nombre;
    private String contraseña;


    public Usuario(String nombre, String contraseña, String correo) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public boolean autenticar(String contraseña){
        return this.contraseña.equals(contraseña);
    }

    public String getUsuario(){
        return nombre;
    }
}
