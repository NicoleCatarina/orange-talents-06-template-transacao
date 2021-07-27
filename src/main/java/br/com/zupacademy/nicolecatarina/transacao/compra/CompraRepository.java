package br.com.zupacademy.nicolecatarina.transacao.compra;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, String> {

    List<Compra> findTop10ByIdentificadorCartaoOrderByEfetivadaEmDesc(String identificadorCartao);


}
