package br.com.rsi.praticar.testesLojaRoupasClassic.steps.business;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.openbdt.element.WebBrowserScreenElement;
import br.com.rsi.praticar.testesLojaRoupasClassic.pages.PageObjectClassic;
import jxl.common.Logger;
import net.serenity_bdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

@ContextConfiguration("/appcontext.xml")
public class StepBusinessClassic {

	PageObjectClassic page;
	private static Logger LOG = Logger.getLogger(StepBusinessClassic.class);
	
	@Autowired
	private WebBrowserScreenElement viewElement; // OBJETO QUE CONT�M M�TODOS PR�PRIOS DO FRAMEWORK

	@Step
	public void openHome(String url) {
		viewElement.open(url);
		viewElement.getDriver().manage().window().maximize();
	}

	public void clicarLinkEntrar() {
		viewElement.clickAndWait(page.getLinkEntrar(), 10);
	}

	public void clicarLinkCriarConta() {
		viewElement.clickAndWait(page.getLinkCriarConta(), 10);
	}

	public void selecionarTituloSocial(String tSocial) {
		page.getRadioBtnTituloSocial().forEach(ele -> {
			if(ele.getText().contains(tSocial)){
				viewElement.clickAndWait(ele, 10);
			}
		});
	}

	public void inserirNome(String nome) {
		viewElement.sendText(page.getCampoNome(), nome);
	}

	public void inserirSobrenome(String sobrenome) {
		viewElement.sendText(page.getCampoSobrenome(), sobrenome);
	}

	public void inserirEmail(String email) {
		String[] mail = email.split("@");
		email = mail[0] + UUID.randomUUID() + "@" + mail[1];
		viewElement.sendText(page.getCampoEmail(), email);
	}

	public void inserirSenha(String senha) {
		viewElement.sendText(page.getCampoSenha(), senha);
	}

	public void clicarBtnMostrar() {
		viewElement.clickAndWait(page.getBtnMostrarSenha(), 10);
	}

	public void inserirDataNascimento(String dataNascimento) {
		viewElement.sendText(page.getCampoDataNascimento(), dataNascimento);
	}

	public void selecionarReceberOfertas(boolean ofertas) {
		if(ofertas) {
			viewElement.findElement(page.getReceberOfertas()).click();
		}
	}
	
	public void selecionarReceberNoticias(boolean noticias) {
		if(noticias) {
			viewElement.findElement(page.getReceberNoticias()).click();
		}
	}

	public void clicarBtnSalvar() {
		viewElement.click(page.getBtnSalvar());
		page.waitFor(5).seconds();
	}

	public void verificarUsuarioLogado(String nome, String sobrenome) {
		LOG.info(nome.concat(" ").concat(sobrenome));
		Assert.assertTrue(page.element(page.getUserInfo()).containsText(nome.concat(" ").concat(sobrenome)));
	}

	public void clicarBtnEntrar() {
		viewElement.clickAndWait(page.getBtnEntrar(), 10);
	}

	public void inserirEmailLogin(String email) {
		viewElement.sendText(page.getCampoEmail(), email);
	}

	public void inserirNovaSenha(String nSenha) {
		viewElement.sendText(page.getCampoSenhaNova(), nSenha);
	}

	public void clicarLinkComNomeUsuario() {
		viewElement.clickAndWait(page.getUserInfo(), 10);
	}

	public void clicarOpcaoInformacao() {
		viewElement.clickAndWait(page.getInformacoesUsuario(), 10);
	}

	public void verificarMenssagemTela(String msg) {
		page.waitFor(page.getAlertAlterarSenha()).isPresent();
		assertTrue(page.element(page.getAlertAlterarSenha()).containsText(msg));
	}

}
