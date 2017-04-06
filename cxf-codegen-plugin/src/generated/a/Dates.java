
package a;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for Dates complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date1" type="{a}date1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dates", propOrder = { "date1" })
public class Dates implements Equals, HashCode {

	@XmlElement(required = true)
	@NotNull
	protected XMLGregorianCalendar date1;

	/**
	 * Gets the value of the date1 property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getDate1() {
		return date1;
	}

	/**
	 * Sets the value of the date1 property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setDate1(XMLGregorianCalendar value) {
		this.date1 = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			XMLGregorianCalendar theDate1;
			theDate1 = this.getDate1();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date1", theDate1), currentHashCode,
					theDate1);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof Dates)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Dates that = ((Dates) object);
		{
			XMLGregorianCalendar lhsDate1;
			lhsDate1 = this.getDate1();
			XMLGregorianCalendar rhsDate1;
			rhsDate1 = that.getDate1();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "date1", lhsDate1),
					LocatorUtils.property(thatLocator, "date1", rhsDate1), lhsDate1, rhsDate1)) {
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
