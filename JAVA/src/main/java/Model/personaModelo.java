package Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class personaModelo {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String segundonombre;

    private String apellido;

    private String segundoapellido;

    private String email;

    private Long telefono;

}
