package ok3w.interceptor;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
public class UserLoginInterceptor implements Interceptor {
	private static final long serialVersionUID = 1593745236481514166L;
	public void destroy() {}
	public void init() {}
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		// ��ȡsession
		Map<String, Object> session = context.getSession();
		Object user = session.get("login");
		// �û���δ��½
		if (user == null) 
		{
			// ��ȡHttpServletRequest����
			HttpServletRequest req = ServletActionContext.getRequest();
			// ��ȡ������ĵ�ַ�������ַ����application name������subString������ȥ��application name
			String path = req.getRequestURI().substring(11);
		
			String parameter=req.getQueryString();
			if(parameter!=null)
				path=path+"?"+parameter;
			// ����session���������
			session.put("prePage", path);
		
			return "login";
		}
		// �û��Ѿ���½������
		return invocation.invoke();
	}
}