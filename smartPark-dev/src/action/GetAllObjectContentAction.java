package action;

import org.apache.struts2.ServletActionContext;

import com.mdd.model.*;
import com.mdd.util.JSONSerializer;
import com.opensymphony.xwork2.ActionSupport;

public class GetAllObjectContentAction extends ActionSupport {
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String result = "{" + jsonPart(energyAlarmInterval) + ","
				+ jsonPart(energyCollectData) + ","
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
				+ jsonPart(energyMessageRelEnt) + ","
				+ jsonPart(energyMeterDevice) + ","
				+ jsonPart(energyRawCoal) + ","
				+ jsonPart(energyStaticData) + ","
				+ jsonPart(energySynthesizeEnergyUse) + ","
				+ jsonPart(energyTerminal) + ","
				+ jsonPart(energyTradeFile) + ","
				+ jsonPart(energyTradeInfo) + ","
				+ jsonPart(energyUseAudit) + ","
				+ jsonPart(energyUseAuditRecord) + ","
				+ jsonPart(energyUseEnergyEquipment) + ","
				+ jsonPart(energyVapour) + ","
				+ jsonPart(energyWaterMeter) + ","
				+ jsonPart(eneSupEneUnitRelFile) + ","
				+ jsonPart(eneUseEneEquipmentFile) + ","
				+ jsonPart(envCoreAreas) + ","
				+ jsonPart(envCoreControlZone) + ","
				+ jsonPart(envCoreDischargeOutletInfo) + ","
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
				+ jsonPart(lgtAlarmManage) + ","
				+ jsonPart(lgtAlarmThreshold) + ","
				+ jsonPart(lgtAlarmTimes) + ","
				+ jsonPart(lgtBlacklistManage) + ","
				+ jsonPart(lgtCarDispatch) + ","
				+ jsonPart(lgtCarRealTimePostion) + ","
				+ jsonPart(lgtDanCarAttRel) + ","
				+ jsonPart(lgtDangerousCarInfo) + ","
				+ jsonPart(lgtEmergencyInfo) + ","
				+ jsonPart(lgtEnterprise) + ","
				+ jsonPart(lgtKaOpen) + ","
				+ jsonPart(lgtParkArea) + ","
				+ jsonPart(lgtRestrictedAreaInfo) + ","
				+ jsonPart(lgtSolveRoute) + ","
				+ jsonPart(lgtSourceGoods) + ","
				+ jsonPart(lgtSourceGoodsInfo) + ","
				+ jsonPart(lgtWaybillGoods) + ","
				+ jsonPart(lgtWaybillGoodsTemplate) + ","
				+ jsonPart(lgtWaybillInfo) + ","
				+ jsonPart(secCEiAccidents) + ","
				+ jsonPart(secCEiAdmiliceinfo) + ","
				+ jsonPart(secCEiChemical) + ","
				+ jsonPart(secCEiDangerindustry) + ","
				+ jsonPart(secCEiDangsrc) + ","
				+ jsonPart(secCEiEnterpriseaudit) + ","
				+ jsonPart(secCEiEnterpriseinfo) + ","
				+ jsonPart(secCEiFireworksindustry) + ","
				+ jsonPart(secCEiKeyplace) + ","
				+ jsonPart(secCEiSecucheck) + ","
				+ jsonPart(secCEiStand) + ","
				+ jsonPart(secCStEntsafescore) + ","
				+ jsonPart(energySupplyEnergyUnitData) + ","
				+ jsonPart(lgtPipeLocation) + ","
				+ jsonPart(lgtPipeManage) +  "}";
		System.out.println(result);
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
