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

}
