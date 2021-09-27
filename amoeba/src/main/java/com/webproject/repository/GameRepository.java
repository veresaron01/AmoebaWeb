package com.webproject.repository;

import com.webproject.domain.GameTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameTable, Long> {
}
