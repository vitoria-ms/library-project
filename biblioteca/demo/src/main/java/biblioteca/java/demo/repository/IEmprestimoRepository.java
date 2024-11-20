package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.IBibliotecaRepository;


public interface IEmprestimoRepository extends JpaRepository<Emprestimo, Long>{
    
}