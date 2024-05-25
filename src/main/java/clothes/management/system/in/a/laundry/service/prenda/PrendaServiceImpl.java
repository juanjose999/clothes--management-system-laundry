package clothes.management.system.in.a.laundry.service.prenda;

import clothes.management.system.in.a.laundry.entity.Prenda;
import clothes.management.system.in.a.laundry.repository.prenda.PrendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PrendaServiceImpl implements PrendaService{
    private final PrendaRepository prendaRepository;

    @Override
    public List<Prenda> todasLasPrendas() {
        return prendaRepository.todasLasPrendas();
    }

    @Override
    public Optional<Prenda> buscarPrendaPorId(Long id) {
        return prendaRepository.buscarPrendaPorId(id);
    }

    @Override
    public Prenda guardarPrenda(Prenda prenda) {
        return prendaRepository.guardarPrenda(prenda);
    }

    @Override
    public Boolean borrarPrenda(Long id) {
        return prendaRepository.borrarPrenda(id);
    }
}
