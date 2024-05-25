package clothes.management.system.in.a.laundry.repository.ingreso;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IngresoRepositoryJpa extends JpaRepository<Ingreso, Long> {
}
