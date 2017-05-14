package action;

import com.mdd.dao.BaseDAO;
import com.mdd.model.*;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateDataAction extends ActionSupport {
	public EnergyAlarmInterval energyAlarmInterval = new EnergyAlarmInterval();
	public EnergyCollectData energyCollectData = new EnergyCollectData();
	public EnergyCollectMachine energyCollectMachine = new EnergyCollectMachine();
	public EnergyCollectSpot energyCollectSpot = new EnergyCollectSpot();
	public EnergyConsumptionDataRed energyConsumptionDataRed = new EnergyConsumptionDataRed();
	public EnergyConsumptionRecord energyConsumptionRecord = new EnergyConsumptionRecord();
	public EnergyEnterpriseInfo energyEnterpriseInfo = new EnergyEnterpriseInfo();
	public EnergyEnterprisePosition energyEnterprisePosition = new EnergyEnterprisePosition();
	public EnergyEnterpriseTarget energyEnterpriseTarget = new EnergyEnterpriseTarget();
	public EnergyEntMonthReport energyEntMonthReport = new EnergyEntMonthReport();
	public EnergyEntYearReport energyEntYearReport = new EnergyEntYearReport();
	public EnergyGardenTarget energyGardenTarget = new EnergyGardenTarget();
	public EnergyMessageRelEnt energyMessageRelEnt = new EnergyMessageRelEnt();
	public EnergyMeterDevice energyMeterDevice = new EnergyMeterDevice();
	public EnergyRawCoal energyRawCoal = new EnergyRawCoal();
	public EnergyStaticData energyStaticData = new EnergyStaticData();
	public EnergySynthesizeEnergyUse energySynthesizeEnergyUse = new EnergySynthesizeEnergyUse();
	public EnergyTerminal energyTerminal = new EnergyTerminal();
	public EnergyTradeFile energyTradeFile = new EnergyTradeFile();
	public EnergyTradeInfo energyTradeInfo = new EnergyTradeInfo();
	public EnergyUseAudit energyUseAudit = new EnergyUseAudit();
	public EnergyUseAuditRecord energyUseAuditRecord = new EnergyUseAuditRecord();
	public EnergyUseEnergyEquipment energyUseEnergyEquipment = new EnergyUseEnergyEquipment();
	public EnergyVapour energyVapour = new EnergyVapour();
	public EnergyWaterMeter energyWaterMeter = new EnergyWaterMeter();
	public EneSupEneUnitRelFile eneSupEneUnitRelFile = new EneSupEneUnitRelFile();
	public EneUseEneEquipmentFile eneUseEneEquipmentFile = new EneUseEneEquipmentFile();
	public EnvCoreAreas envCoreAreas = new EnvCoreAreas();
	public EnvCoreControlZone envCoreControlZone = new EnvCoreControlZone();
	public EnvCoreDischargeOutletInfo envCoreDischargeOutletInfo = new EnvCoreDischargeOutletInfo();
	public EnvCoreDischargeRule envCoreDischargeRule = new EnvCoreDischargeRule();
	public EnvCoreEmergencyPlan envCoreEmergencyPlan = new EnvCoreEmergencyPlan();
	public EnvCoreEnterpriseInfo envCoreEnterpriseInfo = new EnvCoreEnterpriseInfo();
	public EnvCoreEnterpriseKind envCoreEnterpriseKind = new EnvCoreEnterpriseKind();
	public EnvCoreEnterpriseScale envCoreEnterpriseScale = new EnvCoreEnterpriseScale();
	public EnvCoreEnterpriseType envCoreEnterpriseType = new EnvCoreEnterpriseType();
	public EnvCoreEntPollutant envCoreEntPollutant = new EnvCoreEntPollutant();
	public EnvCoreFuelType envCoreFuelType = new EnvCoreFuelType();
	public EnvCoreGasFunctionType envCoreGasFunctionType = new EnvCoreGasFunctionType();
	public EnvCoreIndustryCategory envCoreIndustryCategory = new EnvCoreIndustryCategory();
	public EnvCoreKeyPointType envCoreKeyPointType = new EnvCoreKeyPointType();
	public EnvCoreLetoutStateControl envCoreLetoutStateControl = new EnvCoreLetoutStateControl();
	public EnvCoreOutletType envCoreOutletType = new EnvCoreOutletType();
	public EnvCorePollStandardLimit envCorePollStandardLimit = new EnvCorePollStandardLimit();
	public EnvCorePollutant envCorePollutant = new EnvCorePollutant();
	public EnvCorePollutantType envCorePollutantType = new EnvCorePollutantType();
	public EnvCorePollutantUnit envCorePollutantUnit = new EnvCorePollutantUnit();
	public EnvCoreRadiateSafetyPermit envCoreRadiateSafetyPermit = new EnvCoreRadiateSafetyPermit();
	public EnvCoreRadioactiveSource envCoreRadioactiveSource = new EnvCoreRadioactiveSource();
	public EnvCoreRayDevice envCoreRayDevice = new EnvCoreRayDevice();
	public EnvCoreRegisterType envCoreRegisterType = new EnvCoreRegisterType();
	public EnvCoreSewageDischarge envCoreSewageDischarge = new EnvCoreSewageDischarge();
	public EnvCoreSubordination envCoreSubordination = new EnvCoreSubordination();
	public EnvCoreValley envCoreValley = new EnvCoreValley();
	public EnvCoreValleyFunctionType envCoreValleyFunctionType = new EnvCoreValleyFunctionType();
	public EnvMonitorAlarmLog envMonitorAlarmLog = new EnvMonitorAlarmLog();
	public EnvMonitorAlarmRegistForm envMonitorAlarmRegistForm = new EnvMonitorAlarmRegistForm();
	public EnvMonitorGasAlarm24hours envMonitorGasAlarm24hours = new EnvMonitorGasAlarm24hours();
	public LgtAlarmManage lgtAlarmManage = new LgtAlarmManage();
	public LgtAlarmThreshold lgtAlarmThreshold = new LgtAlarmThreshold();
	public LgtAlarmTimes lgtAlarmTimes = new LgtAlarmTimes();
	public LgtBlacklistManage lgtBlacklistManage = new LgtBlacklistManage();
	public LgtCarDispatch lgtCarDispatch = new LgtCarDispatch();
	public LgtCarRealTimePostion lgtCarRealTimePostion = new LgtCarRealTimePostion();
	public LgtDanCarAttRel lgtDanCarAttRel = new LgtDanCarAttRel();
	public LgtDangerousCarInfo lgtDangerousCarInfo = new LgtDangerousCarInfo();
	public LgtEmergencyInfo lgtEmergencyInfo = new LgtEmergencyInfo();
	public LgtEnterprise lgtEnterprise = new LgtEnterprise();
	public LgtKaOpen lgtKaOpen = new LgtKaOpen();
	public LgtParkArea lgtParkArea = new LgtParkArea();
	public LgtRestrictedAreaInfo lgtRestrictedAreaInfo = new LgtRestrictedAreaInfo();
	public LgtSolveRoute lgtSolveRoute = new LgtSolveRoute();
	public LgtSourceGoods lgtSourceGoods = new LgtSourceGoods();
	public LgtSourceGoodsInfo lgtSourceGoodsInfo = new LgtSourceGoodsInfo();
	public LgtWaybillGoods lgtWaybillGoods = new LgtWaybillGoods();
	public LgtWaybillGoodsTemplate lgtWaybillGoodsTemplate = new LgtWaybillGoodsTemplate();
	public LgtWaybillInfo lgtWaybillInfo = new LgtWaybillInfo();
	public SecCEiAccidents secCEiAccidents = new SecCEiAccidents();
	public SecCEiAdmiliceinfo secCEiAdmiliceinfo = new SecCEiAdmiliceinfo();
	public SecCEiChemical secCEiChemical = new SecCEiChemical();
	public SecCEiDangerindustry secCEiDangerindustry = new SecCEiDangerindustry();
	public SecCEiDangsrc secCEiDangsrc = new SecCEiDangsrc();
	public SecCEiEnterpriseaudit secCEiEnterpriseaudit = new SecCEiEnterpriseaudit();
	public SecCEiEnterpriseinfo secCEiEnterpriseinfo = new SecCEiEnterpriseinfo();
	public SecCEiFireworksindustry secCEiFireworksindustry = new SecCEiFireworksindustry();
	public SecCEiKeyplace secCEiKeyplace = new SecCEiKeyplace();
	public SecCEiSecucheck secCEiSecucheck = new SecCEiSecucheck();
	public SecCEiStand secCEiStand = new SecCEiStand();
	public SecCStEntsafescore secCStEntsafescore = new SecCStEntsafescore();
	public EnergySupplyEnergyUnitData energySupplyEnergyUnitData = new EnergySupplyEnergyUnitData();
	public LgtPipeLocation lgtPipeLocation = new LgtPipeLocation();
	public LgtPipeManage lgtPipeManage = new LgtPipeManage();
	int targetString = 0;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean b = false;
		switch (targetString) {
		case 1:
			b = BaseDAO.update(energyAlarmInterval);
			break;
		case 2:
			b = BaseDAO.update(energyCollectData);
			break;
		case 3:
			b = BaseDAO.update(energyCollectMachine);
			break;
		case 4:
			b = BaseDAO.update(energyCollectSpot);
			break;
		case 5:
			b = BaseDAO.update(energyConsumptionDataRed);
			break;
		case 6:
			b = BaseDAO.update(energyConsumptionRecord);
			break;
		case 7:
			b = BaseDAO.update(energyEnterpriseInfo);
			break;
		case 8:
			b = BaseDAO.update(energyEnterprisePosition);
			break;
		case 9:
			b = BaseDAO.update(energyEnterpriseTarget);
			break;
		case 10:
			b = BaseDAO.update(energyEntMonthReport);
			break;
		case 11:
			b = BaseDAO.update(energyEntYearReport);
			break;
		case 12:
			b = BaseDAO.update(energyGardenTarget);
			break;
		case 13:
			b = BaseDAO.update(energyMessageRelEnt);
			break;
		case 14:
			b = BaseDAO.update(energyMeterDevice);
			break;
		case 15:
			b = BaseDAO.update(energyRawCoal);
			break;
		case 16:
			b = BaseDAO.update(energyStaticData);
			break;
		case 17:
			b = BaseDAO.update(energySynthesizeEnergyUse);
			break;
		case 18:
			b = BaseDAO.update(energyTerminal);
			break;
		case 19:
			b = BaseDAO.update(energyTradeFile);
			break;
		case 20:
			b = BaseDAO.update(energyTradeInfo);
			break;
		case 21:
			b = BaseDAO.update(energyUseAudit);
			break;
		case 22:
			b = BaseDAO.update(energyUseAuditRecord);
			break;
		case 23:
			b = BaseDAO.update(energyUseEnergyEquipment);
			break;
		case 24:
			b = BaseDAO.update(energyVapour);
			break;
		case 25:
			b = BaseDAO.update(energyWaterMeter);
			break;
		case 26:
			b = BaseDAO.update(eneSupEneUnitRelFile);
			break;
		case 27:
			b = BaseDAO.update(eneUseEneEquipmentFile);
			break;
		case 28:
			b = BaseDAO.update(envCoreAreas);
			break;
		case 29:
			b = BaseDAO.update(envCoreControlZone);
			break;
		case 30:
			b = BaseDAO.update(envCoreDischargeOutletInfo);
			break;
		case 31:
			b = BaseDAO.update(envCoreDischargeRule);
			break;
		case 32:
			b = BaseDAO.update(envCoreEmergencyPlan);
			break;
		case 33:
			b = BaseDAO.update(envCoreEnterpriseInfo);
			break;
		case 34:
			b = BaseDAO.update(envCoreEnterpriseKind);
			break;
		case 35:
			b = BaseDAO.update(envCoreEnterpriseScale);
			break;
		case 36:
			b = BaseDAO.update(envCoreEnterpriseType);
			break;
		case 37:
			b = BaseDAO.update(envCoreEntPollutant);
			break;
		case 38:
			b = BaseDAO.update(envCoreFuelType);
			break;
		case 39:
			b = BaseDAO.update(envCoreGasFunctionType);
			break;
		case 40:
			b = BaseDAO.update(envCoreIndustryCategory);
			break;
		case 41:
			b = BaseDAO.update(envCoreKeyPointType);
			break;
		case 42:
			b = BaseDAO.update(envCoreLetoutStateControl);
			break;
		case 43:
			b = BaseDAO.update(envCoreOutletType);
			break;
		case 44:
			b = BaseDAO.update(envCorePollStandardLimit);
			break;
		case 45:
			b = BaseDAO.update(envCorePollutant);
			break;
		case 46:
			b = BaseDAO.update(envCorePollutantType);
			break;
		case 47:
			b = BaseDAO.update(envCorePollutantUnit);
			break;
		case 48:
			b = BaseDAO.update(envCoreRadiateSafetyPermit);
			break;
		case 49:
			b = BaseDAO.update(envCoreRadioactiveSource);
			break;
		case 50:
			b = BaseDAO.update(envCoreRayDevice);
			break;
		case 51:
			b = BaseDAO.update(envCoreRegisterType);
			break;
		case 52:
			b = BaseDAO.update(envCoreSewageDischarge);
			break;
		case 53:
			b = BaseDAO.update(envCoreSubordination);
			break;
		case 54:
			b = BaseDAO.update(envCoreValley);
			break;
		case 55:
			b = BaseDAO.update(envCoreValleyFunctionType);
			break;
		case 56:
			b = BaseDAO.update(envMonitorAlarmLog);
			break;
		case 57:
			b = BaseDAO.update(envMonitorAlarmRegistForm);
			break;
		case 58:
			b = BaseDAO.update(envMonitorGasAlarm24hours);
			break;
		case 59:
			b = BaseDAO.update(lgtAlarmManage);
			break;
		case 60:
			b = BaseDAO.update(lgtAlarmThreshold);
			break;
		case 61:
			b = BaseDAO.update(lgtAlarmTimes);
			break;
		case 62:
			b = BaseDAO.update(lgtBlacklistManage);
			break;
		case 63:
			b = BaseDAO.update(lgtCarDispatch);
			break;
		case 64:
			b = BaseDAO.update(lgtCarRealTimePostion);
			break;
		case 65:
			b = BaseDAO.update(lgtDanCarAttRel);
			break;
		case 66:
			b = BaseDAO.update(lgtDangerousCarInfo);
			break;
		case 67:
			b = BaseDAO.update(lgtEmergencyInfo);
			break;
		case 68:
			b = BaseDAO.update(lgtEnterprise);
			break;
		case 69:
			b = BaseDAO.update(lgtKaOpen);
			break;
		case 70:
			b = BaseDAO.update(lgtParkArea);
			break;
		case 71:
			b = BaseDAO.update(lgtRestrictedAreaInfo);
			break;
		case 72:
			b = BaseDAO.update(lgtSolveRoute);
			break;
		case 73:
			b = BaseDAO.update(lgtSourceGoods);
			break;
		case 74:
			b = BaseDAO.update(lgtSourceGoodsInfo);
			break;
		case 75:
			b = BaseDAO.update(lgtWaybillGoods);
			break;
		case 76:
			b = BaseDAO.update(lgtWaybillGoodsTemplate);
			break;
		case 77:
			b = BaseDAO.update(lgtWaybillInfo);
			break;
		case 78:
			b = BaseDAO.update(secCEiAccidents);
			break;
		case 79:
			b = BaseDAO.update(secCEiAdmiliceinfo);
			break;
		case 80:
			b = BaseDAO.update(secCEiChemical);
			break;
		case 81:
			b = BaseDAO.update(secCEiDangerindustry);
			break;
		case 82:
			b = BaseDAO.update(secCEiDangsrc);
			break;
		case 83:
			b = BaseDAO.update(secCEiEnterpriseaudit);
			break;
		case 84:
			b = BaseDAO.update(secCEiEnterpriseinfo);
			break;
		case 85:
			b = BaseDAO.update(secCEiFireworksindustry);
			break;
		case 86:
			b = BaseDAO.update(secCEiKeyplace);
			break;
		case 87:
			b = BaseDAO.update(secCEiSecucheck);
			break;
		case 88:
			b = BaseDAO.update(secCEiStand);
			break;
		case 89:
			b = BaseDAO.update(secCStEntsafescore);
			break;
		case 90:
			b = BaseDAO.update(energySupplyEnergyUnitData);
			break;
		case 91:
			b = BaseDAO.update(lgtPipeLocation);
			break;
		case 92:
			b = BaseDAO.update(lgtPipeManage);
			break;
		default:
			break;
		}

		if (b)
			return SUCCESS;
		else
			return ERROR;

	}

	public EnergyAlarmInterval getEnergyAlarmInterval() {
		targetString = 1;
		return energyAlarmInterval;
	}

	public void setEnergyAlarmInterval(EnergyAlarmInterval energyAlarmInterval) {
		this.energyAlarmInterval = energyAlarmInterval;
	}

	public EnergyCollectData getEnergyCollectData() {
		targetString = 2;
		return energyCollectData;
	}

	public void setEnergyCollectData(EnergyCollectData energyCollectData) {
		this.energyCollectData = energyCollectData;
	}

	public EnergyCollectMachine getEnergyCollectMachine() {
		targetString = 3;
		return energyCollectMachine;
	}

	public void setEnergyCollectMachine(
			EnergyCollectMachine energyCollectMachine) {
		this.energyCollectMachine = energyCollectMachine;
	}

	public EnergyCollectSpot getEnergyCollectSpot() {
		targetString = 4;
		return energyCollectSpot;
	}

	public void setEnergyCollectSpot(EnergyCollectSpot energyCollectSpot) {
		this.energyCollectSpot = energyCollectSpot;
	}

	public EnergyConsumptionDataRed getEnergyConsumptionDataRed() {
		targetString = 5;
		return energyConsumptionDataRed;
	}

	public void setEnergyConsumptionDataRed(
			EnergyConsumptionDataRed energyConsumptionDataRed) {
		this.energyConsumptionDataRed = energyConsumptionDataRed;
	}

	public EnergyConsumptionRecord getEnergyConsumptionRecord() {
		targetString = 6;
		return energyConsumptionRecord;
	}

	public void setEnergyConsumptionRecord(
			EnergyConsumptionRecord energyConsumptionRecord) {
		this.energyConsumptionRecord = energyConsumptionRecord;
	}

	public EnergyEnterpriseInfo getEnergyEnterpriseInfo() {
		targetString = 7;
		return energyEnterpriseInfo;
	}

	public void setEnergyEnterpriseInfo(
			EnergyEnterpriseInfo energyEnterpriseInfo) {
		this.energyEnterpriseInfo = energyEnterpriseInfo;
	}

	public EnergyEnterprisePosition getEnergyEnterprisePosition() {
		targetString = 8;
		return energyEnterprisePosition;
	}

	public void setEnergyEnterprisePosition(
			EnergyEnterprisePosition energyEnterprisePosition) {
		this.energyEnterprisePosition = energyEnterprisePosition;
	}

	public EnergyEnterpriseTarget getEnergyEnterpriseTarget() {
		targetString = 9;
		return energyEnterpriseTarget;
	}

	public void setEnergyEnterpriseTarget(
			EnergyEnterpriseTarget energyEnterpriseTarget) {
		this.energyEnterpriseTarget = energyEnterpriseTarget;
	}

	public EnergyEntMonthReport getEnergyEntMonthReport() {
		targetString = 10;
		return energyEntMonthReport;
	}

	public void setEnergyEntMonthReport(
			EnergyEntMonthReport energyEntMonthReport) {
		this.energyEntMonthReport = energyEntMonthReport;
	}

	public EnergyEntYearReport getEnergyEntYearReport() {
		targetString = 11;
		return energyEntYearReport;
	}

	public void setEnergyEntYearReport(EnergyEntYearReport energyEntYearReport) {
		this.energyEntYearReport = energyEntYearReport;
	}

	public EnergyGardenTarget getEnergyGardenTarget() {
		targetString = 12;
		return energyGardenTarget;
	}

	public void setEnergyGardenTarget(EnergyGardenTarget energyGardenTarget) {
		this.energyGardenTarget = energyGardenTarget;
	}

	public EnergyMessageRelEnt getEnergyMessageRelEnt() {
		targetString = 13;
		return energyMessageRelEnt;
	}

	public void setEnergyMessageRelEnt(EnergyMessageRelEnt energyMessageRelEnt) {
		this.energyMessageRelEnt = energyMessageRelEnt;
	}

	public EnergyMeterDevice getEnergyMeterDevice() {
		targetString = 14;
		return energyMeterDevice;
	}

	public void setEnergyMeterDevice(EnergyMeterDevice energyMeterDevice) {
		this.energyMeterDevice = energyMeterDevice;
	}

	public EnergyRawCoal getEnergyRawCoal() {
		targetString = 15;
		return energyRawCoal;
	}

	public void setEnergyRawCoal(EnergyRawCoal energyRawCoal) {
		this.energyRawCoal = energyRawCoal;
	}

	public EnergyStaticData getEnergyStaticData() {
		targetString = 16;
		return energyStaticData;
	}

	public void setEnergyStaticData(EnergyStaticData energyStaticData) {
		this.energyStaticData = energyStaticData;
	}

	public EnergySynthesizeEnergyUse getEnergySynthesizeEnergyUse() {
		targetString = 17;
		return energySynthesizeEnergyUse;
	}

	public void setEnergySynthesizeEnergyUse(
			EnergySynthesizeEnergyUse energySynthesizeEnergyUse) {
		this.energySynthesizeEnergyUse = energySynthesizeEnergyUse;
	}

	public EnergyTerminal getEnergyTerminal() {
		targetString = 18;
		return energyTerminal;
	}

	public void setEnergyTerminal(EnergyTerminal energyTerminal) {
		this.energyTerminal = energyTerminal;
	}

	public EnergyTradeFile getEnergyTradeFile() {
		targetString = 19;
		return energyTradeFile;
	}

	public void setEnergyTradeFile(EnergyTradeFile energyTradeFile) {
		this.energyTradeFile = energyTradeFile;
	}

	public EnergyTradeInfo getEnergyTradeInfo() {
		targetString = 20;
		return energyTradeInfo;
	}

	public void setEnergyTradeInfo(EnergyTradeInfo energyTradeInfo) {
		this.energyTradeInfo = energyTradeInfo;
	}

	public EnergyUseAudit getEnergyUseAudit() {
		targetString = 21;
		return energyUseAudit;
	}

	public void setEnergyUseAudit(EnergyUseAudit energyUseAudit) {
		this.energyUseAudit = energyUseAudit;
	}

	public EnergyUseAuditRecord getEnergyUseAuditRecord() {
		targetString = 22;
		return energyUseAuditRecord;
	}

	public void setEnergyUseAuditRecord(
			EnergyUseAuditRecord energyUseAuditRecord) {
		this.energyUseAuditRecord = energyUseAuditRecord;
	}

	public EnergyUseEnergyEquipment getEnergyUseEnergyEquipment() {
		targetString = 23;
		return energyUseEnergyEquipment;
	}

	public void setEnergyUseEnergyEquipment(
			EnergyUseEnergyEquipment energyUseEnergyEquipment) {
		this.energyUseEnergyEquipment = energyUseEnergyEquipment;
	}

	public EnergyVapour getEnergyVapour() {
		targetString = 24;
		return energyVapour;
	}

	public void setEnergyVapour(EnergyVapour energyVapour) {
		this.energyVapour = energyVapour;
	}

	public EnergyWaterMeter getEnergyWaterMeter() {
		targetString = 25;
		return energyWaterMeter;
	}

	public void setEnergyWaterMeter(EnergyWaterMeter energyWaterMeter) {
		this.energyWaterMeter = energyWaterMeter;
	}

	public EneSupEneUnitRelFile getEneSupEneUnitRelFile() {
		targetString = 26;
		return eneSupEneUnitRelFile;
	}

	public void setEneSupEneUnitRelFile(
			EneSupEneUnitRelFile eneSupEneUnitRelFile) {
		this.eneSupEneUnitRelFile = eneSupEneUnitRelFile;
	}

	public EneUseEneEquipmentFile getEneUseEneEquipmentFile() {
		targetString = 27;
		return eneUseEneEquipmentFile;
	}

	public void setEneUseEneEquipmentFile(
			EneUseEneEquipmentFile eneUseEneEquipmentFile) {
		this.eneUseEneEquipmentFile = eneUseEneEquipmentFile;
	}

	public EnvCoreAreas getEnvCoreAreas() {
		targetString = 28;
		return envCoreAreas;
	}

	public void setEnvCoreAreas(EnvCoreAreas envCoreAreas) {
		this.envCoreAreas = envCoreAreas;
	}

	public EnvCoreControlZone getEnvCoreControlZone() {
		targetString = 29;
		return envCoreControlZone;
	}

	public void setEnvCoreControlZone(EnvCoreControlZone envCoreControlZone) {
		this.envCoreControlZone = envCoreControlZone;
	}

	public EnvCoreDischargeOutletInfo getEnvCoreDischargeOutletInfo() {
		targetString = 30;
		return envCoreDischargeOutletInfo;
	}

	public void setEnvCoreDischargeOutletInfo(
			EnvCoreDischargeOutletInfo envCoreDischargeOutletInfo) {
		this.envCoreDischargeOutletInfo = envCoreDischargeOutletInfo;
	}

	public EnvCoreDischargeRule getEnvCoreDischargeRule() {
		targetString = 31;
		return envCoreDischargeRule;
	}

	public void setEnvCoreDischargeRule(
			EnvCoreDischargeRule envCoreDischargeRule) {
		this.envCoreDischargeRule = envCoreDischargeRule;
	}

	public EnvCoreEmergencyPlan getEnvCoreEmergencyPlan() {
		targetString = 32;
		return envCoreEmergencyPlan;
	}

	public void setEnvCoreEmergencyPlan(
			EnvCoreEmergencyPlan envCoreEmergencyPlan) {
		this.envCoreEmergencyPlan = envCoreEmergencyPlan;
	}

	public EnvCoreEnterpriseInfo getEnvCoreEnterpriseInfo() {
		targetString = 33;
		return envCoreEnterpriseInfo;
	}

	public void setEnvCoreEnterpriseInfo(
			EnvCoreEnterpriseInfo envCoreEnterpriseInfo) {
		this.envCoreEnterpriseInfo = envCoreEnterpriseInfo;
	}

	public EnvCoreEnterpriseKind getEnvCoreEnterpriseKind() {
		targetString = 34;
		return envCoreEnterpriseKind;
	}

	public void setEnvCoreEnterpriseKind(
			EnvCoreEnterpriseKind envCoreEnterpriseKind) {
		this.envCoreEnterpriseKind = envCoreEnterpriseKind;
	}

	public EnvCoreEnterpriseScale getEnvCoreEnterpriseScale() {
		targetString = 35;
		return envCoreEnterpriseScale;
	}

	public void setEnvCoreEnterpriseScale(
			EnvCoreEnterpriseScale envCoreEnterpriseScale) {
		this.envCoreEnterpriseScale = envCoreEnterpriseScale;
	}

	public EnvCoreEnterpriseType getEnvCoreEnterpriseType() {
		targetString = 36;
		return envCoreEnterpriseType;
	}

	public void setEnvCoreEnterpriseType(
			EnvCoreEnterpriseType envCoreEnterpriseType) {
		this.envCoreEnterpriseType = envCoreEnterpriseType;
	}

	public EnvCoreEntPollutant getEnvCoreEntPollutant() {
		targetString = 37;
		return envCoreEntPollutant;
	}

	public void setEnvCoreEntPollutant(EnvCoreEntPollutant envCoreEntPollutant) {
		this.envCoreEntPollutant = envCoreEntPollutant;
	}

	public EnvCoreFuelType getEnvCoreFuelType() {
		targetString = 38;
		return envCoreFuelType;
	}

	public void setEnvCoreFuelType(EnvCoreFuelType envCoreFuelType) {
		this.envCoreFuelType = envCoreFuelType;
	}

	public EnvCoreGasFunctionType getEnvCoreGasFunctionType() {
		targetString = 39;
		return envCoreGasFunctionType;
	}

	public void setEnvCoreGasFunctionType(
			EnvCoreGasFunctionType envCoreGasFunctionType) {
		this.envCoreGasFunctionType = envCoreGasFunctionType;
	}

	public EnvCoreIndustryCategory getEnvCoreIndustryCategory() {
		targetString = 40;
		return envCoreIndustryCategory;
	}

	public void setEnvCoreIndustryCategory(
			EnvCoreIndustryCategory envCoreIndustryCategory) {
		this.envCoreIndustryCategory = envCoreIndustryCategory;
	}

	public EnvCoreKeyPointType getEnvCoreKeyPointType() {
		targetString = 41;
		return envCoreKeyPointType;
	}

	public void setEnvCoreKeyPointType(EnvCoreKeyPointType envCoreKeyPointType) {
		this.envCoreKeyPointType = envCoreKeyPointType;
	}

	public EnvCoreLetoutStateControl getEnvCoreLetoutStateControl() {
		targetString = 42;
		return envCoreLetoutStateControl;
	}

	public void setEnvCoreLetoutStateControl(
			EnvCoreLetoutStateControl envCoreLetoutStateControl) {
		this.envCoreLetoutStateControl = envCoreLetoutStateControl;
	}

	public EnvCoreOutletType getEnvCoreOutletType() {
		targetString = 43;
		return envCoreOutletType;
	}

	public void setEnvCoreOutletType(EnvCoreOutletType envCoreOutletType) {
		this.envCoreOutletType = envCoreOutletType;
	}

	public EnvCorePollStandardLimit getEnvCorePollStandardLimit() {
		targetString = 44;
		return envCorePollStandardLimit;
	}

	public void setEnvCorePollStandardLimit(
			EnvCorePollStandardLimit envCorePollStandardLimit) {
		this.envCorePollStandardLimit = envCorePollStandardLimit;
	}

	public EnvCorePollutant getEnvCorePollutant() {
		targetString = 45;
		return envCorePollutant;
	}

	public void setEnvCorePollutant(EnvCorePollutant envCorePollutant) {
		this.envCorePollutant = envCorePollutant;
	}

	public EnvCorePollutantType getEnvCorePollutantType() {
		targetString = 46;
		return envCorePollutantType;
	}

	public void setEnvCorePollutantType(
			EnvCorePollutantType envCorePollutantType) {
		this.envCorePollutantType = envCorePollutantType;
	}

	public EnvCorePollutantUnit getEnvCorePollutantUnit() {
		targetString = 47;
		return envCorePollutantUnit;
	}

	public void setEnvCorePollutantUnit(
			EnvCorePollutantUnit envCorePollutantUnit) {
		this.envCorePollutantUnit = envCorePollutantUnit;
	}

	public EnvCoreRadiateSafetyPermit getEnvCoreRadiateSafetyPermit() {
		targetString = 48;
		return envCoreRadiateSafetyPermit;
	}

	public void setEnvCoreRadiateSafetyPermit(
			EnvCoreRadiateSafetyPermit envCoreRadiateSafetyPermit) {
		this.envCoreRadiateSafetyPermit = envCoreRadiateSafetyPermit;
	}

	public EnvCoreRadioactiveSource getEnvCoreRadioactiveSource() {
		targetString = 49;
		return envCoreRadioactiveSource;
	}

	public void setEnvCoreRadioactiveSource(
			EnvCoreRadioactiveSource envCoreRadioactiveSource) {
		this.envCoreRadioactiveSource = envCoreRadioactiveSource;
	}

	public EnvCoreRayDevice getEnvCoreRayDevice() {
		targetString = 50;
		return envCoreRayDevice;
	}

	public void setEnvCoreRayDevice(EnvCoreRayDevice envCoreRayDevice) {
		this.envCoreRayDevice = envCoreRayDevice;
	}

	public EnvCoreRegisterType getEnvCoreRegisterType() {
		targetString = 51;
		return envCoreRegisterType;
	}

	public void setEnvCoreRegisterType(EnvCoreRegisterType envCoreRegisterType) {
		this.envCoreRegisterType = envCoreRegisterType;
	}

	public EnvCoreSewageDischarge getEnvCoreSewageDischarge() {
		targetString = 52;
		return envCoreSewageDischarge;
	}

	public void setEnvCoreSewageDischarge(
			EnvCoreSewageDischarge envCoreSewageDischarge) {
		this.envCoreSewageDischarge = envCoreSewageDischarge;
	}

	public EnvCoreSubordination getEnvCoreSubordination() {
		targetString = 53;
		return envCoreSubordination;
	}

	public void setEnvCoreSubordination(
			EnvCoreSubordination envCoreSubordination) {
		this.envCoreSubordination = envCoreSubordination;
	}

	public EnvCoreValley getEnvCoreValley() {
		targetString = 54;
		return envCoreValley;
	}

	public void setEnvCoreValley(EnvCoreValley envCoreValley) {
		this.envCoreValley = envCoreValley;
	}

	public EnvCoreValleyFunctionType getEnvCoreValleyFunctionType() {
		targetString = 55;
		return envCoreValleyFunctionType;
	}

	public void setEnvCoreValleyFunctionType(
			EnvCoreValleyFunctionType envCoreValleyFunctionType) {
		this.envCoreValleyFunctionType = envCoreValleyFunctionType;
	}

	public EnvMonitorAlarmLog getEnvMonitorAlarmLog() {
		targetString = 56;
		return envMonitorAlarmLog;
	}

	public void setEnvMonitorAlarmLog(EnvMonitorAlarmLog envMonitorAlarmLog) {
		this.envMonitorAlarmLog = envMonitorAlarmLog;
	}

	public EnvMonitorAlarmRegistForm getEnvMonitorAlarmRegistForm() {
		targetString = 57;
		return envMonitorAlarmRegistForm;
	}

	public void setEnvMonitorAlarmRegistForm(
			EnvMonitorAlarmRegistForm envMonitorAlarmRegistForm) {
		this.envMonitorAlarmRegistForm = envMonitorAlarmRegistForm;
	}

	public EnvMonitorGasAlarm24hours getEnvMonitorGasAlarm24hours() {
		targetString = 58;
		return envMonitorGasAlarm24hours;
	}

	public void setEnvMonitorGasAlarm24hours(
			EnvMonitorGasAlarm24hours envMonitorGasAlarm24hours) {
		this.envMonitorGasAlarm24hours = envMonitorGasAlarm24hours;
	}

	public LgtAlarmManage getLgtAlarmManage() {
		targetString = 59;
		return lgtAlarmManage;
	}

	public void setLgtAlarmManage(LgtAlarmManage lgtAlarmManage) {
		this.lgtAlarmManage = lgtAlarmManage;
	}

	public LgtAlarmThreshold getLgtAlarmThreshold() {
		targetString = 60;
		return lgtAlarmThreshold;
	}

	public void setLgtAlarmThreshold(LgtAlarmThreshold lgtAlarmThreshold) {
		this.lgtAlarmThreshold = lgtAlarmThreshold;
	}

	public LgtAlarmTimes getLgtAlarmTimes() {
		targetString = 61;
		return lgtAlarmTimes;
	}

	public void setLgtAlarmTimes(LgtAlarmTimes lgtAlarmTimes) {
		this.lgtAlarmTimes = lgtAlarmTimes;
	}

	public LgtBlacklistManage getLgtBlacklistManage() {
		targetString = 62;
		return lgtBlacklistManage;
	}

	public void setLgtBlacklistManage(LgtBlacklistManage lgtBlacklistManage) {
		this.lgtBlacklistManage = lgtBlacklistManage;
	}

	public LgtCarDispatch getLgtCarDispatch() {
		targetString = 63;
		return lgtCarDispatch;
	}

	public void setLgtCarDispatch(LgtCarDispatch lgtCarDispatch) {
		this.lgtCarDispatch = lgtCarDispatch;
	}

	public LgtCarRealTimePostion getLgtCarRealTimePostion() {
		targetString = 64;
		return lgtCarRealTimePostion;
	}

	public void setLgtCarRealTimePostion(
			LgtCarRealTimePostion lgtCarRealTimePostion) {
		this.lgtCarRealTimePostion = lgtCarRealTimePostion;
	}

	public LgtDanCarAttRel getLgtDanCarAttRel() {
		targetString = 65;
		return lgtDanCarAttRel;
	}

	public void setLgtDanCarAttRel(LgtDanCarAttRel lgtDanCarAttRel) {
		this.lgtDanCarAttRel = lgtDanCarAttRel;
	}

	public LgtDangerousCarInfo getLgtDangerousCarInfo() {
		targetString = 66;
		return lgtDangerousCarInfo;
	}

	public void setLgtDangerousCarInfo(LgtDangerousCarInfo lgtDangerousCarInfo) {
		this.lgtDangerousCarInfo = lgtDangerousCarInfo;
	}

	public LgtEmergencyInfo getLgtEmergencyInfo() {
		targetString = 67;
		return lgtEmergencyInfo;
	}

	public void setLgtEmergencyInfo(LgtEmergencyInfo lgtEmergencyInfo) {
		this.lgtEmergencyInfo = lgtEmergencyInfo;
	}

	public LgtEnterprise getLgtEnterprise() {
		targetString = 68;
		return lgtEnterprise;
	}

	public void setLgtEnterprise(LgtEnterprise lgtEnterprise) {
		this.lgtEnterprise = lgtEnterprise;
	}

	public LgtKaOpen getLgtKaOpen() {
		targetString = 69;
		return lgtKaOpen;
	}

	public void setLgtKaOpen(LgtKaOpen lgtKaOpen) {
		this.lgtKaOpen = lgtKaOpen;
	}

	public LgtParkArea getLgtParkArea() {
		targetString = 70;
		return lgtParkArea;
	}

	public void setLgtParkArea(LgtParkArea lgtParkArea) {
		this.lgtParkArea = lgtParkArea;
	}

	public LgtRestrictedAreaInfo getLgtRestrictedAreaInfo() {
		targetString = 71;
		return lgtRestrictedAreaInfo;
	}

	public void setLgtRestrictedAreaInfo(
			LgtRestrictedAreaInfo lgtRestrictedAreaInfo) {
		this.lgtRestrictedAreaInfo = lgtRestrictedAreaInfo;
	}

	public LgtSolveRoute getLgtSolveRoute() {
		targetString = 72;
		return lgtSolveRoute;
	}

	public void setLgtSolveRoute(LgtSolveRoute lgtSolveRoute) {
		this.lgtSolveRoute = lgtSolveRoute;
	}

	public LgtSourceGoods getLgtSourceGoods() {
		targetString = 73;
		return lgtSourceGoods;
	}

	public void setLgtSourceGoods(LgtSourceGoods lgtSourceGoods) {
		this.lgtSourceGoods = lgtSourceGoods;
	}

	public LgtSourceGoodsInfo getLgtSourceGoodsInfo() {
		targetString = 74;
		return lgtSourceGoodsInfo;
	}

	public void setLgtSourceGoodsInfo(LgtSourceGoodsInfo lgtSourceGoodsInfo) {
		this.lgtSourceGoodsInfo = lgtSourceGoodsInfo;
	}

	public LgtWaybillGoods getLgtWaybillGoods() {
		targetString = 75;
		return lgtWaybillGoods;
	}

	public void setLgtWaybillGoods(LgtWaybillGoods lgtWaybillGoods) {
		this.lgtWaybillGoods = lgtWaybillGoods;
	}

	public LgtWaybillGoodsTemplate getLgtWaybillGoodsTemplate() {
		targetString = 76;
		return lgtWaybillGoodsTemplate;
	}

	public void setLgtWaybillGoodsTemplate(
			LgtWaybillGoodsTemplate lgtWaybillGoodsTemplate) {
		this.lgtWaybillGoodsTemplate = lgtWaybillGoodsTemplate;
	}

	public LgtWaybillInfo getLgtWaybillInfo() {
		targetString = 77;
		return lgtWaybillInfo;
	}

	public void setLgtWaybillInfo(LgtWaybillInfo lgtWaybillInfo) {
		this.lgtWaybillInfo = lgtWaybillInfo;
	}

	public SecCEiAccidents getSecCEiAccidents() {
		targetString = 78;
		return secCEiAccidents;
	}

	public void setSecCEiAccidents(SecCEiAccidents secCEiAccidents) {
		this.secCEiAccidents = secCEiAccidents;
	}

	public SecCEiAdmiliceinfo getSecCEiAdmiliceinfo() {
		targetString = 79;
		return secCEiAdmiliceinfo;
	}

	public void setSecCEiAdmiliceinfo(SecCEiAdmiliceinfo secCEiAdmiliceinfo) {
		this.secCEiAdmiliceinfo = secCEiAdmiliceinfo;
	}

	public SecCEiChemical getSecCEiChemical() {
		targetString = 80;
		return secCEiChemical;
	}

	public void setSecCEiChemical(SecCEiChemical secCEiChemical) {
		this.secCEiChemical = secCEiChemical;
	}

	public SecCEiDangerindustry getSecCEiDangerindustry() {
		targetString = 81;
		return secCEiDangerindustry;
	}

	public void setSecCEiDangerindustry(
			SecCEiDangerindustry secCEiDangerindustry) {
		this.secCEiDangerindustry = secCEiDangerindustry;
	}

	public SecCEiDangsrc getSecCEiDangsrc() {
		targetString = 82;
		return secCEiDangsrc;
	}

	public void setSecCEiDangsrc(SecCEiDangsrc secCEiDangsrc) {
		this.secCEiDangsrc = secCEiDangsrc;
	}

	public SecCEiEnterpriseaudit getSecCEiEnterpriseaudit() {
		targetString = 83;
		return secCEiEnterpriseaudit;
	}

	public void setSecCEiEnterpriseaudit(
			SecCEiEnterpriseaudit secCEiEnterpriseaudit) {
		this.secCEiEnterpriseaudit = secCEiEnterpriseaudit;
	}

	public SecCEiEnterpriseinfo getSecCEiEnterpriseinfo() {
		targetString = 84;
		return secCEiEnterpriseinfo;
	}

	public void setSecCEiEnterpriseinfo(
			SecCEiEnterpriseinfo secCEiEnterpriseinfo) {
		this.secCEiEnterpriseinfo = secCEiEnterpriseinfo;
	}

	public SecCEiFireworksindustry getSecCEiFireworksindustry() {
		targetString = 85;
		return secCEiFireworksindustry;
	}

	public void setSecCEiFireworksindustry(
			SecCEiFireworksindustry secCEiFireworksindustry) {
		this.secCEiFireworksindustry = secCEiFireworksindustry;
	}

	public SecCEiKeyplace getSecCEiKeyplace() {
		targetString = 86;
		return secCEiKeyplace;
	}

	public void setSecCEiKeyplace(SecCEiKeyplace secCEiKeyplace) {
		this.secCEiKeyplace = secCEiKeyplace;
	}

	public SecCEiSecucheck getSecCEiSecucheck() {
		targetString = 87;
		return secCEiSecucheck;
	}

	public void setSecCEiSecucheck(SecCEiSecucheck secCEiSecucheck) {
		this.secCEiSecucheck = secCEiSecucheck;
	}

	public SecCEiStand getSecCEiStand() {
		targetString = 88;
		return secCEiStand;
	}

	public void setSecCEiStand(SecCEiStand secCEiStand) {
		this.secCEiStand = secCEiStand;
	}

	public SecCStEntsafescore getSecCStEntsafescore() {
		targetString = 89;
		return secCStEntsafescore;
	}

	public void setSecCStEntsafescore(SecCStEntsafescore secCStEntsafescore) {
		this.secCStEntsafescore = secCStEntsafescore;
	}
	public EnergySupplyEnergyUnitData getEnergySupplyEnergyUnitData() {
		targetString = 90;
		return energySupplyEnergyUnitData;
	}

	public void setEnergySupplyEnergyUnitData(
			EnergySupplyEnergyUnitData energySupplyEnergyUnitData) {
		this.energySupplyEnergyUnitData = energySupplyEnergyUnitData;
	}

	public LgtPipeLocation getLgtPipeLocation() {
		targetString = 91;
		return lgtPipeLocation;
	}

	public void setLgtPipeLocation(LgtPipeLocation lgtPipeLocation) {
		this.lgtPipeLocation = lgtPipeLocation;
	}

	public LgtPipeManage getLgtPipeManage() {
		targetString = 92;
		return lgtPipeManage;
	}

	public void setLgtPipeManage(LgtPipeManage lgtPipeManage) {
		this.lgtPipeManage = lgtPipeManage;
	}
}
