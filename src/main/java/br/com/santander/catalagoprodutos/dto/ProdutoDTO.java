package br.com.santander.catalagoprodutos.dto;

import java.math.BigDecimal;

import br.com.santander.catalagoprodutos.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ProdutoDTO {
	
	private String nome;
	private String descricao;
	private BigDecimal preco;
	
	public ProdutoDTO(Produto produto) {
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.preco = produto.getPreco();
	}

}
