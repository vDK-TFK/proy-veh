package com.avance2.Domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "estado")
public class domain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais; //Hibernate lo transforma en id_cliente = idCliente
    String nombrePais;
    String capital;
    int poblacion;
    String moneda;

    public domain() {
    }

    public domain(Long idPais, String nombrePais, String capital, int poblacion, String moneda) {
        this.idPais = idPais; //id_pais
        this.nombrePais = nombrePais;
        this.capital = capital;
        this.poblacion = poblacion;
        this.moneda = moneda;
    } 
}