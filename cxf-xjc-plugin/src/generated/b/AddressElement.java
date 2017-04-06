package b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for addressElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressElement", propOrder = { "freeFormAddress", "standardAddress" })
public class AddressElement implements Equals, HashCode {

	@XmlElement(name = "FreeFormAddress")
	protected FreeFormAddressElement freeFormAddress;
	@XmlElement(name = "StandardAddress")
	protected StandardAddressElement standardAddress;

	/**
	 * Gets the value of the freeFormAddress property.
	 * 
	 * @return possible object is {@link FreeFormAddressElement }
	 * 
	 */
	public FreeFormAddressElement getFreeFormAddress() {
		return freeFormAddress;
	}

	/**
	 * Sets the value of the freeFormAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link FreeFormAddressElement }
	 * 
	 */
	public void setFreeFormAddress(FreeFormAddressElement value) {
		this.freeFormAddress = value;
	}

	/**
	 * Gets the value of the standardAddress property.
	 * 
	 * @return possible object is {@link StandardAddressElement }
	 * 
	 */
	public StandardAddressElement getStandardAddress() {
		return standardAddress;
	}

	/**
	 * Sets the value of the standardAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link StandardAddressElement }
	 * 
	 */
	public void setStandardAddress(StandardAddressElement value) {
		this.standardAddress = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			FreeFormAddressElement theFreeFormAddress;
			theFreeFormAddress = this.getFreeFormAddress();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freeFormAddress", theFreeFormAddress),
					currentHashCode, theFreeFormAddress);
		}
		{
			StandardAddressElement theStandardAddress;
			theStandardAddress = this.getStandardAddress();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardAddress", theStandardAddress),
					currentHashCode, theStandardAddress);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof AddressElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final AddressElement that = ((AddressElement) object);
		{
			FreeFormAddressElement lhsFreeFormAddress;
			lhsFreeFormAddress = this.getFreeFormAddress();
			FreeFormAddressElement rhsFreeFormAddress;
			rhsFreeFormAddress = that.getFreeFormAddress();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFormAddress", lhsFreeFormAddress),
					LocatorUtils.property(thatLocator, "freeFormAddress", rhsFreeFormAddress), lhsFreeFormAddress,
					rhsFreeFormAddress)) {
				return false;
			}
		}
		{
			StandardAddressElement lhsStandardAddress;
			lhsStandardAddress = this.getStandardAddress();
			StandardAddressElement rhsStandardAddress;
			rhsStandardAddress = that.getStandardAddress();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "standardAddress", lhsStandardAddress),
					LocatorUtils.property(thatLocator, "standardAddress", rhsStandardAddress), lhsStandardAddress,
					rhsStandardAddress)) {
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
