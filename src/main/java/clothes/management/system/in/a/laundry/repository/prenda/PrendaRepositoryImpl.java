package clothes.management.system.in.a.laundry.repository.prenda;

import clothes.management.system.in.a.laundry.entity.Prenda;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class PrendaRepositoryImpl implements PrendaRepository {

    private final PrendaRepositoryJpa prendaRepositoryJpa;
    @Override
    public List<Prenda> todasLasPrendas() {
        return prendaRepositoryJpa.findAll();
    }

    @Override
    public Optional<Prenda> buscarPrendaPorId(Long id) {
        return prendaRepositoryJpa.findById(id);
    }

    @Override
    public Prenda guardarPrenda(Prenda prenda) {
        return  prendaRepositoryJpa.save(prenda);
    }

    @Override
    public Boolean borrarPrenda(Long id) {
        Optional<Prenda> buscarPrenda = buscarPrendaPorId(id);
        if(buscarPrenda.isPresent()){
            prendaRepositoryJpa.delete(buscarPrenda.get());
            return true;
        }else return false;
    }
}
