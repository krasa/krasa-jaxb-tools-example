package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardAddressElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardAddressElement", propOrder = {
		"name",
		"firm",
		"address1",
		"address2",
		"city",
		"state",
		"zip",
		"countryCode"
})
public class StandardAddressElement {

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
	 * @return possible object is
	 * {@link String }
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the firm property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getFirm() {
		return firm;
	}

	/**
	 * Sets the value of the firm property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setFirm(String value) {
		this.firm = value;
	}

	/**
	 * Gets the value of the address1 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * Sets the value of the address1 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setAddress1(String value) {
		this.address1 = value;
	}

	/**
	 * Gets the value of the address2 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * Sets the value of the address2 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setAddress2(String value) {
		this.address2 = value;
	}

	/**
	 * Gets the value of the city property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the value of the city property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * Gets the value of the state property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the value of the state property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * Gets the value of the zip property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the value of the zip property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setZip(String value) {
		this.zip = value;
	}

	/**
	 * Gets the value of the countryCode property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Sets the value of the countryCode property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

}
