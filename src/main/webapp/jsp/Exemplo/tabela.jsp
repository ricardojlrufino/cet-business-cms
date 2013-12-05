<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/" %>

<ul>
<mtw:list value="lista">
	<mtw:isEmpty><li>Nenhum Encontrato !</li></mtw:isEmpty>
	<mtw:loop var="atual">
		<li><mtw:out value="atual.nome" /> 
		<a href="ExemploAction.editar.mtw?id=${atual.id}">Editar</a>  | <a href="ExemploAction.excluir.mtw?id=${atual.id}">Excluir</a> </li>
	</mtw:loop>
</mtw:list>
</ul>



