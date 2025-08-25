package org.automacao.mobile.appium.steps;

import io.cucumber.java.pt.*;
import lombok.extern.slf4j.Slf4j;
import org.automacao.mobile.appium.TempStorage;
import org.automacao.mobile.appium.actions.HomeActions;
import org.automacao.mobile.appium.actions.UsuariosActions;
import org.automacao.mobile.appium.actions.UsuariosCriarAlterarActions;

@Slf4j
public class UsuariosSteps {

    @Dado("que seja aberto o modulo de usuarios")
    public void que_seja_aberto_o_modulo_de_usuarios() {

        log.info("Abertura do módulo de usuários");
        HomeActions.clickMenuUsers(true);
        UsuariosActions.validatePage();
        UsuariosActions.validateUserListLoadedSuccesfully();

    }

    @Quando("abrir o formulario de criacao de um novo usuario")
    public void abrir_o_formulario_de_criacao_de_um_novo_usuario() {

        log.info("Abertura do formulário de criação de usuário");

        UsuariosActions.clickNewUser();
        UsuariosCriarAlterarActions.validatePage();

    }

    @E("forem preenchidas os dados do cadastro de usuario")
    public void forem_preenchidas_os_dados_do_cadastro_de_usuário() {

        log.info("Preenchimento dos dados de cadastro do usuário");
        UsuariosCriarAlterarActions.fillForm();

    }

    @E("os dados do usuario forem enviados")
    public void os_dados_do_usuario_forem_enviados() {

        log.info("Submissão dos dados do usuário");
        UsuariosCriarAlterarActions.submit();

    }

    @Entao("sistema deve criar um novo usuario")
    public void sistema_deve_criar_um_novo_usuario() {

        log.info("Validação do novo usuário criado");
        UsuariosCriarAlterarActions.validateUserSavedSuccesfully();

    }

    @Quando("for realizada a busca de um usuario")
    public void for_realizada_a_busca_de_um_usuario(){

        log.info("Busca de um usuário");
        UsuariosActions.search(TempStorage.name );

    }

    @Entao("o usuario devera ser exibido com sucesso")
    public void o_usuario_devera_ser_exibido_com_sucesso(){

        log.info("Validação do resultado da busca");
        UsuariosActions.validateUserInList(TempStorage.name );

    }

}

