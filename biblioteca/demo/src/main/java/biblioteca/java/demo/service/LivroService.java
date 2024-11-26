package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ifbademo.model.Livro;
import com.example.ifbademo.repository.ILivroRepository;



@Service
@Transactional(readOnly = false)
public class LivroService {
    @Autowired
    private ILivroRepository repository;

    public void salvar(Livro livro){
        repository.save(livro);
    }

    public void editar(Livro livro){
        repository.save(livro);        
    }

    public void excluir(Long id){
        
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Livro buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Livro> buscarTodas(){
        return repository.findAll();
    }
    
}