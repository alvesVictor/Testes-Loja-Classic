Feature: filtrar pelo tamanho L e estilo Vistoso

@classic
Scenario Outline: filtrar pelo tamanho L e estilo Vistoso
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Todos os produtos'
  	And filtro pelo tamanho "<tam>"
  	And filtro pelo estilo "<estilo>"
  	And seleciono o produto "<prod>"
  	And seleciono 'Tamanho' "<tam>"
  	And seleciono 'Cor' "<cor>"
  	And seleciono 'Quantidade' "<qtd>"
  	And clico no botao 'Adicionar'
  	Then verifico mensagem de resultado "<msg>"  	
  
      
Examples:
   | url                     		|cor	|prod	|tam|estilo	|qtd|msg											|
   | http://10.1.10.133:8080/br/ 	|Bege	|1		|L	|Vistoso|2	|Produto adicionado ao seu carrinho de compras	|