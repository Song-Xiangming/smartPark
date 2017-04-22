var tableNameMap = {
    SEC_C_EI_ENTERPRISEINFO : {
        NO : 1,
        NAME : '企业基本信息表',
        ENTERPRISE_ID : '企业标识'
    },
    SEC_C_EI_ENTERPRISEAUDIT : {
        NO : 2,
        NAME : '企业基本信息审核表'
    },
    SEC_C_EI_DANGERINDUSTRY : {
        NO : 3,
        NAME : '危险化学品企业行业信息'
    },
    SEC_C_EI_FIREWORKSINDUSTRY : {
        NO : 4,
        NAME : '烟花爆竹企业行业信息'
    },
    SEC_C_EI_CHEMICAL : {
        NO : 5,
        NAME : '企业化学品信息'
    },
    SEC_C_EI_ACCIDENTS : {
        NO : 6,
        NAME : '安全生产事故'
    },
    SEC_C_EI_STAND : {
        NO : 7,
        NAME : '企业标准化证书信息'
    },
    SEC_C_EI_ADMILICEINFO : {
        NO : 8,
        NAME : '企业行政许可信息'
    },
    SEC_C_EI_SECUCHECK : {
        NO : 9,
        NAME : '企业安全检查信息'
    },
    SEC_C_ST_ENTSAFESCORE : {
        NO : 10,
        NAME : '企业安评信息表'
    },
    SEC_C_EI_DANGSRC : {
        NO : 11,
        NAME : '企业重大危险源信息'
    },
    SEC_C_EI_KEYPLACE : {
        NO : 12,
        NAME : '企业重点场所信息'
    },
    LGT_ENTERPRISE_INFO : {
        NO : 1,
        NAME : '企业基本信息表'
    },
    LGT_RESTRICTED_AREA_INFO : {
        NO : 2,
        NAME : '区域限制表'
    },
    LGT_DANGEROUS_CAR_INFO : {
        NO : 4,
        NAME : '危险品车辆信息表'
    },
    LGT_DAN_CAR_ATT_REL : {
        NO : 5,
        NAME : '危险品车辆附件关系'
    },
    LGT_ALARM_TIMES : {
        NO : 7,
        NAME : '报警次数信息表'
    },
    LGT_ALARM_MANAGE : {
        NO : 8,
        NAME : '报警管理信息表'
    },
    LGT_ALARM_THRESHOLD : {
        NO : 9,
        NAME : '报警阈值信息表'
    },
    LGT_EMERGENCY_INFO : {
        NO : 10,
        NAME : '突发信息表'
    },
    LGT_GOODS_SOURCE_INFO : {
        NO : 13,
        NAME : '货源基本信息'
    },
    LGT_GOODS_MANAGE_INFO : {
        NO : 14,
        NAME : '货源管理'
    },
    LGT_WAYBILL_GOODS : {
        NO : 15,
        NAME : '货物信息表'
    },
    LGT_WAYBILL_GOODS_TEMPLATE : {
        NO : 16,
        NAME : '货物模板信息表'
    },
    LGT_CAR_REAL_TIME_POSTION : {
        NO : 18,
        NAME : '车辆实时位置表（运送运单车辆）'
    },
    LGT_VEHICLE_SCHEDULING : {
        NO : 19,
        NAME : '车辆调度'
    },
    LGT_WAYBILL_INFO : {
        NO : 20,
        NAME : '运单信息表'
    },
    LGT_BLACKLIST_INFO : {
        NO : 21,
        NAME : '黑名单信息表'
    },
    ENERGY_MESSAGE_REL_ENT : {
        NO : 1,
        NAME : '业务公式企业表'
    },
    ENERGY_ENTERPRISE_POSITION : {
        NO : 2,
        NAME : '企业位置信息表'
    },
    ENERGY_ENTERPRISE_INFO : {
        NO : 3,
        NAME : '企业信息表'
    },
    ENERGY_ENTERPRISE_TARGET : {
        NO : 4,
        NAME : '企业用能指标表'
    },
    ENERGY_ENT_YEAR_REPORT : {
        NO : 5,
        NAME : '企业能源年报表'
    },
    ENERGY_ENT_MONTH_REPORT : {
        NO :6,
        NAME : '企业能源月报表'
    },
    ENERGY_CONSUMPTION_DATA_RED : {
        NO : 7,
        NAME : '企业能源（能耗）实时数据'
    },
    ENERGY_CONSUMPTION_RECORD : {
        NO : 8,
        NAME : '企业能源（能耗）数据记录'
    },
    ENERGY_RAW_COAL : {
        NO : 11,
        NAME : '原煤表'
    },
    ENERGY_GARDEN_TARGET : {
        NO : 12,
        NAME : '园区用能指标信息表'
    },
    ENERGY_WATER_METER : {
        NO : 13,
        NAME : '水表'
    },
    ENERGY_TRADE_INFO : {
        NO : 14,
        NAME : '用能交易信息表'
    },
    ENERGY_TRADE_FILE : {
        NO : 15,
        NAME : '用能交易附件'
    },
    ENERGY_USE_AUDIT : {
        NO : 16,
        NAME : '用能审计表'
    },
    ENERGY_USE_AUDIT_RECORD : {
        NO : 17,
        NAME : '用能审计记录表'
    },
    ENERGY_TERMINAL : {
        NO : 22,
        NAME : '能源计量终端'
    },
    ENERGY_COLLECT_SPOT : {
        NO : 23,
        NAME : '能源采集点'
    },
    ENERGY_VAPOUR : {
        NO : 24,
        NAME : '蒸汽表'
    },
    ENERGY_COLLECT_MACHINE : {
        NO : 26,
        NAME : '采集器信息表'
    },
    ENERGY_COLLECT_DATA : {
        NO : 27,
        NAME : '采集点数据'
    },
    ENV_CORE_ENTERPRISE_KIND : {
        NO : 1,
        NAME : '企业种类'
    },
    ENV_CORE_VALLEY : {
        NO : 2,
        NAME : '流域'
    },
    ENV_CORE_AREAS : {
        NO : 3,
        NAME : '地区'
    },
    ENV_CORE_KEY_POINT_TYPE : {
        NO : 4,
        NAME : '重点类型'
    },
    ENV_CORE_INDUSTRY_CATEGORY : {
        NO : 5,
        NAME : '行业类别'
    },
    ENV_CORE_REGISTER_TYPE : {
        NO : 6,
        NAME : '注册类型'
    },
    ENV_CORE_ENTERPRISE_SCALE : {
        NO : 7,
        NAME : '企业规模'
    },
    ENV_CORE_SUBORDINATION : {
        NO : 8,
        NAME : '隶属关系'
    },
    ENV_CORE_ENTERPRISE_TYPE : {
        NO : 9,
        NAME : '企业类别'
    },
    ENV_CORE_ENTERPRISE_INFO : {
        NO : 10,
        NAME : '企业信息'
    },
    ENV_CORE_EMERGENCY_PLAN : {
        NO : 11,
        NAME : '应急预案'
    },
    ENV_CORE_RADIATE_SAFETY_PERMIT : {
        NO : 12,
        NAME : '放射源信息-辐射安全许可信息'
    },
    ENV_CORE_RADIOACTIVE_SOURCE : {
        NO : 13,
        NAME : '放射源信息-放射源'
    },
    ENV_CORE_RAY_DEVICE : {
        NO : 14,
        NAME : '放射源信息-射线装置'
    },
    ENV_CORE_POLLUTANT_TYPE : {
        NO : 15,
        NAME : '污染物类型'
    },
    ENV_CORE_POLLUTANT : {
        NO : 16,
        NAME : '污染物'
    },
    ENV_CORE_POLLUTANT_UNIT : {
        NO : 17,
        NAME : '污染物计量单位'
    },
    ENV_CORE_POLL_STANDARD_LIMIT : {
        NO : 18,
        NAME : '污染物标准限值'
    },
    ENV_CORE_VALLEY_FUNCTION_TYPE : {
        NO : 19,
        NAME : '水功能区类别编码'
    },
    ENV_CORE_GAS_FUNCTION_TYPE : {
        NO : 20,
        NAME : '气功能区类别编码'
    },
    ENV_CORE_FUEL_TYPE : {
        NO : 21,
        NAME : '燃料类型'
    },
    ENV_CORE_OUTLET_TYPE : {
        NO : 22,
        NAME : '排放口类型'
    },
    ENV_CORE_SEWAGE_DISCHARGE : {
        NO : 23,
        NAME : '排放去向'
    },
    ENV_CORE_DISCHARGE_RULE : {
        NO : 24,
        NAME : '排放规则'
    },
    ENV_CORE_CONTROL_ZONE : {
        NO : 25,
        NAME : '控制区'
    },
    ENV_CORE_DISCHARGE_OUTLET_INFO : {
        NO : 26,
        NAME : '排放口登记信息库'
    },
    ENV_CORE_LETOUT_STATE_CONTROL : {
        NO : 27,
        NAME : '排放口国控名单记录表'
    },
    ENV_CORE_ENT_POLLUTANT : {
        NO : 28,
        NAME : '企业污染物'
    },
    ENV_MONITOR_ALARM_REGIST_FORM : {
        NO : 29,
        NAME : '报警处置单登记表'
    },
    ENV_MONITOR_ALARM_LOG : {
        NO : 30,
        NAME : '报警信息'
    },
    ENV_MONITOR_GAS_ALARM_24HOURS : {
        NO : 31,
        NAME : '废气连续24小时超标记录表'
    },
}
