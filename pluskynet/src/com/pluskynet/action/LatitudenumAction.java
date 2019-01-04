package com.pluskynet.action;

import java.util.List;

import com.pluskynet.domain.Latitudenum;
import com.pluskynet.service.LatitudenumService;
import com.pluskynet.util.BaseAction;
import com.pluskynet.util.HttpRequest;

public class LatitudenumAction extends BaseAction{
	/*
	 * 统计各个维度的数量
	 */
	private Latitudenum latitudenum;
	
	public Latitudenum getLatitudenum() {
		return latitudenum;
	}

	public void setLatitudenum(Latitudenum latitudenum) {
		this.latitudenum = latitudenum;
	}

	@Override
	public Object getModel() {
		latitudenum = new Latitudenum();
		return latitudenum;
	}
	private LatitudenumService latitudenumService;
	
	public void setLatitudenumService(LatitudenumService latitudenumService) {
		this.latitudenumService = latitudenumService;
	}
	/*
	 * 统计各个新跑维度 type=1 ,各个新跑段落 type = 0 的数量
	 */
	public void countlat(){
		List<Latitudenum> list= latitudenumService.countlat(latitudenum.getType());
		HttpRequest httpRequest = new HttpRequest();
		httpRequest.sendPost("http://39.104.183.189:8081/pluskynet/LatitudenumAction!countlat.action",latitudenum.toString());
		outJsonByMsg(list,list.size(),"成功","");
	}

}
