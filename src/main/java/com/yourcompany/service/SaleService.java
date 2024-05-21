package com.yourcompany.service;

import com.yourcompany.model.Sale;
import com.yourcompany.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public Sale createSale(Sale sale) {
        // Your business logic for creating a sale
        return saleRepository.save(sale);
    }

    // Other methods for sale operations
}
