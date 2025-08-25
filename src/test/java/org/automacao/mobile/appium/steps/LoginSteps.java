package org.automacao.mobile.appium.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import lombok.extern.slf4j.Slf4j;
import org.automacao.mobile.appium.actions.HomeActions;
import org.automacao.mobile.appium.actions.LoginActions;
import org.automacao.mobile.appium.pages.LoginPage;

@Slf4j
public class LoginSteps {

    @Dado("que estou na tela de login")
    public void que_estou_na_tela_de_login() {

        log.info("Validar tela de login");
        LoginActions.validatePage();

    }
    @E("Inserir os dados de login usuario {string} e senha {string}")
    public void inserir_os_dados_de_login_usuario_e_senha(String usuario, String senha) {

        log.info("Validar preenchimento dos dados de login: usuario: " + usuario + " e senha: " + senha);
        LoginActions.fillPage(usuario, senha);
    }
    @Quando("clicar no botao de login")
    public void clicar_no_botao_de_login() {

        log.info("Validar clique no botão de login");
        LoginActions.submit();

    }
    @Entao("sistema redireciona para a tela inicial")
    public void sistema_redireciona_para_a_tela_inicial() {

        log.info("Validar tela inicial");
        HomeActions.validatePage();
    }
}
