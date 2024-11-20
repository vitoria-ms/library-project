package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.IBibliotecaRepository;


public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long>{

}