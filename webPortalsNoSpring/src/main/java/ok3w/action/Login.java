package ok3w.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionContext;

import ok3w.entity.Admin;
import ok3w.service.IService;
import ok3w.util.Util;

public class Login {
	
	private IService service=Util.getService();
	 private String msg;
	 private String name;
	 private String pwd;
	 private String rand;
	 private String prePage;
	 private InputStream inputStream;
	 private boolean validate_rand()
	 {
		 String rand_str =(String)ServletActionContext.getContext().getSession().get("rand");
		 if(rand_str.equals(rand))
		   return true;
		  else 
		   return false;
	 }
	public String login() 
	{
		return "login";
	}
	public String logout() 
	{
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("login");
		String msg="�����˳���½��";
		
        try {
			setInputStream(new ByteArrayInputStream(msg.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "logout";
	}
	public String validate() 
	{
	     Admin user=service.getAdmin(name);
          // ��ȡsession
         Map<String, Object> session = ActionContext.getContext().getSession();
	     int today=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	  	 session.put("login", name);		    	
	     if(!validate_rand())
	     {
	      
	      msg="��֤�벻��ȷ��";
	      return "login";	
	     }
	     if(user==null)
	     {
		    msg="�û��������ڣ�";
		    return "login";	
		  }
	     if(user.getLoginDate().getDate()!=today)
	     {
	    	user.setLoginDate(new Date(System.currentTimeMillis()));
	    	user.setErrorTimes(0);
	    	service.updateAdmin(user);
	     }
	       else if (user.getErrorTimes()==2)
	       {
	    	  msg="��½�����ﵽ��";
			    return "login";	
	       }
		 if (!service.validate(name, pwd))
		  {
			user.setErrorTimes(user.getErrorTimes()+1);
	    	service.updateAdmin(user);
	    	msg="�û������벻��ȷ��";
			return "login";
		  }	  
			prePage = (String) session.get("prePage");
			//���session�е�����
			session.remove("prePage");
			
			//������������ת����½ҳ��ģ�ֱ�ӷ��ʵĵ�½ҳ��
		 if (prePage != null) 
			return "prePage";

		 return "success"; 
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrePage() {
		return prePage;
	}
	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRand() {
		return rand;
	}

	public void setRand(String rand) {
		this.rand = rand;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
}
