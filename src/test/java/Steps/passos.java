package Steps;

import java.io.IOException;

import FabricadeDrivers.configuracaoDriver;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class passos extends configuracaoDriver{
	
	@Dado("que eu acesse o formulario")
	public void que_eu_acesse_o_formulario() {
		
		iniciarTeste();
		acessarFormulario(1, 1);

		
	}

	@Quando("preencho as informações")
	public void preencho_as_informações() throws IOException {
		
		preencherInformacoes();
		printScr("InformacoesPreenchidas");
		
	}

	@Quando("envio o formulario")
	public void envio_o_formulario() {
		
		enviarFormulario();

		
	}

	@Entao("o sistema retorna na tela os resultado do formulario")
	public void o_sistema_retorna_na_tela_os_resultado_do_formulario() throws IOException {

		validarInformacoesRetornadas();
		printScr("InfRetornadas");
		
	}

}
