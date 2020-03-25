# [API] Funcionarios

<h3>Consulta funcionário (Geral)</h3>

URL: {URL-SERVICE}/heycristhian-service/funcionarios <br>
Método: GET <br>
Headers: <br>
  Content-Type : application/json <br>
<br>
<h3>Consulta funcionário (Filtro)</h3> 

URL: {URL-SERVICE}/heycristhian-service/funcionarios?consulta={NOMEDOFUNCIONARIO} <br>
Método: GET <br>
Headers: <br>
  Content-Type : application/json <br>
  <br>
<h3>Inserir funcionário  </h3>

URL: {URL-SERVICE}/heycristhian-service/funcionarios <br>
Método: POST <br>
Headers: <br>
  Content-Type : application/json <br>
  <br>
Conteúdo: <br>
  { <br>
    "nome": String <br>
    "cpf": String <br>
    "dataNascimento": LocalDate <br>
    "descricaoCargo": String <br>
  } <br>
 <br>
Exemplo: <br>
<br>
{ <br>
	"nome": "Lucas Ferraz", <br>
	"cpf": "45073070828", <br>
	"dataNascimento": "1995-09-05", <br>
	"descricaoCargo": "DESENVOLVEDOR"  <br>
} <br>
  <br>
  <br>
<br>
<br>
<b>Informações já inseridas no projeto no arquivo data.sql: </b><br>
 <br>
INSERT INTO CARGO (DESCRICAO, SALARIO) VALUES ('DESENVOLVEDOR', 3500.0); <br>
INSERT INTO CARGO (DESCRICAO, SALARIO) VALUES ('ANALISTA I', 4000.0); <br>
INSERT INTO CARGO (DESCRICAO, SALARIO) VALUES ('ANALISTA II', 4800.0); <br>
<br>
<br>
INSERT INTO FUNCIONARIO (NOME, CPF, CARGO_ID) VALUES ('Cristhian', '45073070828', 1); <br>
INSERT INTO FUNCIONARIO (NOME, CPF, CARGO_ID) VALUES ('Leonardo', '45073070828', 1); <br>
INSERT INTO FUNCIONARIO (NOME, CPF, CARGO_ID) VALUES ('João', '45073070828', 1); <br>
<br>
