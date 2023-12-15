package com.picpay.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.picpaysimplificado.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

    
    
}
