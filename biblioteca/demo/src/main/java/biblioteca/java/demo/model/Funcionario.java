package biblioteca.java.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity


    public class Funcionario extends Usuario {
      
        private String dataAdmissao;
        private String formacaoAcademica;
        private boolean dadosBancarios;
        private String cargo;

        @OneToMany
        @JoinColumn (name= "id_funcionario_fk")
        private List<Usuario> usuario;

    //Getter e setter
    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }
    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }
    public boolean isDadosBancarios() {
        return dadosBancarios;
    }
    public void setDadosBancarios(boolean dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}