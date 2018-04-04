package com.cheong.sell.service;

import com.cheong.sell.dataObject.ProductInfo;
import com.cheong.sell.dto.CarDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {


    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //减库存
    void decreaseStock(List<CarDTO> carDTOList);

    //加库存
    void increaseStock(List<CarDTO> carDTOList);



}
