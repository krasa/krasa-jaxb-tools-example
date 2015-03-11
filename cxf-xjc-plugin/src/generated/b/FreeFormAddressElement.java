package b;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeFormAddressElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="freeFormAddressElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeFormAddressElement", propOrder = {
		"line1",
		"line2",
		"line3",
		"line4",
		"line5",
		"line6"
})
public class FreeFormAddressElement
		implements Equals, HashCode {

	@XmlElement(name = "Line1", required = true)
	@NotNull
	protected String line1;
	@XmlElement(name = "Line2")
	protected String line2;
	@XmlElement(name = "Line3")
	protected String line3;
	@XmlElement(name = "Line4")
	protected String line4;
	@XmlElement(name = "Line5")
	protected String line5;
	@XmlElement(name = "Line6")
	protected String line6;

	/**
	 * Gets the value of the line1 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * Sets the value of the line1 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLine1(String value) {
		this.line1 = value;
	}

	/**
	 * Gets the value of the line2 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLine2() {
		return line2;
	}

	/**
	 * Sets the value of the line2 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLine2(String value) {
		this.line2 = value;
	}

	/**
	 * Gets the value of the line3 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLine3() {
		return line3;
	}

	/**
	 * Sets the value of the line3 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLine3(String value) {
		this.line3 = value;
	}

	/**
	 * Gets the value of the line4 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLine4() {
		return line4;
	}

	/**
	 * Sets the value of the line4 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLine4(String value) {
		this.line4 = value;
	}

	/**
	 * Gets the value of the line5 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLine5() {
		return line5;
	}

	/**
	 * Sets the value of the line5 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLine5(String value) {
		this.line5 = value;
	}

	/**
	 * Gets the value of the line6 property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLine6() {
		return line6;
	}

	/**
	 * Sets the value of the line6 property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLine6(String value) {
		this.line6 = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theLine1;
			theLine1 = this.getLine1();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line1", theLine1), currentHashCode, theLine1);
		}
		{
			String theLine2;
			theLine2 = this.getLine2();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line2", theLine2), currentHashCode, theLine2);
		}
		{
			String theLine3;
			theLine3 = this.getLine3();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line3", theLine3), currentHashCode, theLine3);
		}
		{
			String theLine4;
			theLine4 = this.getLine4();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line4", theLine4), currentHashCode, theLine4);
		}
		{
			String theLine5;
			theLine5 = this.getLine5();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line5", theLine5), currentHashCode, theLine5);
		}
		{
			String theLine6;
			theLine6 = this.getLine6();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line6", theLine6), currentHashCode, theLine6);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof FreeFormAddressElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final FreeFormAddressElement that = ((FreeFormAddressElement) object);
		{
			String lhsLine1;
			lhsLine1 = this.getLine1();
			String rhsLine1;
			rhsLine1 = that.getLine1();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "line1", lhsLine1), LocatorUtils.property(thatLocator, "line1", rhsLine1), lhsLine1, rhsLine1)) {
				return false;
			}
		}
		{
			String lhsLine2;
			lhsLine2 = this.getLine2();
			String rhsLine2;
			rhsLine2 = that.getLine2();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "line2", lhsLine2), LocatorUtils.property(thatLocator, "line2", rhsLine2), lhsLine2, rhsLine2)) {
				return false;
			}
		}
		{
			String lhsLine3;
			lhsLine3 = this.getLine3();
			String rhsLine3;
			rhsLine3 = that.getLine3();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "line3", lhsLine3), LocatorUtils.property(thatLocator, "line3", rhsLine3), lhsLine3, rhsLine3)) {
				return false;
			}
		}
		{
			String lhsLine4;
			lhsLine4 = this.getLine4();
			String rhsLine4;
			rhsLine4 = that.getLine4();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "line4", lhsLine4), LocatorUtils.property(thatLocator, "line4", rhsLine4), lhsLine4, rhsLine4)) {
				return false;
			}
		}
		{
			String lhsLine5;
			lhsLine5 = this.getLine5();
			String rhsLine5;
			rhsLine5 = that.getLine5();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "line5", lhsLine5), LocatorUtils.property(thatLocator, "line5", rhsLine5), lhsLine5, rhsLine5)) {
				return false;
			}
		}
		{
			String lhsLine6;
			lhsLine6 = this.getLine6();
			String rhsLine6;
			rhsLine6 = that.getLine6();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "line6", lhsLine6), LocatorUtils.property(thatLocator, "line6", rhsLine6), lhsLine6, rhsLine6)) {
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
