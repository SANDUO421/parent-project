package com.sanduo.architecture.service;


import com.sanduo.architecture.common.service.IBaseService;
import com.sanduo.architecture.entity.CustomerModel;
import com.sanduo.architecture.entity.CustomerQueryModel;

/**
* @Description:    service
* @Author:         sanduo
* @CreateDate:     2019/6/12 9:20
* @Version:        1.0
*/
public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel> {
	public CustomerModel getByCustomerId(String customerId);
}
