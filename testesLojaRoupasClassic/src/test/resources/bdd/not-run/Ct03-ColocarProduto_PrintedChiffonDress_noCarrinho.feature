Feature: Colocar o produto Printed Chiffon Dress no carrinho


@classic
Scenario Outline: Colocar o produto Printed Chiffon Dress no carrinho
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Entrar'
  	And insiro no campo de login 'Email' "<email>"
  	And insiro no campo de login 'Senha' "<senha>"
  	And clico no botao 'Mostrar'
  	And clico no botao 'Entrar'
  	And verifico se usuario esta logado "<nome>" "<sobrenome>"
  	And insiro no campo de busca "<busca>"
  	And seleciono o vestido 'Chiffon'
  	And seleciono 'Tamanho' "<tam>"
  	And seleciono 'Cor' "<cor>"
  	And seleciono 'Quantidade' "<qtd>"
  	And clico no botao 'Adicionar'
  	Then verifico mensagem de resultado "<msg>"
  
      
Examples:
   | url                     		|email						|senha	|nome	|sobrenome	|busca			|tam	|cor	|qtd|msg											|
   | http://10.1.10.133:8080/br/ 	|victor.santos@rsinet.com.br|123456	|victor	|alves		|vestido chiffon|L		|Verde	|3	|Produto adicionado ao seu carrinho de compras	|