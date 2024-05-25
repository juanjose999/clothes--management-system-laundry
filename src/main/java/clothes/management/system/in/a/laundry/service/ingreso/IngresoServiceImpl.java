package clothes.management.system.in.a.laundry.service.ingreso;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import clothes.management.system.in.a.laundry.repository.ingreso.IngresoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IngresoServiceImpl implements IngresoService{
    private final IngresoRepository ingresoRepository;

    @Override
    public List<Ingreso> todosLosIngresos() {
        return ingresoRepository.todosLosIngresos();
    }

    @Override
    public Optional<Ingreso> buscarIngreso(Long id) {
        return ingresoRepository.buscarIngreso(id);
    }

    @Override
    public Ingreso guardarIngreso(Ingreso ingreso) {
        return ingresoRepository.guardarIngreso(ingreso);
    }

    @Override
    public Boolean borrarIngreso(Long id) {
        return ingresoRepository.borrarIngreso(id);
    }
}
