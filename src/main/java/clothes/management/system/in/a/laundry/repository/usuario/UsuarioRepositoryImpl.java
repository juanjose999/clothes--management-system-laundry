package clothes.management.system.in.a.laundry.repository.usuario;

import clothes.management.system.in.a.laundry.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryImpl implements UsuarioRepository {

    private final  UsuarioRepositoryJpa usuarioRepositoryJpa;

    @Override
    public List<Usuario> todosLosUsuario() {
        return usuarioRepositoryJpa.findAll();
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioRepositoryJpa.findById(id);
    }

    @Override
    public Usuario guardarPrenda(Usuario usuario) {
        return usuarioRepositoryJpa.save(usuario);
    }

    @Override
    public Boolean borrarPrenda(Long id) {
        Optional<Usuario> buscarUsuario = buscarUsuarioPorId(id);
        if(buscarUsuario.isPresent()){
            usuarioRepositoryJpa.delete(buscarUsuario.get());
            return true;
        }else return false;
    }
}
