package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

}