
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
 * Java class for impbElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impbElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Construct" type="{}impbConstructValue"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impbElement", propOrder = { "construct", "value" })
public class ImpbElement implements Equals, HashCode {

	@XmlElement(name = "Construct", required = true)
	@NotNull
	protected ImpbConstructValue construct;
	@XmlElement(name = "Value", required = true)
	@NotNull
	protected String value;

	/**
	 * Gets the value of the construct property.
	 * 
	 * @return possible object is {@link ImpbConstructValue }
	 * 
	 */
	public ImpbConstructValue getConstruct() {
		return construct;
	}

	/**
	 * Sets the value of the construct property.
	 * 
	 * @param value
	 *            allowed object is {@link ImpbConstructValue }
	 * 
	 */
	public void setConstruct(ImpbConstructValue value) {
		this.construct = value;
	}

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

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			ImpbConstructValue theConstruct;
			theConstruct = this.getConstruct();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "construct", theConstruct), currentHashCode, theConstruct);
		}
		{
			String theValue;
			theValue = this.getValue();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof ImpbElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final ImpbElement that = ((ImpbElement) object);
		{
			ImpbConstructValue lhsConstruct;
			lhsConstruct = this.getConstruct();
			ImpbConstructValue rhsConstruct;
			rhsConstruct = that.getConstruct();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "construct", lhsConstruct), LocatorUtils.property(thatLocator, "construct", rhsConstruct),
					lhsConstruct, rhsConstruct)) {
				return false;
			}
		}
		{
			String lhsValue;
			lhsValue = this.getValue();
			String rhsValue;
			rhsValue = that.getValue();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue,
					rhsValue)) {
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
