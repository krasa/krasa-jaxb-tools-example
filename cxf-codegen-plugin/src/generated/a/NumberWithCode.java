
package a;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for NumberWithCode complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberWithCode">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;a>Number">
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberWithCode", propOrder = { "value" })
public class NumberWithCode implements Equals, HashCode {

	@XmlValue
	@Size(min = 1, max = 5)
	protected String value;
	@XmlAttribute(name = "code")
	protected String code;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCode(String value) {
		this.code = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theValue;
			theValue = this.getValue();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode,
					theValue);
		}
		{
			String theCode;
			theCode = this.getCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode,
					theCode);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof NumberWithCode)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final NumberWithCode that = ((NumberWithCode) object);
		{
			String lhsValue;
			lhsValue = this.getValue();
			String rhsValue;
			rhsValue = that.getValue();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue),
					LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
				return false;
			}
		}
		{
			String lhsCode;
			lhsCode = this.getCode();
			String rhsCode;
			rhsCode = that.getCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode),
					LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode)) {
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
