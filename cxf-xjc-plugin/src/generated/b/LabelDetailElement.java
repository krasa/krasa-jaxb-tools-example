package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for labelDetailElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "labelDetailElement", propOrder = { "impb", "serviceTypeCode", "correctedAddress", "mailTypeCode",
		"shipperAddress", "inboundSortCode", "intendedReceivingFacility", "outboundSortCode", "sortingSetupVersion",
		"zipPlus4", "serviceLevel", "orderedProductCode", "mailBanner" })
public class LabelDetailElement implements Equals, HashCode {

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
	 * @return possible object is {@link ImpbElement }
	 * 
	 */
	public ImpbElement getImpb() {
		return impb;
	}

	/**
	 * Sets the value of the impb property.
	 * 
	 * @param value
	 *            allowed object is {@link ImpbElement }
	 * 
	 */
	public void setImpb(ImpbElement value) {
		this.impb = value;
	}

	/**
	 * Gets the value of the serviceTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceTypeCode() {
		return serviceTypeCode;
	}

	/**
	 * Sets the value of the serviceTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceTypeCode(String value) {
		this.serviceTypeCode = value;
	}

	/**
	 * Gets the value of the correctedAddress property.
	 * 
	 * @return possible object is {@link AddressElement }
	 * 
	 */
	public AddressElement getCorrectedAddress() {
		return correctedAddress;
	}

	/**
	 * Sets the value of the correctedAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link AddressElement }
	 * 
	 */
	public void setCorrectedAddress(AddressElement value) {
		this.correctedAddress = value;
	}

	/**
	 * Gets the value of the mailTypeCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMailTypeCode() {
		return mailTypeCode;
	}

	/**
	 * Sets the value of the mailTypeCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMailTypeCode(String value) {
		this.mailTypeCode = value;
	}

	/**
	 * Gets the value of the shipperAddress property.
	 * 
	 * @return possible object is {@link AddressElement }
	 * 
	 */
	public AddressElement getShipperAddress() {
		return shipperAddress;
	}

	/**
	 * Sets the value of the shipperAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link AddressElement }
	 * 
	 */
	public void setShipperAddress(AddressElement value) {
		this.shipperAddress = value;
	}

	/**
	 * Gets the value of the inboundSortCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInboundSortCode() {
		return inboundSortCode;
	}

	/**
	 * Sets the value of the inboundSortCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInboundSortCode(String value) {
		this.inboundSortCode = value;
	}

	/**
	 * Gets the value of the intendedReceivingFacility property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIntendedReceivingFacility() {
		return intendedReceivingFacility;
	}

	/**
	 * Sets the value of the intendedReceivingFacility property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIntendedReceivingFacility(String value) {
		this.intendedReceivingFacility = value;
	}

	/**
	 * Gets the value of the outboundSortCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOutboundSortCode() {
		return outboundSortCode;
	}

	/**
	 * Sets the value of the outboundSortCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOutboundSortCode(String value) {
		this.outboundSortCode = value;
	}

	/**
	 * Gets the value of the sortingSetupVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSortingSetupVersion() {
		return sortingSetupVersion;
	}

	/**
	 * Sets the value of the sortingSetupVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSortingSetupVersion(String value) {
		this.sortingSetupVersion = value;
	}

	/**
	 * Gets the value of the zipPlus4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZipPlus4() {
		return zipPlus4;
	}

	/**
	 * Sets the value of the zipPlus4 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZipPlus4(String value) {
		this.zipPlus4 = value;
	}

	/**
	 * Gets the value of the serviceLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceLevel() {
		return serviceLevel;
	}

	/**
	 * Sets the value of the serviceLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceLevel(String value) {
		this.serviceLevel = value;
	}

	/**
	 * Gets the value of the orderedProductCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrderedProductCode() {
		return orderedProductCode;
	}

	/**
	 * Sets the value of the orderedProductCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrderedProductCode(String value) {
		this.orderedProductCode = value;
	}

	/**
	 * Gets the value of the mailBanner property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMailBanner() {
		return mailBanner;
	}

	/**
	 * Sets the value of the mailBanner property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMailBanner(String value) {
		this.mailBanner = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			ImpbElement theImpb;
			theImpb = this.getImpb();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "impb", theImpb), currentHashCode,
					theImpb);
		}
		{
			String theServiceTypeCode;
			theServiceTypeCode = this.getServiceTypeCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceTypeCode", theServiceTypeCode),
					currentHashCode, theServiceTypeCode);
		}
		{
			AddressElement theCorrectedAddress;
			theCorrectedAddress = this.getCorrectedAddress();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correctedAddress", theCorrectedAddress),
					currentHashCode, theCorrectedAddress);
		}
		{
			String theMailTypeCode;
			theMailTypeCode = this.getMailTypeCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mailTypeCode", theMailTypeCode),
					currentHashCode, theMailTypeCode);
		}
		{
			AddressElement theShipperAddress;
			theShipperAddress = this.getShipperAddress();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipperAddress", theShipperAddress),
					currentHashCode, theShipperAddress);
		}
		{
			String theInboundSortCode;
			theInboundSortCode = this.getInboundSortCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inboundSortCode", theInboundSortCode),
					currentHashCode, theInboundSortCode);
		}
		{
			String theIntendedReceivingFacility;
			theIntendedReceivingFacility = this.getIntendedReceivingFacility();
			currentHashCode = strategy.hashCode(
					LocatorUtils.property(locator, "intendedReceivingFacility", theIntendedReceivingFacility),
					currentHashCode, theIntendedReceivingFacility);
		}
		{
			String theOutboundSortCode;
			theOutboundSortCode = this.getOutboundSortCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outboundSortCode", theOutboundSortCode),
					currentHashCode, theOutboundSortCode);
		}
		{
			String theSortingSetupVersion;
			theSortingSetupVersion = this.getSortingSetupVersion();
			currentHashCode = strategy.hashCode(
					LocatorUtils.property(locator, "sortingSetupVersion", theSortingSetupVersion), currentHashCode,
					theSortingSetupVersion);
		}
		{
			String theZipPlus4;
			theZipPlus4 = this.getZipPlus4();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zipPlus4", theZipPlus4),
					currentHashCode, theZipPlus4);
		}
		{
			String theServiceLevel;
			theServiceLevel = this.getServiceLevel();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLevel", theServiceLevel),
					currentHashCode, theServiceLevel);
		}
		{
			String theOrderedProductCode;
			theOrderedProductCode = this.getOrderedProductCode();
			currentHashCode = strategy.hashCode(
					LocatorUtils.property(locator, "orderedProductCode", theOrderedProductCode), currentHashCode,
					theOrderedProductCode);
		}
		{
			String theMailBanner;
			theMailBanner = this.getMailBanner();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mailBanner", theMailBanner),
					currentHashCode, theMailBanner);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof LabelDetailElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final LabelDetailElement that = ((LabelDetailElement) object);
		{
			ImpbElement lhsImpb;
			lhsImpb = this.getImpb();
			ImpbElement rhsImpb;
			rhsImpb = that.getImpb();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "impb", lhsImpb),
					LocatorUtils.property(thatLocator, "impb", rhsImpb), lhsImpb, rhsImpb)) {
				return false;
			}
		}
		{
			String lhsServiceTypeCode;
			lhsServiceTypeCode = this.getServiceTypeCode();
			String rhsServiceTypeCode;
			rhsServiceTypeCode = that.getServiceTypeCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceTypeCode", lhsServiceTypeCode),
					LocatorUtils.property(thatLocator, "serviceTypeCode", rhsServiceTypeCode), lhsServiceTypeCode,
					rhsServiceTypeCode)) {
				return false;
			}
		}
		{
			AddressElement lhsCorrectedAddress;
			lhsCorrectedAddress = this.getCorrectedAddress();
			AddressElement rhsCorrectedAddress;
			rhsCorrectedAddress = that.getCorrectedAddress();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "correctedAddress", lhsCorrectedAddress),
					LocatorUtils.property(thatLocator, "correctedAddress", rhsCorrectedAddress), lhsCorrectedAddress,
					rhsCorrectedAddress)) {
				return false;
			}
		}
		{
			String lhsMailTypeCode;
			lhsMailTypeCode = this.getMailTypeCode();
			String rhsMailTypeCode;
			rhsMailTypeCode = that.getMailTypeCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "mailTypeCode", lhsMailTypeCode),
					LocatorUtils.property(thatLocator, "mailTypeCode", rhsMailTypeCode), lhsMailTypeCode,
					rhsMailTypeCode)) {
				return false;
			}
		}
		{
			AddressElement lhsShipperAddress;
			lhsShipperAddress = this.getShipperAddress();
			AddressElement rhsShipperAddress;
			rhsShipperAddress = that.getShipperAddress();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "shipperAddress", lhsShipperAddress),
					LocatorUtils.property(thatLocator, "shipperAddress", rhsShipperAddress), lhsShipperAddress,
					rhsShipperAddress)) {
				return false;
			}
		}
		{
			String lhsInboundSortCode;
			lhsInboundSortCode = this.getInboundSortCode();
			String rhsInboundSortCode;
			rhsInboundSortCode = that.getInboundSortCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "inboundSortCode", lhsInboundSortCode),
					LocatorUtils.property(thatLocator, "inboundSortCode", rhsInboundSortCode), lhsInboundSortCode,
					rhsInboundSortCode)) {
				return false;
			}
		}
		{
			String lhsIntendedReceivingFacility;
			lhsIntendedReceivingFacility = this.getIntendedReceivingFacility();
			String rhsIntendedReceivingFacility;
			rhsIntendedReceivingFacility = that.getIntendedReceivingFacility();
			if (!strategy.equals(
					LocatorUtils.property(thisLocator, "intendedReceivingFacility", lhsIntendedReceivingFacility),
					LocatorUtils.property(thatLocator, "intendedReceivingFacility", rhsIntendedReceivingFacility),
					lhsIntendedReceivingFacility, rhsIntendedReceivingFacility)) {
				return false;
			}
		}
		{
			String lhsOutboundSortCode;
			lhsOutboundSortCode = this.getOutboundSortCode();
			String rhsOutboundSortCode;
			rhsOutboundSortCode = that.getOutboundSortCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "outboundSortCode", lhsOutboundSortCode),
					LocatorUtils.property(thatLocator, "outboundSortCode", rhsOutboundSortCode), lhsOutboundSortCode,
					rhsOutboundSortCode)) {
				return false;
			}
		}
		{
			String lhsSortingSetupVersion;
			lhsSortingSetupVersion = this.getSortingSetupVersion();
			String rhsSortingSetupVersion;
			rhsSortingSetupVersion = that.getSortingSetupVersion();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "sortingSetupVersion", lhsSortingSetupVersion),
					LocatorUtils.property(thatLocator, "sortingSetupVersion", rhsSortingSetupVersion),
					lhsSortingSetupVersion, rhsSortingSetupVersion)) {
				return false;
			}
		}
		{
			String lhsZipPlus4;
			lhsZipPlus4 = this.getZipPlus4();
			String rhsZipPlus4;
			rhsZipPlus4 = that.getZipPlus4();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "zipPlus4", lhsZipPlus4),
					LocatorUtils.property(thatLocator, "zipPlus4", rhsZipPlus4), lhsZipPlus4, rhsZipPlus4)) {
				return false;
			}
		}
		{
			String lhsServiceLevel;
			lhsServiceLevel = this.getServiceLevel();
			String rhsServiceLevel;
			rhsServiceLevel = that.getServiceLevel();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLevel", lhsServiceLevel),
					LocatorUtils.property(thatLocator, "serviceLevel", rhsServiceLevel), lhsServiceLevel,
					rhsServiceLevel)) {
				return false;
			}
		}
		{
			String lhsOrderedProductCode;
			lhsOrderedProductCode = this.getOrderedProductCode();
			String rhsOrderedProductCode;
			rhsOrderedProductCode = that.getOrderedProductCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "orderedProductCode", lhsOrderedProductCode),
					LocatorUtils.property(thatLocator, "orderedProductCode", rhsOrderedProductCode),
					lhsOrderedProductCode, rhsOrderedProductCode)) {
				return false;
			}
		}
		{
			String lhsMailBanner;
			lhsMailBanner = this.getMailBanner();
			String rhsMailBanner;
			rhsMailBanner = that.getMailBanner();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "mailBanner", lhsMailBanner),
					LocatorUtils.property(thatLocator, "mailBanner", rhsMailBanner), lhsMailBanner, rhsMailBanner)) {
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
