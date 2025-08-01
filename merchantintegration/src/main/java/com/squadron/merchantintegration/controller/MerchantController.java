package com.squadron.merchantintegration.controller;

import com.squadron.merchantintegration.model.Merchant;
import com.squadron.merchantintegration.model.Transaction;
import com.squadron.merchantintegration.service.MerchantService;
import com.squadron.merchantintegration.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @Autowired
    private TransactionService transactionService;


//    @PostMapping("/registerMerchant")
//    public Merchant registerMerchant(@RequestBody Merchant merchant) {
//        return merchantService.registerMerchant(merchant);
//    }
    @PostMapping("/registerMerchant")
    public ResponseEntity<Merchant> registerMerchant(@Valid @RequestBody Merchant merchant) {
        Merchant savedMerchant = merchantService.registerMerchant(merchant);
        return ResponseEntity.ok(savedMerchant);
    }

    @GetMapping("/merchantByEmail")
    public Optional<Merchant> getMerchantByEmail(@RequestParam String email) {
        return merchantService.findMerchantByEmail(email);
    }

    @PostMapping("/initiatePayment")
    public Transaction initiatePayment(@RequestBody Transaction transaction) {
        return transactionService.initiatePayment(transaction);
    }

    @GetMapping("/transactionsByStatus")
    public List<Transaction> getTransactionsByStatus(@RequestParam String status) {
        return transactionService.getTransactionsByStatus(status);
    }

    @GetMapping("/getTransactionStatus")
    public Optional<Transaction> getTransactionById(@RequestParam Long id) {
        return transactionService.getTransactionById(id);
    }
}
