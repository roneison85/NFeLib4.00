//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.03.18 �s 03:37:28 PM BRT 
//


package br.inf.portalfiscal.nfe.consrecinfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo de informa��es do respons�vel t�cnico pelo sistema de emiss�o de DF-e
 * 
 * <p>Classe Java de TInfRespTec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TInfRespTec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/>
 *         &lt;element name="xContato">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="email">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="6"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{6,14}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="idCSRT">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;whiteSpace value="preserve"/>
 *                 &lt;pattern value="[0-9]{2}"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="hashCSRT">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *                 &lt;length value="20"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInfRespTec", propOrder = {
    "cnpj",
    "xContato",
    "email",
    "fone",
    "idCSRT",
    "hashCSRT"
})
public class TInfRespTec {

    @XmlElement(name = "CNPJ", required = true)
    protected String cnpj;
    @XmlElement(required = true)
    protected String xContato;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String fone;
    protected String idCSRT;
    protected byte[] hashCSRT;

    /**
     * Obt�m o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Obt�m o valor da propriedade xContato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXContato() {
        return xContato;
    }

    /**
     * Define o valor da propriedade xContato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXContato(String value) {
        this.xContato = value;
    }

    /**
     * Obt�m o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obt�m o valor da propriedade fone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFone() {
        return fone;
    }

    /**
     * Define o valor da propriedade fone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFone(String value) {
        this.fone = value;
    }

    /**
     * Obt�m o valor da propriedade idCSRT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCSRT() {
        return idCSRT;
    }

    /**
     * Define o valor da propriedade idCSRT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCSRT(String value) {
        this.idCSRT = value;
    }

    /**
     * Obt�m o valor da propriedade hashCSRT.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHashCSRT() {
        return hashCSRT;
    }

    /**
     * Define o valor da propriedade hashCSRT.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHashCSRT(byte[] value) {
        this.hashCSRT = value;
    }

}
