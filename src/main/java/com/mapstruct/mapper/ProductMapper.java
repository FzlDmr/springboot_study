package com.mapstruct.mapper;

import com.mapstruct.dto.ProductDto;
import com.mapstruct.model.Product;

public interface ProductMapper {

    ProductDto modelToDto(Product product);
    Product dtoToModel(ProductDto productDto);
}
