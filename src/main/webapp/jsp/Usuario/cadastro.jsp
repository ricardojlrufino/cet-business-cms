<%@ taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<!-- Main window -->
<div class="main_container" id="forms_page">
	<div class="row-fluid">
		<ul class="breadcrumb">
			<li><a href="#">Home</a> <span class="divider">/</span></li>
			<li><a href="#">Features</a> <span class="divider">/</span></li>
			<li class="active">Categorias</li>
		</ul>
		<h2 class="heading">
			Cadastrar Usuário
			<div class="btn-group pull-right">
				<a class="btn" href="/UsuarioAction.listar.mtw">
					<i class="icon-download-alt"></i> Listar
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
			<form class="form-horizontal" action="UsuarioAction.salvar.mtw" method="post">
			<div class="widget-body">
				<div class="widget-forms clearfix">					
						<div class="control-group">
							<label class="control-label">Nome:</label>
							<div class="controls">
								<input class="span7" type="text" name="nome" placeholder="Nome do cliente" />
								<span class="help-inline">Apenas o nome do usuário.</span>
							</div>
							<br /> <label class="control-label">Login:</label>
							<div class="controls">
								<input class="span7" name="login" type="text" placeholder="Login"/> 
							</div>
							<br /> <label class="control-label">Senha:</label>
							<div class="controls">
								<input class="span7" name="senha" type="password" placeholder="Senha"/> 
							</div>
							<br /> 
						</div>
				</div>
			</div>
			<div class="widget-footer">
				<button class="btn btn-primary" type="submit">Salvar</button>
				<button class="btn" type="button">Cancelar</button>
			</div>
			</form>
		</div>
	</div>
	<div class="row-fluid"></div>
</div>
</div>
<!-- /Main window -->

</div>
<!--/.fluid-container-->