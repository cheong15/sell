package com.cheong.sell.dto;

import com.cheong.sell.enums.OrderDetail;
import lombok.Data;

import java.util.List;

@Data
public class OrderDTO extends OrderDetail{

    private List<OrderDetail> orderDetailList;

}
