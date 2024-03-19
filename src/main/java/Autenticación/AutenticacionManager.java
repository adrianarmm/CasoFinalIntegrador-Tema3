package Autenticación;

import java.util.ArrayList;
import java.util.List;

public class AutenticacionManager {
    private List<Usuario> usuarios;

    public AutenticacionManager() {
        this.usuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Usuario autenticar(String usuario, String contraseña){
        for (Usuario u : usuarios){
            if (u.getUsuario().equals(usuario) && u.autenticar(contraseña)){
                return u;
            }
        }
        return null;
    }
}
