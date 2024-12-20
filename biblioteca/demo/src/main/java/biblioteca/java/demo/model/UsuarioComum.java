
package biblioteca.java.demo.model;
import jakarta.persistence.Entity;


@Entity

public class UsuarioComum extends Usuario {
    
    private String campusEnsino;
    private String matricula;
    private String status;

    //get e set
    public String getCampusEnsino() {
        return campusEnsino;
    }
    public void setCampusEnsino(String campusEnsino) {
        this.campusEnsino = campusEnsino;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}