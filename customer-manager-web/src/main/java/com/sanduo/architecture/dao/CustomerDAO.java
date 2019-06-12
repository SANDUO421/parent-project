package com.sanduo.architecture.dao;

import com.sanduo.architecture.common.dao.BaseDAO;
import com.sanduo.architecture.entity.CustomerModel;
import com.sanduo.architecture.entity.CustomerQueryModel;
import org.springframework.stereotype.Repository;

/**
* @Description:    消费者DAO
* @Author:         sanduo
* @CreateDate:     2019/6/11 17:41
* @Version:        1.0
*/
@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel, CustomerQueryModel> {
	/**
	 * 根据顾客id查询顾客
	 * @param customerId
	 * @return
	 */
	public CustomerModel getByCustomerId(String customerId);
}
