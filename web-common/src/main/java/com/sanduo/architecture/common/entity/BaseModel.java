package com.sanduo.architecture.common.entity;

import com.sanduo.architecture.pageutil.Page;

/**
* @Description:    基本model
* @Author:         sanduo
* @CreateDate:     2019/6/11 17:38
* @Version:        1.0
*/
public class BaseModel implements java.io.Serializable{
	
	private Integer uuid;
	private Page page = new Page();

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}

	public Integer getUuid() {
		return uuid;
	}
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseModel other = (BaseModel) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}
}
