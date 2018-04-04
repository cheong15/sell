package com.cheong.sell.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name="product_category")
@DynamicUpdate
@Data
public class ProductCategory {

    public ProductCategory() {
    }

    /**
     * 类目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    /**
     * 类目名字
     */
    private String categoryName;


    /**
     * 类目编号
     */
    private Integer categoryType;

}