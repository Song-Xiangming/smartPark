package action;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONObject;
import com.mdd.util.*;
import com.mdd.dao.BaseDAO;
import com.mdd.model.EnergyCollectData;
import com.mdd.model.EnergyCollectMachine;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class QueryDataAction extends ActionSupport {
	public String sqlString = "";
	public String pageSize = "";
	public String page = "";
	public List<EnergyCollectData> list = new ArrayList<EnergyCollectData>();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// list =
		// BaseDAO.query("from EnergyCollectData energyCollectData",null);
		String firstString = sqlString.substring(0, 1);
		firstString = firstString.toLowerCase();
		sqlString = "from " + sqlString + " " + firstString
				+ sqlString.substring(1);
		if(page.equals("")||pageSize.equals(""))
			list = BaseDAO.query(sqlString, null);
		else
			list = BaseDAO.queryByPage(sqlString, null, Integer.parseInt(page),
				Integer.parseInt(pageSize));
		String content = JSONSerializer.serialize(list);
		String totalString = "\'total\':" +  String.valueOf(list.size())
				+ ",";
		content = content.substring(0, 2) + totalString + content.substring(2);
		ServletActionContext.getRequest().setAttribute("content",
				content.replace('\"', '\''));
		return SUCCESS;
	}

	public String getSqlString() {
		return sqlString;
	}

	public void setSqlString(String sqlString) {
		this.sqlString = sqlString;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

}
