package a;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Primitives complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Primitives">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="double" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="float" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="byte" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="short" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Primitives", propOrder = {
		"_int",
		"_long",
		"_boolean",
		"_double",
		"_float",
		"_byte",
		"_short"
})
public class Primitives
		implements Equals, HashCode {

	@XmlElement(name = "int")
	@javax.validation.constraints.NotNull
	protected Integer _int;
	@XmlElement(name = "long")
	@javax.validation.constraints.NotNull
	protected Long _long;
	@XmlElement(name = "boolean")
	@javax.validation.constraints.NotNull
	protected Boolean _boolean;
	@XmlElement(name = "double")
	@javax.validation.constraints.NotNull
	protected Double _double;
	@XmlElement(name = "float")
	@javax.validation.constraints.NotNull
	protected Float _float;
	@XmlElement(name = "byte")
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMax("127")
	@javax.validation.constraints.DecimalMin("-128")
	protected Byte _byte;
	@XmlElement(name = "short")
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.DecimalMax("32767")
	@javax.validation.constraints.DecimalMin("-32768")
	protected Short _short;

	/**
	 * Gets the value of the int property.
	 */
	public int getInt() {
		return _int;
	}

	/**
	 * Sets the value of the int property.
	 */
	public void setInt(int value) {
		this._int = value;
	}

	/**
	 * Gets the value of the long property.
	 */
	public long getLong() {
		return _long;
	}

	/**
	 * Sets the value of the long property.
	 */
	public void setLong(long value) {
		this._long = value;
	}

	/**
	 * Gets the value of the boolean property.
	 */
	public boolean isBoolean() {
		return _boolean;
	}

	/**
	 * Sets the value of the boolean property.
	 */
	public void setBoolean(boolean value) {
		this._boolean = value;
	}

	/**
	 * Gets the value of the double property.
	 */
	public double getDouble() {
		return _double;
	}

	/**
	 * Sets the value of the double property.
	 */
	public void setDouble(double value) {
		this._double = value;
	}

	/**
	 * Gets the value of the float property.
	 */
	public float getFloat() {
		return _float;
	}

	/**
	 * Sets the value of the float property.
	 */
	public void setFloat(float value) {
		this._float = value;
	}

	/**
	 * Gets the value of the byte property.
	 */
	public byte getByte() {
		return _byte;
	}

	/**
	 * Sets the value of the byte property.
	 */
	public void setByte(byte value) {
		this._byte = value;
	}

	/**
	 * Gets the value of the short property.
	 */
	public short getShort() {
		return _short;
	}

	/**
	 * Sets the value of the short property.
	 */
	public void setShort(short value) {
		this._short = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			int theInt;
			theInt = this.getInt();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_int", theInt), currentHashCode, theInt);
		}
		{
			long theLong;
			theLong = this.getLong();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_long", theLong), currentHashCode, theLong);
		}
		{
			boolean theBoolean;
			theBoolean = this.isBoolean();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_boolean", theBoolean), currentHashCode, theBoolean);
		}
		{
			double theDouble;
			theDouble = this.getDouble();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_double", theDouble), currentHashCode, theDouble);
		}
		{
			float theFloat;
			theFloat = this.getFloat();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_float", theFloat), currentHashCode, theFloat);
		}
		{
			byte theByte;
			theByte = this.getByte();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_byte", theByte), currentHashCode, theByte);
		}
		{
			short theShort;
			theShort = this.getShort();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_short", theShort), currentHashCode, theShort);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof Primitives)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Primitives that = ((Primitives) object);
		{
			int lhsInt;
			lhsInt = this.getInt();
			int rhsInt;
			rhsInt = that.getInt();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_int", lhsInt), LocatorUtils.property(thatLocator, "_int", rhsInt), lhsInt, rhsInt)) {
				return false;
			}
		}
		{
			long lhsLong;
			lhsLong = this.getLong();
			long rhsLong;
			rhsLong = that.getLong();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_long", lhsLong), LocatorUtils.property(thatLocator, "_long", rhsLong), lhsLong, rhsLong)) {
				return false;
			}
		}
		{
			boolean lhsBoolean;
			lhsBoolean = this.isBoolean();
			boolean rhsBoolean;
			rhsBoolean = that.isBoolean();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_boolean", lhsBoolean), LocatorUtils.property(thatLocator, "_boolean", rhsBoolean), lhsBoolean, rhsBoolean)) {
				return false;
			}
		}
		{
			double lhsDouble;
			lhsDouble = this.getDouble();
			double rhsDouble;
			rhsDouble = that.getDouble();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_double", lhsDouble), LocatorUtils.property(thatLocator, "_double", rhsDouble), lhsDouble, rhsDouble)) {
				return false;
			}
		}
		{
			float lhsFloat;
			lhsFloat = this.getFloat();
			float rhsFloat;
			rhsFloat = that.getFloat();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_float", lhsFloat), LocatorUtils.property(thatLocator, "_float", rhsFloat), lhsFloat, rhsFloat)) {
				return false;
			}
		}
		{
			byte lhsByte;
			lhsByte = this.getByte();
			byte rhsByte;
			rhsByte = that.getByte();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_byte", lhsByte), LocatorUtils.property(thatLocator, "_byte", rhsByte), lhsByte, rhsByte)) {
				return false;
			}
		}
		{
			short lhsShort;
			lhsShort = this.getShort();
			short rhsShort;
			rhsShort = that.getShort();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "_short", lhsShort), LocatorUtils.property(thatLocator, "_short", rhsShort), lhsShort, rhsShort)) {
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
