package clothes.management.system.in.a.laundry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

//Un Usuario con nombre y datos de contacto.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String full_name_usuario;
    private String telefono;
    private LocalDate fecha_registro;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Ingreso> ingreso;
}
