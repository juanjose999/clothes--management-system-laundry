package clothes.management.system.in.a.laundry.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Una Prenda con tipo de prenda y precio por prenda.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prenda;
    private String tipo_prenda;
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "ingreso_id")
    @JsonIgnore
    private Ingreso ingreso;
}
