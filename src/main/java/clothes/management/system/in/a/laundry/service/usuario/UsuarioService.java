package clothes.management.system.in.a.laundry.service.usuario;

import clothes.management.system.in.a.laundry.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> todosLosUsuario();
    Optional<Usuario> buscarUsuarioPorId(Long id);
    Usuario guardarUsuario(Usuario usuario);
    Boolean borrarUsuario(Long id);
}
