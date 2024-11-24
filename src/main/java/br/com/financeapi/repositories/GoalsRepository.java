package br.com.financeapi.repositories;

import br.com.financeapi.entities.Goals;
import br.com.financeapi.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GoalsRepository extends JpaRepository<Goals, UUID> {
}
