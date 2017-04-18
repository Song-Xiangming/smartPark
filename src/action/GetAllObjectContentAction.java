package action;

import org.apache.struts2.ServletActionContext;

import com.mdd.model.EnergyCollectData;
import com.mdd.model.EnergyCollectMachine;
import com.mdd.util.JSONSerializer;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllObjectContentAction extends ActionSupport {
	public EnergyCollectData energyCollectData = new EnergyCollectData();
	public EnergyCollectMachine energyCollectMachine = new EnergyCollectMachine();

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String result = "{" + jsonPart(energyCollectData)+","
				+ jsonPart(energyCollectMachine) + "}";
		ServletActionContext.getRequest().setAttribute("result",result);
		// mock数据
		ServletActionContext.getRequest().setAttribute("name","采集点数据,编号,采集值,采集ID,创建时间,数据序列,eid,是否移除,取样时间,地点ID,分系统ID,终点ID,上传类型;能源采集机器,创建人,创建时间,eid,经度,纬度,机器地址,机器编码,机器名,机器类型,是否移除,更新人,更新时间");
		return SUCCESS;
	}
	private String jsonPart(Object o) {
		String result = JSONSerializer.serialize(o);
		int length = result.length();
		if (length > 2)
			result.subSequence(1, length - 2);
		else
			result = "";
		String name = o.getClass().getSimpleName();
		String firstString = name.substring(0, 1);
		firstString = firstString.toLowerCase();
		name = firstString + name.substring(1);
		return ("\"" + name + "\"" +":"+result).replace('\"','\'');
	}

}
