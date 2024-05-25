package clothes.management.system.in.a.laundry.service.prenda;

import clothes.management.system.in.a.laundry.entity.Prenda;

import java.util.List;
import java.util.Optional;

public interface PrendaService {
    List<Prenda> todasLasPrendas();
    Optional<Prenda> buscarPrendaPorId(Long id);
    Prenda guardarPrenda(Prenda prenda);
    Boolean borrarPrenda(Long id);
}
