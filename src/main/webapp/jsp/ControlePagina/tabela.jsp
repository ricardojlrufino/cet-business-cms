<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>



<%-- <div style="color:red">Erro: ${erro}</div> --%>

<ul>
	<mtw:list value="lista">
		<mtw:isEmpty>
			<li>Nenhum Encontrato !</li>
		</mtw:isEmpty>
		<mtw:loop var="cat">
			<li><mtw:out value="cat.nome_categoria" /> - <a
				href="CategoriaMenuAction.editar.mtw?id_cat=${cat.id_categoria}">Editar</a> | <a
				href="CategoriaMenuAction.excluir.mtw?id_cat=${cat.id_categoria}">Excluir</a></li>
		</mtw:loop>
	</mtw:list>
</ul>



