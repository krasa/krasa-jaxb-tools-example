
package b;

import java.math.BigDecimal;

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
 * Java class for weightElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weightElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{}weightUnitValue"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weightElement", propOrder = { "unit", "value" })
public class WeightElement implements Equals, HashCode {

	@XmlElement(name = "Unit", required = true)
	@NotNull
	protected WeightUnitValue unit;
	@XmlElement(name = "Value", required = true)
	@NotNull
	protected BigDecimal value;

	/**
	 * Gets the value of the unit property.
	 * 
	 * @return possible object is {@link WeightUnitValue }
	 * 
	 */
	public WeightUnitValue getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the unit property.
	 * 
	 * @param value
	 *            allowed object is {@link WeightUnitValue }
	 * 
	 */
	public void setUnit(WeightUnitValue value) {
		this.unit = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			WeightUnitValue theUnit;
			theUnit = this.getUnit();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unit", theUnit), currentHashCode, theUnit);
		}
		{
			BigDecimal theValue;
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
		if (!(object instanceof WeightElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final WeightElement that = ((WeightElement) object);
		{
			WeightUnitValue lhsUnit;
			lhsUnit = this.getUnit();
			WeightUnitValue rhsUnit;
			rhsUnit = that.getUnit();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit)) {
				return false;
			}
		}
		{
			BigDecimal lhsValue;
			lhsValue = this.getValue();
			BigDecimal rhsValue;
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
