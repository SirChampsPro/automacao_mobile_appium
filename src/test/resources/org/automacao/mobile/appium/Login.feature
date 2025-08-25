#language:pt

  Funcionalidade: Validar fluxo de login
    Como usuario cadastrado
    Desejo ser capaz de acessar a aplicacao
    Para realizar transacoes

  Esquema do Cenario: Login com usuario valido
    Dado que estou na tela de login
    E Inserir os dados de login usuario "<usuario>" e senha "<senha>"
    Quando clicar no botao de login
    Entao sistema redireciona para a tela inicial

    Exemplos:
      | usuario                 | senha         |
      | admin@automacao.org.br  | password01    |