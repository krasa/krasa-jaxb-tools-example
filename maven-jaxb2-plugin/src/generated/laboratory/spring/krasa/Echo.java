
package laboratory.spring.krasa;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import a.Main;

/**
 * <p>
 * Java class for Echo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Echo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://krasa.spring.laboratory/}genericString"/>
 *         &lt;element name="main" type="{a}Main"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Echo", propOrder = { "message", "main" })
public class Echo implements Equals, HashCode {

	@XmlElement(name = "Message", required = true)
	@NotNull
	@Size(min = 0, max = 1024)
	protected String message;
	@XmlElement(required = true)
	@NotNull
	@Valid
	protected Main main;

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value) {
		this.message = value;
	}

	/**
	 * Gets the value of the main property.
	 * 
	 * @return possible object is {@link Main }
	 * 
	 */
	public Main getMain() {
		return main;
	}

	/**
	 * Sets the value of the main property.
	 * 
	 * @param value
	 *            allowed object is {@link Main }
	 * 
	 */
	public void setMain(Main value) {
		this.main = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theMessage;
			theMessage = this.getMessage();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
		}
		{
			Main theMain;
			theMain = this.getMain();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "main", theMain), currentHashCode, theMain);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof Echo)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final Echo that = ((Echo) object);
		{
			String lhsMessage;
			lhsMessage = this.getMessage();
			String rhsMessage;
			rhsMessage = that.getMessage();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage),
					lhsMessage, rhsMessage)) {
				return false;
			}
		}
		{
			Main lhsMain;
			lhsMain = this.getMain();
			Main rhsMain;
			rhsMain = that.getMain();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "main", lhsMain), LocatorUtils.property(thatLocator, "main", rhsMain), lhsMain, rhsMain)) {
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
