package clothes.management.system.in.a.laundry.controller;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import clothes.management.system.in.a.laundry.entity.dto.IngresoDto;
import clothes.management.system.in.a.laundry.service.ingreso.IngresoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/ingreso")
public class IngresoController {

    private final IngresoService ingresoService;
    @GetMapping
    private ResponseEntity<List<Ingreso>> todosLosIngreso(){
        return ResponseEntity.ok(ingresoService.todosLosIngresos().stream().toList());
    }
    @PostMapping
    public ResponseEntity<Ingreso> guardarIngreso(@RequestBody IngresoDto ingresoDto){
        return ResponseEntity.ok(ingresoService.guardarIngreso(ingresoDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> eliminarIngreso(@PathVariable Long id){
        boolean eliminar = ingresoService.borrarIngreso(id);
        if(eliminar){
            return ResponseEntity.noContent().build();
        }else return ResponseEntity.notFound().build();
    }
}
