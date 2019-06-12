package com.sanduo.architecture.common.service;

import com.sanduo.architecture.common.entity.BaseModel;
import com.sanduo.architecture.pageutil.Page;

/**
* @Description:   定义IBaseService
* @Author:         sanduo
* @CreateDate:     2019/6/11 17:29
* @Version:        1.0
*/
public interface IBaseService<M,QM extends BaseModel> {
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
	 * 根据id查询
	 * @param uuid
	 * @return
	 */
	public M getByUuid(int uuid);

	/**
	 * 查询条件分页查询
	 * @param qm
	 * @return
	 */
	public Page<M> getByConditionPage(QM qm);
}
