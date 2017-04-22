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
		list = BaseDAO.query(sqlString, null);
		// List<Object> list = new ArrayList<Object>();
		// list.add(new EnergyCollectData());
		// list.add(new EnergyCollectMachine());
		String content = JSONSerializer.serialize(list);
		ServletActionContext.getRequest().setAttribute("content", content.replace('\"','\''));
		return SUCCESS;
	}

	public String getSqlString() {
		return sqlString;
	}

	public void setSqlString(String sqlString) {
		this.sqlString = sqlString;
	}

}
