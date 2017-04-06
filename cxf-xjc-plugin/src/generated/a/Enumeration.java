package a;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for Enumeration complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;complexType name="Enumeration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="N05"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enumeration", propOrder = { "foo" })
public class Enumeration implements Equals, HashCode {

	@XmlElement(required = true)
	@NotNull
	@Pattern(regexp = "N05")
	protected String foo;

	/**
	 * Gets the value of the foo property.
	 *
	 * @return possible object is {@link String }
	 */
	public String getFoo() {
		return foo;
	}

	/**
	 * Sets the value of the foo property.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 */
	public void setFoo(String value) {
		this.foo = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theFoo;
			theFoo = this.getFoo();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "foo", theFoo), currentHashCode, theFoo);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof Enumeration)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Enumeration that = ((Enumeration) object);
		{
			String lhsFoo;
			lhsFoo = this.getFoo();
			String rhsFoo;
			rhsFoo = that.getFoo();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "foo", lhsFoo),
					LocatorUtils.property(thatLocator, "foo", rhsFoo), lhsFoo, rhsFoo)) {
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
