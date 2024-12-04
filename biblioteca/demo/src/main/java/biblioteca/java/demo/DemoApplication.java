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

			/*e.setCpf("999.999.999-99");
			e.setDataCadastro(LocalDate.now());
			e.setDataNasc(LocalDate.of(2006, 9, 19));
			e.setTelefone("(77) 99999-9999");
			e.setSenha("askdasda");
			*/
			emp.salvar(e);

			//System.out.println(e.buscarTodos());
		

			Funcionario f = new Funcionario();
			f.setDataAdmissao("eduardo@gmail.com");
			f.setFormacaoAcademica(new BigDecimal("1200.00"));
			f.setCargo("Cabeleleiro");

			fun.salvar(f);

			//System.out.println(func.buscarTodos());

			Livro l = new Livro();
			l.setAutor("corte + barba");
			l.setIsbn("dsadasdasdasdadsasda");
			l.setDataPublicacao(new BigDecimal("40.00"));
			l.setTitulo(new BigDecimal("40.00"));
			l.setDisponibilidade(new BigDecimal("40.00"));

			liv.salvar(l);

			//System.out.println(liv.buscarTodos());

		;

			List<Servico> listaServicos = new ArrayList<>();
			listaServicos.add(s);
			listaServicos.add(s1);

			UsuarioComum us = new UsuarioComum();
			u.setCampusEnsino(c);
			u.setMatricula();
		
			usc.salvar(us);
			//System.out.println(agend.buscarTodas());

			Usuario u = new Usuario();
			us.setNome("Denilson Costa");
			us.setCpf("444.555.666-77");
			us.setSenha("321123d");
			us.setTelefone("(77) 95555-1073");
			us.setEmail("denilson.dev@artia.com.br");
			us.dataNasc("24/04/2006");
			usu.salvar(u);
			//System.out.println(serv.buscarTodos())
			
		};
	}

