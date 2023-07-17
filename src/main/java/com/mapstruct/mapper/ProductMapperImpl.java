package com.mapstruct.mapper;

import com.mapstruct.dto.ProductDto;
import com.mapstruct.model.Product;

public class ProductMapperImpl implements ProductMapper{
    @Override
    public ProductDto modelToDto(Product product) {

        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());

        return productDto;
    }

    @Override
    public Product dtoToModel(ProductDto productDto) {

        Product product = new Product();
        product.setId(product.getId());
        product.setName(product.getName());
        product.setPrice(product.getPrice());
        product.setQuantity(product.getQuantity());

        return product;
    }
}
