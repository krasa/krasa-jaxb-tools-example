package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for labelDetailElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="labelDetailElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Impb" minOccurs="0"/>
 *         &lt;element name="ServiceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorrectedAddress" type="{}addressElement" minOccurs="0"/>
 *         &lt;element name="MailTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipperAddress" type="{}addressElement"/>
 *         &lt;element name="InboundSortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IntendedReceivingFacility" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutboundSortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SortingSetupVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZipPlus4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderedProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MailBanner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "labelDetailElement", propOrder = {
		"impb",
		"serviceTypeCode",
		"correctedAddress",
		"mailTypeCode",
		"shipperAddress",
		"inboundSortCode",
		"intendedReceivingFacility",
		"outboundSortCode",
		"sortingSetupVersion",
		"zipPlus4",
		"serviceLevel",
		"orderedProductCode",
		"mailBanner"
})
public class LabelDetailElement {

	@XmlElement(name = "Impb")
	protected ImpbElement impb;
	@XmlElement(name = "ServiceTypeCode")
	protected String serviceTypeCode;
	@XmlElement(name = "CorrectedAddress")
	protected AddressElement correctedAddress;
	@XmlElement(name = "MailTypeCode", required = true)
	@NotNull
	protected String mailTypeCode;
	@XmlElement(name = "ShipperAddress", required = true)
	@NotNull
	protected AddressElement shipperAddress;
	@XmlElement(name = "InboundSortCode", required = true)
	@NotNull
	protected String inboundSortCode;
	@XmlElement(name = "IntendedReceivingFacility", required = true)
	@NotNull
	protected String intendedReceivingFacility;
	@XmlElement(name = "OutboundSortCode", required = true)
	@NotNull
	protected String outboundSortCode;
	@XmlElement(name = "SortingSetupVersion", required = true)
	@NotNull
	protected String sortingSetupVersion;
	@XmlElement(name = "ZipPlus4")
	protected String zipPlus4;
	@XmlElement(name = "ServiceLevel")
	protected String serviceLevel;
	@XmlElement(name = "OrderedProductCode", required = true)
	@NotNull
	protected String orderedProductCode;
	@XmlElement(name = "MailBanner")
	protected String mailBanner;

	/**
	 * Gets the value of the impb property.
	 *
	 * @return possible object is
	 * {@link ImpbElement }
	 */
	public ImpbElement getImpb() {
		return impb;
	}

	/**
	 * Sets the value of the impb property.
	 *
	 * @param value allowed object is
	 *              {@link ImpbElement }
	 */
	public void setImpb(ImpbElement value) {
		this.impb = value;
	}

	/**
	 * Gets the value of the serviceTypeCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getServiceTypeCode() {
		return serviceTypeCode;
	}

	/**
	 * Sets the value of the serviceTypeCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setServiceTypeCode(String value) {
		this.serviceTypeCode = value;
	}

	/**
	 * Gets the value of the correctedAddress property.
	 *
	 * @return possible object is
	 * {@link AddressElement }
	 */
	public AddressElement getCorrectedAddress() {
		return correctedAddress;
	}

	/**
	 * Sets the value of the correctedAddress property.
	 *
	 * @param value allowed object is
	 *              {@link AddressElement }
	 */
	public void setCorrectedAddress(AddressElement value) {
		this.correctedAddress = value;
	}

	/**
	 * Gets the value of the mailTypeCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getMailTypeCode() {
		return mailTypeCode;
	}

	/**
	 * Sets the value of the mailTypeCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMailTypeCode(String value) {
		this.mailTypeCode = value;
	}

	/**
	 * Gets the value of the shipperAddress property.
	 *
	 * @return possible object is
	 * {@link AddressElement }
	 */
	public AddressElement getShipperAddress() {
		return shipperAddress;
	}

	/**
	 * Sets the value of the shipperAddress property.
	 *
	 * @param value allowed object is
	 *              {@link AddressElement }
	 */
	public void setShipperAddress(AddressElement value) {
		this.shipperAddress = value;
	}

	/**
	 * Gets the value of the inboundSortCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getInboundSortCode() {
		return inboundSortCode;
	}

	/**
	 * Sets the value of the inboundSortCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setInboundSortCode(String value) {
		this.inboundSortCode = value;
	}

	/**
	 * Gets the value of the intendedReceivingFacility property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getIntendedReceivingFacility() {
		return intendedReceivingFacility;
	}

	/**
	 * Sets the value of the intendedReceivingFacility property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setIntendedReceivingFacility(String value) {
		this.intendedReceivingFacility = value;
	}

	/**
	 * Gets the value of the outboundSortCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getOutboundSortCode() {
		return outboundSortCode;
	}

	/**
	 * Sets the value of the outboundSortCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setOutboundSortCode(String value) {
		this.outboundSortCode = value;
	}

	/**
	 * Gets the value of the sortingSetupVersion property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getSortingSetupVersion() {
		return sortingSetupVersion;
	}

	/**
	 * Sets the value of the sortingSetupVersion property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setSortingSetupVersion(String value) {
		this.sortingSetupVersion = value;
	}

	/**
	 * Gets the value of the zipPlus4 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getZipPlus4() {
		return zipPlus4;
	}

	/**
	 * Sets the value of the zipPlus4 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setZipPlus4(String value) {
		this.zipPlus4 = value;
	}

	/**
	 * Gets the value of the serviceLevel property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getServiceLevel() {
		return serviceLevel;
	}

	/**
	 * Sets the value of the serviceLevel property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setServiceLevel(String value) {
		this.serviceLevel = value;
	}

	/**
	 * Gets the value of the orderedProductCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getOrderedProductCode() {
		return orderedProductCode;
	}

	/**
	 * Sets the value of the orderedProductCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setOrderedProductCode(String value) {
		this.orderedProductCode = value;
	}

	/**
	 * Gets the value of the mailBanner property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getMailBanner() {
		return mailBanner;
	}

	/**
	 * Sets the value of the mailBanner property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMailBanner(String value) {
		this.mailBanner = value;
	}

}
