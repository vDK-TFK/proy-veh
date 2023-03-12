package com.avance2.Service;

import com.avance2.dao.UsuarioDao;
import com.avance2.Domain.domain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceimpl implements UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<domain> getUsuario() {
         return (List<domain>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public domain getUsuario(domain usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(domain usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(domain usuario) {
        usuarioDao.deleteById(usuario.getIdUsuario());
    }
}