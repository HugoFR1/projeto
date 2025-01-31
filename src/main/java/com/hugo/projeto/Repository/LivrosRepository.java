package com.hugo.projeto.Repository;

import com.hugo.projeto.entity.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<LivrosEntity, Long> {
}
