package com.avance2.Service;

import com.avance2.Domain.domain;
import com.avance2.dao.estadoDao;
import com.avance2.Domain.domain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceimpl implements EstadoService {

    @Autowired
    estadoDao estadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<domain> getEstados() {
        return (List<domain>) estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public domain getEstado(domain estado) {
        return estadoDao.findById(estado.getIdPais()).orElse(null);
    }

    @Override
    @Transactional
    public void save(domain estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(domain estado) {
        estadoDao.deleteById(estado.getIdPais());
    }
}