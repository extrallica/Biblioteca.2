<%-- 
    Document   : encabezado
    Created on : Nov 11, 2018, 8:50:21 PM
    Author     : const
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<!--		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">-->
		<link rel="stylesheet" href="../../bootstrap/css/Estilos.css" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=request.getParameter("titulo-pestania")%></title>
    </head>
    <body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href="#">Biblioteca . 2</a>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link" href="#">Inicio <span class="sr-only"></span></a>
					</li>

					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Libros
						</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Registro</a>
							<a class="dropdown-item" href="#">Consulta</a>
							<a class="dropdown-item" href="#">Modificacion</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Eliminar</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Usuarios
						</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Registro</a>
							<a class="dropdown-item" href="#">Consulta</a>
							<a class="dropdown-item" href="#">Modificacion</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Eliminar</a>
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Prestamos
						</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Prestamo</a>
							<a class="dropdown-item" href="#">Consulta</a>
							<a class="dropdown-item" href="#">Devolucion</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Historial</a>
						</div>
					</li>

				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" name="buscarL" type="search" placeholder="Busqueda" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
				</form>
			</div>
		</nav>
		<section>
