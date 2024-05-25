package clothes.management.system.in.a.laundry.repository;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrendaRepositoryJpa extends JpaRepository<Ingreso, Long> {
}
