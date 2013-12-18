<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>

<!-- Main window -->
<div class="main_container" id="tables_page">
	<div class="row-fluid">
		<ul class="breadcrumb">
			<li><a href="#">Home</a> <span class="divider">/</span></li>
			<li><a href="#">Features</a> <span class="divider">/</span></li>
			<li class="active">Categorias</li>
		</ul>
		<h2 class="heading">
			Lista de usuários
			<div class="btn-group pull-right">
				<a class="btn" href="/UsuarioAction.cadastro.mtw">
					<i class="icon-download-alt"></i> Adicionar Novo
				</a>
				<button class="btn">
					<i class="icon-download-alt"></i> Editar
				</button>
				<!--<button class="btn"><i class="icon-envelope"></i> Email</button>-->
				<button class="btn">
					<i class="icon-cog"></i> Exluir
				</button>
			</div>
		</h2>
	</div>
	<div class="row-fluid">
		<div class="widget widget-padding span12">
			<div class="widget-header">
				<i class="icon-list-alt"></i>
				<h5>Dados do Usuário</h5>
				<div class="widget-buttons">
					<a href="#" data-title="Collapse" data-collapsed="false"
						class="tip collapse"><i class="icon-chevron-up"></i></a>
				</div>
			</div>
			<table class="table table-striped table-bordered dataTable">
				<tr>  
					<th>Código</th>  
					<th>Nome</th>  
					<th>Login</th>  
					<th>Senha</th>  
			    </tr> 
			    <mtw:list value="lista">        
			        <mtw:loop>  
			            <tr>  
			                <td><mtw:out value="id"/></td>  
			                <td><mtw:out value="nome"/></td>  
			                <td><mtw:out value="login"/></td>  
			                <td><mtw:out value="senha"/></td>  
			            </tr>  
			        </mtw:loop>  
			    </mtw:list> 
			</table>
		</div>
	</div>
	<div class="row-fluid"></div>
</div>
</div>
<!-- /Main window -->

</div>
<!--/.fluid-container-->