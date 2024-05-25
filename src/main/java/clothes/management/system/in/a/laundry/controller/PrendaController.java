package clothes.management.system.in.a.laundry.controller;

import clothes.management.system.in.a.laundry.entity.Prenda;
import clothes.management.system.in.a.laundry.service.prenda.PrendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/prenda")
public class PrendaController {
    private final PrendaService prendaService;
    @GetMapping
    public ResponseEntity<List<Prenda>> todasLasPrendas(){
        return ResponseEntity.ok(prendaService.todasLasPrendas().stream().toList());
    }
    @PostMapping
    public ResponseEntity<Prenda> guardarPrenda(@RequestBody Prenda prenda){
        return ResponseEntity.ok(prendaService.guardarPrenda(prenda));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminarPrenda(@PathVariable Long id){
        boolean eliminar = prendaService.borrarPrenda(id);
        if(eliminar){
            return ResponseEntity.noContent().build();
        }else return ResponseEntity.notFound().build();
    }
}
