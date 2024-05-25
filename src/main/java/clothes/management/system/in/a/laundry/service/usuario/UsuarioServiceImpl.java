package clothes.management.system.in.a.laundry.service.usuario;

import clothes.management.system.in.a.laundry.entity.Usuario;
import clothes.management.system.in.a.laundry.repository.usuario.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> todosLosUsuario() {
        return usuarioRepository.todosLosUsuario();
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioRepository.buscarUsuarioPorId(id);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.guardarPrenda(usuario);
    }

    @Override
    public Boolean borrarUsuario(Long id) {
        return usuarioRepository.borrarPrenda(id);
    }
}
