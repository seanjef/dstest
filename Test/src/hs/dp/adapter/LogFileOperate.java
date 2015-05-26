package hs.dp.adapter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {
	
	private String logFilePathName = "AdapterLog.log";
	
	
	
	public LogFileOperate(String logFilePathName) {
		super();
		if(logFilePathName != null && logFilePathName.trim().length() >0)
		this.logFilePathName = logFilePathName;
	}

	@Override
	public List<LogModel> readLogFile() {
		// TODO Auto-generated method stub
		List<LogModel> list = null;
		ObjectInputStream oin = null;
		try{
			File f = new File(logFilePathName);
			if(f.exists()){
				oin = new ObjectInputStream(
					  new BufferedInputStream(
					  new FileInputStream(f)));
				
			}
			list = (List<LogModel>)oin.readObject();
		}catch(Exception e){e.printStackTrace();
		}finally{
			try{
				if(oin!=null)oin.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		return list;
	}

	@Override
	public void writeLogFile(List<LogModel> list) {
		// TODO Auto-generated method stub
		File f = new File(logFilePathName);
		ObjectOutputStream oout = null;
		try{
			oout = new ObjectOutputStream(
				   new BufferedOutputStream(
				   new FileOutputStream(f)));
			oout.writeObject(list);
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				oout.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
