package clothes.management.system.in.a.laundry.service.ingreso;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import clothes.management.system.in.a.laundry.entity.dto.IngresoDto;
import clothes.management.system.in.a.laundry.entity.Prenda;
import clothes.management.system.in.a.laundry.entity.Usuario;
import clothes.management.system.in.a.laundry.repository.ingreso.IngresoRepository;
import clothes.management.system.in.a.laundry.repository.prenda.PrendaRepository;
import clothes.management.system.in.a.laundry.repository.prenda.PrendaRepositoryJpa;
import clothes.management.system.in.a.laundry.service.prenda.PrendaService;
import clothes.management.system.in.a.laundry.service.usuario.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IngresoServiceImpl implements IngresoService{
    private final IngresoRepository ingresoRepository;
    private final PrendaService prendaService;
    private final PrendaRepositoryJpa prendaRepository;
    private final UsuarioService usuarioService;

    @Override
    public List<Ingreso> todosLosIngresos() {
        return ingresoRepository.todosLosIngresos();
    }

    @Override
    public Optional<Ingreso> buscarIngreso(Long id) {
        return ingresoRepository.buscarIngreso(id);
    }

    @Override
    public Ingreso guardarIngreso(IngresoDto ingresoDto) {
        Usuario usuario = ingresoDto.getUsuario();
        usuarioService.guardarUsuario(usuario);

        Ingreso ingreso = ingresoDto.getIngreso();
        ingreso.setUsuario(usuario);

        Ingreso savedIngreso = ingresoRepository.guardarIngreso(ingreso);

        List<Prenda> prendaList = ingresoDto.getIngreso().getPrendaList();
        for(Prenda p : prendaList){
            p.setIngreso(savedIngreso);
            prendaService.guardarPrenda(p);
        }
        savedIngreso.setPrendaList(prendaList);

        return ingresoRepository.guardarIngreso(savedIngreso);
    }

    @Override
    public Boolean borrarIngreso(Long id) {
        return ingresoRepository.borrarIngreso(id);
    }
}
