package a;

import java.io.Serializable;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for Numbers complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Numbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minInclusive" type="{a}minInclusive"/>
 *         &lt;element name="maxInclusive" type="{a}maxInclusive"/>
 *         &lt;element name="minExclusive" type="{a}minExclusive"/>
 *         &lt;element name="maxExclusive" type="{a}maxExclusive"/>
 *         &lt;element name="minMaxExclusive" type="{a}minMaxExclusive"/>
 *         &lt;element name="NumberWithCode" type="{a}NumberWithCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numbers", propOrder = { "minInclusive", "maxInclusive", "minExclusive", "maxExclusive",
		"minMaxExclusive", "numberWithCode" })
public class Numbers implements Serializable, Equals, HashCode {

	private final static long serialVersionUID = 1L;
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMin("1000")
	protected java.lang.Long minInclusive;
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMax("1000")
	protected java.lang.Long maxInclusive;
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMin("1")
	protected java.lang.Long minExclusive;
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMax("999")
	protected java.lang.Long maxExclusive;
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMax("999")
	@javax.validation.constraints.DecimalMin("1")
	protected Integer minMaxExclusive;
	@XmlElement(name = "NumberWithCode")
	@Valid
	protected NumberWithCode numberWithCode;

	/**
	 * Gets the value of the minInclusive property.
	 * 
	 */
	public java.lang.Long getMinInclusive() {
		return minInclusive;
	}

	/**
	 * Sets the value of the minInclusive property.
	 * 
	 */
	public void setMinInclusive(java.lang.Long value) {
		this.minInclusive = value;
	}

	/**
	 * Gets the value of the maxInclusive property.
	 * 
	 */
	public java.lang.Long getMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * Sets the value of the maxInclusive property.
	 * 
	 */
	public void setMaxInclusive(java.lang.Long value) {
		this.maxInclusive = value;
	}

	/**
	 * Gets the value of the minExclusive property.
	 * 
	 */
	public java.lang.Long getMinExclusive() {
		return minExclusive;
	}

	/**
	 * Sets the value of the minExclusive property.
	 * 
	 */
	public void setMinExclusive(java.lang.Long value) {
		this.minExclusive = value;
	}

	/**
	 * Gets the value of the maxExclusive property.
	 * 
	 */
	public java.lang.Long getMaxExclusive() {
		return maxExclusive;
	}

	/**
	 * Sets the value of the maxExclusive property.
	 * 
	 */
	public void setMaxExclusive(java.lang.Long value) {
		this.maxExclusive = value;
	}

	/**
	 * Gets the value of the minMaxExclusive property.
	 * 
	 */
	public Integer getMinMaxExclusive() {
		return minMaxExclusive;
	}

	/**
	 * Sets the value of the minMaxExclusive property.
	 * 
	 */
	public void setMinMaxExclusive(Integer value) {
		this.minMaxExclusive = value;
	}

	/**
	 * Gets the value of the numberWithCode property.
	 * 
	 * @return possible object is {@link NumberWithCode }
	 * 
	 */
	public NumberWithCode getNumberWithCode() {
		return numberWithCode;
	}

	/**
	 * Sets the value of the numberWithCode property.
	 * 
	 * @param value
	 *            allowed object is {@link NumberWithCode }
	 * 
	 */
	public void setNumberWithCode(NumberWithCode value) {
		this.numberWithCode = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			java.lang.Long theMinInclusive;
			theMinInclusive = this.getMinInclusive();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minInclusive", theMinInclusive),
					currentHashCode, theMinInclusive);
		}
		{
			java.lang.Long theMaxInclusive;
			theMaxInclusive = this.getMaxInclusive();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxInclusive", theMaxInclusive),
					currentHashCode, theMaxInclusive);
		}
		{
			java.lang.Long theMinExclusive;
			theMinExclusive = this.getMinExclusive();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minExclusive", theMinExclusive),
					currentHashCode, theMinExclusive);
		}
		{
			java.lang.Long theMaxExclusive;
			theMaxExclusive = this.getMaxExclusive();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxExclusive", theMaxExclusive),
					currentHashCode, theMaxExclusive);
		}
		{
			Integer theMinMaxExclusive;
			theMinMaxExclusive = this.getMinMaxExclusive();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minMaxExclusive", theMinMaxExclusive),
					currentHashCode, theMinMaxExclusive);
		}
		{
			NumberWithCode theNumberWithCode;
			theNumberWithCode = this.getNumberWithCode();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberWithCode", theNumberWithCode),
					currentHashCode, theNumberWithCode);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof Numbers)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Numbers that = ((Numbers) object);
		{
			java.lang.Long lhsMinInclusive;
			lhsMinInclusive = this.getMinInclusive();
			java.lang.Long rhsMinInclusive;
			rhsMinInclusive = that.getMinInclusive();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "minInclusive", lhsMinInclusive),
					LocatorUtils.property(thatLocator, "minInclusive", rhsMinInclusive), lhsMinInclusive,
					rhsMinInclusive)) {
				return false;
			}
		}
		{
			java.lang.Long lhsMaxInclusive;
			lhsMaxInclusive = this.getMaxInclusive();
			java.lang.Long rhsMaxInclusive;
			rhsMaxInclusive = that.getMaxInclusive();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "maxInclusive", lhsMaxInclusive),
					LocatorUtils.property(thatLocator, "maxInclusive", rhsMaxInclusive), lhsMaxInclusive,
					rhsMaxInclusive)) {
				return false;
			}
		}
		{
			java.lang.Long lhsMinExclusive;
			lhsMinExclusive = this.getMinExclusive();
			java.lang.Long rhsMinExclusive;
			rhsMinExclusive = that.getMinExclusive();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "minExclusive", lhsMinExclusive),
					LocatorUtils.property(thatLocator, "minExclusive", rhsMinExclusive), lhsMinExclusive,
					rhsMinExclusive)) {
				return false;
			}
		}
		{
			java.lang.Long lhsMaxExclusive;
			lhsMaxExclusive = this.getMaxExclusive();
			java.lang.Long rhsMaxExclusive;
			rhsMaxExclusive = that.getMaxExclusive();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "maxExclusive", lhsMaxExclusive),
					LocatorUtils.property(thatLocator, "maxExclusive", rhsMaxExclusive), lhsMaxExclusive,
					rhsMaxExclusive)) {
				return false;
			}
		}
		{
			Integer lhsMinMaxExclusive;
			lhsMinMaxExclusive = this.getMinMaxExclusive();
			Integer rhsMinMaxExclusive;
			rhsMinMaxExclusive = that.getMinMaxExclusive();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "minMaxExclusive", lhsMinMaxExclusive),
					LocatorUtils.property(thatLocator, "minMaxExclusive", rhsMinMaxExclusive), lhsMinMaxExclusive,
					rhsMinMaxExclusive)) {
				return false;
			}
		}
		{
			NumberWithCode lhsNumberWithCode;
			lhsNumberWithCode = this.getNumberWithCode();
			NumberWithCode rhsNumberWithCode;
			rhsNumberWithCode = that.getNumberWithCode();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "numberWithCode", lhsNumberWithCode),
					LocatorUtils.property(thatLocator, "numberWithCode", rhsNumberWithCode), lhsNumberWithCode,
					rhsNumberWithCode)) {
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
