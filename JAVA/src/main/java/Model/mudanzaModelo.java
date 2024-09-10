package Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class mudanzaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidadObjetos;

    private Date fecha;

    private int estadoMudanza;

    private Long viviendaOrigen;

    private Long ViviendaDestino;

    private Double precioBase;

}
