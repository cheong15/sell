package com.cheong.sell.service;

import com.cheong.sell.dataObject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);

    ProductCategory save(ProductCategory productCategory);

}
