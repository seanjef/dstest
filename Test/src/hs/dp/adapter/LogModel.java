package hs.dp.adapter;

import java.io.Serializable;

public class LogModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5956287521969031285L;

	private String logId;
	private String operateUser;
	private String operateTime;
	private String logContent;
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getOperateUser() {
		return operateUser;
	}
	public void setOperateUser(String operateUser) {
		this.operateUser = operateUser;
	}
	public String getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getLogContent() {
		return logContent;
	}
	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString(){
		return "logId="+logId+",operateUser="+operateUser+",operateTime"+operateTime+",logContent"+logContent;
	}
	
}
