package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ifbademo.model.Usuario;
import com.example.ifbademo.repository.IUsuarioRepository;



@Service
@Transactional(readOnly = false)
public class UsuarioService {
    @Autowired
    private IUsuarioRepository repository;

    public void salvar(Usuario usuario){
        repository.save(usuario);
    }

    public void editar(Usuario usuario){
        repository.save(usuario);        
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