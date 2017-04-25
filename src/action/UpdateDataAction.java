package action;

import com.mdd.dao.BaseDAO;
import com.mdd.model.EnergyCollectData;
import com.mdd.model.EnergyCollectMachine;
import com.mdd.model.EnergyCollectSpot;
import com.mdd.model.EnergyConsumptionDataRed;
import com.mdd.model.EnergyConsumptionRecord;
import com.mdd.model.EnergyEntMonthReport;
import com.mdd.model.EnergyEntYearReport;
import com.mdd.model.EnergyEnterpriseInfo;
import com.mdd.model.EnergyEnterprisePosition;
import com.mdd.model.EnergyEnterpriseTarget;
import com.mdd.model.EnergyGardenTarget;
import com.mdd.model.EnergyMessageRelEnt;
import com.mdd.model.EnergyRawCoal;
import com.mdd.model.EnergyTerminal;
import com.mdd.model.EnergyTradeFile;
import com.mdd.model.EnergyTradeInfo;
import com.mdd.model.EnergyUseAudit;
import com.mdd.model.EnergyUseAuditRecord;
import com.mdd.model.EnergyVapour;
import com.mdd.model.EnergyWaterMeter;
import com.mdd.model.EnvCoreAreas;
import com.mdd.model.EnvCoreControlZone;
import com.mdd.model.EnvCoreDischargeOutletInfo;
import com.mdd.model.EnvCoreDischargeRule;
import com.mdd.model.EnvCoreEmergencyPlan;
import com.mdd.model.EnvCoreEntPollutant;
import com.mdd.model.EnvCoreEnterpriseInfo;
import com.mdd.model.EnvCoreEnterpriseKind;
import com.mdd.model.EnvCoreEnterpriseScale;
import com.mdd.model.EnvCoreEnterpriseType;
import com.mdd.model.EnvCoreFuelType;
import com.mdd.model.EnvCoreGasFunctionType;
import com.mdd.model.EnvCoreIndustryCategory;
import com.mdd.model.EnvCoreKeyPointType;
import com.mdd.model.EnvCoreLetoutStateControl;
import com.mdd.model.EnvCoreOutletType;
import com.mdd.model.EnvCorePollStandardLimit;
import com.mdd.model.EnvCorePollutant;
import com.mdd.model.EnvCorePollutantType;
import com.mdd.model.EnvCorePollutantUnit;
import com.mdd.model.EnvCoreRadiateSafetyPermit;
import com.mdd.model.EnvCoreRadioactiveSource;
import com.mdd.model.EnvCoreRayDevice;
import com.mdd.model.EnvCoreRegisterType;
import com.mdd.model.EnvCoreSewageDischarge;
import com.mdd.model.EnvCoreSubordination;
import com.mdd.model.EnvCoreValley;
import com.mdd.model.EnvCoreValleyFunctionType;
import com.mdd.model.EnvMonitorAlarmLog;
import com.mdd.model.EnvMonitorAlarmRegistForm;
import com.mdd.model.EnvMonitorGasAlarm24hours;
import com.mdd.model.LgtAlarmManage;
import com.mdd.model.LgtAlarmThreshold;
import com.mdd.model.LgtAlarmTimes;
import com.mdd.model.LgtBlacklistInfo;
import com.mdd.model.LgtCarRealTimePostion;
import com.mdd.model.LgtDanCarAttRel;
import com.mdd.model.LgtDangerousCarInfo;
import com.mdd.model.LgtEmergencyInfo;
import com.mdd.model.LgtEnterpriseInfo;
import com.mdd.model.LgtGoodsManageInfo;
import com.mdd.model.LgtGoodsSourceInfo;
import com.mdd.model.LgtRestrictedAreaInfo;
import com.mdd.model.LgtVehicleScheduling;
import com.mdd.model.LgtWaybillGoods;
import com.mdd.model.LgtWaybillGoodsTemplate;
import com.mdd.model.LgtWaybillInfo;
import com.mdd.model.SecCEiAccidents;
import com.mdd.model.SecCEiAdmiliceinfo;
import com.mdd.model.SecCEiChemical;
import com.mdd.model.SecCEiDangerindustry;
import com.mdd.model.SecCEiDangsrc;
import com.mdd.model.SecCEiEnterpriseaudit;
import com.mdd.model.SecCEiEnterpriseinfo;
import com.mdd.model.SecCEiFireworksindustry;
import com.mdd.model.SecCEiKeyplace;
import com.mdd.model.SecCEiSecucheck;
import com.mdd.model.SecCEiStand;
import com.mdd.model.SecCStEntsafescore;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateDataAction extends ActionSupport {
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
	public EnergyRawCoal energyRawCoal = new EnergyRawCoal();
	public EnergyTerminal energyTerminal = new EnergyTerminal();
	public EnergyTradeFile energyTradeFile = new EnergyTradeFile();
	public EnergyTradeInfo energyTradeInfo = new EnergyTradeInfo();
	public EnergyUseAudit energyUseAudit = new EnergyUseAudit();
	public EnergyUseAuditRecord energyUseAuditRecord = new EnergyUseAuditRecord();
	public EnergyVapour energyVapour = new EnergyVapour();
	public EnergyWaterMeter energyWaterMeter = new EnergyWaterMeter();
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
	public LgtBlacklistInfo lgtBlacklistInfo = new LgtBlacklistInfo();
	public LgtCarRealTimePostion lgtCarRealTimePostion = new LgtCarRealTimePostion();
	public LgtDanCarAttRel lgtDanCarAttRel = new LgtDanCarAttRel();
	public LgtDangerousCarInfo lgtDangerousCarInfo = new LgtDangerousCarInfo();
	public LgtEmergencyInfo lgtEmergencyInfo = new LgtEmergencyInfo();
	public LgtEnterpriseInfo lgtEnterpriseInfo = new LgtEnterpriseInfo();
	public LgtGoodsManageInfo lgtGoodsManageInfo = new LgtGoodsManageInfo();
	public LgtGoodsSourceInfo lgtGoodsSourceInfo = new LgtGoodsSourceInfo();
	public LgtRestrictedAreaInfo lgtRestrictedAreaInfo = new LgtRestrictedAreaInfo();
	public LgtVehicleScheduling lgtVehicleScheduling = new LgtVehicleScheduling();
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
		case 3:
			b = BaseDAO.update(energyCollectSpot);
			break;
		case 4:
			b = BaseDAO.update(energyConsumptionDataRed);
			break;
		case 5:
			b = BaseDAO.update(energyConsumptionRecord);
			break;
		case 6:
			b = BaseDAO.update(energyEnterpriseInfo);
			break;
		case 7:
			b = BaseDAO.update(energyEnterprisePosition);
			break;
		case 8:
			b = BaseDAO.update(energyEnterpriseTarget);
			break;
		case 9:
			b = BaseDAO.update(energyEntMonthReport);
			break;
		case 10:
			b = BaseDAO.update(energyEntYearReport);
			break;
		case 11:
			b = BaseDAO.update(energyGardenTarget);
			break;
		case 12:
			b = BaseDAO.update(energyMessageRelEnt);
			break;
		case 13:
			b = BaseDAO.update(energyRawCoal);
			break;
		case 14:
			b = BaseDAO.update(energyTerminal);
			break;
		case 15:
			b = BaseDAO.update(energyTradeFile);
			break;
		case 16:
			b = BaseDAO.update(energyTradeInfo);
			break;
		case 17:
			b = BaseDAO.update(energyUseAudit);
			break;
		case 18:
			b = BaseDAO.update(energyUseAuditRecord);
			break;
		case 19:
			b = BaseDAO.update(energyVapour);
			break;
		case 20:
			b = BaseDAO.update(energyWaterMeter);
			break;
		case 21:
			b = BaseDAO.update(envCoreAreas);
			break;
		case 22:
			b = BaseDAO.update(envCoreControlZone);
			break;
		case 23:
			b = BaseDAO.update(envCoreDischargeOutletInfo);
			break;
		case 24:
			b = BaseDAO.update(envCoreDischargeRule);
			break;
		case 25:
			b = BaseDAO.update(envCoreEmergencyPlan);
			break;
		case 26:
			b = BaseDAO.update(envCoreEnterpriseInfo);
			break;
		case 27:
			b = BaseDAO.update(envCoreEnterpriseKind);
			break;
		case 28:
			b = BaseDAO.update(envCoreEnterpriseScale);
			break;
		case 29:
			b = BaseDAO.update(envCoreEnterpriseType);
			break;
		case 30:
			b = BaseDAO.update(envCoreEntPollutant);
			break;
		case 31:
			b = BaseDAO.update(envCoreFuelType);
			break;
		case 32:
			b = BaseDAO.update(envCoreGasFunctionType);
			break;
		case 33:
			b = BaseDAO.update(envCoreIndustryCategory);
			break;
		case 34:
			b = BaseDAO.update(envCoreKeyPointType);
			break;
		case 35:
			b = BaseDAO.update(envCoreLetoutStateControl);
			break;
		case 36:
			b = BaseDAO.update(envCoreOutletType);
			break;
		case 37:
			b = BaseDAO.update(envCorePollStandardLimit);
			break;
		case 38:
			b = BaseDAO.update(envCorePollutant);
			break;
		case 39:
			b = BaseDAO.update(envCorePollutantType);
			break;
		case 40:
			b = BaseDAO.update(envCorePollutantUnit);
			break;
		case 41:
			b = BaseDAO.update(envCoreRadiateSafetyPermit);
			break;
		case 42:
			b = BaseDAO.update(envCoreRadioactiveSource);
			break;
		case 43:
			b = BaseDAO.update(envCoreRayDevice);
			break;
		case 44:
			b = BaseDAO.update(envCoreRegisterType);
			break;
		case 45:
			b = BaseDAO.update(envCoreSewageDischarge);
			break;
		case 46:
			b = BaseDAO.update(envCoreSubordination);
			break;
		case 47:
			b = BaseDAO.update(envCoreValley);
			break;
		case 48:
			b = BaseDAO.update(envCoreValleyFunctionType);
			break;
		case 49:
			b = BaseDAO.update(envMonitorAlarmLog);
			break;
		case 50:
			b = BaseDAO.update(envMonitorAlarmRegistForm);
			break;
		case 51:
			b = BaseDAO.update(envMonitorGasAlarm24hours);
			break;
		case 52:
			b = BaseDAO.update(lgtAlarmManage);
			break;
		case 53:
			b = BaseDAO.update(lgtAlarmThreshold);
			break;
		case 54:
			b = BaseDAO.update(lgtAlarmTimes);
			break;
		case 55:
			b = BaseDAO.update(lgtBlacklistInfo);
			break;
		case 56:
			b = BaseDAO.update(lgtCarRealTimePostion);
			break;
		case 57:
			b = BaseDAO.update(lgtDanCarAttRel);
			break;
		case 58:
			b = BaseDAO.update(lgtDangerousCarInfo);
			break;
		case 59:
			b = BaseDAO.update(lgtEmergencyInfo);
			break;
		case 60:
			b = BaseDAO.update(lgtEnterpriseInfo);
			break;
		case 61:
			b = BaseDAO.update(lgtGoodsManageInfo);
			break;
		case 62:
			b = BaseDAO.update(lgtGoodsSourceInfo);
			break;
		case 63:
			b = BaseDAO.update(lgtRestrictedAreaInfo);
			break;
		case 64:
			b = BaseDAO.update(lgtVehicleScheduling);
			break;
		case 65:
			b = BaseDAO.update(lgtWaybillGoods);
			break;
		case 66:
			b = BaseDAO.update(lgtWaybillGoodsTemplate);
			break;
		case 67:
			b = BaseDAO.update(lgtWaybillInfo);
			break;
		case 68:
			b = BaseDAO.update(secCEiAccidents);
			break;
		case 69:
			b = BaseDAO.update(secCEiAdmiliceinfo);
			break;
		case 70:
			b = BaseDAO.update(secCEiChemical);
			break;
		case 71:
			b = BaseDAO.update(secCEiDangerindustry);
			break;
		case 72:
			b = BaseDAO.update(secCEiDangsrc);
			break;
		case 73:
			b = BaseDAO.update(secCEiEnterpriseaudit);
			break;
		case 74:
			b = BaseDAO.update(secCEiEnterpriseinfo);
			break;
		case 75:
			b = BaseDAO.update(secCEiFireworksindustry);
			break;
		case 76:
			b = BaseDAO.update(secCEiKeyplace);
			break;
		case 77:
			b = BaseDAO.update(secCEiSecucheck);
			break;
		case 78:
			b = BaseDAO.update(secCEiStand);
			break;
		case 79:
			b = BaseDAO.update(secCStEntsafescore);
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

	public EnergyCollectSpot getEnergyCollectSpot() {
		targetString = 3;
		return energyCollectSpot;
	}

	public void setEnergyCollectSpot(EnergyCollectSpot energyCollectSpot) {
		this.energyCollectSpot = energyCollectSpot;
	}

	public EnergyConsumptionDataRed getEnergyConsumptionDataRed() {
		targetString = 4;
		return energyConsumptionDataRed;
	}

	public void setEnergyConsumptionDataRed(
			EnergyConsumptionDataRed energyConsumptionDataRed) {
		this.energyConsumptionDataRed = energyConsumptionDataRed;
	}

	public EnergyConsumptionRecord getEnergyConsumptionRecord() {
		targetString = 5;
		return energyConsumptionRecord;
	}

	public void setEnergyConsumptionRecord(
			EnergyConsumptionRecord energyConsumptionRecord) {
		this.energyConsumptionRecord = energyConsumptionRecord;
	}

	public EnergyEnterpriseInfo getEnergyEnterpriseInfo() {
		targetString = 6;
		return energyEnterpriseInfo;
	}

	public void setEnergyEnterpriseInfo(
			EnergyEnterpriseInfo energyEnterpriseInfo) {
		this.energyEnterpriseInfo = energyEnterpriseInfo;
	}

	public EnergyEnterprisePosition getEnergyEnterprisePosition() {
		targetString = 7;
		return energyEnterprisePosition;
	}

	public void setEnergyEnterprisePosition(
			EnergyEnterprisePosition energyEnterprisePosition) {
		this.energyEnterprisePosition = energyEnterprisePosition;
	}

	public EnergyEnterpriseTarget getEnergyEnterpriseTarget() {
		targetString = 8;
		return energyEnterpriseTarget;
	}

	public void setEnergyEnterpriseTarget(
			EnergyEnterpriseTarget energyEnterpriseTarget) {
		this.energyEnterpriseTarget = energyEnterpriseTarget;
	}

	public EnergyEntMonthReport getEnergyEntMonthReport() {
		targetString = 9;
		return energyEntMonthReport;
	}

	public void setEnergyEntMonthReport(
			EnergyEntMonthReport energyEntMonthReport) {
		this.energyEntMonthReport = energyEntMonthReport;
	}

	public EnergyEntYearReport getEnergyEntYearReport() {
		targetString = 10;
		return energyEntYearReport;
	}

	public void setEnergyEntYearReport(EnergyEntYearReport energyEntYearReport) {
		this.energyEntYearReport = energyEntYearReport;
	}

	public EnergyGardenTarget getEnergyGardenTarget() {
		targetString = 11;
		return energyGardenTarget;
	}

	public void setEnergyGardenTarget(EnergyGardenTarget energyGardenTarget) {
		this.energyGardenTarget = energyGardenTarget;
	}

	public EnergyMessageRelEnt getEnergyMessageRelEnt() {
		targetString = 12;
		return energyMessageRelEnt;
	}

	public void setEnergyMessageRelEnt(EnergyMessageRelEnt energyMessageRelEnt) {
		this.energyMessageRelEnt = energyMessageRelEnt;
	}

	public EnergyRawCoal getEnergyRawCoal() {
		targetString = 13;
		return energyRawCoal;
	}

	public void setEnergyRawCoal(EnergyRawCoal energyRawCoal) {
		this.energyRawCoal = energyRawCoal;
	}

	public EnergyTerminal getEnergyTerminal() {
		targetString = 14;
		return energyTerminal;
	}

	public void setEnergyTerminal(EnergyTerminal energyTerminal) {
		this.energyTerminal = energyTerminal;
	}

	public EnergyTradeFile getEnergyTradeFile() {
		targetString = 15;
		return energyTradeFile;
	}

	public void setEnergyTradeFile(EnergyTradeFile energyTradeFile) {
		this.energyTradeFile = energyTradeFile;
	}

	public EnergyTradeInfo getEnergyTradeInfo() {
		targetString = 16;
		return energyTradeInfo;
	}

	public void setEnergyTradeInfo(EnergyTradeInfo energyTradeInfo) {
		this.energyTradeInfo = energyTradeInfo;
	}

	public EnergyUseAudit getEnergyUseAudit() {
		targetString = 17;
		return energyUseAudit;
	}

	public void setEnergyUseAudit(EnergyUseAudit energyUseAudit) {
		this.energyUseAudit = energyUseAudit;
	}

	public EnergyUseAuditRecord getEnergyUseAuditRecord() {
		targetString = 18;
		return energyUseAuditRecord;
	}

	public void setEnergyUseAuditRecord(
			EnergyUseAuditRecord energyUseAuditRecord) {
		this.energyUseAuditRecord = energyUseAuditRecord;
	}

	public EnergyVapour getEnergyVapour() {
		targetString = 19;
		return energyVapour;
	}

	public void setEnergyVapour(EnergyVapour energyVapour) {
		this.energyVapour = energyVapour;
	}

	public EnergyWaterMeter getEnergyWaterMeter() {
		targetString = 20;
		return energyWaterMeter;
	}

	public void setEnergyWaterMeter(EnergyWaterMeter energyWaterMeter) {
		this.energyWaterMeter = energyWaterMeter;
	}

	public EnvCoreAreas getEnvCoreAreas() {
		targetString = 21;
		return envCoreAreas;
	}

	public void setEnvCoreAreas(EnvCoreAreas envCoreAreas) {
		this.envCoreAreas = envCoreAreas;
	}

	public EnvCoreControlZone getEnvCoreControlZone() {
		targetString = 22;
		return envCoreControlZone;
	}

	public void setEnvCoreControlZone(EnvCoreControlZone envCoreControlZone) {
		this.envCoreControlZone = envCoreControlZone;
	}

	public EnvCoreDischargeOutletInfo getEnvCoreDischargeOutletInfo() {
		targetString = 23;
		return envCoreDischargeOutletInfo;
	}

	public void setEnvCoreDischargeOutletInfo(
			EnvCoreDischargeOutletInfo envCoreDischargeOutletInfo) {
		this.envCoreDischargeOutletInfo = envCoreDischargeOutletInfo;
	}

	public EnvCoreDischargeRule getEnvCoreDischargeRule() {
		targetString = 24;
		return envCoreDischargeRule;
	}

	public void setEnvCoreDischargeRule(
			EnvCoreDischargeRule envCoreDischargeRule) {
		this.envCoreDischargeRule = envCoreDischargeRule;
	}

	public EnvCoreEmergencyPlan getEnvCoreEmergencyPlan() {
		targetString = 25;
		return envCoreEmergencyPlan;
	}

	public void setEnvCoreEmergencyPlan(
			EnvCoreEmergencyPlan envCoreEmergencyPlan) {
		this.envCoreEmergencyPlan = envCoreEmergencyPlan;
	}

	public EnvCoreEnterpriseInfo getEnvCoreEnterpriseInfo() {
		targetString = 26;
		return envCoreEnterpriseInfo;
	}

	public void setEnvCoreEnterpriseInfo(
			EnvCoreEnterpriseInfo envCoreEnterpriseInfo) {
		this.envCoreEnterpriseInfo = envCoreEnterpriseInfo;
	}

	public EnvCoreEnterpriseKind getEnvCoreEnterpriseKind() {
		targetString = 27;
		return envCoreEnterpriseKind;
	}

	public void setEnvCoreEnterpriseKind(
			EnvCoreEnterpriseKind envCoreEnterpriseKind) {
		this.envCoreEnterpriseKind = envCoreEnterpriseKind;
	}

	public EnvCoreEnterpriseScale getEnvCoreEnterpriseScale() {
		targetString = 28;
		return envCoreEnterpriseScale;
	}

	public void setEnvCoreEnterpriseScale(
			EnvCoreEnterpriseScale envCoreEnterpriseScale) {
		this.envCoreEnterpriseScale = envCoreEnterpriseScale;
	}

	public EnvCoreEnterpriseType getEnvCoreEnterpriseType() {
		targetString = 29;
		return envCoreEnterpriseType;
	}

	public void setEnvCoreEnterpriseType(
			EnvCoreEnterpriseType envCoreEnterpriseType) {
		this.envCoreEnterpriseType = envCoreEnterpriseType;
	}

	public EnvCoreEntPollutant getEnvCoreEntPollutant() {
		targetString = 30;
		return envCoreEntPollutant;
	}

	public void setEnvCoreEntPollutant(EnvCoreEntPollutant envCoreEntPollutant) {
		this.envCoreEntPollutant = envCoreEntPollutant;
	}

	public EnvCoreFuelType getEnvCoreFuelType() {
		targetString = 31;
		return envCoreFuelType;
	}

	public void setEnvCoreFuelType(EnvCoreFuelType envCoreFuelType) {
		this.envCoreFuelType = envCoreFuelType;
	}

	public EnvCoreGasFunctionType getEnvCoreGasFunctionType() {
		targetString = 32;
		return envCoreGasFunctionType;
	}

	public void setEnvCoreGasFunctionType(
			EnvCoreGasFunctionType envCoreGasFunctionType) {
		this.envCoreGasFunctionType = envCoreGasFunctionType;
	}

	public EnvCoreIndustryCategory getEnvCoreIndustryCategory() {
		targetString = 33;
		return envCoreIndustryCategory;
	}

	public void setEnvCoreIndustryCategory(
			EnvCoreIndustryCategory envCoreIndustryCategory) {
		this.envCoreIndustryCategory = envCoreIndustryCategory;
	}

	public EnvCoreKeyPointType getEnvCoreKeyPointType() {
		targetString = 34;
		return envCoreKeyPointType;
	}

	public void setEnvCoreKeyPointType(EnvCoreKeyPointType envCoreKeyPointType) {
		this.envCoreKeyPointType = envCoreKeyPointType;
	}

	public EnvCoreLetoutStateControl getEnvCoreLetoutStateControl() {
		targetString = 35;
		return envCoreLetoutStateControl;
	}

	public void setEnvCoreLetoutStateControl(
			EnvCoreLetoutStateControl envCoreLetoutStateControl) {
		this.envCoreLetoutStateControl = envCoreLetoutStateControl;
	}

	public EnvCoreOutletType getEnvCoreOutletType() {
		targetString = 36;
		return envCoreOutletType;
	}

	public void setEnvCoreOutletType(EnvCoreOutletType envCoreOutletType) {
		this.envCoreOutletType = envCoreOutletType;
	}

	public EnvCorePollStandardLimit getEnvCorePollStandardLimit() {
		targetString = 37;
		return envCorePollStandardLimit;
	}

	public void setEnvCorePollStandardLimit(
			EnvCorePollStandardLimit envCorePollStandardLimit) {
		this.envCorePollStandardLimit = envCorePollStandardLimit;
	}

	public EnvCorePollutant getEnvCorePollutant() {
		targetString = 38;
		return envCorePollutant;
	}

	public void setEnvCorePollutant(EnvCorePollutant envCorePollutant) {
		this.envCorePollutant = envCorePollutant;
	}

	public EnvCorePollutantType getEnvCorePollutantType() {
		targetString = 39;
		return envCorePollutantType;
	}

	public void setEnvCorePollutantType(
			EnvCorePollutantType envCorePollutantType) {
		this.envCorePollutantType = envCorePollutantType;
	}

	public EnvCorePollutantUnit getEnvCorePollutantUnit() {
		targetString = 40;
		return envCorePollutantUnit;
	}

	public void setEnvCorePollutantUnit(
			EnvCorePollutantUnit envCorePollutantUnit) {
		this.envCorePollutantUnit = envCorePollutantUnit;
	}

	public EnvCoreRadiateSafetyPermit getEnvCoreRadiateSafetyPermit() {
		targetString = 41;
		return envCoreRadiateSafetyPermit;
	}

	public void setEnvCoreRadiateSafetyPermit(
			EnvCoreRadiateSafetyPermit envCoreRadiateSafetyPermit) {
		this.envCoreRadiateSafetyPermit = envCoreRadiateSafetyPermit;
	}

	public EnvCoreRadioactiveSource getEnvCoreRadioactiveSource() {
		targetString = 42;
		return envCoreRadioactiveSource;
	}

	public void setEnvCoreRadioactiveSource(
			EnvCoreRadioactiveSource envCoreRadioactiveSource) {
		this.envCoreRadioactiveSource = envCoreRadioactiveSource;
	}

	public EnvCoreRayDevice getEnvCoreRayDevice() {
		targetString = 43;
		return envCoreRayDevice;
	}

	public void setEnvCoreRayDevice(EnvCoreRayDevice envCoreRayDevice) {
		this.envCoreRayDevice = envCoreRayDevice;
	}

	public EnvCoreRegisterType getEnvCoreRegisterType() {
		targetString = 44;
		return envCoreRegisterType;
	}

	public void setEnvCoreRegisterType(EnvCoreRegisterType envCoreRegisterType) {
		this.envCoreRegisterType = envCoreRegisterType;
	}

	public EnvCoreSewageDischarge getEnvCoreSewageDischarge() {
		targetString = 45;
		return envCoreSewageDischarge;
	}

	public void setEnvCoreSewageDischarge(
			EnvCoreSewageDischarge envCoreSewageDischarge) {
		this.envCoreSewageDischarge = envCoreSewageDischarge;
	}

	public EnvCoreSubordination getEnvCoreSubordination() {
		targetString = 46;
		return envCoreSubordination;
	}

	public void setEnvCoreSubordination(
			EnvCoreSubordination envCoreSubordination) {
		this.envCoreSubordination = envCoreSubordination;
	}

	public EnvCoreValley getEnvCoreValley() {
		targetString = 47;
		return envCoreValley;
	}

	public void setEnvCoreValley(EnvCoreValley envCoreValley) {
		this.envCoreValley = envCoreValley;
	}

	public EnvCoreValleyFunctionType getEnvCoreValleyFunctionType() {
		targetString = 48;
		return envCoreValleyFunctionType;
	}

	public void setEnvCoreValleyFunctionType(
			EnvCoreValleyFunctionType envCoreValleyFunctionType) {
		this.envCoreValleyFunctionType = envCoreValleyFunctionType;
	}

	public EnvMonitorAlarmLog getEnvMonitorAlarmLog() {
		targetString = 49;
		return envMonitorAlarmLog;
	}

	public void setEnvMonitorAlarmLog(EnvMonitorAlarmLog envMonitorAlarmLog) {
		this.envMonitorAlarmLog = envMonitorAlarmLog;
	}

	public EnvMonitorAlarmRegistForm getEnvMonitorAlarmRegistForm() {
		targetString = 50;
		return envMonitorAlarmRegistForm;
	}

	public void setEnvMonitorAlarmRegistForm(
			EnvMonitorAlarmRegistForm envMonitorAlarmRegistForm) {
		this.envMonitorAlarmRegistForm = envMonitorAlarmRegistForm;
	}

	public EnvMonitorGasAlarm24hours getEnvMonitorGasAlarm24hours() {
		targetString = 51;
		return envMonitorGasAlarm24hours;
	}

	public void setEnvMonitorGasAlarm24hours(
			EnvMonitorGasAlarm24hours envMonitorGasAlarm24hours) {
		this.envMonitorGasAlarm24hours = envMonitorGasAlarm24hours;
	}

	public LgtAlarmManage getLgtAlarmManage() {
		targetString = 52;
		return lgtAlarmManage;
	}

	public void setLgtAlarmManage(LgtAlarmManage lgtAlarmManage) {
		this.lgtAlarmManage = lgtAlarmManage;
	}

	public LgtAlarmThreshold getLgtAlarmThreshold() {
		targetString = 53;
		return lgtAlarmThreshold;
	}

	public void setLgtAlarmThreshold(LgtAlarmThreshold lgtAlarmThreshold) {
		this.lgtAlarmThreshold = lgtAlarmThreshold;
	}

	public LgtAlarmTimes getLgtAlarmTimes() {
		targetString = 54;
		return lgtAlarmTimes;
	}

	public void setLgtAlarmTimes(LgtAlarmTimes lgtAlarmTimes) {
		this.lgtAlarmTimes = lgtAlarmTimes;
	}

	public LgtBlacklistInfo getLgtBlacklistInfo() {
		targetString = 55;
		return lgtBlacklistInfo;
	}

	public void setLgtBlacklistInfo(LgtBlacklistInfo lgtBlacklistInfo) {
		this.lgtBlacklistInfo = lgtBlacklistInfo;
	}

	public LgtCarRealTimePostion getLgtCarRealTimePostion() {
		targetString = 56;
		return lgtCarRealTimePostion;
	}

	public void setLgtCarRealTimePostion(
			LgtCarRealTimePostion lgtCarRealTimePostion) {
		this.lgtCarRealTimePostion = lgtCarRealTimePostion;
	}

	public LgtDanCarAttRel getLgtDanCarAttRel() {
		targetString = 57;
		return lgtDanCarAttRel;
	}

	public void setLgtDanCarAttRel(LgtDanCarAttRel lgtDanCarAttRel) {
		this.lgtDanCarAttRel = lgtDanCarAttRel;
	}

	public LgtDangerousCarInfo getLgtDangerousCarInfo() {
		targetString = 58;
		return lgtDangerousCarInfo;
	}

	public void setLgtDangerousCarInfo(LgtDangerousCarInfo lgtDangerousCarInfo) {
		this.lgtDangerousCarInfo = lgtDangerousCarInfo;
	}

	public LgtEmergencyInfo getLgtEmergencyInfo() {
		targetString = 59;
		return lgtEmergencyInfo;
	}

	public void setLgtEmergencyInfo(LgtEmergencyInfo lgtEmergencyInfo) {
		this.lgtEmergencyInfo = lgtEmergencyInfo;
	}

	public LgtEnterpriseInfo getLgtEnterpriseInfo() {
		targetString = 60;
		return lgtEnterpriseInfo;
	}

	public void setLgtEnterpriseInfo(LgtEnterpriseInfo lgtEnterpriseInfo) {
		this.lgtEnterpriseInfo = lgtEnterpriseInfo;
	}

	public LgtGoodsManageInfo getLgtGoodsManageInfo() {
		targetString = 61;
		return lgtGoodsManageInfo;
	}

	public void setLgtGoodsManageInfo(LgtGoodsManageInfo lgtGoodsManageInfo) {
		this.lgtGoodsManageInfo = lgtGoodsManageInfo;
	}

	public LgtGoodsSourceInfo getLgtGoodsSourceInfo() {
		targetString = 62;
		return lgtGoodsSourceInfo;
	}

	public void setLgtGoodsSourceInfo(LgtGoodsSourceInfo lgtGoodsSourceInfo) {
		this.lgtGoodsSourceInfo = lgtGoodsSourceInfo;
	}

	public LgtRestrictedAreaInfo getLgtRestrictedAreaInfo() {
		targetString = 63;
		return lgtRestrictedAreaInfo;
	}

	public void setLgtRestrictedAreaInfo(
			LgtRestrictedAreaInfo lgtRestrictedAreaInfo) {
		this.lgtRestrictedAreaInfo = lgtRestrictedAreaInfo;
	}

	public LgtVehicleScheduling getLgtVehicleScheduling() {
		targetString = 64;
		return lgtVehicleScheduling;
	}

	public void setLgtVehicleScheduling(
			LgtVehicleScheduling lgtVehicleScheduling) {
		this.lgtVehicleScheduling = lgtVehicleScheduling;
	}

	public LgtWaybillGoods getLgtWaybillGoods() {
		targetString = 65;
		return lgtWaybillGoods;
	}

	public void setLgtWaybillGoods(LgtWaybillGoods lgtWaybillGoods) {
		this.lgtWaybillGoods = lgtWaybillGoods;
	}

	public LgtWaybillGoodsTemplate getLgtWaybillGoodsTemplate() {
		targetString = 66;
		return lgtWaybillGoodsTemplate;
	}

	public void setLgtWaybillGoodsTemplate(
			LgtWaybillGoodsTemplate lgtWaybillGoodsTemplate) {
		this.lgtWaybillGoodsTemplate = lgtWaybillGoodsTemplate;
	}

	public LgtWaybillInfo getLgtWaybillInfo() {
		targetString = 67;
		return lgtWaybillInfo;
	}

	public void setLgtWaybillInfo(LgtWaybillInfo lgtWaybillInfo) {
		this.lgtWaybillInfo = lgtWaybillInfo;
	}

	public SecCEiAccidents getSecCEiAccidents() {
		targetString = 68;
		return secCEiAccidents;
	}

	public void setSecCEiAccidents(SecCEiAccidents secCEiAccidents) {
		this.secCEiAccidents = secCEiAccidents;
	}

	public SecCEiAdmiliceinfo getSecCEiAdmiliceinfo() {
		targetString = 69;
		return secCEiAdmiliceinfo;
	}

	public void setSecCEiAdmiliceinfo(SecCEiAdmiliceinfo secCEiAdmiliceinfo) {
		this.secCEiAdmiliceinfo = secCEiAdmiliceinfo;
	}

	public SecCEiChemical getSecCEiChemical() {
		targetString = 70;
		return secCEiChemical;
	}

	public void setSecCEiChemical(SecCEiChemical secCEiChemical) {
		this.secCEiChemical = secCEiChemical;
	}

	public SecCEiDangerindustry getSecCEiDangerindustry() {
		targetString = 71;
		return secCEiDangerindustry;
	}

	public void setSecCEiDangerindustry(
			SecCEiDangerindustry secCEiDangerindustry) {
		this.secCEiDangerindustry = secCEiDangerindustry;
	}

	public SecCEiDangsrc getSecCEiDangsrc() {
		targetString = 72;
		return secCEiDangsrc;
	}

	public void setSecCEiDangsrc(SecCEiDangsrc secCEiDangsrc) {
		this.secCEiDangsrc = secCEiDangsrc;
	}

	public SecCEiEnterpriseaudit getSecCEiEnterpriseaudit() {
		targetString = 73;
		return secCEiEnterpriseaudit;
	}

	public void setSecCEiEnterpriseaudit(
			SecCEiEnterpriseaudit secCEiEnterpriseaudit) {
		this.secCEiEnterpriseaudit = secCEiEnterpriseaudit;
	}

	public SecCEiEnterpriseinfo getSecCEiEnterpriseinfo() {
		targetString = 74;
		return secCEiEnterpriseinfo;
	}

	public void setSecCEiEnterpriseinfo(
			SecCEiEnterpriseinfo secCEiEnterpriseinfo) {
		this.secCEiEnterpriseinfo = secCEiEnterpriseinfo;
	}

	public SecCEiFireworksindustry getSecCEiFireworksindustry() {
		targetString = 75;
		return secCEiFireworksindustry;
	}

	public void setSecCEiFireworksindustry(
			SecCEiFireworksindustry secCEiFireworksindustry) {
		this.secCEiFireworksindustry = secCEiFireworksindustry;
	}

	public SecCEiKeyplace getSecCEiKeyplace() {
		targetString = 76;
		return secCEiKeyplace;
	}

	public void setSecCEiKeyplace(SecCEiKeyplace secCEiKeyplace) {
		this.secCEiKeyplace = secCEiKeyplace;
	}

	public SecCEiSecucheck getSecCEiSecucheck() {
		targetString = 77;
		return secCEiSecucheck;
	}

	public void setSecCEiSecucheck(SecCEiSecucheck secCEiSecucheck) {
		this.secCEiSecucheck = secCEiSecucheck;
	}

	public SecCEiStand getSecCEiStand() {
		targetString = 78;
		return secCEiStand;
	}

	public void setSecCEiStand(SecCEiStand secCEiStand) {
		this.secCEiStand = secCEiStand;
	}

	public SecCStEntsafescore getSecCStEntsafescore() {
		targetString = 79;
		return secCStEntsafescore;
	}

	public void setSecCStEntsafescore(SecCStEntsafescore secCStEntsafescore) {
		this.secCStEntsafescore = secCStEntsafescore;
	}

}
