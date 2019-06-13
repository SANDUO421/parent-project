package com.sanduo.architecture.dao;

import com.sanduo.architecture.common.dao.BaseDAO;
import com.sanduo.architecture.entity.OrderModel;
import com.sanduo.architecture.entity.OrderQueryModel;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDAO extends BaseDAO<OrderModel, OrderQueryModel> {
	
}
