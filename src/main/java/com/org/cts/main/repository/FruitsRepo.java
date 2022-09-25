package com.org.cts.main.repository;

import com.org.cts.main.model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitsRepo extends JpaRepository<Fruits, Integer> {
}
