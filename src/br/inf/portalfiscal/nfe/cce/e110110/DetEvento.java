//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2017.07.13 �s 09:51:42 AM BRT 
//


package br.inf.portalfiscal.nfe.cce.e110110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Carta de Corre��o"/>
 *               &lt;enumeration value="Carta de Correcao"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xCorrecao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="15"/>
 *               &lt;maxLength value="1000"/>
 *               &lt;pattern value="[!-�]{1}[ -�]{0,}[!-�]{1}|[!-�]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xCondUso">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="A Carta de Corre��o � disciplinada pelo � 1�-A do art. 7� do Conv�nio S/N, de 15 de dezembro de 1970 e pode ser utilizada para regulariza��o de erro ocorrido na emiss�o de documento fiscal, desde que o erro n�o esteja relacionado com: I - as vari�veis que determinam o valor do imposto tais como: base de c�lculo, al�quota, diferen�a de pre�o, quantidade, valor da opera��o ou da presta��o; II - a corre��o de dados cadastrais que implique mudan�a do remetente ou do destinat�rio; III - a data de emiss�o ou de sa�da."/>
 *               &lt;enumeration value="A Carta de Correcao e disciplinada pelo paragrafo 1o-A do art. 7o do Convenio S/N, de 15 de dezembro de 1970 e pode ser utilizada para regularizacao de erro ocorrido na emissao de documento fiscal, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da operacao ou da prestacao; II - a correcao de dados cadastrais que implique mudanca do remetente ou do destinatario; III - a data de emissao ou de saida."/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="preserve"/>
 *             &lt;enumeration value="1.00"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descEvento",
    "xCorrecao",
    "xCondUso"
})
@XmlRootElement(name = "detEvento")
public class DetEvento {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected String xCorrecao;
    @XmlElement(required = true)
    protected String xCondUso;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obt�m o valor da propriedade descEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Define o valor da propriedade descEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Obt�m o valor da propriedade xCorrecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCorrecao() {
        return xCorrecao;
    }

    /**
     * Define o valor da propriedade xCorrecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCorrecao(String value) {
        this.xCorrecao = value;
    }

    /**
     * Obt�m o valor da propriedade xCondUso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCondUso() {
        return xCondUso;
    }

    /**
     * Define o valor da propriedade xCondUso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCondUso(String value) {
        this.xCondUso = value;
    }

    /**
     * Obt�m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
