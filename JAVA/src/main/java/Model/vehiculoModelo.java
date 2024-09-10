package Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class vehiculoModelo {
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)

    private Long id;

    private int  idConductor;

    private String placaVehiculo;

    private String modelo;

    private int cargaMaxima;
}
