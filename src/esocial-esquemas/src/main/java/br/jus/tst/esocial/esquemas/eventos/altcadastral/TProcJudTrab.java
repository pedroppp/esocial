//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.24 at 06:39:21 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.altcadastral;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: OC
 * 
 * <p>Java class for T_procJudTrab complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_procJudTrab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpTrib" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_tpTrib"/>
 *         &lt;element name="nrProcJud" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_nrProcJud_1"/>
 *         &lt;element name="codSusp" type="{http://www.esocial.gov.br/schema/evt/evtAltCadastral/v_S_01_00_00}TS_codSusp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_procJudTrab", propOrder = {
    "tpTrib",
    "nrProcJud",
    "codSusp"
})
public class TProcJudTrab {

    protected byte tpTrib;
    @XmlElement(required = true)
    protected String nrProcJud;
    @XmlElement(required = true)
    protected BigInteger codSusp;

    /**
     * Gets the value of the tpTrib property.
     * 
     */
    public byte getTpTrib() {
        return tpTrib;
    }

    /**
     * Sets the value of the tpTrib property.
     * 
     */
    public void setTpTrib(byte value) {
        this.tpTrib = value;
    }

    /**
     * Gets the value of the nrProcJud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProcJud() {
        return nrProcJud;
    }

    /**
     * Sets the value of the nrProcJud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProcJud(String value) {
        this.nrProcJud = value;
    }

    /**
     * Gets the value of the codSusp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodSusp() {
        return codSusp;
    }

    /**
     * Sets the value of the codSusp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodSusp(BigInteger value) {
        this.codSusp = value;
    }

}
