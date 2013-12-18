<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>



<%-- <div style="color:red">Erro: ${erro}</div> --%>

<ul>
	<mtw:list value="listarMenu">
		<mtw:isEmpty>
			<li>Nenhum Encontrato !</li>
		</mtw:isEmpty>
		<mtw:loop var="menu">
			<li><mtw:out value="menu.nome_menu" /> - <mtw:out value="menu.nome_categoria" /> <a
				href="MenuAction.editar.mtw?id_menu=${menu.id_menu}">Editar</a> | <a
				href="MenuAction.excluir.mtw?id_menu=${menu.id_menu}">Excluir</a></li>
		</mtw:loop>
	</mtw:list>
</ul>



