package clothes.management.system.in.a.laundry.service.ingreso;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import clothes.management.system.in.a.laundry.entity.dto.IngresoDto;

import java.util.List;
import java.util.Optional;

public interface IngresoService {
    List<Ingreso> todosLosIngresos();
    Optional<Ingreso> buscarIngreso(Long id);
    Ingreso guardarIngreso(IngresoDto ingresoDto);
    Boolean borrarIngreso(Long id);
}
