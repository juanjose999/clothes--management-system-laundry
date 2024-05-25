package clothes.management.system.in.a.laundry.repository.prenda;

import clothes.management.system.in.a.laundry.entity.Prenda;

import java.util.List;
import java.util.Optional;

public interface PrendaRepository {
    List<Prenda> todasLasPrendas();
    Optional<Prenda> buscarPrendaPorId(Long id);
    Prenda guardarPrenda(Prenda prenda);
    Boolean borrarPrenda(Long id);
}
