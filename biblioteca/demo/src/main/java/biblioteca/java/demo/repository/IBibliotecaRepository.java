package biblioteca.java.demo.repository;
import biblioteca.java.demo.model.Biblioteca;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.IBibliotecaRepository;


public interface IBibliotecaRepository extends JpaRepository<Biblioteca, Long>{
    
}
