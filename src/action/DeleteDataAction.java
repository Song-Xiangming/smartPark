package action;

import com.mdd.dao.BaseDAO;
import com.mdd.model.EnergyCollectData;
import com.mdd.model.EnergyCollectMachine;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteDataAction extends ActionSupport{
	EnergyCollectData energyCollectData = new EnergyCollectData();
	EnergyCollectMachine energyCollectMachine = new EnergyCollectMachine();
	int targetString = 0;

	public EnergyCollectMachine getEnergyCollectMachine() {
		targetString = 2;
		return energyCollectMachine;
	}

	public void setEnergyCollectMachine(
			EnergyCollectMachine energyCollectMachine) {
		this.energyCollectMachine = energyCollectMachine;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		switch (targetString) {
		case 1:
			b = BaseDAO.delete(energyCollectData);
			break;

		case 2:
			b = BaseDAO.delete(energyCollectData);
			break;

		default:
			break;
		}

		if (b)
			return SUCCESS;
		else
			return ERROR;

	}

	public EnergyCollectData getEnergyCollectData() {
		targetString = 1;
		return energyCollectData;
	}

	public void setEnergyCollectData(EnergyCollectData energyCollectData) {
		this.energyCollectData = energyCollectData;
	}
}
