package com.michaelloi.transaction.repositories;

import com.michaelloi.common.models.entity.TransactionData;
import com.michaelloi.transaction.constants.QueryValues;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class TransactionRepositories {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertTransactional(TransactionData transactionData) {
        entityManager.createNativeQuery(QueryValues.insertTransaction)
            .setParameter(1, transactionData.getTransactionId())
            .setParameter(2, transactionData.getTransactionType())
            .setParameter(3, transactionData.getTransactionFromCcy())
            .setParameter(4, transactionData.getTransactionFromAmount())
            .setParameter(5, transactionData.getTransactionToCcy())
            .setParameter(6, transactionData.getTransactionToAmount())
            .setParameter(7, transactionData.getTransactionPrice())
            .setParameter(8, transactionData.getTransactionTotalPrice())
            .setParameter(9, transactionData.getTransactionDate())
            .setParameter(10, transactionData.getAccountNo())
            .setParameter(11, transactionData.isSuccess())
            .executeUpdate();
    }
}
