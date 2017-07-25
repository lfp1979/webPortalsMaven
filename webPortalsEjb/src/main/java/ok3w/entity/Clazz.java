package ok3w.entity;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.collection.internal.PersistentBag;

import ok3w.service.IService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the ok3w_class database table.
 * 
 */
@Entity
@Table(name="ok3w_class")
public class Clazz implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private boolean isOpen;
	private int orderID;
    @ManyToOne
    @JoinColumn(name="parentID")
	private Clazz parent;
	private String sortPath;
	private String sortName;
	//webService jaxb marshaller会引起延迟加载，故取消@OneToMany映射
	//@OneToMany(mappedBy="parent")
	//@OrderBy("orderID")
	@Transient
	private List<Clazz> child;
	
	public Clazz() {
	}
	public Clazz(Clazz c)
	{
		this.id=c.id;
		this.isOpen=c.isOpen;
		this.orderID=c.orderID;
		this.parent=c.parent;
		this.child=c.child;
		this.sortName=c.sortName;
		this.sortPath=c.sortPath;
	}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Clazz> getChild() {
		return child;
	}

	public void setChild(List<Clazz> child) {
		this.child = child;
	}

	
	public boolean getIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public int getOrderID() {
		return this.orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Clazz getParent() {
		return parent;
	}

	public void setParent(Clazz parent) {
		this.parent = parent;
	}

	public String getSortPath() {
		return this.sortPath;
	}

	public void setSortPath(String sortPath) {
		this.sortPath = sortPath;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	
}