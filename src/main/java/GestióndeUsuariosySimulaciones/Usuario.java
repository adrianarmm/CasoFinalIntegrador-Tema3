package GestióndeUsuariosySimulaciones;

public class Usuario {
    private String usuario;
    private String contraseña;


    public Usuario(String usuario, String contraseña) {
        this.usuario = Usuario();
        this.contraseña = contraseña;
    }

    public boolean autenticar(String contraseña){

        return this.contraseña.equals(contraseña);
    }

    public String Usuario(){
        return usuario;
    }

    public String getContraseña(){
        return contraseña;
    }

    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
}
