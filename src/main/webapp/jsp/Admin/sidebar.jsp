<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Side menu -->
<div class="sidebar-nav nav-collapse collapse">
	<div class="user_side clearfix">
		<img src="assets/img/odinn.jpg" alt="Odinn god of Thunder">
		<h5>Business</h5>
		<a href="#"><i class="icon-cog"></i> Configurações</a>
	</div>
	<div class="accordion" id="accordion2">
		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle active b_F79999"
					href="/AdminAction.admin.mtw"><i class="icon-dashboard"></i> <span>Painel</span></a>
			</div>
		</div>
		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_C3F7A7 collapsed"
					data-toggle="collapse" data-parent="#accordion2" href="#collapse1"><i
					class="icon-magic"></i> <span>Loja</span></a>
			</div>

			<div id="collapse1" class="accordion-body collapse">
				<div class="accordion-inner">
					<a class="accordion-toggle" href="/ClienteAction.cadastro.mtw"><i
						class="icon-star"></i> Cadastrar Cliente</a> <a
						class="accordion-toggle"
						href="/CategoriaProdutoAction.cadastro.mtw"><i
						class="icon-list-alt"></i>Categorias</a>
					<!--                 <a class="accordion-toggle" href="tables.html"><i class="icon-table"></i> Tables</a> -->
					<!--                 <a class="accordion-toggle" href="buttons.html"><i class="icon-circle"></i> Buttons</a> -->
				</div>
			</div>
		</div>
		<!-- Finaliza accordion-group -->


		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_9FDDF6 collapsed"
					data-toggle="collapse" data-parent="#accordion2" href="#collapse2"><i
					class="icon-reorder"></i> <span>Components</span></a>
			</div>
			<div id="collapse2" class="accordion-body collapse">
				<div class="accordion-inner">
					<a class="accordion-toggle" href="notifications.html"><i
						class="icon-rss"></i> Notifications</a> <a class="accordion-toggle"
						href="calendar.html"><i class="icon-calendar"></i> Calendar</a> <a
						class="accordion-toggle" href="gallery.html"><i
						class="icon-picture"></i> Gallery</a>
				</div>
			</div>
		</div>
		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_F6F1A2"
					href="ExemploAction.cadastro.mtw"><i class="icon-tasks"></i> <span>Exemplo</span></a>
			</div>
		</div>
		
		<!-- Controle de páginas-->
		
		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_9FDDF6 collapsed"
					data-toggle="collapse" data-parent="#accordion3" href="#collapse3"><i
					class="icon-reorder"></i> <span>Controle de paginas</span></a>
			</div>
			<div id="collapse3" class="accordion-body collapse">
				<div class="accordion-inner">
					<a class="accordion-toggle" href="CategoriaMenuAction.cadastro.mtw">
					<i class="icon-rss"></i> Cadastro de categorias</a>
					<a class="accordion-toggle" href="MenuAction.cadastro.mtw"><i class="icon-rss"></i> Cadastro de menus</a> <a
						class="accordion-toggle" href="gallery.html"><i	class="icon-rss"></i> Cadastro de páginas</a>
				</div>
			</div>
		</div>
	

		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_C1F8A9" href="analytics.html"><i
					class="icon-bar-chart"></i> <span>Analytics</span></a>
			</div>
		</div>
		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_9FDDF6" href="tickets.html"><i
					class="icon-bullhorn"></i> <span>Support Tickets</span></a>
			</div>
		</div>
		<div class="accordion-group">
			<div class="accordion-heading">
				<a class="accordion-toggle b_F5C294"
					href="/UsuarioAction.listar.mtw"><i class="icon-user"></i> <span>Usuários</span></a>
			</div>
		</div>
	</div>
</div>
<!-- /Side menu -->