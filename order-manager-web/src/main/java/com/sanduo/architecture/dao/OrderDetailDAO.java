package com.sanduo.architecture.dao;

import com.sanduo.architecture.common.dao.BaseDAO;
import com.sanduo.architecture.entity.OrderDetailModel;
import com.sanduo.architecture.entity.OrderDetailQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailDAO extends BaseDAO<OrderDetailModel, OrderDetailQueryModel> {
	
}
