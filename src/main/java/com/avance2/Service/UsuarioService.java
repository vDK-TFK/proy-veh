package com.avance2.Service;

import com.avance2.Domain.domain;
import java.util.List;

public interface UsuarioService {

    public List<domain> getUsuario(); //obtener todos los clientes

    public domain getUsuario(domain usuario); //un cliente en especifico

    public void save(domain usuario); //insertar nuevo registro o modificar (si viene el id cliente o no)

    public void delete(domain usuario); //eliminars
}