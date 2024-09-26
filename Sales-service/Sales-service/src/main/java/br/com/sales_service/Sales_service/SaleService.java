package br.com.sales_service.Sales_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductClient productClient;

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Sale saveSale(Sale sale) {
        Product product = productClient.getProductById(sale.getProductId());
        sale.setTotalPrice(product.getPrice() * sale.getQuantity());
        return saleRepository.save(sale);
    }
}
