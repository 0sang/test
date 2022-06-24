package com.test.loadingTest.repository;

import com.test.loadingTest.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
