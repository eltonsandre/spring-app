package com.github.eltonsandre.app.repository;

import com.github.eltonsandre.app.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, String> {
}
