package b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="addressElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}FreeFormAddress" minOccurs="0"/>
 *         &lt;element ref="{}StandardAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressElement", propOrder = {
		"freeFormAddress",
		"standardAddress"
})
public class AddressElement {

	@XmlElement(name = "FreeFormAddress")
	protected FreeFormAddressElement freeFormAddress;
	@XmlElement(name = "StandardAddress")
	protected StandardAddressElement standardAddress;

	/**
	 * Gets the value of the freeFormAddress property.
	 *
	 * @return possible object is
	 * {@link FreeFormAddressElement }
	 */
	public FreeFormAddressElement getFreeFormAddress() {
		return freeFormAddress;
	}

	/**
	 * Sets the value of the freeFormAddress property.
	 *
	 * @param value allowed object is
	 *              {@link FreeFormAddressElement }
	 */
	public void setFreeFormAddress(FreeFormAddressElement value) {
		this.freeFormAddress = value;
	}

	/**
	 * Gets the value of the standardAddress property.
	 *
	 * @return possible object is
	 * {@link StandardAddressElement }
	 */
	public StandardAddressElement getStandardAddress() {
		return standardAddress;
	}

	/**
	 * Sets the value of the standardAddress property.
	 *
	 * @param value allowed object is
	 *              {@link StandardAddressElement }
	 */
	public void setStandardAddress(StandardAddressElement value) {
		this.standardAddress = value;
	}

}
