package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.UsuarioComum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioComumRepository extends JpaRepository<UsuarioComum, Long>{

}