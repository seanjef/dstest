package hs.dp.adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogModel lml = new LogModel();
		lml.setLogId("001");
		lml.setOperateUser("admin");
		lml.setOperateTime(new Date(System.currentTimeMillis()).toString());
		lml.setLogContent("第一次測試");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lml);
		
		LogFileOperateApi fapi = new LogFileOperate("");
		fapi.writeLogFile(list);
		
		List<LogModel> readLog = fapi.readLogFile();
		System.out.println(readLog);
	}

}
