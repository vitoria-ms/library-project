package com.example.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ifbademo.model.Funcionario;
import com.example.ifbademo.repository.IFuncionarioRepository;



@Service
@Transactional(readOnly = false)
public class FuncionarioService {
    @Autowired
    private IFuncionarioRepository repository;

    public void salvar(Funcionario funcionario){
        repository.save(funcionario);
    }

    public void editar(Funcionario funcionario){
        repository.save(funcionario);        
    }

    public void excluir(Long id){
        
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodas(){
        return repository.findAll();
    }
    
}