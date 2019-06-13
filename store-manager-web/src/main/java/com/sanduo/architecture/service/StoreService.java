package com.sanduo.architecture.service;


import com.sanduo.architecture.common.service.BaseService;
import com.sanduo.architecture.dao.StoreDAO;
import com.sanduo.architecture.entity.StoreModel;
import com.sanduo.architecture.entity.StoreQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class StoreService extends BaseService<StoreModel, StoreQueryModel> implements IStoreService{
	private StoreDAO dao = null;
	@Autowired
	private void setDao(StoreDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
	public StoreModel getByGoodsUuid(int goodsUuid) {
		return dao.getByGoodsUuid(goodsUuid);
	}
	
}