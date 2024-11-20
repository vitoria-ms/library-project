package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.IBibliotecaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

}