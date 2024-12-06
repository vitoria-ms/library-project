

package biblioteca.java.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import biblioteca.java.demo.model.Emprestimo;
import biblioteca.java.demo.repository.IEmprestimoRepository;



@Service
@Transactional(readOnly = false)
public class EmprestimoService {
    @Autowired
    private IEmprestimoRepository repository;

    public void salvar(Emprestimo emprestimo){
        repository.save(emprestimo);
    }

    public void editar(Emprestimo emprestimo){
        repository.save(emprestimo);        
    }

    public void excluir(Long id){
        
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Emprestimo buscarPorId(Long id){
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Emprestimo> buscarTodas(){
        return repository.findAll();
    }
    
}