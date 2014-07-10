package b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for mpuResponseElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="mpuResponseElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}LabelDetail" minOccurs="0"/>
 *         &lt;element name="LabelZpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="MailItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelconFromImpb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpuResponseElement", propOrder = {
		"errorList",
		"labelDetail",
		"labelZpl",
		"labelImage",
		"mailItemId",
		"delconFromImpb"
})
public class MpuResponseElement {

	@XmlElement(name = "ErrorList")
	protected MpuResponseElement.ErrorList errorList;
	@XmlElement(name = "LabelDetail")
	protected LabelDetailElement labelDetail;
	@XmlElement(name = "LabelZpl")
	protected String labelZpl;
	@XmlElement(name = "LabelImage")
	protected byte[] labelImage;
	@XmlElement(name = "MailItemId")
	protected String mailItemId;
	@XmlElement(name = "DelconFromImpb")
	protected String delconFromImpb;

	/**
	 * Gets the value of the errorList property.
	 *
	 * @return possible object is
	 * {@link MpuResponseElement.ErrorList }
	 */
	public MpuResponseElement.ErrorList getErrorList() {
		return errorList;
	}

	/**
	 * Sets the value of the errorList property.
	 *
	 * @param value allowed object is
	 *              {@link MpuResponseElement.ErrorList }
	 */
	public void setErrorList(MpuResponseElement.ErrorList value) {
		this.errorList = value;
	}

	/**
	 * Gets the value of the labelDetail property.
	 *
	 * @return possible object is
	 * {@link LabelDetailElement }
	 */
	public LabelDetailElement getLabelDetail() {
		return labelDetail;
	}

	/**
	 * Sets the value of the labelDetail property.
	 *
	 * @param value allowed object is
	 *              {@link LabelDetailElement }
	 */
	public void setLabelDetail(LabelDetailElement value) {
		this.labelDetail = value;
	}

	/**
	 * Gets the value of the labelZpl property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLabelZpl() {
		return labelZpl;
	}

	/**
	 * Sets the value of the labelZpl property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLabelZpl(String value) {
		this.labelZpl = value;
	}

	/**
	 * Gets the value of the labelImage property.
	 *
	 * @return possible object is
	 * byte[]
	 */
	public byte[] getLabelImage() {
		return labelImage;
	}

	/**
	 * Sets the value of the labelImage property.
	 *
	 * @param value allowed object is
	 *              byte[]
	 */
	public void setLabelImage(byte[] value) {
		this.labelImage = ((byte[]) value);
	}

	/**
	 * Gets the value of the mailItemId property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getMailItemId() {
		return mailItemId;
	}

	/**
	 * Sets the value of the mailItemId property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMailItemId(String value) {
		this.mailItemId = value;
	}

	/**
	 * Gets the value of the delconFromImpb property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getDelconFromImpb() {
		return delconFromImpb;
	}

	/**
	 * Sets the value of the delconFromImpb property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setDelconFromImpb(String value) {
		this.delconFromImpb = value;
	}


	/**
	 * <p>Java class for anonymous complex type.
	 * <p/>
	 * <p>The following schema fragment specifies the expected content contained within this class.
	 * <p/>
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"error"
	})
	public static class ErrorList {

		@XmlElement(name = "Error")
		protected List<String> error;

		/**
		 * Gets the value of the error property.
		 * <p/>
		 * <p/>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the error property.
		 * <p/>
		 * <p/>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getError().add(newItem);
		 * </pre>
		 * <p/>
		 * <p/>
		 * <p/>
		 * Objects of the following type(s) are allowed in the list
		 * {@link String }
		 */
		public List<String> getError() {
			if (error == null) {
				error = new ArrayList<String>();
			}
			return this.error;
		}

	}

}
