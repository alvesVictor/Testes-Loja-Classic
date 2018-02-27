Feature: Alterar Senha do usuario

@classic
Scenario Outline: Alterar Senha
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Entrar'
  And insiro no campo de login 'Email' "<email>"
  And insiro no campo de login 'Senha' "<senha>"
  And clico no botao 'Mostrar'
  And clico no botao 'Entrar'
  And verifico se usuario esta logado "<nome>" "<sobrenome>"
  And clico no link com o nome do usuario
  And clico na opcao 'Informacao'
  And insiro no campo 'Senha' "<senha>"
  And clico no botao 'Mostrar'
  And insiro no campo 'Nova_senha' "<nSenha>"
  And clico no botao 'Mostrar'
  And clico no botao 'Salvar'
  Then verifico a mensagem na tela "<msg>"

Examples:
   | url                     		|email						|senha	|nome	|sobrenome	|nSenha|msg|
   | http://10.1.10.133:8080/br/ 	|victor.santos@rsinet.com.br|123456	|victor	|alves		|123456|Informações atualizadas com sucesso.|