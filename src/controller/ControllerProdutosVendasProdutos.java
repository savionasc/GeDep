/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOProdutosVendasProdutos;
import java.util.ArrayList;
import model.ModelProdutosVendasProdutos;

/**
 *
 * @author Sávio
 */
public class ControllerProdutosVendasProdutos {
    private DAOProdutosVendasProdutos dAOProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda){
        return this.dAOProdutosVendasProdutos.getListaProdutosVendasProdutos(pCodigoVenda);
    }
}
