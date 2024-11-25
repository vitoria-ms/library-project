package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.Funcionario;


public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long>{

}