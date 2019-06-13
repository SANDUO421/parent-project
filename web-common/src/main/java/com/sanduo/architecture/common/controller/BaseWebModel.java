package com.sanduo.architecture.common.controller;

/**
* @Description:   web和前端交互(分页)结数据
* @Author:         sanduo
* @CreateDate:     2019/6/12 14:34
* @Version:        1.0
*/
public class BaseWebModel {
	
	private String queryJsonStr = "";
	private int nowPage = 1;
	private int pageShow = 0;
	public String getQueryJsonStr() {
		return queryJsonStr;
	}
	public void setQueryJsonStr(String queryJsonStr) {
		this.queryJsonStr = queryJsonStr;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getPageShow() {
		return pageShow;
	}
	public void setPageShow(int pageShow) {
		this.pageShow = pageShow;
	}
	@Override
	public String toString() {
		return "BaseWebModel [queryJsonStr=" + queryJsonStr + ", nowPage="
				+ nowPage + ", pageShow=" + pageShow + "]";
	}
}
