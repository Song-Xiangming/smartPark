package com.mdd.test;

import java.util.Iterator;
import java.util.List;

import com.mdd.dao.BaseDAO;
import com.mdd.model.EnergyCollectData;


public class TestHibernateUtil {
	public static void main(String[] args) {
		
		// 1. add
//		EnergyCollectData ecd = new EnergyCollectData();
//		ecd.setEid("003");
//		ecd.setUploadType("computer");
//		ecd.setSubsystemId("sub02");
//		BaseDAO.add(ecd);
		
		// 2. get
//		EnergyCollectData ecd2 = (EnergyCollectData) BaseDAO.get(EnergyCollectData.class, "002");
//		System.out.println("用户ID为002的用户数据：" + ecd2.getUploadType() + "-->"
//				+ ecd2.getSubsystemId());
		
		// 3. update
//		ecd2.setUploadType("computer");
//		ecd2.setSubsystemId("sub202");
//		BaseDAO.update(ecd2);
//		System.out.println("用户ID为002的用户数据：" + ecd2.getUploadType() + "-->"
//				+ ecd2.getSubsystemId());

		// 4. query all
//		String[] para = { "computer" };
//		List<EnergyCollectData> list = BaseDAO.query("from EnergyCollectData e where e.uploadType=?", para);
//		Iterator iter = list.iterator();
//		EnergyCollectData ect3 = null;
//		while (iter.hasNext()) {
//			ect3 = (EnergyCollectData) iter.next();
//			System.out.println(ect3.getEid() + "-->" + ect3.getSubsystemId());
//		}
		
		// 5. del by id
		EnergyCollectData ecd5 = new EnergyCollectData(); 
		ecd5.setEid("003"); 
		BaseDAO.delete(ecd5);
		System.out.println("删除了ID为003的用户！");
		
	}
}
