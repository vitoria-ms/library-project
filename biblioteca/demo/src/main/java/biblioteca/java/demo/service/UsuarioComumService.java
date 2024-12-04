package biblioteca.java.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import biblioteca.java.demo.model.Usuario;
import biblioteca.java.demo.model.UsuarioComum;
import biblioteca.java.demo.repository.IUsuarioRepository;



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