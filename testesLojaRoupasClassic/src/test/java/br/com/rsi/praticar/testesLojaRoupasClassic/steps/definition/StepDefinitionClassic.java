package br.com.rsi.praticar.testesLojaRoupasClassic.steps.definition;

import java.util.UUID;

import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import br.com.rsi.praticar.testesLojaRoupasClassic.steps.business.StepBusinessClassic;
import net.thucydides.core.annotations.Steps;

@ContextConfiguration("/appcontext.xml")
public class StepDefinitionClassic {

	@Steps
	StepBusinessClassic stepB;
	
	@Given("^estou na pagina inicial do site \"([^\"]*)\"$")
	public void estou_na_pagina_inicial_do_site(String url) throws Throwable {
	    stepB.openHome(url);
	}
	
	@When("^clico no link 'Entrar'$")
	public void clico_no_link_Entrar() throws Throwable {
		stepB.clicarLinkEntrar();
	}

	@When("^clico no link 'Nao_tem_uma_conta\\?_Crie_uma_aqui'$")
	public void clico_no_link_Nao_tem_uma_conta__Crie_uma_aqui() throws Throwable {
		stepB.clicarLinkCriarConta();
	}

	@When("^seleciono o 'Titulo_Social' \"([^\"]*)\"$")
	public void seleciono_o_Titulo_Social(String tSocial) throws Throwable {
		stepB.selecionarTituloSocial(tSocial);
	}

	@When("^insiro no campo 'Nome' \"([^\"]*)\"$")
	public void insiro_no_campo_Nome(String nome) throws Throwable {
		stepB.inserirNome(nome);
	}

	@When("^insiro no campo 'Sobrenome' \"([^\"]*)\"$")
	public void insiro_no_campo_Sobrenome(String sobrenome) throws Throwable {
		stepB.inserirSobrenome(sobrenome);
	}

	@When("^insiro no campo 'Email' \"([^\"]*)\"$")
	public void insiro_no_campo_Email(String email) throws Throwable {
		stepB.inserirEmail(email);
	}

	@When("^insiro no campo 'Senha' \"([^\"]*)\"$")
	public void insiro_no_campo_Senha(String senha) throws Throwable {
		stepB.inserirSenha(senha);
	}

	@When("^clico no botao 'Mostrar'$")
	public void clico_no_botao_Mostrar() throws Throwable {
		stepB.clicarBtnMostrar();
	}

	@When("^insiro no campo 'Data_de_nascimento' \"([^\"]*)\"$")
	public void insiro_no_campo_Data_de_nascimento(String dataNascimento) throws Throwable {
		stepB.inserirDataNascimento(dataNascimento);
	}

	@When("^seleciono 'Receber_ofertas' \"([^\"]*)\"$")
	public void seleciono_Receber_ofertas(boolean ofertas) throws Throwable {
		stepB.selecionarReceberOfertas(ofertas);
	}

	@When("^seleciono 'Receber_noticias' \"([^\"]*)\"$")
	public void seleciono_Receber_noticias(boolean noticias) throws Throwable {
		stepB.selecionarReceberNoticias(noticias);
	}

	@When("^clico no botao 'Salvar'$")
	public void clico_no_botao_Salvar() throws Throwable {
		stepB.clicarBtnSalvar();
	}
	@Then("^verifico se usuario esta logado \"([^\"]*)\" \"([^\"]*)\"$")
	public void verifico_se_usuario_esta_logado(String nome, String sobrenome) throws Throwable {
		stepB.verificarUsuarioLogado(nome, sobrenome);
	}

}
