package com.skymart.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductStock {
    private Integer id;
    private Integer totalStock;
    private Float unitPrice;
    private Float totalPrice;
    private Integer productCombinationId;
}
