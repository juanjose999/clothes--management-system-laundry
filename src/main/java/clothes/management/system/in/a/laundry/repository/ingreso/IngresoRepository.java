package clothes.management.system.in.a.laundry.repository.ingreso;

import clothes.management.system.in.a.laundry.entity.Ingreso;

import java.util.List;
import java.util.Optional;

public interface IngresoRepository {
    List<Ingreso> todosLosIngresos();
    Optional<Ingreso> buscarIngreso(Long id);
    Ingreso guardarIngreso(Ingreso ingreso);
    Boolean borrarIngreso(Long id);

}
