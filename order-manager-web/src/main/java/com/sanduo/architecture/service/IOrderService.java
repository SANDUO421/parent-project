package com.sanduo.architecture.service;


import com.sanduo.architecture.common.service.IBaseService;
import com.sanduo.architecture.entity.OrderModel;
import com.sanduo.architecture.entity.OrderQueryModel;

public interface IOrderService extends IBaseService<OrderModel, OrderQueryModel> {
	public void order(int customerUuid);
}

