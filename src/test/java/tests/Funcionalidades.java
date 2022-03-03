package tests;

import javafx.scene.input.KeyCode;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Funcionalidades {
    @Test
    public void criarNovaContaUsuario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\caique.souza\\driver\\chromedriver.exe");
        WebDriver InstanciaNavegador = new ChromeDriver();

        //Dado que estou na pagina advantage online
        InstanciaNavegador.get("http://advantageonlineshopping.com/#/");

        //clico no icone de usuario
        InstanciaNavegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        InstanciaNavegador.findElement(By.id("menuUser")).click();

        //clico em create new account
        InstanciaNavegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        InstanciaNavegador.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();

        //preencho first name
        InstanciaNavegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement firstName = (WebElement) InstanciaNavegador.findElements(By.name("first_nameRegisterPage"));
        firstName.sendKeys("Caique");

        //preencho last name
        WebElement lastName = InstanciaNavegador.findElement(By.name("last_nameRegisterPage"));
        lastName.sendKeys("Alves");

        //preencho phone
        WebElement phone = InstanciaNavegador.findElement(By.name("phone_numberRegisterPage"));
        phone.sendKeys("11955362105");

        //seleciono country Brazil


    }
}
