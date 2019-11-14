package com.woniuxy.web.page;

public interface Dialect{
	public String getPageSql(String sql,int offset,int limit);
}
