Feature: filtrar pelo tamanho L e composição Algodão e depois remover filtro de tamanho

@classic
Scenario Outline: filtrar pelo tamanho L e composição Algodão
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Todos os produtos'
  	And filtro pelo tamanho "<tam>"
  	And filtro pela composicao "<composi>"
  	And removo de 'Filtros ativos' "<filtro>"
  	Then verifico se o filtro foi removido	
  
      
Examples:
   | url                     		|tam|composi	|filtro		|
   | http://10.1.10.133:8080/br/ 	|L	|Algodão	|Tamanho: L	|