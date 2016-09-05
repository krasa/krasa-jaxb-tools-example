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
 * Java class for standardAddressElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardAddressElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardAddressElement", propOrder = { "name", "firm", "address1", "address2", "city", "state", "zip",
		"countryCode" })
public class StandardAddressElement implements Equals, HashCode {

	@XmlElement(name = "Name")
	protected String name;
	@XmlElement(name = "Firm")
	protected String firm;
	@XmlElement(name = "Address1", required = true)
	@NotNull
	protected String address1;
	@XmlElement(name = "Address2")
	protected String address2;
	@XmlElement(name = "City", required = true)
	@NotNull
	protected String city;
	@XmlElement(name = "State", required = true)
	@NotNull
	protected String state;
	@XmlElement(name = "Zip", required = true)
	@NotNull
	protected String zip;
	@XmlElement(name = "CountryCode", required = true)
	@NotNull
	protected String countryCode;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the firm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirm() {
		return firm;
	}

	/**
	 * Sets the value of the firm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirm(String value) {
		this.firm = value;
	}

	/**
	 * Gets the value of the address1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * Sets the value of the address1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddress1(String value) {
		this.address1 = value;
	}

	/**
	 * Gets the value of the address2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * Sets the value of the address2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddress2(String value) {
		this.address2 = value;
	}

	/**
	 * Gets the value of the city property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the state property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the value of the state property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * Gets the value of the zip property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the value of the zip property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZip(String value) {
		this.zip = value;
	}

	/**
	 * Gets the value of the countryCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the value of the countryCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theName;
			theName = this.getName();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode,
					theName);
		}
		{
			String theFirm;
			theFirm = this.getFirm();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firm", theFirm), currentHashCode,
					theFirm);
		}
		{
			String theAddress1;
			theAddress1 = this.getAddress1();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address1", theAddress1),
					currentHashCode, theAddress1);
		}
		{
			String theAddress2;
			theAddress2 = this.getAddress2();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address2", theAddress2),
					currentHashCode, theAddress2);
		}
		{
			String theCity;
			theCity = this.getCity();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "city", theCity), currentHashCode,
					theCity);
		}
		{
			String theState;
			theState = this.getState();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "state", theState), currentHashCode,
					theState);
		}
		{
			String theZip;
			theZip = this.getZip();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zip", theZip), currentHashCode, theZip);
		}
		{
			String theCountryCode;
			theCountryCode = this.getCountryCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryCode", theCountryCode),
					currentHashCode, theCountryCode);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof StandardAddressElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final StandardAddressElement that = ((StandardAddressElement) object);
		{
			String lhsName;
			lhsName = this.getName();
			String rhsName;
			rhsName = that.getName();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName),
					LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
				return false;
			}
		}
		{
			String lhsFirm;
			lhsFirm = this.getFirm();
			String rhsFirm;
			rhsFirm = that.getFirm();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "firm", lhsFirm),
					LocatorUtils.property(thatLocator, "firm", rhsFirm), lhsFirm, rhsFirm)) {
				return false;
			}
		}
		{
			String lhsAddress1;
			lhsAddress1 = this.getAddress1();
			String rhsAddress1;
			rhsAddress1 = that.getAddress1();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "address1", lhsAddress1),
					LocatorUtils.property(thatLocator, "address1", rhsAddress1), lhsAddress1, rhsAddress1)) {
				return false;
			}
		}
		{
			String lhsAddress2;
			lhsAddress2 = this.getAddress2();
			String rhsAddress2;
			rhsAddress2 = that.getAddress2();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "address2", lhsAddress2),
					LocatorUtils.property(thatLocator, "address2", rhsAddress2), lhsAddress2, rhsAddress2)) {
				return false;
			}
		}
		{
			String lhsCity;
			lhsCity = this.getCity();
			String rhsCity;
			rhsCity = that.getCity();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity),
					LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity)) {
				return false;
			}
		}
		{
			String lhsState;
			lhsState = this.getState();
			String rhsState;
			rhsState = that.getState();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "state", lhsState),
					LocatorUtils.property(thatLocator, "state", rhsState), lhsState, rhsState)) {
				return false;
			}
		}
		{
			String lhsZip;
			lhsZip = this.getZip();
			String rhsZip;
			rhsZip = that.getZip();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "zip", lhsZip),
					LocatorUtils.property(thatLocator, "zip", rhsZip), lhsZip, rhsZip)) {
				return false;
			}
		}
		{
			String lhsCountryCode;
			lhsCountryCode = this.getCountryCode();
			String rhsCountryCode;
			rhsCountryCode = that.getCountryCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode),
					LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode)) {
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
