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
		String result = "[" + jsonPart(energyCollectData)+","
				+ jsonPart(energyCollectMachine) + "]";
		ServletActionContext.getRequest().setAttribute("result",result);
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
		return name +":"+result;

	}

}
