package biblioteca.java.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import biblioteca.java.demo.model.Emprestimo;
import biblioteca.java.demo.model.Funcionario;
import biblioteca.java.demo.model.Livro;
import biblioteca.java.demo.model.UsuarioComum;
import biblioteca.java.demo.service.EmprestimoService;
import biblioteca.java.demo.service.FuncionarioService;
import biblioteca.java.demo.service.LivroService;
import biblioteca.java.demo.service.UsuarioComumService;
import biblioteca.java.demo.service.UsuarioService;
import biblioteca.java.demo.model.Usuario;


@SpringBootApplication
public class DemoApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}


    @Bean
    CommandLineRunner demo(EmprestimoService emp, FuncionarioService fun, LivroService liv, UsuarioComumService usc, UsuarioService usu)
	{
		return(args) ->{

			Emprestimo e = new Emprestimo();
			e.setDataEmprestimo("12/08/2022");
			e.setDataDevolucao("12/08/2022");

			
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

			

			

			UsuarioComum uc = new UsuarioComum();
			uc.setCampusEnsino("Brumado");
			uc.setMatricula("202115210018");
		
			usc.salvar(uc);

			Usuario us = new Usuario();
			us.setNome("Denilson Costa");
			us.setCpf("444.555.666-77");
			us.setSenha("321123d");
			us.setTelefone("(77) 95555-1073");
			us.setEmail("denilson.dev@artia.com.br");
			us.setDataNasc("24/04/2006");

			usu.salvar(us);
			
			
		};
	}

}