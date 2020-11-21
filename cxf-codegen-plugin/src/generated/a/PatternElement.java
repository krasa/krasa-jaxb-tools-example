
package a;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for PatternElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatternElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiplePatternsWithBase" type="{a}patternList" minOccurs="0"/>
 *         &lt;element name="enumRestrictions" type="{a}enumRestrictions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatternElement", propOrder = { "multiplePatternsWithBase", "enumRestrictions" })
public class PatternElement implements Serializable, Equals, HashCode {

	private final static long serialVersionUID = 1L;
	@Pattern.List({ @Pattern(regexp = "[A-Z]"), @Pattern(regexp = "([0-9])|([A-B])") })
	protected String multiplePatternsWithBase;
	@Pattern(regexp = "(\\Qtest 123\\E)|(\\Qtest (123)\\E)")
	protected String enumRestrictions;

	/**
	 * Gets the value of the multiplePatternsWithBase property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMultiplePatternsWithBase() {
		return multiplePatternsWithBase;
	}

	/**
	 * Sets the value of the multiplePatternsWithBase property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMultiplePatternsWithBase(String value) {
		this.multiplePatternsWithBase = value;
	}

	/**
	 * Gets the value of the enumRestrictions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEnumRestrictions() {
		return enumRestrictions;
	}

	/**
	 * Sets the value of the enumRestrictions property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEnumRestrictions(String value) {
		this.enumRestrictions = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theMultiplePatternsWithBase;
			theMultiplePatternsWithBase = this.getMultiplePatternsWithBase();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiplePatternsWithBase", theMultiplePatternsWithBase), currentHashCode,
					theMultiplePatternsWithBase);
		}
		{
			String theEnumRestrictions;
			theEnumRestrictions = this.getEnumRestrictions();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enumRestrictions", theEnumRestrictions), currentHashCode, theEnumRestrictions);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof PatternElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final PatternElement that = ((PatternElement) object);
		{
			String lhsMultiplePatternsWithBase;
			lhsMultiplePatternsWithBase = this.getMultiplePatternsWithBase();
			String rhsMultiplePatternsWithBase;
			rhsMultiplePatternsWithBase = that.getMultiplePatternsWithBase();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "multiplePatternsWithBase", lhsMultiplePatternsWithBase),
					LocatorUtils.property(thatLocator, "multiplePatternsWithBase", rhsMultiplePatternsWithBase), lhsMultiplePatternsWithBase,
					rhsMultiplePatternsWithBase)) {
				return false;
			}
		}
		{
			String lhsEnumRestrictions;
			lhsEnumRestrictions = this.getEnumRestrictions();
			String rhsEnumRestrictions;
			rhsEnumRestrictions = that.getEnumRestrictions();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "enumRestrictions", lhsEnumRestrictions),
					LocatorUtils.property(thatLocator, "enumRestrictions", rhsEnumRestrictions), lhsEnumRestrictions, rhsEnumRestrictions)) {
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
