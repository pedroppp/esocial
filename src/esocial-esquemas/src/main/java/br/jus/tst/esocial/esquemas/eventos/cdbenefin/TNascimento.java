//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:39:28 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.cdbenefin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Grupo de informações do nascimento do trabalhador.
 * 
 * <p>Java class for T_nascimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_nascimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtNascto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="paisNascto" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_pais"/>
 *         &lt;element name="paisNac" type="{http://www.esocial.gov.br/schema/evt/evtCdBenefIn/v_S_01_00_00}TS_paisNac"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_nascimento", propOrder = {
    "dtNascto",
    "paisNascto",
    "paisNac"
})
public class TNascimento {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtNascto;
    @XmlElement(required = true)
    protected String paisNascto;
    @XmlElement(required = true)
    protected String paisNac;

    /**
     * Gets the value of the dtNascto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtNascto() {
        return dtNascto;
    }

    /**
     * Sets the value of the dtNascto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtNascto(XMLGregorianCalendar value) {
        this.dtNascto = value;
    }

    /**
     * Gets the value of the paisNascto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNascto() {
        return paisNascto;
    }

    /**
     * Sets the value of the paisNascto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNascto(String value) {
        this.paisNascto = value;
    }

    /**
     * Gets the value of the paisNac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisNac() {
        return paisNac;
    }

    /**
     * Sets the value of the paisNac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisNac(String value) {
        this.paisNac = value;
    }

}
