package clothes.management.system.in.a.laundry.controller;

import clothes.management.system.in.a.laundry.entity.Usuario;
import clothes.management.system.in.a.laundry.service.usuario.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<Usuario>> todosLosUsuario(){
        return ResponseEntity.ok(usuarioService.todosLosUsuario().stream().toList());
    }
    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.guardarUsuario(usuario));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> borrarUsuario(@PathVariable Long id){
        boolean eliminar = usuarioService.borrarUsuario(id);
        if(eliminar){
            return ResponseEntity.noContent().build();
        }else return ResponseEntity.notFound().build();
    }
}
