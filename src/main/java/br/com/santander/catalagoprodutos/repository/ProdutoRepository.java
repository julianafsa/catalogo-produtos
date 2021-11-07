package br.com.santander.catalagoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.catalagoprodutos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
