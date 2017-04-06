package a;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for ComplexChoicesWithMinMax complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexChoicesWithMinMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="2">
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
@XmlType(name = "ComplexChoicesWithMinMax", propOrder = { "teaOrCoffee" })
public class ComplexChoicesWithMinMax implements Equals, HashCode {

	@XmlElements({ @XmlElement(name = "Coffee", type = Coffee.class), @XmlElement(name = "Tea", type = Tea.class) })
	@Size(min = 1, max = 2)
	protected List<Object> teaOrCoffee;

	/**
	 * Gets the value of the teaOrCoffee property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the teaOrCoffee property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTeaOrCoffee().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Coffee } {@link Tea }
	 * 
	 * 
	 */
	public List<Object> getTeaOrCoffee() {
		if (teaOrCoffee == null) {
			teaOrCoffee = new ArrayList<Object>();
		}
		return this.teaOrCoffee;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			List<Object> theTeaOrCoffee;
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
		if (!(object instanceof ComplexChoicesWithMinMax)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final ComplexChoicesWithMinMax that = ((ComplexChoicesWithMinMax) object);
		{
			List<Object> lhsTeaOrCoffee;
			lhsTeaOrCoffee = (((this.teaOrCoffee != null) && (!this.teaOrCoffee.isEmpty())) ? this.getTeaOrCoffee()
					: null);
			List<Object> rhsTeaOrCoffee;
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
