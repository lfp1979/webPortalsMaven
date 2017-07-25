
package ok3w.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for urlLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="urlLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "urlLink", propOrder = {
    "lid",
    "lname",
    "lurl"
})
public class UrlLink implements Serializable{

    protected int lid;
    protected String lname;
    protected String lurl;

    /**
     * Gets the value of the lid property.
     * 
     */
    public int getLid() {
        return lid;
    }

    /**
     * Sets the value of the lid property.
     * 
     */
    public void setLid(int value) {
        this.lid = value;
    }

    /**
     * Gets the value of the lname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLname(String value) {
        this.lname = value;
    }

    /**
     * Gets the value of the lurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLurl() {
        return lurl;
    }

    /**
     * Sets the value of the lurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLurl(String value) {
        this.lurl = value;
    }

}
