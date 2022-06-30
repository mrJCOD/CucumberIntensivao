package FabricadeDrivers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Metodos.Metodos;

public class configuracaoDriver extends Metodos{
	
	public void iniciarTeste() {
		
		String urlPadrao = "https://demoqa.com/";
		String navegador = "chrome";
		boolean headless = true;
		ChromeOptions opcao = new ChromeOptions();
		
		if (navegador.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C://driver-navegadores/chromedriver.exe");
			if (headless) {
				opcao.addArguments("--headless");
				opcao.addArguments("--disable-gpu");
				opcao.addArguments("--window-size=1920,1080");
			}
			
			driver = new ChromeDriver(opcao);
			driver.manage().window().maximize();
			driver.get(urlPadrao);
			
	}
		
		
	}
	
	public void acessarFormulario(int menu, int topico) {
		
		driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])["+menu+"]")).click();
		driver.findElement(By.xpath("(//div[@class='element-list collapse show']//li)["+topico+"]")).click();
		

	}
	
	public void preencherInformacoes() {
		
		escrever(By.id("userName"), "Maria Miranda");
		escrever(By.id("userEmail"), "teste@gmail.com");
		escrever(By.id("currentAddress"), "Rua 1");
		escrever(By.id("permanentAddress"), "Rua 1");
	}
	
	public void enviarFormulario() {
		
		clicar(By.id("submit"));
	}
	
	public void validarInformacoesRetornadas() {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("index0");
		lista.add("Name:Maria Miranda");
		lista.add("Email:teste@gmail.com");
		lista.add("Current Address :Rua 1");
		lista.add("Permananet Address :Rua 1");
		
		
		for(int i = 1; i<4; i++) {
			
			String texto = driver.findElement(By.xpath("//p[@class='mb-1']["+i+"]")).getText();
			assertEquals(lista.get(i), texto);
			
		}
		
		
	}
	
	
	
	

}
