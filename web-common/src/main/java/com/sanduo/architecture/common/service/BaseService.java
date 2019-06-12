package com.sanduo.architecture.common.service;

import com.sanduo.architecture.common.dao.BaseDAO;
import com.sanduo.architecture.common.entity.BaseModel;
import com.sanduo.architecture.pageutil.Page;

import java.util.List;
/**
* @Description:    定义service
* @Author:         sanduo
* @CreateDate:     2019/6/11 17:30
* @Version:        1.0
*/
public class BaseService<M, QM extends BaseModel> implements IBaseService<M,QM> {
	/**
	 * 装饰着模式，通过实现类传入
	 */
	private BaseDAO dao = null;
	public void setDAO(BaseDAO dao){
		this.dao = dao;
	}
	public void create(M m) {
		dao.create(m);
	}

	public void update(M m) {
		dao.update(m);
	}

	public void delete(int uuid) {
		dao.delete(uuid);
	}

	public M getByUuid(int uuid) {
		return (M)dao.getByUuid(uuid);
	}

	public Page<M> getByConditionPage(QM qm) {
		List<M> list = dao.getByConditionPage(qm);
		qm.getPage().setResult(list);
		
		return qm.getPage();
	}
}
