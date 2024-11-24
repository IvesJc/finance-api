package br.com.financeapi.repositories;

import br.com.financeapi.entities.Categories;
import br.com.financeapi.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionsRepository extends JpaRepository<Transactions, UUID> {
}
