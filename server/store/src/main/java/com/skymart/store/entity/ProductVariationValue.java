package com.skymart.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVariationValue {
    private Integer id;
    private String variationValue;
    private Integer productVariationId;
}
