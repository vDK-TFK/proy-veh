package com.avance2.Service;

import com.avance2.Domain.domain;
import java.util.List;

public interface EstadoService {

    public List<domain> getEstados(); //obtener todos los clientes

    public domain getEstado(domain estado); //un cliente en especifico

    public void save(domain estado); //insertar nuevo registro o modificar (si viene el id cliente o no)

    public void delete(domain estado); //eliminars
}