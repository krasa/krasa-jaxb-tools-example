package a;

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
 * Java class for ComplexChoices complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexChoices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Tea" type="{a}Tea"/>
 *           &lt;element name="Coffee" type="{a}Coffee"/>
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
@XmlType(name = "ComplexChoices", propOrder = { "tea", "coffee" })
public class ComplexChoices implements Equals, HashCode {

	@XmlElement(name = "Tea")
	@Valid
	protected Tea tea;
	@XmlElement(name = "Coffee")
	@Valid
	protected Coffee coffee;

	/**
	 * Gets the value of the tea property.
	 * 
	 * @return possible object is {@link Tea }
	 * 
	 */
	public Tea getTea() {
		return tea;
	}

	/**
	 * Sets the value of the tea property.
	 * 
	 * @param value
	 *            allowed object is {@link Tea }
	 * 
	 */
	public void setTea(Tea value) {
		this.tea = value;
	}

	/**
	 * Gets the value of the coffee property.
	 * 
	 * @return possible object is {@link Coffee }
	 * 
	 */
	public Coffee getCoffee() {
		return coffee;
	}

	/**
	 * Sets the value of the coffee property.
	 * 
	 * @param value
	 *            allowed object is {@link Coffee }
	 * 
	 */
	public void setCoffee(Coffee value) {
		this.coffee = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			Tea theTea;
			theTea = this.getTea();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tea", theTea), currentHashCode, theTea);
		}
		{
			Coffee theCoffee;
			theCoffee = this.getCoffee();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coffee", theCoffee), currentHashCode,
					theCoffee);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof ComplexChoices)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final ComplexChoices that = ((ComplexChoices) object);
		{
			Tea lhsTea;
			lhsTea = this.getTea();
			Tea rhsTea;
			rhsTea = that.getTea();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "tea", lhsTea),
					LocatorUtils.property(thatLocator, "tea", rhsTea), lhsTea, rhsTea)) {
				return false;
			}
		}
		{
			Coffee lhsCoffee;
			lhsCoffee = this.getCoffee();
			Coffee rhsCoffee;
			rhsCoffee = that.getCoffee();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "coffee", lhsCoffee),
					LocatorUtils.property(thatLocator, "coffee", rhsCoffee), lhsCoffee, rhsCoffee)) {
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
