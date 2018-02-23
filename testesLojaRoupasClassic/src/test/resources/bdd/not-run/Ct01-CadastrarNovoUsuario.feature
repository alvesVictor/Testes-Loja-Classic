Feature: Cadastrar novo usuario

@classic
Scenario Outline: Cadastrar usuario
  Given estou na pagina inicial do site "<url>"
  When clico no link 'Entrar'
  And clico no link 'Nao_tem_uma_conta?_Crie_uma_aqui'
  And seleciono o 'Titulo_Social' "<tSocial>"
  And insiro no campo 'Nome' "<nome>"
  And insiro no campo 'Sobrenome' "<sobrenome>"
  And insiro no campo 'Email' "<email>"
  And insiro no campo 'Senha' "<senha>"
  And clico no botao 'Mostrar'
  And insiro no campo 'Data_de_nascimento' "<dataNascimento>"
  And seleciono 'Receber_ofertas' "<ofertas>"
  And seleciono 'Receber_noticias' "<noticias>"
  And clico no botao 'Salvar'
  Then verifico se usuario esta logado "<nome>" "<sobrenome>"
  
  
  
  
  
Examples:
   | url                     		|tSocial|nome		|sobrenome		|email			|senha	|dataNascimento	|ofertas|noticias	|
   | http://10.1.10.133:8080/br/ 	|Sra.	|Dollynho	|seu amiguinho	|dolly@gmail.com|123456	|1994-08-23		|true	|true		| 