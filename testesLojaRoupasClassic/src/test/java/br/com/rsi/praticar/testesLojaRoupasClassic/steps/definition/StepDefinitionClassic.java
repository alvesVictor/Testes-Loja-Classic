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
	
	@When("^insiro no campo de login 'Email' \"([^\"]*)\"$")
	public void insiro_no_campo_de_login_Email(String email) throws Throwable {
		stepB.inserirEmailLogin(email);
	}
	
	@When("^insiro no campo de login 'Senha' \"([^\"]*)\"$")
	public void insiro_no_campo_de_login_Senha(String senha) throws Throwable {
		stepB.inserirSenha(senha);
	}

	@When("^insiro no campo 'Senha' \"([^\"]*)\"$")
	public void insiro_no_campo_Senha(String senha) throws Throwable {
		stepB.inserirSenha(senha);
	}
	
	@When("^insiro no campo 'Nova_senha' \"([^\"]*)\"$")
	public void insiro_no_campo_Nova_senha(String nSenha) throws Throwable {
		stepB.inserirNovaSenha(nSenha);
	}

	@When("^clico no botao 'Mostrar'$")
	public void clico_no_botao_Mostrar() throws Throwable {
		stepB.clicarBtnMostrar();
	}

	@When("^clico no botao 'Entrar'$")
	public void clico_no_botao_Entrar() throws Throwable {
		stepB.clicarBtnEntrar();
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
	
	@When("^clico no link com o nome do usuario$")
	public void clico_no_link_com_o_nome_do_usuario() throws Throwable {
		stepB.clicarLinkComNomeUsuario();
	}

	@When("^clico na opcao 'Informacao'$")
	public void clico_na_opcao_Informacao() throws Throwable {
		stepB.clicarOpcaoInformacao();
	}
	
	@When("^insiro no campo de busca \"([^\"]*)\"$")
	public void insiro_no_campo_de_busca(String busca) throws Throwable {
		stepB.inserirCampoBusca(busca);
		
	}
	
	@When("^seleciono o vestido 'Chiffon'$")
	public void seleciono_o_vestido_Chiffon() throws Throwable {
		stepB.selecionarVestidoChiffon();
	}
	
	@When("^seleciono 'Tamanho' \"([^\"]*)\"$")
	public void seleciono_Tamanho(String tamanho) throws Throwable {
		stepB.selecionarTamanho(tamanho);
	}

	@When("^seleciono 'Cor' \"([^\"]*)\"$")
	public void seleciono_Cor(String cor) throws Throwable {
		stepB.selecionarCor(cor);
	}

	@When("^seleciono 'Quantidade' \"([^\"]*)\"$")
	public void seleciono_Quantidade(String qtd) throws Throwable {
		stepB.selecionarQuantidade(qtd);
	}

	@When("^clico no botao 'Adicionar'$")
	public void clico_no_botao_Adicionar() throws Throwable {
		stepB.clicarBtnAdicionar();
	}

	@When("^clico no link 'Todos os produtos'$")
	public void clico_no_link_Todos_os_produtos() throws Throwable {
		stepB.clicarLinkTodosProdutos();
	}

	@When("^filtro pela cor \"([^\"]*)\"$")
	public void filtro_pela_cor(String cor) throws Throwable {
		stepB.filtrarCor(cor);
	}
	
	@When("^filtro pelo tamanho \"([^\"]*)\"$")
	public void filtro_pelo_tamanho(String tam) throws Throwable {
		stepB.filtrarTamanho(tam);
	}
	
	@When("^filtro pelo estilo \"([^\"]*)\"$")
	public void filtro_pelo_estilo(String estilo) throws Throwable {
		stepB.filtrarEstilo(estilo);
	}
	
	@When("^filtro pela composicao \"([^\"]*)\"$")
	public void filtro_pela_composicao(String compo) throws Throwable {
		stepB.filtrarComposicao(compo);
	}

	@When("^seleciono o produto \"([^\"]*)\"$")
	public void seleciono_o_produto(int prod) throws Throwable {
		stepB.selecionarProduto(prod);
	}
	
	@When("^removo de 'Filtros ativos' \"([^\"]*)\"$")
	public void removo_de_Filtros_ativos(String filtro) throws Throwable {
		stepB.removerFiltroAtivo(filtro);
	}
	
	@When("^filtro pelo preco \"([^\"]*)\"$")
	public void filtro_pelo_preco(String preco) throws Throwable {
		stepB.filtrarPreco(preco);
	}
	
	@When("^clico no botao 'limpar tudo'$")
	public void clico_no_botao_limpar_tudo() throws Throwable {
		stepB.clicarBotaoLimparTudo();
	}

	@Then("^verifico se removeu todos os filtros$")
	public void verifico_se_removeu_todos_os_filtros() throws Throwable {
		stepB.verificarRemocaoTodosFiltros();
	}
	
	@Then("^verifico menssagem de resultado \"([^\"]*)\"$")
	public void verifico_menssagem_de_resultado(String msg) throws Throwable {
		stepB.verificarMenssagemResultado(msg);
	}
	
	@Then("^verifico se usuario esta logado \"([^\"]*)\" \"([^\"]*)\"$")
	public void verifico_se_usuario_esta_logado(String nome, String sobrenome) throws Throwable {
		stepB.verificarUsuarioLogado(nome, sobrenome);
	}
	
	@Then("^verifico a menssagem na tela \"([^\"]*)\"$")
	public void verifico_a_menssagem_na_tela(String msg) throws Throwable {
		stepB.verificarMenssagemTela(msg);
	}
	
	@Then("^verifico se o filtro foi removido$")
	public void verifico_se_o_filtro_foi_removido() throws Throwable {
		stepB.verificarFiltroRemovido();
	}


}
