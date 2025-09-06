package io.eduardo.FSTSales;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import io.eduardo.FSTSales.controller.ProductController;

@SpringBootTest
class FSTSalesTest {

    @Autowired
    private ProductController productController;

    @Test
    void contextLoads() {
        assertThat(productController).isNotNull();
    }

}
