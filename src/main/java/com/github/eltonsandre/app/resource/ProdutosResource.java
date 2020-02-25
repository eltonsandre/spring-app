package com.github.eltonsandre.app.resource;

import com.github.eltonsandre.app.model.Produto;
import com.github.eltonsandre.app.repository.ProdutosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

    @Autowired
    private ProdutosRepository repository;

    @GetMapping
    public ResponseEntity<List<Produto>> produtos() {
        return ResponseEntity.ok(this.repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Produto> newProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(this.repository.save(produto));
    }
}
