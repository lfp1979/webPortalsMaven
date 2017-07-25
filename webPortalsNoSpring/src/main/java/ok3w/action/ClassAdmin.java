package ok3w.action;

import java.util.List;
import java.util.Map;



import com.opensymphony.xwork2.ActionSupport;

import ok3w.entity.Clazz;
import ok3w.service.IService;
import ok3w.util.Util;
public class ClassAdmin extends ActionSupport{
	
	private IService service=Util.getService();
	private List<Clazz> list;
	private Map<String,String> path;
	private String msg;
	private Clazz clazz;
	private int id;
	public String del()
	{
		service.delClass(clazz);
		msg="ɾ���ɹ���";
		return list();
	}
	public String saveOrUpdate()
	{
	   
	   service.ClassSaveOrUpdate(clazz);
		msg="����ɹ���";
		return list();
		
	}
	public String list()
	{
		list=service.listClassChild(id);
		path=service.getClassPathInAdmin(service.getClass(id));
		return "list";
		
	}
	public List<Clazz> getList() {
		return list;
	}
	public void setList(List<Clazz> list) {
		this.list = list;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String,String> getPath() {
		return path;
	}
	public void setPath(Map<String,String> path) {
		this.path = path;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
