package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Emprestimo;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.Emprestimo;


public interface IEmprestimoRepository extends JpaRepository<Emprestimo, Long>{
    
}