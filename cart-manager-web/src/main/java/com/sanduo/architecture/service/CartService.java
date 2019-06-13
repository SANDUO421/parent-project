package com.sanduo.architecture.service;


import com.sanduo.architecture.common.service.BaseService;
import com.sanduo.architecture.dao.CartDAO;
import com.sanduo.architecture.entity.CartModel;
import com.sanduo.architecture.entity.CartQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CartService extends BaseService<CartModel, CartQueryModel> implements ICartService{
	private CartDAO dao = null;
	@Autowired
	private void setDao(CartDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	
}