
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
 * Java class for mpuElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mpuElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}PackageRef" minOccurs="0"/>
 *         &lt;element name="ConsigneeAddress" type="{}addressElement"/>
 *         &lt;element name="ReturnAddress" type="{}addressElement" minOccurs="0"/>
 *         &lt;element name="OrderedProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}Weight"/>
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingRef1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingRef2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyBillTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MailTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FacilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}Impb" minOccurs="0"/>
 *         &lt;element name="ContainerRef1" type="{}containerElement" minOccurs="0"/>
 *         &lt;element name="ContainerRef2" type="{}containerElement" minOccurs="0"/>
 *         &lt;element ref="{}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpuElement", propOrder = { "packageId", "packageRef", "consigneeAddress", "returnAddress", "orderedProductCode", "weight", "service",
		"billingRef1", "billingRef2", "thirdPartyBillTo", "mailTypeCode", "facilityCode", "expectedShipDate", "impb", "containerRef1", "containerRef2",
		"response" })
public class MpuElement implements Equals, HashCode {

	@XmlElement(name = "PackageId")
	protected String packageId;
	@XmlElement(name = "PackageRef")
	protected PackageRefElement packageRef;
	@XmlElement(name = "ConsigneeAddress", required = true)
	@NotNull
	protected AddressElement consigneeAddress;
	@XmlElement(name = "ReturnAddress")
	protected AddressElement returnAddress;
	@XmlElement(name = "OrderedProductCode", required = true)
	@NotNull
	protected String orderedProductCode;
	@XmlElement(name = "Weight", required = true)
	@NotNull
	protected WeightElement weight;
	@XmlElement(name = "Service")
	protected String service;
	@XmlElement(name = "BillingRef1")
	protected String billingRef1;
	@XmlElement(name = "BillingRef2")
	protected String billingRef2;
	@XmlElement(name = "ThirdPartyBillTo")
	protected Integer thirdPartyBillTo;
	@XmlElement(name = "MailTypeCode", required = true)
	@NotNull
	protected String mailTypeCode;
	@XmlElement(name = "FacilityCode")
	protected String facilityCode;
	@XmlElement(name = "ExpectedShipDate", required = true)
	@NotNull
	protected String expectedShipDate;
	@XmlElement(name = "Impb")
	protected ImpbElement impb;
	@XmlElement(name = "ContainerRef1")
	protected ContainerElement containerRef1;
	@XmlElement(name = "ContainerRef2")
	protected ContainerElement containerRef2;
	@XmlElement(name = "Response")
	protected MpuResponseElement response;

	/**
	 * Gets the value of the packageId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPackageId() {
		return packageId;
	}

	/**
	 * Sets the value of the packageId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPackageId(String value) {
		this.packageId = value;
	}

	/**
	 * Gets the value of the packageRef property.
	 * 
	 * @return possible object is {@link PackageRefElement }
	 * 
	 */
	public PackageRefElement getPackageRef() {
		return packageRef;
	}

	/**
	 * Sets the value of the packageRef property.
	 * 
	 * @param value
	 *            allowed object is {@link PackageRefElement }
	 * 
	 */
	public void setPackageRef(PackageRefElement value) {
		this.packageRef = value;
	}

	/**
	 * Gets the value of the consigneeAddress property.
	 * 
	 * @return possible object is {@link AddressElement }
	 * 
	 */
	public AddressElement getConsigneeAddress() {
		return consigneeAddress;
	}

	/**
	 * Sets the value of the consigneeAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link AddressElement }
	 * 
	 */
	public void setConsigneeAddress(AddressElement value) {
		this.consigneeAddress = value;
	}

	/**
	 * Gets the value of the returnAddress property.
	 * 
	 * @return possible object is {@link AddressElement }
	 * 
	 */
	public AddressElement getReturnAddress() {
		return returnAddress;
	}

	/**
	 * Sets the value of the returnAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link AddressElement }
	 * 
	 */
	public void setReturnAddress(AddressElement value) {
		this.returnAddress = value;
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
	 * Gets the value of the weight property.
	 * 
	 * @return possible object is {@link WeightElement }
	 * 
	 */
	public WeightElement getWeight() {
		return weight;
	}

	/**
	 * Sets the value of the weight property.
	 * 
	 * @param value
	 *            allowed object is {@link WeightElement }
	 * 
	 */
	public void setWeight(WeightElement value) {
		this.weight = value;
	}

	/**
	 * Gets the value of the service property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getService() {
		return service;
	}

	/**
	 * Sets the value of the service property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setService(String value) {
		this.service = value;
	}

	/**
	 * Gets the value of the billingRef1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBillingRef1() {
		return billingRef1;
	}

	/**
	 * Sets the value of the billingRef1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBillingRef1(String value) {
		this.billingRef1 = value;
	}

	/**
	 * Gets the value of the billingRef2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBillingRef2() {
		return billingRef2;
	}

	/**
	 * Sets the value of the billingRef2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBillingRef2(String value) {
		this.billingRef2 = value;
	}

	/**
	 * Gets the value of the thirdPartyBillTo property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getThirdPartyBillTo() {
		return thirdPartyBillTo;
	}

	/**
	 * Sets the value of the thirdPartyBillTo property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setThirdPartyBillTo(Integer value) {
		this.thirdPartyBillTo = value;
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
	 * Gets the value of the facilityCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacilityCode() {
		return facilityCode;
	}

	/**
	 * Sets the value of the facilityCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFacilityCode(String value) {
		this.facilityCode = value;
	}

	/**
	 * Gets the value of the expectedShipDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpectedShipDate() {
		return expectedShipDate;
	}

	/**
	 * Sets the value of the expectedShipDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpectedShipDate(String value) {
		this.expectedShipDate = value;
	}

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
	 * Gets the value of the containerRef1 property.
	 * 
	 * @return possible object is {@link ContainerElement }
	 * 
	 */
	public ContainerElement getContainerRef1() {
		return containerRef1;
	}

	/**
	 * Sets the value of the containerRef1 property.
	 * 
	 * @param value
	 *            allowed object is {@link ContainerElement }
	 * 
	 */
	public void setContainerRef1(ContainerElement value) {
		this.containerRef1 = value;
	}

	/**
	 * Gets the value of the containerRef2 property.
	 * 
	 * @return possible object is {@link ContainerElement }
	 * 
	 */
	public ContainerElement getContainerRef2() {
		return containerRef2;
	}

	/**
	 * Sets the value of the containerRef2 property.
	 * 
	 * @param value
	 *            allowed object is {@link ContainerElement }
	 * 
	 */
	public void setContainerRef2(ContainerElement value) {
		this.containerRef2 = value;
	}

	/**
	 * Gets the value of the response property.
	 * 
	 * @return possible object is {@link MpuResponseElement }
	 * 
	 */
	public MpuResponseElement getResponse() {
		return response;
	}

	/**
	 * Sets the value of the response property.
	 * 
	 * @param value
	 *            allowed object is {@link MpuResponseElement }
	 * 
	 */
	public void setResponse(MpuResponseElement value) {
		this.response = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String thePackageId;
			thePackageId = this.getPackageId();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageId", thePackageId), currentHashCode, thePackageId);
		}
		{
			PackageRefElement thePackageRef;
			thePackageRef = this.getPackageRef();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageRef", thePackageRef), currentHashCode, thePackageRef);
		}
		{
			AddressElement theConsigneeAddress;
			theConsigneeAddress = this.getConsigneeAddress();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consigneeAddress", theConsigneeAddress), currentHashCode, theConsigneeAddress);
		}
		{
			AddressElement theReturnAddress;
			theReturnAddress = this.getReturnAddress();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnAddress", theReturnAddress), currentHashCode, theReturnAddress);
		}
		{
			String theOrderedProductCode;
			theOrderedProductCode = this.getOrderedProductCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderedProductCode", theOrderedProductCode), currentHashCode,
					theOrderedProductCode);
		}
		{
			WeightElement theWeight;
			theWeight = this.getWeight();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weight", theWeight), currentHashCode, theWeight);
		}
		{
			String theService;
			theService = this.getService();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "service", theService), currentHashCode, theService);
		}
		{
			String theBillingRef1;
			theBillingRef1 = this.getBillingRef1();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingRef1", theBillingRef1), currentHashCode, theBillingRef1);
		}
		{
			String theBillingRef2;
			theBillingRef2 = this.getBillingRef2();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingRef2", theBillingRef2), currentHashCode, theBillingRef2);
		}
		{
			Integer theThirdPartyBillTo;
			theThirdPartyBillTo = this.getThirdPartyBillTo();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thirdPartyBillTo", theThirdPartyBillTo), currentHashCode, theThirdPartyBillTo);
		}
		{
			String theMailTypeCode;
			theMailTypeCode = this.getMailTypeCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mailTypeCode", theMailTypeCode), currentHashCode, theMailTypeCode);
		}
		{
			String theFacilityCode;
			theFacilityCode = this.getFacilityCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facilityCode", theFacilityCode), currentHashCode, theFacilityCode);
		}
		{
			String theExpectedShipDate;
			theExpectedShipDate = this.getExpectedShipDate();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedShipDate", theExpectedShipDate), currentHashCode, theExpectedShipDate);
		}
		{
			ImpbElement theImpb;
			theImpb = this.getImpb();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "impb", theImpb), currentHashCode, theImpb);
		}
		{
			ContainerElement theContainerRef1;
			theContainerRef1 = this.getContainerRef1();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerRef1", theContainerRef1), currentHashCode, theContainerRef1);
		}
		{
			ContainerElement theContainerRef2;
			theContainerRef2 = this.getContainerRef2();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerRef2", theContainerRef2), currentHashCode, theContainerRef2);
		}
		{
			MpuResponseElement theResponse;
			theResponse = this.getResponse();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "response", theResponse), currentHashCode, theResponse);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof MpuElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final MpuElement that = ((MpuElement) object);
		{
			String lhsPackageId;
			lhsPackageId = this.getPackageId();
			String rhsPackageId;
			rhsPackageId = that.getPackageId();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "packageId", lhsPackageId), LocatorUtils.property(thatLocator, "packageId", rhsPackageId),
					lhsPackageId, rhsPackageId)) {
				return false;
			}
		}
		{
			PackageRefElement lhsPackageRef;
			lhsPackageRef = this.getPackageRef();
			PackageRefElement rhsPackageRef;
			rhsPackageRef = that.getPackageRef();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "packageRef", lhsPackageRef),
					LocatorUtils.property(thatLocator, "packageRef", rhsPackageRef), lhsPackageRef, rhsPackageRef)) {
				return false;
			}
		}
		{
			AddressElement lhsConsigneeAddress;
			lhsConsigneeAddress = this.getConsigneeAddress();
			AddressElement rhsConsigneeAddress;
			rhsConsigneeAddress = that.getConsigneeAddress();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "consigneeAddress", lhsConsigneeAddress),
					LocatorUtils.property(thatLocator, "consigneeAddress", rhsConsigneeAddress), lhsConsigneeAddress, rhsConsigneeAddress)) {
				return false;
			}
		}
		{
			AddressElement lhsReturnAddress;
			lhsReturnAddress = this.getReturnAddress();
			AddressElement rhsReturnAddress;
			rhsReturnAddress = that.getReturnAddress();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "returnAddress", lhsReturnAddress),
					LocatorUtils.property(thatLocator, "returnAddress", rhsReturnAddress), lhsReturnAddress, rhsReturnAddress)) {
				return false;
			}
		}
		{
			String lhsOrderedProductCode;
			lhsOrderedProductCode = this.getOrderedProductCode();
			String rhsOrderedProductCode;
			rhsOrderedProductCode = that.getOrderedProductCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "orderedProductCode", lhsOrderedProductCode),
					LocatorUtils.property(thatLocator, "orderedProductCode", rhsOrderedProductCode), lhsOrderedProductCode, rhsOrderedProductCode)) {
				return false;
			}
		}
		{
			WeightElement lhsWeight;
			lhsWeight = this.getWeight();
			WeightElement rhsWeight;
			rhsWeight = that.getWeight();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "weight", lhsWeight), LocatorUtils.property(thatLocator, "weight", rhsWeight), lhsWeight,
					rhsWeight)) {
				return false;
			}
		}
		{
			String lhsService;
			lhsService = this.getService();
			String rhsService;
			rhsService = that.getService();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "service", lhsService), LocatorUtils.property(thatLocator, "service", rhsService),
					lhsService, rhsService)) {
				return false;
			}
		}
		{
			String lhsBillingRef1;
			lhsBillingRef1 = this.getBillingRef1();
			String rhsBillingRef1;
			rhsBillingRef1 = that.getBillingRef1();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "billingRef1", lhsBillingRef1),
					LocatorUtils.property(thatLocator, "billingRef1", rhsBillingRef1), lhsBillingRef1, rhsBillingRef1)) {
				return false;
			}
		}
		{
			String lhsBillingRef2;
			lhsBillingRef2 = this.getBillingRef2();
			String rhsBillingRef2;
			rhsBillingRef2 = that.getBillingRef2();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "billingRef2", lhsBillingRef2),
					LocatorUtils.property(thatLocator, "billingRef2", rhsBillingRef2), lhsBillingRef2, rhsBillingRef2)) {
				return false;
			}
		}
		{
			Integer lhsThirdPartyBillTo;
			lhsThirdPartyBillTo = this.getThirdPartyBillTo();
			Integer rhsThirdPartyBillTo;
			rhsThirdPartyBillTo = that.getThirdPartyBillTo();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "thirdPartyBillTo", lhsThirdPartyBillTo),
					LocatorUtils.property(thatLocator, "thirdPartyBillTo", rhsThirdPartyBillTo), lhsThirdPartyBillTo, rhsThirdPartyBillTo)) {
				return false;
			}
		}
		{
			String lhsMailTypeCode;
			lhsMailTypeCode = this.getMailTypeCode();
			String rhsMailTypeCode;
			rhsMailTypeCode = that.getMailTypeCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "mailTypeCode", lhsMailTypeCode),
					LocatorUtils.property(thatLocator, "mailTypeCode", rhsMailTypeCode), lhsMailTypeCode, rhsMailTypeCode)) {
				return false;
			}
		}
		{
			String lhsFacilityCode;
			lhsFacilityCode = this.getFacilityCode();
			String rhsFacilityCode;
			rhsFacilityCode = that.getFacilityCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "facilityCode", lhsFacilityCode),
					LocatorUtils.property(thatLocator, "facilityCode", rhsFacilityCode), lhsFacilityCode, rhsFacilityCode)) {
				return false;
			}
		}
		{
			String lhsExpectedShipDate;
			lhsExpectedShipDate = this.getExpectedShipDate();
			String rhsExpectedShipDate;
			rhsExpectedShipDate = that.getExpectedShipDate();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedShipDate", lhsExpectedShipDate),
					LocatorUtils.property(thatLocator, "expectedShipDate", rhsExpectedShipDate), lhsExpectedShipDate, rhsExpectedShipDate)) {
				return false;
			}
		}
		{
			ImpbElement lhsImpb;
			lhsImpb = this.getImpb();
			ImpbElement rhsImpb;
			rhsImpb = that.getImpb();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "impb", lhsImpb), LocatorUtils.property(thatLocator, "impb", rhsImpb), lhsImpb, rhsImpb)) {
				return false;
			}
		}
		{
			ContainerElement lhsContainerRef1;
			lhsContainerRef1 = this.getContainerRef1();
			ContainerElement rhsContainerRef1;
			rhsContainerRef1 = that.getContainerRef1();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "containerRef1", lhsContainerRef1),
					LocatorUtils.property(thatLocator, "containerRef1", rhsContainerRef1), lhsContainerRef1, rhsContainerRef1)) {
				return false;
			}
		}
		{
			ContainerElement lhsContainerRef2;
			lhsContainerRef2 = this.getContainerRef2();
			ContainerElement rhsContainerRef2;
			rhsContainerRef2 = that.getContainerRef2();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "containerRef2", lhsContainerRef2),
					LocatorUtils.property(thatLocator, "containerRef2", rhsContainerRef2), lhsContainerRef2, rhsContainerRef2)) {
				return false;
			}
		}
		{
			MpuResponseElement lhsResponse;
			lhsResponse = this.getResponse();
			MpuResponseElement rhsResponse;
			rhsResponse = that.getResponse();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "response", lhsResponse), LocatorUtils.property(thatLocator, "response", rhsResponse),
					lhsResponse, rhsResponse)) {
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
