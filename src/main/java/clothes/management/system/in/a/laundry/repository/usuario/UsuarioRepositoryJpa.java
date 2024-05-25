package clothes.management.system.in.a.laundry.repository.usuario;

import clothes.management.system.in.a.laundry.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoryJpa extends JpaRepository<Usuario, Long> {
}
