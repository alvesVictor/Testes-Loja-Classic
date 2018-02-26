Feature: filtrar pelo preço 25,00 R$ - 38,00 R$

@classic
Scenario Outline: filtrar pelo preço 25,00 R$ - 38,00 R$
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Todos os produtos'
  	And filtro pelo preco "<preco>"
  	And clico no botao 'limpar tudo'
  	Then verifico se removeu todos os filtros  	 
      
Examples:
   | url                     		|tam|composi	|filtro		|preco				|
   | http://10.1.10.133:8080/br/ 	|L	|Algodão	|Tamanho: L	|R$25,00 - R$38,00	|