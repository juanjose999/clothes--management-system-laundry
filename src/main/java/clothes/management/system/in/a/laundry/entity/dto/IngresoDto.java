package clothes.management.system.in.a.laundry.entity.dto;

import clothes.management.system.in.a.laundry.entity.Ingreso;
import clothes.management.system.in.a.laundry.entity.Prenda;
import clothes.management.system.in.a.laundry.entity.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IngresoDto {
    Usuario usuario;
    Ingreso ingreso;
}
