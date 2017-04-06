package b;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for mpuResponseElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpuResponseElement", propOrder = { "errorList", "labelDetail", "labelZpl", "labelImage", "mailItemId",
		"delconFromImpb" })
public class MpuResponseElement implements Equals, HashCode {

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
	 * @return possible object is {@link MpuResponseElement.ErrorList }
	 * 
	 */
	public MpuResponseElement.ErrorList getErrorList() {
		return errorList;
	}

	/**
	 * Sets the value of the errorList property.
	 * 
	 * @param value
	 *            allowed object is {@link MpuResponseElement.ErrorList }
	 * 
	 */
	public void setErrorList(MpuResponseElement.ErrorList value) {
		this.errorList = value;
	}

	/**
	 * Gets the value of the labelDetail property.
	 * 
	 * @return possible object is {@link LabelDetailElement }
	 * 
	 */
	public LabelDetailElement getLabelDetail() {
		return labelDetail;
	}

	/**
	 * Sets the value of the labelDetail property.
	 * 
	 * @param value
	 *            allowed object is {@link LabelDetailElement }
	 * 
	 */
	public void setLabelDetail(LabelDetailElement value) {
		this.labelDetail = value;
	}

	/**
	 * Gets the value of the labelZpl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLabelZpl() {
		return labelZpl;
	}

	/**
	 * Sets the value of the labelZpl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLabelZpl(String value) {
		this.labelZpl = value;
	}

	/**
	 * Gets the value of the labelImage property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getLabelImage() {
		return labelImage;
	}

	/**
	 * Sets the value of the labelImage property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setLabelImage(byte[] value) {
		this.labelImage = ((byte[]) value);
	}

	/**
	 * Gets the value of the mailItemId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMailItemId() {
		return mailItemId;
	}

	/**
	 * Sets the value of the mailItemId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMailItemId(String value) {
		this.mailItemId = value;
	}

	/**
	 * Gets the value of the delconFromImpb property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDelconFromImpb() {
		return delconFromImpb;
	}

	/**
	 * Sets the value of the delconFromImpb property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDelconFromImpb(String value) {
		this.delconFromImpb = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			MpuResponseElement.ErrorList theErrorList;
			theErrorList = this.getErrorList();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "errorList", theErrorList),
					currentHashCode, theErrorList);
		}
		{
			LabelDetailElement theLabelDetail;
			theLabelDetail = this.getLabelDetail();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelDetail", theLabelDetail),
					currentHashCode, theLabelDetail);
		}
		{
			String theLabelZpl;
			theLabelZpl = this.getLabelZpl();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelZpl", theLabelZpl),
					currentHashCode, theLabelZpl);
		}
		{
			byte[] theLabelImage;
			theLabelImage = this.getLabelImage();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelImage", theLabelImage),
					currentHashCode, theLabelImage);
		}
		{
			String theMailItemId;
			theMailItemId = this.getMailItemId();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mailItemId", theMailItemId),
					currentHashCode, theMailItemId);
		}
		{
			String theDelconFromImpb;
			theDelconFromImpb = this.getDelconFromImpb();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delconFromImpb", theDelconFromImpb),
					currentHashCode, theDelconFromImpb);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof MpuResponseElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final MpuResponseElement that = ((MpuResponseElement) object);
		{
			MpuResponseElement.ErrorList lhsErrorList;
			lhsErrorList = this.getErrorList();
			MpuResponseElement.ErrorList rhsErrorList;
			rhsErrorList = that.getErrorList();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "errorList", lhsErrorList),
					LocatorUtils.property(thatLocator, "errorList", rhsErrorList), lhsErrorList, rhsErrorList)) {
				return false;
			}
		}
		{
			LabelDetailElement lhsLabelDetail;
			lhsLabelDetail = this.getLabelDetail();
			LabelDetailElement rhsLabelDetail;
			rhsLabelDetail = that.getLabelDetail();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "labelDetail", lhsLabelDetail),
					LocatorUtils.property(thatLocator, "labelDetail", rhsLabelDetail), lhsLabelDetail,
					rhsLabelDetail)) {
				return false;
			}
		}
		{
			String lhsLabelZpl;
			lhsLabelZpl = this.getLabelZpl();
			String rhsLabelZpl;
			rhsLabelZpl = that.getLabelZpl();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "labelZpl", lhsLabelZpl),
					LocatorUtils.property(thatLocator, "labelZpl", rhsLabelZpl), lhsLabelZpl, rhsLabelZpl)) {
				return false;
			}
		}
		{
			byte[] lhsLabelImage;
			lhsLabelImage = this.getLabelImage();
			byte[] rhsLabelImage;
			rhsLabelImage = that.getLabelImage();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "labelImage", lhsLabelImage),
					LocatorUtils.property(thatLocator, "labelImage", rhsLabelImage), lhsLabelImage, rhsLabelImage)) {
				return false;
			}
		}
		{
			String lhsMailItemId;
			lhsMailItemId = this.getMailItemId();
			String rhsMailItemId;
			rhsMailItemId = that.getMailItemId();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "mailItemId", lhsMailItemId),
					LocatorUtils.property(thatLocator, "mailItemId", rhsMailItemId), lhsMailItemId, rhsMailItemId)) {
				return false;
			}
		}
		{
			String lhsDelconFromImpb;
			lhsDelconFromImpb = this.getDelconFromImpb();
			String rhsDelconFromImpb;
			rhsDelconFromImpb = that.getDelconFromImpb();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "delconFromImpb", lhsDelconFromImpb),
					LocatorUtils.property(thatLocator, "delconFromImpb", rhsDelconFromImpb), lhsDelconFromImpb,
					rhsDelconFromImpb)) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(Object object) {
		final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
		return equals(null, null, object, strategy);
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
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
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "error" })
	public static class ErrorList implements Equals, HashCode {

		@XmlElement(name = "Error")
		protected List<String> error;

		/**
		 * Gets the value of the error property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
		 * make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE>
		 * method for the error property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getError().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link String }
		 * 
		 * 
		 */
		public List<String> getError() {
			if (error == null) {
				error = new ArrayList<String>();
			}
			return this.error;
		}

		public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
			int currentHashCode = 1;
			{
				List<String> theError;
				theError = (((this.error != null) && (!this.error.isEmpty())) ? this.getError() : null);
				currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "error", theError), currentHashCode,
						theError);
			}
			return currentHashCode;
		}

		public int hashCode() {
			final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
			return this.hashCode(null, strategy);
		}

		public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
				EqualsStrategy strategy) {
			if (!(object instanceof MpuResponseElement.ErrorList)) {
				return false;
			}
			if (this == object) {
				return true;
			}
			final MpuResponseElement.ErrorList that = ((MpuResponseElement.ErrorList) object);
			{
				List<String> lhsError;
				lhsError = (((this.error != null) && (!this.error.isEmpty())) ? this.getError() : null);
				List<String> rhsError;
				rhsError = (((that.error != null) && (!that.error.isEmpty())) ? that.getError() : null);
				if (!strategy.equals(LocatorUtils.property(thisLocator, "error", lhsError),
						LocatorUtils.property(thatLocator, "error", rhsError), lhsError, rhsError)) {
					return false;
				}
			}
			return true;
		}

		public boolean equals(Object object) {
			final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
			return equals(null, null, object, strategy);
		}

	}

}
