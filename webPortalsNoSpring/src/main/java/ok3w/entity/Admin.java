
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
 * <p>Java class for admin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="admin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adminName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorTimes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "admin", propOrder = {
    "adminId",
    "adminName",
    "adminPwd",
    "errorTimes",
    "loginDate"
})
public class Admin implements Serializable{

    protected int adminId;
    protected String adminName;
    protected String adminPwd;
    protected int errorTimes;
    @XmlSchemaType(name = "dateTime")
    protected Date loginDate;

    /**
     * Gets the value of the adminId property.
     * 
     */
    public int getAdminId() {
        return adminId;
    }

    /**
     * Sets the value of the adminId property.
     * 
     */
    public void setAdminId(int value) {
        this.adminId = value;
    }

    /**
     * Gets the value of the adminName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * Sets the value of the adminName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminName(String value) {
        this.adminName = value;
    }

    /**
     * Gets the value of the adminPwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    /**
     * Sets the value of the adminPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminPwd(String value) {
        this.adminPwd = value;
    }

    /**
     * Gets the value of the errorTimes property.
     * 
     */
    public int getErrorTimes() {
        return errorTimes;
    }

    /**
     * Sets the value of the errorTimes property.
     * 
     */
    public void setErrorTimes(int value) {
        this.errorTimes = value;
    }

    /**
     * Gets the value of the loginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * Sets the value of the loginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoginDate(Date value) {
        this.loginDate = value;
    }

}
