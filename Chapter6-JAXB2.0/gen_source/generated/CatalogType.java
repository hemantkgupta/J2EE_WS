//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.06.19 at 11:18:21 AM IST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.AccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import generated.CatalogType;
import generated.JournalType;


/**
 * <p>Java class for catalogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="catalogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}journal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="publisher" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="section" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(AccessType.FIELD)
@XmlType(name = "catalogType", propOrder = {
    "journal"
})
public class CatalogType {

    protected List<JournalType> journal;
    @XmlAttribute
    protected String publisher;
    @XmlAttribute
    protected String section;

    /**
     * Gets the value of the journal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalType }
     * 
     * 
     */
    public List<JournalType> getJournal() {
        if (journal == null) {
            journal = new ArrayList<JournalType>();
        }
        return this.journal;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

}