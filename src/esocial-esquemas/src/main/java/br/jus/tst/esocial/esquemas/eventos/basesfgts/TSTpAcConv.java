//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.05 at 06:37:41 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.basesfgts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TS_tpAcConv.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TS_tpAcConv">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TS_tpAcConv")
@XmlEnum
public enum TSTpAcConv {


    /**
     * Acordo Coletivo de Trabalho
     * 
     */
    A,

    /**
     * Legislação federal, estadual, municipal ou distrital
     * 
     */
    B,

    /**
     * Convenção Coletiva de Trabalho
     * 
     */
    C,

    /**
     * Sentença normativa - Dissídio
     * 
     */
    D,

    /**
     * Conversão de licença saúde em acidente de trabalho
     * 
     */
    E,

    /**
     * Outras verbas de natureza salarial ou não salarial devidas após o desligamento
     * 
     */
    F,

    /**
     * Antecipação de diferenças de acordo, convenção ou dissídio coletivo
     * 
     */
    G,

    /**
     * Recolhimento mensal de FGTS anterior ao início de obrigatoriedade dos eventos periódicos
     * 
     */
    H;

    public String value() {
        return name();
    }

    public static TSTpAcConv fromValue(String v) {
        return valueOf(v);
    }

}
