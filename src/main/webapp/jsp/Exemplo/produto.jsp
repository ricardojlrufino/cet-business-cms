 <!-- Main window -->
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
              <i class="icon-list-alt"></i><h5>Dados do Produto</h5>
              <div class="widget-buttons">
                  <a href="#" data-title="Collapse" data-collapsed="false" class="tip collapse"><i class="icon-chevron-up"></i></a>
              </div>
            </div>
            <div class="widget-body">
              <div class="widget-forms clearfix">
                <form class="form-horizontal">
                  <div class="control-group">
                    <label class="control-label">Descrição:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="Descricao">
                      <span class="help-inline">Apenas o nome do produto.</span>
                    </div><br/>
                    <div class="control-group">
                    <label class="control-label">Categoria</label>
                      <div class="controls">
                        <select tabindex="1" data-placeholder="Selecione.." class="span7">
                           <option value=""></option>
                           <option value="categoria">Tecnologia</option>
                           <option value="categoria">Eletronicos</option>
                           <option value="categoria">Telefonia</option>
                           <option value="categoria">Acessórios</option>
                        </select>
                     </div>
                  </div>
                    <label class="control-label">Fornecedor</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="fornecedor">
                      <span class="help-inline">Apenas nome do Fornecedor</span>
                    </div><br/>
                    <label class="control-label">Fabricante</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="fabricante">
                    </div><br/>
                    <label class="control-label">Embalagem de Compra</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="embcompra">
                    </div><br/>
                    <label class="control-label">Embalagem de Venda</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="embvenda">
                    </div><br/>
                    <label class="control-label">Codigo de Barras</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="bairro">
                    </div><br/>
                    <label class="control-label">Nome Popular:</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="telefone">
                    </div><br/>
                    <label class="control-label">Quantidade da Embalagem</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="qtdembalagem">
                    </div><br/>
                    <label class="control-label">Fração</label>
                    <div class="controls">
                      <input class="span7" type="checkbox" placeholder="fracao">Fração
                    </div><br/>
                    <label class="control-label">Unidade Fração</label>
                    <div class="controls">
                      <input class="span7" type="text" placeholder="und_fracao">
                    </div><br/>
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