package biblioteca.java.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import biblioteca.java.demo.model.Emprestimo;
import biblioteca.java.demo.model.Funcionario;
import biblioteca.java.demo.model.Livro;
import biblioteca.java.demo.model.UsuarioComum;
import biblioteca.java.demo.model.Usuario;
import biblioteca.java.demo.service.Emprestimo;
import biblioteca.java.demo.service.Funcionario;
import biblioteca.java.demo.service.Livro;
import biblioteca.java.demo.service.UsuarioComum;
import biblioteca.java.demo.service.Usuario;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Bean
	public CommandLineRunner demo (EmprestimoService emp, FuncionarioService fun, LivroService liv, UsuarioComumService usc, UsuarioService usu){
		return(args) ->{

			Emprestimo e = new Emprestimo();
			e.seteDataEmprestimo("12/08/2022");
			e.seteDataDevolucao("12/08/2022");

			
			emp.salvar(e);

		

			Funcionario f = new Funcionario();
			f.setDataAdmissao("10/02/2023");
			f.setFormacaoAcademica("Superior");
			f.setCargo("Assistente");

			fun.salvar(f);


			Livro l = new Livro();
			l.setAutor("J. K. Rowling");
			l.setIsbn("154984157");
			l.setDataPublicacao("14/03/2011");
			l.setTitulo("Harry Potter");

			liv.salvar(l);

			

			UsuarioComum us = new UsuarioComum();
			u.setCampusEnsino("Brumado");
			u.setMatricula("202115210018");
		
			usc.salvar(us);
			

			Usuario u = new Usuario();
			us.setNome("Denilson Costa");
			us.setCpf("444.555.666-77");
			us.setSenha("321123d");
			us.setTelefone("(77) 95555-1073");
			us.setEmail("denilson.dev@artia.com.br");
			us.dataNasc("24/04/2006");

			usu.salvar(u);
			
			
		};
	}

