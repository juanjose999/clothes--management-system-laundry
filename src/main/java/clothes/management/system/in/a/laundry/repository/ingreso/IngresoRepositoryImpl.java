package clothes.management.system.in.a.laundry.repository.ingreso;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class IngresoRepositoryImpl implements IngresoRepository {

    private final IngresoRepositoryJpa ingresoRepositoryJpa;

    @Override
    public List<Ingreso> todosLosIngresos() {
        return ingresoRepositoryJpa.findAll();
    }

    @Override
    public Optional<Ingreso> buscarIngreso(Long id) {
        return ingresoRepositoryJpa.findById(id);
    }

    @Override
    public Ingreso guardarIngreso(Ingreso ingreso) {
        return ingresoRepositoryJpa.save(ingreso);
    }

    @Override
    public Boolean borrarIngreso(Long id) {
        Optional<Ingreso> buscar = Optional.ofNullable(ingresoRepositoryJpa.findById(id).orElseThrow(() -> new RuntimeException("no se encontro el id")));
        if(buscar.isPresent()){
            ingresoRepositoryJpa.deleteById(id);
            return true;
        }else return false;
    }
}
