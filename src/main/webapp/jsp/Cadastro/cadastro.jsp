﻿     <!-- Main window -->
      <div class="main_container" id="forms_page">
        <div class="row-fluid">
          <ul class="breadcrumb">
            <li><a href="#">Home</a> <span class="divider">/</span></li>
            <li><a href="#">Features</a> <span class="divider">/</span></li>
            <li class="active">Categorias</li>
          </ul>
          <h2 class="heading">
                Cadastrar Cliente
                <div class="btn-group pull-right">
                  <button class="btn"><i class="icon-download-alt"></i> Editar</button>
                  <!--<button class="btn"><i class="icon-envelope"></i> Email</button>-->
                  <button class="btn"><i class="icon-cog"></i> Exluir</button>
                </div>
          </h2>
        </div> 
        <div class="row-fluid">
          <div class="widget widget-padding span12">
            <div class="widget-header">
              <i class="icon-list-alt"></i><h5>Dados do Cliente</h5>
              <div class="widget-buttons">
                  <a href="#" data-title="Collapse" data-collapsed="false" class="tip collapse"><i class="icon-chevron-up"></i></a>
              </div>
            </div>
            <div class="widget-body">
              <div class="widget-forms clearfix">
                <form class="form-horizontal">
                  <div class="control-group">
                    <label class="control-label">Nome:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="Nome do cliente">
                      <span class="help-inline">Apenas o nome do cliente.</span>
                    </div><br/>
                    <label class="control-label">CPF:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="CPF">
                      <span class="help-inline">Apenas números.</span>
                    </div><br/>
                    <label class="control-label">RG:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="RG">
                      <span class="help-inline">Apenas números.</span>
                    </div><br/>
                    <label class="control-label">Data de Nascimento:</label>
                    <div class="controls">
                      <input class="span7" type="date" placeholder="datanascimento">
                    </div><br/>
                    <label class="control-label">Sexo:</label>
                    <div class="controls">
                      <input class="span7" type="radio" placeholder="sexo" value="M">M
                      <input class="span7" type="radio" placeholder="sexo" value="F">F
                    </div><br/>
                    <label class="control-label">Logradouro:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="logradouro">
                    </div><br/>
                    <label class="control-label">Complemento:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="complemento">
                    </div><br/>
                    <label class="control-label">Bairro:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="bairro">
                    </div><br/>
                    <label class="control-label">Telefone:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="telefone">
                    </div><br/>
                  </div>
                  
                  <div class="control-group">
                    <label class="control-label">U</label>
                      <div class="controls">
                        <select tabindex="1" data-placeholder="Selecione.." class="span7">
                           <option value=""></option>
                           <option value="Estado">MA</option>
                           <option value="Estado">PI</option>
                           <option value="Estado">CE</option>
                           <option value="Estado">TO</option>
                        </select>
                     </div>
                  </div>
                  <div class="control-group">
                    <label class="control-label">Observações Complementares</label>
                      <div class="controls">
                        <textarea class="span7" rows="5" style="height:100px;"></textarea>
                      </div>
                  </div>
                </form>
              </div>
            </div>
            <div class="widget-footer">
               <button class="btn btn-primary" type="submit">Salvar</button>
               <button class="btn" type="button">Cancelar</button>
            </div>
          </div>
        </div> 
        <div class="row-fluid">
          
        </div>
        </div>
      </div>
      <!-- /Main window -->
      
    </div><!--/.fluid-container-->