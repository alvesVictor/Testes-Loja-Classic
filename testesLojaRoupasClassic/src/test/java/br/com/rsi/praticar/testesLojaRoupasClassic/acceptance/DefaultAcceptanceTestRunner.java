package br.com.rsi.praticar.testesLojaRoupasClassic.acceptance;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.openbdt.cucumber.CucumberWithOpenBdt;

@RunWith(CucumberWithOpenBdt.class)
@CucumberOptions(features = {"src/test/resources/bdd/features"}, glue = {"br.com.rsi.praticar.testesLojaRoupasClassic.steps.definition"})
public class DefaultAcceptanceTestRunner {}
