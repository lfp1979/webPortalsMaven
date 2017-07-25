package ok3w.util;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ok3w.service.IService;
import ok3w.service.WsService;

public class Util {
	private static IService getWsService()
	{
		return new WsService();
	}
	private static IService getEjbService()
	{
		IService s = null;
		Hashtable<String, String> props = new Hashtable<String, String>();
		props.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
		
		try {
			Context context = new InitialContext(props);
			 s=(IService) context.lookup("ejb:webPortalsEar-1.0/webPortalsEjb-1.0/IServiceImp!ok3w.service.IService");
			  } catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	public static IService getService()
	{
		//ejb mode
		 // return getEjbService();
		//webSevice mode
		return getWsService();
	}
}
