package a;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for Main complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Main">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numbers" type="{a}Numbers"/>
 *         &lt;element name="strings" type="{a}Strings"/>
 *         &lt;element name="unsignedByte" type="{a}unsignedByte"/>
 *         &lt;element name="choices" type="{a}Choices"/>
 *         &lt;element name="complexChoices" type="{a}ComplexChoices"/>
 *         &lt;element name="choicesWithMinMax" type="{a}ChoicesWithMinMax"/>
 *         &lt;element name="complexChoicesWithMinMax" type="{a}ComplexChoicesWithMinMax"/>
 *         &lt;element name="enumerations" type="{a}Enumerations"/>
 *         &lt;element name="enumeration" type="{a}Enumeration"/>
 *         &lt;element name="array" type="{a}ArrayOfBytes"/>
 *         &lt;element name="primitives" type="{a}Primitives"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Main", propOrder = { "numbers", "strings", "unsignedByte", "choices", "complexChoices",
		"choicesWithMinMax", "complexChoicesWithMinMax", "enumerations", "enumeration", "array", "primitives" })
public class Main implements Serializable, Equals, HashCode {

	private final static long serialVersionUID = 1L;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected Numbers numbers;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected Strings strings;
	@javax.validation.constraints.NotNull
	@DecimalMax("255")
	@DecimalMin("0")
	protected Short unsignedByte;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected Choices choices;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected ComplexChoices complexChoices;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected ChoicesWithMinMax choicesWithMinMax;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected ComplexChoicesWithMinMax complexChoicesWithMinMax;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected Enumerations enumerations;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected Enumeration enumeration;
	@XmlElement(required = true, type = String.class)
	@XmlJavaTypeAdapter(HexBinaryAdapter.class)
	@javax.validation.constraints.NotNull
	@Size(max = 18)
	protected byte[] array;
	@XmlElement(required = true)
	@javax.validation.constraints.NotNull
	@Valid
	protected Primitives primitives;

	/**
	 * Gets the value of the numbers property.
	 * 
	 * @return possible object is {@link Numbers }
	 * 
	 */
	public Numbers getNumbers() {
		return numbers;
	}

	/**
	 * Sets the value of the numbers property.
	 * 
	 * @param value
	 *            allowed object is {@link Numbers }
	 * 
	 */
	public void setNumbers(Numbers value) {
		this.numbers = value;
	}

	/**
	 * Gets the value of the strings property.
	 * 
	 * @return possible object is {@link Strings }
	 * 
	 */
	public Strings getStrings() {
		return strings;
	}

	/**
	 * Sets the value of the strings property.
	 * 
	 * @param value
	 *            allowed object is {@link Strings }
	 * 
	 */
	public void setStrings(Strings value) {
		this.strings = value;
	}

	/**
	 * Gets the value of the unsignedByte property.
	 * 
	 */
	public Short getUnsignedByte() {
		return unsignedByte;
	}

	/**
	 * Sets the value of the unsignedByte property.
	 * 
	 */
	public void setUnsignedByte(Short value) {
		this.unsignedByte = value;
	}

	/**
	 * Gets the value of the choices property.
	 * 
	 * @return possible object is {@link Choices }
	 * 
	 */
	public Choices getChoices() {
		return choices;
	}

	/**
	 * Sets the value of the choices property.
	 * 
	 * @param value
	 *            allowed object is {@link Choices }
	 * 
	 */
	public void setChoices(Choices value) {
		this.choices = value;
	}

	/**
	 * Gets the value of the complexChoices property.
	 * 
	 * @return possible object is {@link ComplexChoices }
	 * 
	 */
	public ComplexChoices getComplexChoices() {
		return complexChoices;
	}

	/**
	 * Sets the value of the complexChoices property.
	 * 
	 * @param value
	 *            allowed object is {@link ComplexChoices }
	 * 
	 */
	public void setComplexChoices(ComplexChoices value) {
		this.complexChoices = value;
	}

	/**
	 * Gets the value of the choicesWithMinMax property.
	 * 
	 * @return possible object is {@link ChoicesWithMinMax }
	 * 
	 */
	public ChoicesWithMinMax getChoicesWithMinMax() {
		return choicesWithMinMax;
	}

	/**
	 * Sets the value of the choicesWithMinMax property.
	 * 
	 * @param value
	 *            allowed object is {@link ChoicesWithMinMax }
	 * 
	 */
	public void setChoicesWithMinMax(ChoicesWithMinMax value) {
		this.choicesWithMinMax = value;
	}

	/**
	 * Gets the value of the complexChoicesWithMinMax property.
	 * 
	 * @return possible object is {@link ComplexChoicesWithMinMax }
	 * 
	 */
	public ComplexChoicesWithMinMax getComplexChoicesWithMinMax() {
		return complexChoicesWithMinMax;
	}

	/**
	 * Sets the value of the complexChoicesWithMinMax property.
	 * 
	 * @param value
	 *            allowed object is {@link ComplexChoicesWithMinMax }
	 * 
	 */
	public void setComplexChoicesWithMinMax(ComplexChoicesWithMinMax value) {
		this.complexChoicesWithMinMax = value;
	}

	/**
	 * Gets the value of the enumerations property.
	 * 
	 * @return possible object is {@link Enumerations }
	 * 
	 */
	public Enumerations getEnumerations() {
		return enumerations;
	}

	/**
	 * Sets the value of the enumerations property.
	 * 
	 * @param value
	 *            allowed object is {@link Enumerations }
	 * 
	 */
	public void setEnumerations(Enumerations value) {
		this.enumerations = value;
	}

	/**
	 * Gets the value of the enumeration property.
	 * 
	 * @return possible object is {@link Enumeration }
	 * 
	 */
	public Enumeration getEnumeration() {
		return enumeration;
	}

	/**
	 * Sets the value of the enumeration property.
	 * 
	 * @param value
	 *            allowed object is {@link Enumeration }
	 * 
	 */
	public void setEnumeration(Enumeration value) {
		this.enumeration = value;
	}

	/**
	 * Gets the value of the array property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public byte[] getArray() {
		return array;
	}

	/**
	 * Sets the value of the array property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArray(byte[] value) {
		this.array = ((byte[]) value);
	}

	/**
	 * Gets the value of the primitives property.
	 * 
	 * @return possible object is {@link Primitives }
	 * 
	 */
	public Primitives getPrimitives() {
		return primitives;
	}

	/**
	 * Sets the value of the primitives property.
	 * 
	 * @param value
	 *            allowed object is {@link Primitives }
	 * 
	 */
	public void setPrimitives(Primitives value) {
		this.primitives = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			Numbers theNumbers;
			theNumbers = this.getNumbers();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numbers", theNumbers), currentHashCode,
					theNumbers);
		}
		{
			Strings theStrings;
			theStrings = this.getStrings();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strings", theStrings), currentHashCode,
					theStrings);
		}
		{
			Short theUnsignedByte;
			theUnsignedByte = this.getUnsignedByte();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsignedByte", theUnsignedByte),
					currentHashCode, theUnsignedByte);
		}
		{
			Choices theChoices;
			theChoices = this.getChoices();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "choices", theChoices), currentHashCode,
					theChoices);
		}
		{
			ComplexChoices theComplexChoices;
			theComplexChoices = this.getComplexChoices();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complexChoices", theComplexChoices),
					currentHashCode, theComplexChoices);
		}
		{
			ChoicesWithMinMax theChoicesWithMinMax;
			theChoicesWithMinMax = this.getChoicesWithMinMax();
			currentHashCode = strategy.hashCode(
					LocatorUtils.property(locator, "choicesWithMinMax", theChoicesWithMinMax), currentHashCode,
					theChoicesWithMinMax);
		}
		{
			ComplexChoicesWithMinMax theComplexChoicesWithMinMax;
			theComplexChoicesWithMinMax = this.getComplexChoicesWithMinMax();
			currentHashCode = strategy.hashCode(
					LocatorUtils.property(locator, "complexChoicesWithMinMax", theComplexChoicesWithMinMax),
					currentHashCode, theComplexChoicesWithMinMax);
		}
		{
			Enumerations theEnumerations;
			theEnumerations = this.getEnumerations();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enumerations", theEnumerations),
					currentHashCode, theEnumerations);
		}
		{
			Enumeration theEnumeration;
			theEnumeration = this.getEnumeration();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enumeration", theEnumeration),
					currentHashCode, theEnumeration);
		}
		{
			byte[] theArray;
			theArray = this.getArray();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "array", theArray), currentHashCode,
					theArray);
		}
		{
			Primitives thePrimitives;
			thePrimitives = this.getPrimitives();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primitives", thePrimitives),
					currentHashCode, thePrimitives);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof Main)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Main that = ((Main) object);
		{
			Numbers lhsNumbers;
			lhsNumbers = this.getNumbers();
			Numbers rhsNumbers;
			rhsNumbers = that.getNumbers();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "numbers", lhsNumbers),
					LocatorUtils.property(thatLocator, "numbers", rhsNumbers), lhsNumbers, rhsNumbers)) {
				return false;
			}
		}
		{
			Strings lhsStrings;
			lhsStrings = this.getStrings();
			Strings rhsStrings;
			rhsStrings = that.getStrings();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "strings", lhsStrings),
					LocatorUtils.property(thatLocator, "strings", rhsStrings), lhsStrings, rhsStrings)) {
				return false;
			}
		}
		{
			Short lhsUnsignedByte;
			lhsUnsignedByte = this.getUnsignedByte();
			Short rhsUnsignedByte;
			rhsUnsignedByte = that.getUnsignedByte();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "unsignedByte", lhsUnsignedByte),
					LocatorUtils.property(thatLocator, "unsignedByte", rhsUnsignedByte), lhsUnsignedByte,
					rhsUnsignedByte)) {
				return false;
			}
		}
		{
			Choices lhsChoices;
			lhsChoices = this.getChoices();
			Choices rhsChoices;
			rhsChoices = that.getChoices();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "choices", lhsChoices),
					LocatorUtils.property(thatLocator, "choices", rhsChoices), lhsChoices, rhsChoices)) {
				return false;
			}
		}
		{
			ComplexChoices lhsComplexChoices;
			lhsComplexChoices = this.getComplexChoices();
			ComplexChoices rhsComplexChoices;
			rhsComplexChoices = that.getComplexChoices();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "complexChoices", lhsComplexChoices),
					LocatorUtils.property(thatLocator, "complexChoices", rhsComplexChoices), lhsComplexChoices,
					rhsComplexChoices)) {
				return false;
			}
		}
		{
			ChoicesWithMinMax lhsChoicesWithMinMax;
			lhsChoicesWithMinMax = this.getChoicesWithMinMax();
			ChoicesWithMinMax rhsChoicesWithMinMax;
			rhsChoicesWithMinMax = that.getChoicesWithMinMax();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "choicesWithMinMax", lhsChoicesWithMinMax),
					LocatorUtils.property(thatLocator, "choicesWithMinMax", rhsChoicesWithMinMax), lhsChoicesWithMinMax,
					rhsChoicesWithMinMax)) {
				return false;
			}
		}
		{
			ComplexChoicesWithMinMax lhsComplexChoicesWithMinMax;
			lhsComplexChoicesWithMinMax = this.getComplexChoicesWithMinMax();
			ComplexChoicesWithMinMax rhsComplexChoicesWithMinMax;
			rhsComplexChoicesWithMinMax = that.getComplexChoicesWithMinMax();
			if (!strategy.equals(
					LocatorUtils.property(thisLocator, "complexChoicesWithMinMax", lhsComplexChoicesWithMinMax),
					LocatorUtils.property(thatLocator, "complexChoicesWithMinMax", rhsComplexChoicesWithMinMax),
					lhsComplexChoicesWithMinMax, rhsComplexChoicesWithMinMax)) {
				return false;
			}
		}
		{
			Enumerations lhsEnumerations;
			lhsEnumerations = this.getEnumerations();
			Enumerations rhsEnumerations;
			rhsEnumerations = that.getEnumerations();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "enumerations", lhsEnumerations),
					LocatorUtils.property(thatLocator, "enumerations", rhsEnumerations), lhsEnumerations,
					rhsEnumerations)) {
				return false;
			}
		}
		{
			Enumeration lhsEnumeration;
			lhsEnumeration = this.getEnumeration();
			Enumeration rhsEnumeration;
			rhsEnumeration = that.getEnumeration();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "enumeration", lhsEnumeration),
					LocatorUtils.property(thatLocator, "enumeration", rhsEnumeration), lhsEnumeration,
					rhsEnumeration)) {
				return false;
			}
		}
		{
			byte[] lhsArray;
			lhsArray = this.getArray();
			byte[] rhsArray;
			rhsArray = that.getArray();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "array", lhsArray),
					LocatorUtils.property(thatLocator, "array", rhsArray), lhsArray, rhsArray)) {
				return false;
			}
		}
		{
			Primitives lhsPrimitives;
			lhsPrimitives = this.getPrimitives();
			Primitives rhsPrimitives;
			rhsPrimitives = that.getPrimitives();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "primitives", lhsPrimitives),
					LocatorUtils.property(thatLocator, "primitives", rhsPrimitives), lhsPrimitives, rhsPrimitives)) {
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
