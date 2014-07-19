package a;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Choices complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Choices", propOrder = {
		"teaOrCoffee"
})
public class Choices {

	@XmlElementRefs({
			@XmlElementRef(name = "Tea", namespace = "a", type = JAXBElement.class),
			@XmlElementRef(name = "Coffee", namespace = "a", type = JAXBElement.class)
	})
	protected JAXBElement<String> teaOrCoffee;

	/**
	 * Gets the value of the teaOrCoffee property.
	 *
	 * @return possible object is
	 * {@link JAXBElement }{@code <}{@link String }{@code >}
	 * {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	public JAXBElement<String> getTeaOrCoffee() {
		return teaOrCoffee;
	}

	/**
	 * Sets the value of the teaOrCoffee property.
	 *
	 * @param value allowed object is
	 *              {@link JAXBElement }{@code <}{@link String }{@code >}
	 *              {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	public void setTeaOrCoffee(JAXBElement<String> value) {
		this.teaOrCoffee = ((JAXBElement<String>) value);
	}

}
