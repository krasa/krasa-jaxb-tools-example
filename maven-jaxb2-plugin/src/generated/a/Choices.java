package a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for Choices complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Choices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Tea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Coffee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Choices", propOrder = { "tea", "coffee" })
public class Choices implements Equals, HashCode {

	@XmlElement(name = "Tea")
	protected String tea;
	@XmlElement(name = "Coffee")
	protected String coffee;

	/**
	 * Gets the value of the tea property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTea() {
		return tea;
	}

	/**
	 * Sets the value of the tea property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTea(String value) {
		this.tea = value;
	}

	/**
	 * Gets the value of the coffee property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCoffee() {
		return coffee;
	}

	/**
	 * Sets the value of the coffee property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCoffee(String value) {
		this.coffee = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theTea;
			theTea = this.getTea();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tea", theTea), currentHashCode, theTea);
		}
		{
			String theCoffee;
			theCoffee = this.getCoffee();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coffee", theCoffee), currentHashCode, theCoffee);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof Choices)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Choices that = ((Choices) object);
		{
			String lhsTea;
			lhsTea = this.getTea();
			String rhsTea;
			rhsTea = that.getTea();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "tea", lhsTea), LocatorUtils.property(thatLocator, "tea", rhsTea), lhsTea, rhsTea)) {
				return false;
			}
		}
		{
			String lhsCoffee;
			lhsCoffee = this.getCoffee();
			String rhsCoffee;
			rhsCoffee = that.getCoffee();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "coffee", lhsCoffee), LocatorUtils.property(thatLocator, "coffee", rhsCoffee), lhsCoffee,
					rhsCoffee)) {
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
