package br.com.rsi.praticar.testesLojaRoupasClassic.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PageObjectClassic extends PageObject{

	@FindBy(xpath="//div[@class='user-info']/a")
	private WebElement linkEntrar;
	
	@FindBy(xpath="//a[contains(text(), 'Crie uma')]")
	private WebElement linkCriarConta;
	
	@FindBy(xpath="//label[contains(@class,'radio-')]")
	private List<WebElement> radioBtnTituloSocial;
	
	@FindBy(name="firstname")
	private WebElement campoNome;
	
	@FindBy(name="lastname")
	private WebElement campoSobrenome;
	
	@FindBy(xpath="//input[contains(@type, 'email')]")
	private WebElement campoEmail;
	
	@FindBy(name="password")
	private WebElement campoSenha;
	
	@FindBy(name="new_password")
	private WebElement campoSenhaNova;
	
	@FindBy(xpath="//button[contains(text(), 'Mostrar')]")
	private WebElement btnMostrarSenha;
	
	@FindBy(xpath="//button[contains(text(), 'Entrar')]")
	private WebElement btnEntrar;
	
	@FindBy(name="birthday")
	private WebElement campoDataNascimento;
	
	//@FindBy(xpath="//span/following::input[@name='optin']")
	private By receberOfertas = By.xpath("//span/following::input[@name='optin']");
	public By getReceberOfertas() {
		return receberOfertas;
	}
	
	//@FindBy(xpath="//span/following::input[@name='newsletter']")
	private By receberNoticias = By.xpath("//span/following::input[@name='newsletter']");
	public By getReceberNoticias() {
		return receberNoticias;
	}
	
	@FindBy(xpath="//button[contains(text(), 'Salvar')]")
	private WebElement btnSalvar;
	
	@FindBy(xpath="//div[@class='user-info']/a[last()]")
	private WebElement userInfo;
	
	@FindBy(xpath="//i/preceding::span[contains(text(),'')]/preceding::a[contains(@href,'identidade')]")
	private WebElement informacoesUsuario;
	
	@FindBy(xpath="//article[@role='alert']")
	private WebElement alertAlterarSenha;
	
	@FindBy(xpath="//a[contains(text(), 'chiffon estampado')]")
	private WebElement vestidoChiffon;
	
	@FindBy(xpath="//input[starts-with(@placeholder,'Pesquisar')]")
	private WebElement campoPesquisa;
	
	@FindBy(name="group[1]")
	private WebElement selectTamanho;
	
	@FindBy(xpath="//li[@class='float-xs-left input-container']/label")
	private List<WebElement> cores;
	
	@FindBy(name="qty")
	private WebElement qtdItem;
	
	@FindBy(xpath="//button[@class='btn btn-primary add-to-cart']")
	private WebElement addCarrinho;
	
	@FindBy(xpath="//div[@class='modal fade in']")
	private WebElement mensagemCarrinho;
	
	@FindBy(xpath="//h4[contains(@id, 'myModalLabel')]")
	private WebElement mensagemCarrinhoResultado;
	
	@FindBy(xpath="//a[contains(normalize-space(text()), 'Todos os produtos')]")
	private WebElement linkTodosProdutos;
	
	@FindBy(xpath="//a[contains(@href, 'Cor-')]/parent::label")
	private List<WebElement> filtroCores;
	
	@FindBy(xpath="//a[contains(@href, 'Tamanho-')]/parent::label")
	private List<WebElement> filtroTamanhos;
	
	@FindBy(xpath="//a[contains(@href, 'Composi')]/parent::label")
	private List<WebElement> filtroComposicao;
	
	@FindBy(xpath="//a[contains(@href, 'Estilos-')]/parent::label")
	private List<WebElement> filtroEstilos;
	
	@FindBy(xpath="//a[contains(@href, 'q=Pre')]/parent::label")
	private List<WebElement> filtroPrecos;
	
	@FindBy(xpath="//a[starts-with(@class,'thumbnail product')]")
	private List<WebElement> produtos;
	
	@FindBy(xpath="//li[@class='filter-block']")
	private List<WebElement> filtrosAtivos;
	
	@FindBy(xpath="//a[contains(@href, 'order=product')]")
	private List<WebElement> linksOrdenar;
	
	@FindBy(xpath="//button[contains(@class, 'filters-clear-all')]")
	private WebElement btnLimparTodosFiltros;
	
	@FindBy(xpath="//section[@class='active_filters']")
	private WebElement sectionFiltrosAtivos;
	
	@FindBy(xpath="//button[@class='btn-unstyle select-title']")
	private WebElement btnOrdenar;
	
	@FindBy(xpath="//a[contains(@href, 'women')]")
	private WebElement linkWomen;
	
	@FindBy(xpath="//li[@id='category-5']/a[contains(@href, 'tshirts')]")
	private WebElement linkTShirts;
	
	@FindBy(xpath="//button[@class='btn btn-touchspin js-touchspin bootstrap-touchspin-up']")
	private WebElement btnUpQtd;
	
	@FindBy(xpath="//a[contains(text(), 'Finalizar pedido')]")
	private WebElement btnFinalizarPedido;
	
	@FindBy(xpath="//div[@id='contact-link']/descendant::a[contains(text(),'Fale')]")
	private WebElement linkFaleConosco;
	
	@FindBy(name="id_contact")
	private WebElement selectAssunto;
	
	@FindBy(xpath="//textarea[contains(@name, 'message')]")
	private WebElement campoMensagem;
	
	@FindBy(xpath="//input[contains(@name, 'submitMessage')]")
	private WebElement btnEnviarMensagem;
	
	@FindBy(xpath="//div[starts-with(@class, 'col-xs-12 alert alert')]")
	private WebElement divRespostaEnvioEmail;

	
	public WebElement getLinkEntrar() {
		return linkEntrar;
	}

	public WebElement getLinkCriarConta() {
		return linkCriarConta;
	}

	public List<WebElement> getRadioBtnTituloSocial() {
		return radioBtnTituloSocial;
	}

	public WebElement getCampoNome() {
		return campoNome;
	}

	public WebElement getCampoSobrenome() {
		return campoSobrenome;
	}

	public WebElement getCampoEmail() {
		return campoEmail;
	}

	public WebElement getCampoSenha() {
		return campoSenha;
	}

	public WebElement getBtnMostrarSenha() {
		return btnMostrarSenha;
	}

	public WebElement getCampoDataNascimento() {
		return campoDataNascimento;
	}

	public WebElement getBtnSalvar() {
		return btnSalvar;
	}

	public WebElement getUserInfo() {
		return userInfo;
	}

	public WebElement getBtnEntrar() {
		return btnEntrar;
	}

	public WebElement getCampoSenhaNova() {
		return campoSenhaNova;
	}

	public WebElement getInformacoesUsuario() {
		return informacoesUsuario;
	}

	public WebElement getAlertAlterarSenha() {
		return alertAlterarSenha;
	}

	public WebElement getVestidoChiffon() {
		return vestidoChiffon;
	}

	public WebElement getCampoPesquisa() {
		return campoPesquisa;
	}

	public WebElement getSelectTamanho() {
		return selectTamanho;
	}

	public List<WebElement> getCores() {
		return cores;
	}

	public WebElement getQtdItem() {
		return qtdItem;
	}

	public WebElement getAddCarrinho() {
		return addCarrinho;
	}

	public WebElement getMensagemCarrinho() {
		return mensagemCarrinho;
	}

	public WebElement getMensagemCarrinhoResultado() {
		return mensagemCarrinhoResultado;
	}

	public WebElement getLinkTodosProdutos() {
		return linkTodosProdutos;
	}

	public List<WebElement> getFiltroCores() {
		return filtroCores;
	}

	public List<WebElement> getFiltroTamanhos() {
		return filtroTamanhos;
	}

	public List<WebElement> getFiltroComposicao() {
		return filtroComposicao;
	}

	public List<WebElement> getFiltroEstilos() {
		return filtroEstilos;
	}

	public List<WebElement> getProdutos() {
		return produtos;
	}

	public List<WebElement> getFiltrosAtivos() {
		return filtrosAtivos;
	}

	public List<WebElement> getFiltroPrecos() {
		return filtroPrecos;
	}

	public WebElement getBtnLimparTodosFiltros() {
		return btnLimparTodosFiltros;
	}

	public WebElement getSectionFiltrosAtivos() {
		return sectionFiltrosAtivos;
	}

	public List<WebElement> getLinksOrdenar() {
		return linksOrdenar;
	}

	public WebElement getBtnOrdenar() {
		return btnOrdenar;
	}

	public WebElement getLinkWomen() {
		return linkWomen;
	}

	public WebElement getLinkTShirts() {
		return linkTShirts;
	}

	public WebElement getBtnUpQtd() {
		return btnUpQtd;
	}

	public WebElement getBtnFinalizarPedido() {
		return btnFinalizarPedido;
	}

	public WebElement getLinkFaleConosco() {
		return linkFaleConosco;
	}

	public WebElement getSelectAssunto() {
		return selectAssunto;
	}

	public WebElement getCampoMensagem() {
		return campoMensagem;
	}

	public WebElement getBtnEnviarMensagem() {
		return btnEnviarMensagem;
	}

	public WebElement getDivRespostaEnvioEmail() {
		return divRespostaEnvioEmail;
	}
		
		
}
