package com.sanduo.architecture.dao;

import com.sanduo.architecture.common.dao.BaseDAO;
import com.sanduo.architecture.entity.StoreModel;
import com.sanduo.architecture.entity.StoreQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDAO extends BaseDAO<StoreModel, StoreQueryModel> {
	public StoreModel getByGoodsUuid(int goodsUuid);
}
