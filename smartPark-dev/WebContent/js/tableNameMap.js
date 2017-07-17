var tableNameMap = {
    SECCEIENTERPRISEINFO : {
        NO : 1,
        NAME : '企业基本信息表',
        ENTERPRISEID : '企业标识'
    },
    SECCEIENTERPRISEAUDIT : {
        NO : 2,
        NAME : '企业基本信息审核表'
    },
    SECCEIDANGERINDUSTRY : {
        NO : 3,
        NAME : '危险化学品企业行业信息'
    },
    SECCEIFIREWORKSINDUSTRY : {
        NO : 4,
        NAME : '烟花爆竹企业行业信息'
    },
    SECCEICHEMICAL : {
        NO : 5,
        NAME : '企业化学品信息'
    },
    SECCEIACCIDENTS : {
        NO : 6,
        NAME : '安全生产事故'
    },
    SECCEISTAND : {
        NO : 7,
        NAME : '企业标准化证书信息'
    },
    SECCEIADMILICEINFO : {
        NO : 8,
        NAME : '企业行政许可信息'
    },
    SECCEISECUCHECK : {
        NO : 9,
        NAME : '企业安全检查信息'
    },
    SECCSTENTSAFESCORE : {
        NO : 10,
        NAME : '企业安评信息表'
    },
    SECCEIDANGSRC : {
        NO : 11,
        NAME : '企业重大危险源信息'
    },
    SECCEIKEYPLACE : {
        NO : 12,
        NAME : '企业重点场所信息'
    },
    LGTENTERPRISE : {
        NO : 1,
        NAME : '企业基本信息表'
    },
    LGTRESTRICTEDAREAINFO : {
        NO : 2,
        NAME : '区域限制表'
    },
    LGTKAOPEN : {
        NO : 3,
        NAME : '卡口表'
    },
    LGTDANGEROUSCARINFO : {
        NO : 4,
        NAME : '危险品车辆信息表'
    },
    LGTDANCARATTREL : {
        NO : 5,
        NAME : '危险品车辆附件关系表'
    },
    LGTPARKAREA : {
        NO : 6,
        NAME : '园区表'
    },
    LGTALARMTIMES : {
        NO : 7,
        NAME : '报警次数信息表'
    },
    LGTALARMMANAGE : {
        NO : 8,
        NAME : '报警管理信息表'
    },
    LGTALARMTHRESHOLD : {
        NO : 9,
        NAME : '报警阈值信息表'
    },
    LGTEMERGENCYINFO : {
        NO : 10,
        NAME : '突发信息表'
    },
    LGTPIPELOCATION : {
        NO : 11,
        NAME : '管道/储罐位置表'
    },
    LGTPIPEMANAGE : {
        NO : 12,
        NAME : '管道/储罐基本信息表'
    },
    LGTSOURCEGOODSINFO : {
        NO : 13,
        NAME : '货源基本信息'
    },
    LGTSOURCEGOODS : {
        NO : 14,
        NAME : '货源管理'
    },
    LGTWAYBILLGOODS : {
        NO : 15,
        NAME : '货物信息表'
    },
    LGTWAYBILLGOODSTEMPLATE : {
        NO : 16,
        NAME : '货物模板信息表'
    },
    LGTSOLVEROUTE : {
        NO : 17,
        NAME : '路径规划表'
    },
    LGTCARREALTIMEPOSTION : {
        NO : 18,
        NAME : '车辆实时位置表（运送运单车辆）'
    },
    LGTCARDISPATCH : {
        NO : 19,
        NAME : '车辆调度'
    },
    LGTWAYBILLINFO : {
        NO : 20,
        NAME : '运单信息表'
    },
    LGTBLACKLISTMANAGE : {
        NO : 21,
        NAME : '黑名单信息表'
    },
    ENERGYMESSAGERELENT : {
        NO : 1,
        NAME : '业务公式企业表'
    },
    ENERGYENTERPRISEPOSITION : {
        NO : 2,
        NAME : '企业位置信息表'
    },
    ENERGYENTERPRISEINFO : {
        NO : 3,
        NAME : '企业信息表'
    },
    ENERGYENTERPRISETARGET : {
        NO : 4,
        NAME : '企业用能指标表'
    },
    ENERGYENTYEARREPORT : {
        NO : 5,
        NAME : '企业能源年报表'
    },
    ENERGYENTMONTHREPORT : {
        NO :6,
        NAME : '企业能源月报表'
    },
    ENERGYCONSUMPTIONDATARED : {
        NO : 7,
        NAME : '企业能源（能耗）实时数据'
    },
    ENERGYCONSUMPTIONRECORD : {
        NO : 8,
        NAME : '企业能源（能耗）数据记录'
    },
    ENERGYSUPPLYENERGYUNITDATA : {
        NO : 9,
        NAME : '供能单位数据'
    },
    ENESUPENEUNITRELFILE : {
        NO : 10,
        NAME : '供能单位数据附件关系表'
    },
    ENERGYRAWCOAL : {
        NO : 11,
        NAME : '原煤表'
    },
    ENERGYGARDENTARGET : {
        NO : 12,
        NAME : '园区用能指标信息表'
    },
    ENERGYWATERMETER : {
        NO : 13,
        NAME : '水表'
    },
    ENERGYTRADEINFO : {
        NO : 14,
        NAME : '用能交易信息表'
    },
    ENERGYTRADEFILE : {
        NO : 15,
        NAME : '用能交易附件'
    },
    ENERGYUSEAUDIT : {
        NO : 16,
        NAME : '用能审计表'
    },
    ENERGYUSEAUDITRECORD : {
        NO : 17,
        NAME : '用能审计记录表'
    },
    ENERGYUSEENERGYEQUIPMENT : {
        NO : 18,
        NAME : '用能设备'
    },
    ENEUSEENEEQUIPMENTFILE : {
        NO : 19,
        NAME : '用能设备附件表'
    },
    ENERGYSTATICDATA : {
        NO : 20,
        NAME : '统计局数据'
    },
    ENERGYSYNTHESIZEENERGYUSE : {
        NO : 21,
        NAME : '综合能耗预警'
    },
    ENERGYTERMINAL : {
        NO : 22,
        NAME : '能源计量终端'
    },
    ENERGYCOLLECTSPOT : {
        NO : 23,
        NAME : '能源采集点'
    },
    ENERGYVAPOUR : {
        NO : 24,
        NAME : '蒸汽表'
    },
    ENERGYMETERDEVICE : {
        NO : 25,
        NAME : '计量仪表'
    },
    ENERGYCOLLECTMACHINE : {
        NO : 26,
        NAME : '采集器信息表'
    },
    ENERGYCOLLECTDATA : {
        NO : 27,
        NAME : '采集点数据'
    },
    ENERGYALARMINTERVAL : {
        NO : 28,
        NAME : '预警区间表'
    },
    ENVCOREENTERPRISEKIND : {
        NO : 1,
        NAME : '企业种类'
    },
    ENVCOREVALLEY : {
        NO : 2,
        NAME : '流域'
    },
    ENVCOREAREAS : {
        NO : 3,
        NAME : '地区'
    },
    ENVCOREKEYPOINTTYPE : {
        NO : 4,
        NAME : '重点类型'
    },
    ENVCOREINDUSTRYCATEGORY : {
        NO : 5,
        NAME : '行业类别'
    },
    ENVCOREREGISTERTYPE : {
        NO : 6,
        NAME : '注册类型'
    },
    ENVCOREENTERPRISESCALE : {
        NO : 7,
        NAME : '企业规模'
    },
    ENVCORESUBORDINATION : {
        NO : 8,
        NAME : '隶属关系'
    },
    ENVCOREENTERPRISETYPE : {
        NO : 9,
        NAME : '企业类别'
    },
    ENVCOREENTERPRISEINFO : {
        NO : 10,
        NAME : '企业信息'
    },
    ENVCOREEMERGENCYPLAN : {
        NO : 11,
        NAME : '应急预案'
    },
    ENVCORERADIATESAFETYPERMIT : {
        NO : 12,
        NAME : '放射源信息-辐射安全许可信息'
    },
    ENVCORERADIOACTIVESOURCE : {
        NO : 13,
        NAME : '放射源信息-放射源'
    },
    ENVCORERAYDEVICE : {
        NO : 14,
        NAME : '放射源信息-射线装置'
    },
    ENVCOREPOLLUTANTTYPE : {
        NO : 15,
        NAME : '污染物类型'
    },
    ENVCOREPOLLUTANT : {
        NO : 16,
        NAME : '污染物'
    },
    ENVCOREPOLLUTANTUNIT : {
        NO : 17,
        NAME : '污染物计量单位'
    },
    ENVCOREPOLLSTANDARDLIMIT : {
        NO : 18,
        NAME : '污染物标准限值'
    },
    ENVCOREVALLEYFUNCTIONTYPE : {
        NO : 19,
        NAME : '水功能区类别编码'
    },
    ENVCOREGASFUNCTIONTYPE : {
        NO : 20,
        NAME : '气功能区类别编码'
    },
    ENVCOREFUELTYPE : {
        NO : 21,
        NAME : '燃料类型'
    },
    ENVCOREOUTLETTYPE : {
        NO : 22,
        NAME : '排放口类型'
    },
    ENVCORESEWAGEDISCHARGE : {
        NO : 23,
        NAME : '排放去向'
    },
    ENVCOREDISCHARGERULE : {
        NO : 24,
        NAME : '排放规则'
    },
    ENVCORECONTROLZONE : {
        NO : 25,
        NAME : '控制区'
    },
    ENVCOREDISCHARGEOUTLETINFO : {
        NO : 26,
        NAME : '排放口登记信息库'
    },
    ENVCORELETOUTSTATECONTROL : {
        NO : 27,
        NAME : '排放口国控名单记录表'
    },
    ENVCOREENTPOLLUTANT : {
        NO : 28,
        NAME : '企业污染物'
    },
    ENVMONITORALARMREGISTFORM : {
        NO : 29,
        NAME : '报警处置单登记表'
    },
    ENVMONITORALARMLOG : {
        NO : 30,
        NAME : '报警信息'
    },
    ENVMONITORGASALARM24HOURS : {
        NO : 31,
        NAME : '废气连续24小时超标记录表'
    },
}
