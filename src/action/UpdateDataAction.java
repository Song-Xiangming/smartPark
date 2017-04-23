package action;

import com.mdd.dao.BaseDAO;
import com.mdd.model.EnergyCollectData;
import com.mdd.model.EnergyCollectMachine;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateDataAction extends ActionSupport{
	EnergyCollectData energyCollectData = new EnergyCollectData();
	EnergyCollectMachine energyCollectMachine = new EnergyCollectMachine();
	int targetString = 0;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		switch (targetString) {
		case 1:
			b = BaseDAO.update(energyCollectData);
			break;

		case 2:
			b = BaseDAO.update(energyCollectMachine);
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
	
	public EnergyCollectMachine getEnergyCollectMachine() {
		targetString = 2;
		return energyCollectMachine;
	}

	public void setEnergyCollectMachine(
			EnergyCollectMachine energyCollectMachine) {
		this.energyCollectMachine = energyCollectMachine;
	}
	
}
