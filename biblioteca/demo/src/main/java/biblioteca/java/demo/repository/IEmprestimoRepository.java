package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Emprestimo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmprestimoRepository extends JpaRepository<Emprestimo, Long>{
  //  private List<Emprestimo> findByBetweendataEmprestimo(); 
}