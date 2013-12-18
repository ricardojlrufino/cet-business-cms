<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>

<div class="main_container" id="forms_page">

	<mtw:form action="CategoriaMenuAction.salvar.mtw" method="post">
		<fieldset>
			<legend>Cadastro da categoria de menu</legend>
			<mtw:input name="id_menu" type="hidden" />

			<mtw:isNull test="id_menu" negate="true"><mtw:out value="id_menu" />
			</mtw:isNull>

			<label> Tipo categoria: </label>
			<mtw:input name="nome_cat" /><br>
			

			<mtw:submit value="Salvar" />
		</fieldset>
	</mtw:form>

	<fieldset>
		<legend>Listagem </legend>
		<jsp:include page="tabelaMenu.jsp" />
	</fieldset>

</div>