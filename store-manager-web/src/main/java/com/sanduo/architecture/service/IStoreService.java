package com.sanduo.architecture.service;


import com.sanduo.architecture.common.service.IBaseService;
import com.sanduo.architecture.entity.StoreModel;
import com.sanduo.architecture.entity.StoreQueryModel;

public interface IStoreService extends IBaseService<StoreModel, StoreQueryModel> {
	public StoreModel getByGoodsUuid(int goodsUuid);
}

