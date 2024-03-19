package GestióndeUsuariosySimulaciones;

import java.util.ArrayList;
import java.util.List;



public class AutenticacionManager {
    // Suponiendo que tienes una lista de usuarios...
    private List<Usuario> usuarios;

    public AutenticacionManager() {
        this.usuarios = new ArrayList<>();
    }

    public Usuario autenticar(String usuario, String contraseña) {
        for (Usuario u : usuarios) {
            // Asegúrate de que u y u.getUsuario() no sean null antes de invocar equals
            if (u != null && u.Usuario() != null && u.Usuario().equals(usuario) && u.autenticar(contraseña)) {
                return u;
            }
        }
        return null;
    }
}
