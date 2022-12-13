package br.com.alura.loja.testes;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class AtualizarProduto {
    public static void main(String[] args) {
        Long id = 1l;
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto produto = produtoDao.buscarPorId(id);
        em.getTransaction().begin();
        produtoDao.atualizar(produto);
        produto.setPreco(new BigDecimal("1000"));
        em.getTransaction().commit();
        em.close();

    }
}
