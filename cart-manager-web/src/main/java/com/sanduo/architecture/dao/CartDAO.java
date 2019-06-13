package com.sanduo.architecture.dao;

import com.sanduo.architecture.common.dao.BaseDAO;
import com.sanduo.architecture.entity.CartModel;
import com.sanduo.architecture.entity.CartQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDAO extends BaseDAO<CartModel, CartQueryModel> {
	
}
