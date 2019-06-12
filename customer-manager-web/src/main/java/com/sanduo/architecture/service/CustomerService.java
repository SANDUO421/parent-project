package com.sanduo.architecture.service;

import com.sanduo.architecture.common.service.BaseService;
import com.sanduo.architecture.dao.CustomerDAO;
import com.sanduo.architecture.entity.CustomerModel;
import com.sanduo.architecture.entity.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @Description:    java类作用描述
* @Author:         sanduo
* @CreateDate:     2019/6/12 9:20
* @Version:        1.0
*/
@Service
@Transactional
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService{
	private CustomerDAO dao = null;
	@Autowired
	private void setDao(CustomerDAO dao){
		this.dao = dao;
		//必须给父类传入
		super.setDAO(dao);
	}
	public CustomerModel getByCustomerId(String customerId) {
		return dao.getByCustomerId(customerId);
	}

}
