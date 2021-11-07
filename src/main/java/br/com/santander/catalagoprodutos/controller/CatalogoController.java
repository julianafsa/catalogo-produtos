package br.com.santander.catalagoprodutos.controller;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.catalagoprodutos.model.Produto;
import br.com.santander.catalagoprodutos.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class CatalogoController {

	private final ProdutoRepository repository;

	private static final Logger LOG = LoggerFactory.getLogger(CatalogoController.class);

	@Autowired
	public CatalogoController(ProdutoRepository repository) {
		this.repository = repository;
	}

//	@GetMapping("/{id}")
//	public ResponseEntity<ProdutoDTO> buscarProdutoPorId(@PathVariable Long id) {
//		LOG.info("Buscando informação do produto de id " + id);
//		ProdutoDTO dto = repository.findById(id).map(ProdutoDTO::new)
//				.orElseThrow(() -> new EntityNotFoundException("Produto de id " + id + " não existe"));
//		return ResponseEntity.ok(dto);
//	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
		LOG.info("Buscando informação do produto de id " + id);
		Produto dto = repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Produto de id " + id + " não existe"));
		return ResponseEntity.ok(dto);
	}

}
