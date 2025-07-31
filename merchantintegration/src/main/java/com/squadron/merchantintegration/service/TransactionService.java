package com.squadron.merchantintegration.service;

import com.squadron.merchantintegration.model.Transaction;
import com.squadron.merchantintegration.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction initiatePayment(Transaction transaction) {
        transaction.setStatus("INITIATED");
        transaction.setTimestamp(java.time.LocalDateTime.now());
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsByStatus(String status) {
        return transactionRepository.findByStatus(status);
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findById(id);
    }
}

