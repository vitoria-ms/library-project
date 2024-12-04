package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long>{

}