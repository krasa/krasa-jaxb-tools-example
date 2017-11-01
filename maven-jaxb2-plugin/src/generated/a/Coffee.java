
package a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for Coffee complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coffee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="bar" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "Coffee", propOrder = { "bar" })
public class Coffee implements Equals, HashCode {

	protected String bar;

	/**
	 * Gets the value of the bar property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBar() {
		return bar;
	}

	/**
	 * Sets the value of the bar property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBar(String value) {
		this.bar = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theBar;
			theBar = this.getBar();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bar", theBar), currentHashCode, theBar);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof Coffee)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Coffee that = ((Coffee) object);
		{
			String lhsBar;
			lhsBar = this.getBar();
			String rhsBar;
			rhsBar = that.getBar();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "bar", lhsBar), LocatorUtils.property(thatLocator, "bar", rhsBar), lhsBar, rhsBar)) {
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
