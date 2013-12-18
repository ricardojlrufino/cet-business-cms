<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>

<div class="main_container" id="forms_page">

	<mtw:form action="MenuAction.salvar.mtw" method="post">
		<fieldset>
			<legend>Cadastro de menu</legend>
			<mtw:input name="id_menu" type="hidden" />

			<mtw:isNull test="id_menu" negate="true">
				<mtw:out value="id_menu" />
			</mtw:isNull>
			
			<label>Menu:</label>
			<mtw:input name="nome_menu"/><br>
			

			<label> Categoria: </label>
			<select name="categorias">
				<mtw:list value="listaCategoria">
					<mtw:isEmpty>Nenhuma lista disponivel</mtw:isEmpty>
						<option selected="selected">selecionar categoria</option>
					<mtw:loop var="cat">
						<option value="<mtw:out value="cat.id_categoria" />"><mtw:out value="cat.nome_categoria" /></option>
					</mtw:loop>

				</mtw:list>
			</select>
			<br/>
			<mtw:submit value="Salvar" />
		</fieldset>
	</mtw:form>

		<fieldset>
			<legend>Listagem </legend>
			<jsp:include page="tabelaMenu.jsp" />
		</fieldset>

</div>