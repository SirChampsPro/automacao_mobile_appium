#language:pt

@usuarios
Funcionalidade: Gerenciamento de Usuários no App
  Como usuário administrador do App
  Eu quero gerenciar os demais usuários
  Para que eles possam realizar transações

  Contexto: Autenticação de um usuário válido
    Dado que estou na tela de login
    E Inserir os dados de login usuario "admin@automacao.org.br" e senha "password01"
    Quando clicar no botao de login
    Entao sistema redireciona para a tela inicial

  @inserir
  Cenário: Cadastro de um novo usuário
    Dado que seja aberto o modulo de usuarios
    Quando abrir o formulario de criacao de um novo usuario
    E forem preenchidas os dados do cadastro de usuario
    E os dados do usuario forem enviados
    Entao sistema deve criar um novo usuario

  @buscar
  Cenário:  Busca de um usuário
    Dado que seja aberto o modulo de usuarios
    Quando for realizada a busca de um usuario
    Entao o usuario devera ser exibido com sucesso
