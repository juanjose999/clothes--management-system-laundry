package clothes.management.system.in.a.laundry.repository.prenda;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import clothes.management.system.in.a.laundry.entity.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrendaRepositoryJpa extends JpaRepository<Prenda, Long> {
}
