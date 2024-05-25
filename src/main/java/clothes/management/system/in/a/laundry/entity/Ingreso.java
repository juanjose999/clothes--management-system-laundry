package clothes.management.system.in.a.laundry.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Un Ingreso que contenga el usuario, la lista de prendas y el estado del pedido.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ingreso;
    private String fecha_ingreso;
    @OneToOne
    private Usuario usuario;
    @OneToMany(mappedBy = "ingreso", cascade = CascadeType.ALL)
    private List<Prenda> prendaList;

}
