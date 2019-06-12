package com.sanduo.architecture.common.dao;

import java.util.List;

/**
* @Description:    基本的CRUD
* @Author:         sanduo
* @CreateDate:     2019/6/11 17:25
* @Version:        1.0
*/
public interface BaseDAO<M,QM>{

	/**
	 * 创建
	 * @param m
	 */
	public void create(M m);

	/**
	 * 修改
	 * @param m
	 */
	public void update(M m);

	/**
	 * 删除
	 * @param uuid
	 */
	public void delete(int uuid);

	/**
	 * uuid获取
	 * @param uuid
	 * @return
	 */
	public M getByUuid(int uuid);

	/**
	 * 条件查询
	 * @param qm
	 * @return
	 */
	public List<M> getByConditionPage(QM qm);
}
