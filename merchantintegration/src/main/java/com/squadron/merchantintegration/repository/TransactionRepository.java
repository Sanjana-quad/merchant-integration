package com.squadron.merchantintegration.repository;

import com.squadron.merchantintegration.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    List<Transaction> findByStatus(String status);
}
