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
	
	@FindBy(xpath="//button[contains(text(), 'Mostrar')]")
	private WebElement btnMostrarSenha;
	
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
	
	
		
}
