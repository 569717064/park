package com.woniuxy.web.page;

public class OracleDialect implements Dialect{

	@Override
	public String getPageSql(String sql, int offset, int limit) {
		String returnSQL = "select * from " + 
				"(select *,rownum rn from "+(sql)+" where rownum<"+(offset+limit)+") t " + 
				"where t.rn>"+offset+"" + 
				"";
		return returnSQL;
	}

}
