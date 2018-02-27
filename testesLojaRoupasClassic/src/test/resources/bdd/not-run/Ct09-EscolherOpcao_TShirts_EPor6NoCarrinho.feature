Feature:  escolher a seção T-shirts, aumentar a quantidade do item a seis

@classic
Scenario Outline: escolher a seção T-shirts, aumentar a quantidade do item a seis
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Women'
  	And clico na opcao 'T-Shirts' categoria 'Tops'
  	And seleciono o produto "<prod>"
  	And seleciono 'Tamanho' "<tam>"
  	And seleciono 'Cor' "<cor>"
  	And seleciono 'Quantidade' "<qtd>"
  	And clico no botao 'Adicionar'
  	And verifico mensagem de resultado "<msg>"
  	Then clico no botao 'Finalizar pedido'
  	  	
  	
  		 	 
      
Examples:
   | url                     		|prod	|tam|cor	|qtd|msg											|
   | http://10.1.10.133:8080/br/ 	|1		|M	|Azul	|6	|Produto adicionado ao seu carrinho de compras	|