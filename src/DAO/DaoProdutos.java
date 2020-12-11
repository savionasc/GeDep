/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Sávio
 */
public class DaoProdutos extends ConexaoMySql {

    /**
     * Cadastrar um produto no banco
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_produto ("
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_cod_barra"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getProNome() + "',"
                    + "'" + pModelProdutos.getProValor() + "',"
                    + "'" + pModelProdutos.getProEstoque() + "',"
                    + "'" + pModelProdutos.getProCodBarra() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Excluir um produto do banco
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar dados do produto
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET"
                            + " pro_nome = '"+pModelProdutos.getProNome()+"',"
                            + " pro_valor = '"+pModelProdutos.getProValor()+"',"
                            + " pro_estoque = '"+pModelProdutos.getProEstoque()+"'"
                            + " WHERE pk_id_produto = '"+pModelProdutos.getIdProduto()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * retorna um produto pelo codigo
     * @param pIdProduto
     * @return modelProduto
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto){
        ModelProdutos modelProdutos = new ModelProdutos();
        modelProdutos.setAtivo(false);
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_cod_barra "
                    + "FROM tbl_produto WHERE pk_id_produto = '"+pIdProduto+"'");
            
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
                modelProdutos.setProCodBarra(this.getResultSet().getString(5));
                modelProdutos.setAtivo(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return modelProdutos;
    }
    
    /**
     * retorna um produto pelo nome do produto
     * @param pNomeProduto
     * @return modelProduto
     */
    public ModelProdutos retornarProdutoDAO(String pNomeProduto){
        ModelProdutos modelProdutos = new ModelProdutos();
        modelProdutos.setAtivo(false);
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_cod_barra "
                    + "FROM tbl_produto WHERE pro_nome = '"+pNomeProduto+"'");
            
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
                modelProdutos.setProCodBarra(this.getResultSet().getString(5));
                modelProdutos.setAtivo(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return modelProdutos;
    }
    
    /**
     * retorna um produto pelo código de barras
     * @param pCodigoBarras
     * @return modelProduto
     */
    public ModelProdutos retornarProdutoCodigoBarrasDAO(String pCodigoBarras){
        ModelProdutos modelProdutos = new ModelProdutos();
        modelProdutos.setAtivo(false);
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque,"
                    + "pro_cod_barra "
                    + "FROM tbl_produto WHERE pro_cod_barra = '"+pCodigoBarras+"'");
            
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
                modelProdutos.setProCodBarra(this.getResultSet().getString(5));
                modelProdutos.setAtivo(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return modelProdutos;
    }
    
    /**
     * Retornar uma lista de produtos
     * @return listaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO(){
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        modelProdutos.setAtivo(false);
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "pro_nome,"
                    + "pro_valor,"
                    + "pro_estoque "
                    + "FROM tbl_produto");
            
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProEstoque(this.getResultSet().getInt(4));
                modelProdutos.setAtivo(true);
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return listaModelProdutos;
    }

    /**
     * Alterar estoque de produtos do banco
     * @param pListaModelProdutos
     * @return boolean
     */
    public boolean alterarEstoqueProdutosDAO(ArrayList<ModelProdutos> pListaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET"
                            + " pro_estoque = '"+pListaModelProdutos.get(i).getProEstoque()+"'"
                            + " WHERE pk_id_produto = '"+pListaModelProdutos.get(i).getIdProduto()+"'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
