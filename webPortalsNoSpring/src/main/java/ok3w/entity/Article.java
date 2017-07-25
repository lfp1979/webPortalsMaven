
package ok3w.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for article complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="article">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clazz" type="{http://service.ok3w/}clazz" minOccurs="0"/>
 *         &lt;element name="comeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inputer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCommend" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMove" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isPass" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isPic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isPlay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isTop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="picFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "article", propOrder = {
    "addTime",
    "author",
    "clazz",
    "comeFrom",
    "content",
    "hits",
    "id",
    "inputer",
    "isCommend",
    "isDelete",
    "isMove",
    "isPass",
    "isPic",
    "isPlay",
    "isTop",
    "picFile",
    "sortPath",
    "title"
})
public class Article implements Serializable{

    @XmlSchemaType(name = "dateTime")
    protected Date addTime;
    protected String author;
    protected Clazz clazz;
    protected String comeFrom;
    private String content="";
    protected int hits;
    protected int id;
    protected String inputer;
    protected boolean isCommend;
    protected boolean isDelete;
    protected boolean isMove;
    protected boolean isPass;
    protected boolean isPic;
    protected boolean isPlay;
    protected boolean isTop;
    protected String picFile;
    protected String sortPath;
    protected String title;

    /**
     * Gets the value of the addTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * Sets the value of the addTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddTime(Date value) {
        this.addTime = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Clazz }
     *     
     */
    public Clazz getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clazz }
     *     
     */
    public void setClazz(Clazz value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the comeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComeFrom() {
        return comeFrom;
    }

    /**
     * Sets the value of the comeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComeFrom(String value) {
        this.comeFrom = value;
    }

    /**
     * Gets the value of the hits property.
     * 
     */
    public int getHits() {
        return hits;
    }

    /**
     * Sets the value of the hits property.
     * 
     */
    public void setHits(int value) {
        this.hits = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the inputer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputer() {
        return inputer;
    }

    /**
     * Sets the value of the inputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputer(String value) {
        this.inputer = value;
    }

    /**
     * Gets the value of the isCommend property.
     * 
     */
    public boolean isIsCommend() {
        return isCommend;
    }

    /**
     * Sets the value of the isCommend property.
     * 
     */
    public void setIsCommend(boolean value) {
        this.isCommend = value;
    }

    /**
     * Gets the value of the isDelete property.
     * 
     */
    public boolean isIsDelete() {
        return isDelete;
    }

    /**
     * Sets the value of the isDelete property.
     * 
     */
    public void setIsDelete(boolean value) {
        this.isDelete = value;
    }

    /**
     * Gets the value of the isMove property.
     * 
     */
    public boolean isIsMove() {
        return isMove;
    }

    /**
     * Sets the value of the isMove property.
     * 
     */
    public void setIsMove(boolean value) {
        this.isMove = value;
    }

    /**
     * Gets the value of the isPass property.
     * 
     */
    public boolean isIsPass() {
        return isPass;
    }

    /**
     * Sets the value of the isPass property.
     * 
     */
    public void setIsPass(boolean value) {
        this.isPass = value;
    }

    /**
     * Gets the value of the isPic property.
     * 
     */
    public boolean isIsPic() {
        return isPic;
    }

    /**
     * Sets the value of the isPic property.
     * 
     */
    public void setIsPic(boolean value) {
        this.isPic = value;
    }

    /**
     * Gets the value of the isPlay property.
     * 
     */
    public boolean isIsPlay() {
        return isPlay;
    }

    /**
     * Sets the value of the isPlay property.
     * 
     */
    public void setIsPlay(boolean value) {
        this.isPlay = value;
    }

    /**
     * Gets the value of the isTop property.
     * 
     */
    public boolean isIsTop() {
        return isTop;
    }

    /**
     * Sets the value of the isTop property.
     * 
     */
    public void setIsTop(boolean value) {
        this.isTop = value;
    }

    /**
     * Gets the value of the picFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicFile() {
        return picFile;
    }

    /**
     * Sets the value of the picFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicFile(String value) {
        this.picFile = value;
    }

    /**
     * Gets the value of the sortPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortPath() {
        return sortPath;
    }

    /**
     * Sets the value of the sortPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortPath(String value) {
        this.sortPath = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
