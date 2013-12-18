<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>



<div style="color:red">Erro: ${erro}</div>

<ul>
	<mtw:list value="lista">
		<mtw:isEmpty>
			<li>Nenhum Encontrato !</li>
		</mtw:isEmpty>
		<mtw:loop var="cat">
			<li><mtw:out value="cat.nome_cat" /> <mtw:out value="cat.nome_cat" /> <a
				href="CategoriaMenuAction.editar.mtw?id=${cat.id}">Editar</a> | <a
				href="CategoriaMenuAction.excluir.mtw?id=${cat.id}">Excluir</a></li>
		</mtw:loop>
	</mtw:list>
</ul>



