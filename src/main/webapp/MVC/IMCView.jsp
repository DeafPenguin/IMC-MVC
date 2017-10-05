<%@ page contentType="text/html; charset=UTF-8" %>
<html>

	<head>
		<title>Calculo de IMC</title>
	</head>
	
	<body>
		<h2>Calculo de IMC</h2>
		<form>
        	peso <input type="number" name="peso"></br></br>
        	altura <input type="float" name="altura"></br></br>
       		<button>Calcular</button>
		</form>
		<!-- Para mostrar o conteúdo do atributo "resultado". -->
		<h3>
			${resultado}
		</h3>
    </body>
</html>
