package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ifbademo.model.UsuarioComum;
import com.example.ifbademo.repository.IUsuarioComumRepository;



@Service
@Transactional(readOnly = false)
public class UsuarioComumService {
    @Autowired
    private IUsuarioRepository repository;

    public void salvar(UsuarioComum usuariocomum){
        repository.save(usuariocomum);
    }

    public void editar(UsuarioComum usuariocomum){
        repository.save(usuariocomum);        
    }

    public void excluir(Long id){
        
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Usuario> buscarTodas(){
        return repository.findAll();
    }
    
}