package clothes.management.system.in.a.laundry.repository.usuario;

import clothes.management.system.in.a.laundry.entity.Prenda;
import clothes.management.system.in.a.laundry.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    List<Usuario> todosLosUsuario();
    Optional<Usuario> buscarUsuarioPorId(Long id);
    Usuario guardarPrenda(Usuario usuario);
    Boolean borrarPrenda(Long id);
}
