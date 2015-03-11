package laboratory.spring.krasa;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EchoResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="EchoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalMessage" type="{http://krasa.spring.laboratory/}genericString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EchoResponse", propOrder = {
		"originalMessage"
})
public class EchoResponse
		implements Equals, HashCode {

	@XmlElement(name = "OriginalMessage", required = true)
	@NotNull
	@Size(min = 0, max = 1024)
	protected String originalMessage;

	/**
	 * Gets the value of the originalMessage property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getOriginalMessage() {
		return originalMessage;
	}

	/**
	 * Sets the value of the originalMessage property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setOriginalMessage(String value) {
		this.originalMessage = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			String theOriginalMessage;
			theOriginalMessage = this.getOriginalMessage();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalMessage", theOriginalMessage), currentHashCode, theOriginalMessage);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof EchoResponse)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final EchoResponse that = ((EchoResponse) object);
		{
			String lhsOriginalMessage;
			lhsOriginalMessage = this.getOriginalMessage();
			String rhsOriginalMessage;
			rhsOriginalMessage = that.getOriginalMessage();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "originalMessage", lhsOriginalMessage), LocatorUtils.property(thatLocator, "originalMessage", rhsOriginalMessage), lhsOriginalMessage, rhsOriginalMessage)) {
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
