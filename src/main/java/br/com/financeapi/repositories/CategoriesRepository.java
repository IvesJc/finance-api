package br.com.financeapi.repositories;

import br.com.financeapi.entities.Categories;
import br.com.financeapi.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoriesRepository extends JpaRepository<Categories, UUID> {
}
