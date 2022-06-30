package Metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Metodos {
	
	public static WebDriver driver;
	
	public static WebDriver navegador() {
		
		return driver;
	}
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
		
	}
	
	public void escrever(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void printScr(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot)navegador());
		File nomeArq = scrShot.getScreenshotAs(OutputType.FILE);
		File destArq = new File("./src/evidencias/"+nome+".png");
		FileUtils.copyFile(nomeArq, destArq);

	}

}
