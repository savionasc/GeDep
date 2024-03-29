/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Sávio
 */
public class ControllerProdutos {
    
    private DaoProdutos daoProdutos = new DaoProdutos();
    
    /**
     * Salvar produtos Controller
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    /**
     * Excluir um produto pelo codigo
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    /**
     * Alterar um produto
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    /**
     * Retornar produto pelo codigo
     * @param pCodigo
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    /**
     * Retornar produto pelo codigo de barras
     * @param pCodigoBarras
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoPorCodigoBarrasController(String pCodigoBarras){
        return this.daoProdutos.retornarProdutoCodigoBarrasDAO(pCodigoBarras);
    }
    
    /**
     * Retornar produto pelo codigo
     * @param pNomeProduto
     * @return ModelProdutos
     */
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    /**
     * Retorna uma lista de produtos
     * @return ArrayList ModelProdutos
     */
    public ArrayList<ModelProdutos> retornaListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    
    /**
     * Alterar lista de produtos no banco
     * @param pListaModelProdutos
     * @return boolean
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos){
        return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }
}
