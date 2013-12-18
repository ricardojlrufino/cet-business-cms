<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>

<div class="main_container" id="forms_page">

	<mtw:form action="CategoriaMenuAction.salvar.mtw" method="post">
		<fieldset>
			<legend>Cadastro de menu</legend>
			<mtw:input name="id_menu" type="hidden" />

			<mtw:isNull test="id_menu" negate="true">
				<mtw:out value="id_menu" />
			</mtw:isNull>

			<label> Nome do menu: </label> 
			
		
			<mtw:select name="categorias" list="listaCategorias" emptyField="true"/>


			<mtw:submit value="Salvar" />
		</fieldset>
	</mtw:form>

	<!-- 	<fieldset> -->
	<!-- 		<legend>Listagem </legend> -->
	<%-- 		<jsp:include page="tabelaMenu.jsp" /> --%>
	<!-- 	</fieldset> -->

</div>