package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mpuElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpuElement", propOrder = {
		"packageId",
		"packageRef",
		"consigneeAddress",
		"returnAddress",
		"orderedProductCode",
		"weight",
		"service",
		"billingRef1",
		"billingRef2",
		"thirdPartyBillTo",
		"mailTypeCode",
		"facilityCode",
		"expectedShipDate",
		"impb",
		"containerRef1",
		"containerRef2",
		"response"
})
public class MpuElement {

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
	 * @return possible object is
	 * {@link String }
	 */
	public String getPackageId() {
		return packageId;
	}

	/**
	 * Sets the value of the packageId property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setPackageId(String value) {
		this.packageId = value;
	}

	/**
	 * Gets the value of the packageRef property.
	 *
	 * @return possible object is
	 * {@link PackageRefElement }
	 */
	public PackageRefElement getPackageRef() {
		return packageRef;
	}

	/**
	 * Sets the value of the packageRef property.
	 *
	 * @param value allowed object is
	 *              {@link PackageRefElement }
	 */
	public void setPackageRef(PackageRefElement value) {
		this.packageRef = value;
	}

	/**
	 * Gets the value of the consigneeAddress property.
	 *
	 * @return possible object is
	 * {@link AddressElement }
	 */
	public AddressElement getConsigneeAddress() {
		return consigneeAddress;
	}

	/**
	 * Sets the value of the consigneeAddress property.
	 *
	 * @param value allowed object is
	 *              {@link AddressElement }
	 */
	public void setConsigneeAddress(AddressElement value) {
		this.consigneeAddress = value;
	}

	/**
	 * Gets the value of the returnAddress property.
	 *
	 * @return possible object is
	 * {@link AddressElement }
	 */
	public AddressElement getReturnAddress() {
		return returnAddress;
	}

	/**
	 * Sets the value of the returnAddress property.
	 *
	 * @param value allowed object is
	 *              {@link AddressElement }
	 */
	public void setReturnAddress(AddressElement value) {
		this.returnAddress = value;
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
	 * Gets the value of the weight property.
	 *
	 * @return possible object is
	 * {@link WeightElement }
	 */
	public WeightElement getWeight() {
		return weight;
	}

	/**
	 * Sets the value of the weight property.
	 *
	 * @param value allowed object is
	 *              {@link WeightElement }
	 */
	public void setWeight(WeightElement value) {
		this.weight = value;
	}

	/**
	 * Gets the value of the service property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getService() {
		return service;
	}

	/**
	 * Sets the value of the service property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setService(String value) {
		this.service = value;
	}

	/**
	 * Gets the value of the billingRef1 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBillingRef1() {
		return billingRef1;
	}

	/**
	 * Sets the value of the billingRef1 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBillingRef1(String value) {
		this.billingRef1 = value;
	}

	/**
	 * Gets the value of the billingRef2 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBillingRef2() {
		return billingRef2;
	}

	/**
	 * Sets the value of the billingRef2 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBillingRef2(String value) {
		this.billingRef2 = value;
	}

	/**
	 * Gets the value of the thirdPartyBillTo property.
	 *
	 * @return possible object is
	 * {@link Integer }
	 */
	public Integer getThirdPartyBillTo() {
		return thirdPartyBillTo;
	}

	/**
	 * Sets the value of the thirdPartyBillTo property.
	 *
	 * @param value allowed object is
	 *              {@link Integer }
	 */
	public void setThirdPartyBillTo(Integer value) {
		this.thirdPartyBillTo = value;
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
	 * Gets the value of the facilityCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getFacilityCode() {
		return facilityCode;
	}

	/**
	 * Sets the value of the facilityCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setFacilityCode(String value) {
		this.facilityCode = value;
	}

	/**
	 * Gets the value of the expectedShipDate property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getExpectedShipDate() {
		return expectedShipDate;
	}

	/**
	 * Sets the value of the expectedShipDate property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setExpectedShipDate(String value) {
		this.expectedShipDate = value;
	}

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
	 * Gets the value of the containerRef1 property.
	 *
	 * @return possible object is
	 * {@link ContainerElement }
	 */
	public ContainerElement getContainerRef1() {
		return containerRef1;
	}

	/**
	 * Sets the value of the containerRef1 property.
	 *
	 * @param value allowed object is
	 *              {@link ContainerElement }
	 */
	public void setContainerRef1(ContainerElement value) {
		this.containerRef1 = value;
	}

	/**
	 * Gets the value of the containerRef2 property.
	 *
	 * @return possible object is
	 * {@link ContainerElement }
	 */
	public ContainerElement getContainerRef2() {
		return containerRef2;
	}

	/**
	 * Sets the value of the containerRef2 property.
	 *
	 * @param value allowed object is
	 *              {@link ContainerElement }
	 */
	public void setContainerRef2(ContainerElement value) {
		this.containerRef2 = value;
	}

	/**
	 * Gets the value of the response property.
	 *
	 * @return possible object is
	 * {@link MpuResponseElement }
	 */
	public MpuResponseElement getResponse() {
		return response;
	}

	/**
	 * Sets the value of the response property.
	 *
	 * @param value allowed object is
	 *              {@link MpuResponseElement }
	 */
	public void setResponse(MpuResponseElement value) {
		this.response = value;
	}

}
