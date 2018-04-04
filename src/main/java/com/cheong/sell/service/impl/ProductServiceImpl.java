package com.cheong.sell.service.impl;

import com.cheong.sell.dataObject.ProductInfo;
import com.cheong.sell.dto.CarDTO;
import com.cheong.sell.enums.ProductStatusEnum;
import com.cheong.sell.enums.ResultEnum;
import com.cheong.sell.exception.SellException;
import com.cheong.sell.repository.ProductInfoRepository;
import com.cheong.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.getOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CarDTO> carDTOList) {

    }

    @Override
    @Transactional
    public void decreaseStock(List<CarDTO> carDTOList) {
        for (CarDTO carDTO : carDTOList) {
            ProductInfo one = repository.getOne(carDTO.getProductId());
            if (one == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIT);
            }
            int result = one.getProductStock() - carDTO.getProductQuantity();
            if (result < 0) {
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            one.setProductStock(result);
            repository.save(one);
        }


    }
}
