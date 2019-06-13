package com.sanduo.architecture.service;


import com.sanduo.architecture.common.service.BaseService;
import com.sanduo.architecture.dao.OrderDetailDAO;
import com.sanduo.architecture.entity.OrderDetailModel;
import com.sanduo.architecture.entity.OrderDetailQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class OrderDetailService extends BaseService<OrderDetailModel, OrderDetailQueryModel> implements IOrderDetailService{
	private OrderDetailDAO dao = null;
	@Autowired
	private void setDao(OrderDetailDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}