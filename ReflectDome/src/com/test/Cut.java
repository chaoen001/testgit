package com.test;

public class Cut {
		private String cid;//切片id
		private String pic_id;//图片id
		private String c_url;//切片路径
		private String c_time;//切片时间
		private String tem_zd;//图片字段
		private String postone;// 1岗的录入员
		private String ponestate;//  1岗的录入状态
		private String ponevalue;//  1岗录入的值
		private String ponedate;// 1岗的录入的时间
		private String posttwo;// 2岗的录入员
		private String ptwostate;//  2岗的录入状态
		private String ptwovalue;//  2岗录入的值
		private String ptwodate;// 2岗的录入的时间
		private String checkpost;// 复核岗的录入员
		private String cpstate;// 复核岗的复核状态
		private String cpvalue;// 复核岗录入的值
		private String cpdate;// 审核岗的审核的时间
		private String among;//录入的状态
		private String name;//图片字段名称
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getPic_id() {
			return pic_id;
		}
		public void setPic_id(String pic_id) {
			this.pic_id = pic_id;
		}
		public String getC_url() {
			return c_url;
		}
		public void setC_url(String c_url) {
			this.c_url = c_url;
		}
		public String getC_time() {
			return c_time;
		}
		public void setC_time(String c_time) {
			this.c_time = c_time;
		}
		public String getTem_zd() {
			return tem_zd;
		}
		public void setTem_zd(String tem_zd) {
			this.tem_zd = tem_zd;
		}
		public String getPostone() {
			return postone;
		}
		public void setPostone(String postone) {
			this.postone = postone;
		}
		public String getPosttwo() {
			return posttwo;
		}
		public void setPosttwo(String posttwo) {
			this.posttwo = posttwo;
		}
		public String getCheckpost() {
			return checkpost;
		}
		public void setCheckpost(String checkpost) {
			this.checkpost = checkpost;
		}
		public String getPonestate() {
			return ponestate;
		}
		public void setPonestate(String ponestate) {
			this.ponestate = ponestate;
		}
		public String getPtwostate() {
			return ptwostate;
		}
		public void setPtwostate(String ptwostate) {
			this.ptwostate = ptwostate;
		}
		public String getCpstate() {
			return cpstate;
		}
		public void setCpstate(String cpstate) {
			this.cpstate = cpstate;
		}
		public String getPonevalue() {
			return ponevalue;
		}
		public void setPonevalue(String ponevalue) {
			this.ponevalue = ponevalue;
		}
		public String getPtwovalue() {
			return ptwovalue;
		}
		public void setPtwovalue(String ptwovalue) {
			this.ptwovalue = ptwovalue;
		}
		public String getCpvalue() {
			return cpvalue;
		}
		public void setCpvalue(String cpvalue) {
			this.cpvalue = cpvalue;
		}
		public String getAmong() {
			return among;
		}
		public void setAmong(String among) {
			this.among = among;
		}
		public String getPonedate() {
			return ponedate;
		}
		public void setPonedate(String ponedate) {
			this.ponedate = ponedate;
		}
		public String getPtwodate() {
			return ptwodate;
		}
		public void setPtwodate(String ptwodate) {
			this.ptwodate = ptwodate;
		}
		public String getCpdate() {
			return cpdate;
		}
		public void setCpdate(String cpdate) {
			this.cpdate = cpdate;
		}
		@Override
		public String toString() {
			return "Cut [cid=" + cid + ", pic_id=" + pic_id + ", c_url=" + c_url + ", c_time=" + c_time + ", tem_zd="
					+ tem_zd + ", postone=" + postone + ", ponestate=" + ponestate + ", ponevalue=" + ponevalue
					+ ", ponedate=" + ponedate + ", posttwo=" + posttwo + ", ptwostate=" + ptwostate + ", ptwovalue="
					+ ptwovalue + ", ptwodate=" + ptwodate + ", checkpost=" + checkpost + ", cpstate=" + cpstate
					+ ", cpvalue=" + cpvalue + ", cpdate=" + cpdate + ", among=" + among + ", name=" + name + "]";
		}
		
}
