package a;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for ChoicesWithMinMax complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;complexType name="ChoicesWithMinMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="2">
 *           &lt;element name="Tea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Coffee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoicesWithMinMax", propOrder = { "teaOrCoffee" })
public class ChoicesWithMinMax implements Equals, HashCode {

	@XmlElementRefs({ @XmlElementRef(name = "Tea", namespace = "a", type = JAXBElement.class),
			@XmlElementRef(name = "Coffee", namespace = "a", type = JAXBElement.class) })
	protected List<JAXBElement<String>> teaOrCoffee;

	/**
	 * Gets the value of the teaOrCoffee property.
	 * <p>
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the teaOrCoffee property.
	 * <p>
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTeaOrCoffee().add(newItem);
	 * </pre>
	 * <p>
	 * <p>
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link String }{@code >}
	 * {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	public List<JAXBElement<String>> getTeaOrCoffee() {
		if (teaOrCoffee == null) {
			teaOrCoffee = new ArrayList<JAXBElement<String>>();
		}
		return this.teaOrCoffee;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			List<JAXBElement<String>> theTeaOrCoffee;
			theTeaOrCoffee = (((this.teaOrCoffee != null) && (!this.teaOrCoffee.isEmpty())) ? this.getTeaOrCoffee()
					: null);
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "teaOrCoffee", theTeaOrCoffee),
					currentHashCode, theTeaOrCoffee);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof ChoicesWithMinMax)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final ChoicesWithMinMax that = ((ChoicesWithMinMax) object);
		{
			List<JAXBElement<String>> lhsTeaOrCoffee;
			lhsTeaOrCoffee = (((this.teaOrCoffee != null) && (!this.teaOrCoffee.isEmpty())) ? this.getTeaOrCoffee()
					: null);
			List<JAXBElement<String>> rhsTeaOrCoffee;
			rhsTeaOrCoffee = (((that.teaOrCoffee != null) && (!that.teaOrCoffee.isEmpty())) ? that.getTeaOrCoffee()
					: null);
			if (!strategy.equals(LocatorUtils.property(thisLocator, "teaOrCoffee", lhsTeaOrCoffee),
					LocatorUtils.property(thatLocator, "teaOrCoffee", rhsTeaOrCoffee), lhsTeaOrCoffee,
					rhsTeaOrCoffee)) {
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
