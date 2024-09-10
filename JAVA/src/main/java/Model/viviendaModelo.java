package Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class viviendaModelo {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)

    private int idVivienda;

    private String tipoVivienda;

    private String direccion;

    private int IdLocalidad;
}
