Feature: ordenar do mais barato pro mais caro e colocar o produto mais barato no carrinho

@classic
Scenario Outline: ordenar do mais barato pro mais caro
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Todos os produtos'
  	And clico em 'Ordenar por'
  	And seleciono a opcao de ordenacao "<opcao>"
  	And seleciono o produto "<prod>"
  	And seleciono 'Quantidade' "<qtd>"
  	And clico no botao 'Adicionar'
  	Then verifico menssagem de resultado "<msg>"
      
Examples:
   | url                     		|tam|composi	|filtro		|preco				|opcao								|prod	|qtd|msg											|
   | http://10.1.10.133:8080/br/ 	|L	|Algodão	|Tamanho: L	|R$25,00 - R$38,00	|Preço, do mais baixo ao mais alto	|1		|1	|Produto adicionado ao seu carrinho de compras	|