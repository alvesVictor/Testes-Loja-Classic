Feature: Filtrar pela cor Verde e adicionar ao carrinho

@classic
Scenario Outline: Filtrar pela cor Verde
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Todos os produtos'
  	And filtro pela cor "<cor>"
  	And seleciono o produto "<prod>"
  	And seleciono 'Tamanho' "<tam>"
  	And seleciono 'Cor' "<cor>"
  	And seleciono 'Quantidade' "<qtd>"
  	And clico no botao 'Adicionar'
  	Then verifico menssagem de resultado "<msg>"
  	
  
      
Examples:
   | url                     		|cor	|prod	|tam|qtd|msg											|
   | http://10.1.10.133:8080/br/ 	|Verde	|1		|M	|2	|Produto adicionado ao seu carrinho de compras	|