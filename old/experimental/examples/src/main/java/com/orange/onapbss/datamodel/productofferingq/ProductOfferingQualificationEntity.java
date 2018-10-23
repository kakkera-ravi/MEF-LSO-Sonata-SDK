//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.08 at 10:41:50 AM CEST 
//


package com.orange.onapbss.datamodel.productofferingq;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 
 * 
 * <p>Java class for ProductOfferingQualification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOfferingQualification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://orange.com/POC_ONAP/api/productOfferingQualification/v0/model}state" minOccurs="0"/&gt;
 *         &lt;element name="provideAlternative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="expectedResponseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemaLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relatedParty" type="{http://orange.com/POC_ONAP/api/productOfferingQualification/v0/model}RelatedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productOfferingQualificationItem" type="{http://orange.com/POC_ONAP/api/productOfferingQualification/v0/model}ProductOfferingQualificationItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOfferingQualification", propOrder = {
    "id",
    "state",
    "provideAlternative",
    "expectedResponseDate",
    "projectId",
    "expirationDate",
    "type",
    "schemaLocation",
    "relatedParty",
    "productOfferingQualificationItem"
})
public class ProductOfferingQualificationEntity
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected String id;
    @XmlSchemaType(name = "string")
    protected StateEntity state;
    protected Boolean provideAlternative;
    @XmlSchemaType(name = "date")
    protected Date expectedResponseDate;
    protected String projectId;
    @XmlSchemaType(name = "date")
    protected Date expirationDate;
    protected String type;
    protected String schemaLocation;
    protected List<RelatedPartyEntity> relatedParty;
    @XmlElement(required = true)
    protected List<ProductOfferingQualificationItemEntity> productOfferingQualificationItem;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateEntity }
     *     
     */
    public StateEntity getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateEntity }
     *     
     */
    public void setState(StateEntity value) {
        this.state = value;
    }

    /**
     * Gets the value of the provideAlternative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvideAlternative() {
        return provideAlternative;
    }

    /**
     * Sets the value of the provideAlternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvideAlternative(Boolean value) {
        this.provideAlternative = value;
    }

    /**
     * Gets the value of the expectedResponseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getExpectedResponseDate() {
        return expectedResponseDate;
    }

    /**
     * Sets the value of the expectedResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedResponseDate(Date value) {
        this.expectedResponseDate = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectId(String value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the expirationDate property.
     *
     * @return
     *     possible object is
     *     {@link Date }
     *
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the schemaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * Sets the value of the schemaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaLocation(String value) {
        this.schemaLocation = value;
    }

    /**
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPartyEntity }
     * 
     * 
     */
    public List<RelatedPartyEntity> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedPartyEntity>();
        }
        return this.relatedParty;
    }

    /**
     * 
     * 
     */
    public void setRelatedParty(List<RelatedPartyEntity> relatedParty) {
        this.relatedParty = relatedParty;
    }

    /**
     * Gets the value of the productOfferingQualificationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOfferingQualificationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOfferingQualificationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOfferingQualificationItemEntity }
     * 
     * 
     */
    public List<ProductOfferingQualificationItemEntity> getProductOfferingQualificationItem() {
        if (productOfferingQualificationItem == null) {
            productOfferingQualificationItem = new ArrayList<ProductOfferingQualificationItemEntity>();
        }
        return this.productOfferingQualificationItem;
    }

    /**
     * 
     * 
     */
    public void setProductOfferingQualificationItem(List<ProductOfferingQualificationItemEntity> productOfferingQualificationItem) {
        this.productOfferingQualificationItem = productOfferingQualificationItem;
    }



}