package com.skymart.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductCombination {
    private Integer id;
    private String combination;
    private String sku;
    private Float price;
    private String uniqueStringId;
    private Integer availableStock;
    private Integer productId;
}
