package com.example.bytemybudget.repository;

import com.example.bytemybudget.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByUserId(Long userId);

    List<Expense> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    Optional<Expense> findByIdAndUserId(Long id, Long userId);

}
