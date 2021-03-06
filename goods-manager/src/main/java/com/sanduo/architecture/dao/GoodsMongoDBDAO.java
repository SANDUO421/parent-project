package com.sanduo.architecture.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sishuok.architecture1.goodsmgr.vo.GoodsModel;
import com.sishuok.architecture1.goodsmgr.vo.GoodsQueryModel;

public interface GoodsMongoDBDAO extends GoodsDAO{
	public List<Integer> getIdsByConditionPage(GoodsQueryModel gqm);
	public List<GoodsModel> getByIds(String ids);
}
