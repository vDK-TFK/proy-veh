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
@Table(name = "usuario")
public class domain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario; 
    String nombre;
    String primApellido;
    String usuario;
    String password;

    public domain() {
    }

    public domain(Long idUsuario, String nombre, String primApellido, String usuario, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.primApellido = primApellido;
        this.usuario = usuario;
        this.password = password;
    }
}