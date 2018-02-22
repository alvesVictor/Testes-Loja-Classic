Feature: Cadastrar novo usuario

@classic
Scenario Outline: Cadastrar usuario
  Given estou na pagina inicial do site "<url>"
  
Examples:
   | url                     | 
   | http://10.1.10.133:8080 |  