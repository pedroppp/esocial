//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.05 at 06:38:20 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.tabrubrica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * CONDICAO_GRUPO: O (se {classTrib}(1000_infoEmpregador_inclusao_infoCadastro_classTrib) em S-1000 = [03]); N (nos demais casos)
 * 
 * <p>Java class for T_infoSimples complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_infoSimples">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indSimples" type="{http://www.esocial.gov.br/schema/evt/evtTabRubrica/v_S_01_00_00}TS_indSimples"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_infoSimples", propOrder = {
    "indSimples"
})
public class TInfoSimples {

    protected byte indSimples;

    /**
     * Gets the value of the indSimples property.
     * 
     */
    public byte getIndSimples() {
        return indSimples;
    }

    /**
     * Sets the value of the indSimples property.
     * 
     */
    public void setIndSimples(byte value) {
        this.indSimples = value;
    }

}
