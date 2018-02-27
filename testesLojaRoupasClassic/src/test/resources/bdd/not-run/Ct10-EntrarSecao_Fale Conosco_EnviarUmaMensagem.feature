Feature:  Entrar na seção Fale Conosco, enviar uma mensagem

@classic
Scenario Outline: escolher a seção T-shirts, aumentar a quantidade do item a seis
  	Given estou na pagina inicial do site "<url>"
  	When clico no link 'Fale conosco'
  	And seleciono o 'Assunto' "<assunto>"
  	And insiro no campo 'Email' "<email>"
  	And insiro no campo 'Mensagem' "<msg>"
  	And clico no botao 'Enviar'
  	Then verifico mensagem de envio de email "<msgEnvio>"
  	
  	  	
Examples:
   | url                     		|assunto	|email				|msg						|msgEnvio													|
   | http://10.1.10.133:8080/br/ 	|Webmaster	|victor@gmail.com	|Esta é uma mensagem teste	|Sua mensagem foi enviada com sucesso à nossa equipe.	|