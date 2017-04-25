package action;

import org.apache.struts2.ServletActionContext;

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
import com.mdd.util.JSONSerializer;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllObjectContentAction extends ActionSupport {
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

	// EnergyConsumptionRecord
	// EnergyEnterpriseInfo
	// EnergyEnterprisePosition
	// EnergyEnterpriseTarget
	// EnergyEntMonthReport
	// EnergyEntYearReport
	// EnergyGardenTarget
	// EnergyMessageRelEnt
	// EnergyRawCoal
	// EnergyTerminal
	// EnergyTradeFile
	// EnergyTradeInfo
	// EnergyUseAudit
	// EnergyUseAuditRecord
	// EnergyVapour
	// EnergyWaterMeter
	// EnvCoreAreas
	// EnvCoreControlZone
	// EnvCoreDischargeOutletInfo
	// EnvCoreDischargeRule
	// EnvCoreEmergencyPlan
	// EnvCoreEnterpriseInfo
	// EnvCoreEnterpriseKind
	// EnvCoreEnterpriseScale
	// EnvCoreEnterpriseType
	// EnvCoreEntPollutant
	// EnvCoreFuelType
	// EnvCoreGasFunctionType
	// EnvCoreIndustryCategory
	// EnvCoreKeyPointType
	// EnvCoreLetoutStateControl
	// EnvCoreOutletType
	// EnvCorePollStandardLimit
	// EnvCorePollutant
	// EnvCorePollutantType
	// EnvCorePollutantUnit
	// EnvCoreRadiateSafetyPermit
	// EnvCoreRadioactiveSource
	// EnvCoreRayDevice
	// EnvCoreRegisterType
	// EnvCoreSewageDischarge
	// EnvCoreSubordination
	// EnvCoreValley
	// EnvCoreValleyFunctionType
	// EnvMonitorAlarmLog
	// EnvMonitorAlarmRegistForm
	// EnvMonitorGasAlarm24hours
	// LgtAlarmManage
	// LgtAlarmThreshold
	// LgtAlarmTimes
	// LgtBlacklistInfo
	// LgtCarRealTimePostion
	// LgtDanCarAttRel
	// LgtDangerousCarInfo
	// LgtEmergencyInfo
	// LgtEnterpriseInfo
	// LgtGoodsManageInfo
	// LgtGoodsSourceInfo
	// LgtRestrictedAreaInfo
	// LgtVehicleScheduling
	// LgtWaybillGoods
	// LgtWaybillGoodsTemplate
	// LgtWaybillInfo
	// SecCEiAccidents
	// SecCEiAdmiliceinfo
	// SecCEiChemical
	// SecCEiDangerindustry
	// SecCEiDangsrc
	// SecCEiEnterpriseaudit
	// SecCEiEnterpriseinfo
	// SecCEiFireworksindustry
	// SecCEiKeyplace
	// SecCEiSecucheck
	// SecCEiStand
	// SecCStEntsafescore

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String result = "{" + jsonPart(energyCollectData) + ","
				+ jsonPart(energyCollectMachine) + ","
				+ jsonPart(energyCollectSpot) + ","
				+ jsonPart(energyConsumptionDataRed) + ","
				+ jsonPart(energyConsumptionRecord) + ","
				+ jsonPart(energyEnterpriseInfo) + ","
				+ jsonPart(energyEnterprisePosition) + ","
				+ jsonPart(energyEnterpriseTarget) + ","
				+ jsonPart(energyEntMonthReport) + ","
				+ jsonPart(energyEntYearReport) + ","
				+ jsonPart(energyGardenTarget) + ","
				+ jsonPart(energyMessageRelEnt) + "," + jsonPart(energyRawCoal)
				+ "," + jsonPart(energyTerminal) + ","
				+ jsonPart(energyTradeFile) + "," + jsonPart(energyTradeInfo)
				+ "," + jsonPart(energyUseAudit) + ","
				+ jsonPart(energyUseAuditRecord) + "," + jsonPart(energyVapour)
				+ "," + jsonPart(energyWaterMeter) + ","
				+ jsonPart(envCoreAreas) + "," + jsonPart(envCoreControlZone)
				+ "," + jsonPart(envCoreDischargeOutletInfo) + ","
				+ jsonPart(envCoreDischargeRule) + ","
				+ jsonPart(envCoreEmergencyPlan) + ","
				+ jsonPart(envCoreEnterpriseInfo) + ","
				+ jsonPart(envCoreEnterpriseKind) + ","
				+ jsonPart(envCoreEnterpriseScale) + ","
				+ jsonPart(envCoreEnterpriseType) + ","
				+ jsonPart(envCoreEntPollutant) + ","
				+ jsonPart(envCoreFuelType) + ","
				+ jsonPart(envCoreGasFunctionType) + ","
				+ jsonPart(envCoreIndustryCategory) + ","
				+ jsonPart(envCoreKeyPointType) + ","
				+ jsonPart(envCoreLetoutStateControl) + ","
				+ jsonPart(envCoreOutletType) + ","
				+ jsonPart(envCorePollStandardLimit) + ","
				+ jsonPart(envCorePollutant) + ","
				+ jsonPart(envCorePollutantType) + ","
				+ jsonPart(envCorePollutantUnit) + ","
				+ jsonPart(envCoreRadiateSafetyPermit) + ","
				+ jsonPart(envCoreRadioactiveSource) + ","
				+ jsonPart(envCoreRayDevice) + ","
				+ jsonPart(envCoreRegisterType) + ","
				+ jsonPart(envCoreSewageDischarge) + ","
				+ jsonPart(envCoreSubordination) + ","
				+ jsonPart(envCoreValley) + ","
				+ jsonPart(envCoreValleyFunctionType) + ","
				+ jsonPart(envMonitorAlarmLog) + ","
				+ jsonPart(envMonitorAlarmRegistForm) + ","
				+ jsonPart(envMonitorGasAlarm24hours) + ","
				+ jsonPart(lgtAlarmManage) + "," + jsonPart(lgtAlarmThreshold)
				+ "," + jsonPart(lgtAlarmTimes) + ","
				+ jsonPart(lgtBlacklistInfo) + ","
				+ jsonPart(lgtCarRealTimePostion) + ","
				+ jsonPart(lgtDanCarAttRel) + ","
				+ jsonPart(lgtDangerousCarInfo) + ","
				+ jsonPart(lgtEmergencyInfo) + ","
				+ jsonPart(lgtEnterpriseInfo) + ","
				+ jsonPart(lgtGoodsManageInfo) + ","
				+ jsonPart(lgtGoodsSourceInfo) + ","
				+ jsonPart(lgtRestrictedAreaInfo) + ","
				+ jsonPart(lgtVehicleScheduling) + ","
				+ jsonPart(lgtWaybillGoods) + ","
				+ jsonPart(lgtWaybillGoodsTemplate) + ","
				+ jsonPart(lgtWaybillInfo) + "," + jsonPart(secCEiAccidents)
				+ "," + jsonPart(secCEiAdmiliceinfo) + ","
				+ jsonPart(secCEiChemical) + ","
				+ jsonPart(secCEiDangerindustry) + ","
				+ jsonPart(secCEiDangsrc) + ","
				+ jsonPart(secCEiEnterpriseaudit) + ","
				+ jsonPart(secCEiEnterpriseinfo) + ","
				+ jsonPart(secCEiFireworksindustry) + ","
				+ jsonPart(secCEiKeyplace) + "," + jsonPart(secCEiSecucheck)
				+ "," + jsonPart(secCEiStand) + ","
				+ jsonPart(secCStEntsafescore) + "}";
		ServletActionContext.getRequest().setAttribute("result", result);
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
		return ("\"" + name + "\"" + ":" + result).replace('\"', '\'');
	}

}
