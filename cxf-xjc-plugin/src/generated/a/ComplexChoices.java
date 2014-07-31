package a;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexChoices complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexChoices", propOrder = {
		"tea",
		"coffee"
})
public class ComplexChoices {

	@XmlElement(name = "Tea")
	@Valid
	protected Tea tea;
	@XmlElement(name = "Coffee")
	@Valid
	protected Coffee coffee;

	/**
	 * Gets the value of the tea property.
	 *
	 * @return possible object is
	 * {@link Tea }
	 */
	public Tea getTea() {
		return tea;
	}

	/**
	 * Sets the value of the tea property.
	 *
	 * @param value allowed object is
	 *              {@link Tea }
	 */
	public void setTea(Tea value) {
		this.tea = value;
	}

	/**
	 * Gets the value of the coffee property.
	 *
	 * @return possible object is
	 * {@link Coffee }
	 */
	public Coffee getCoffee() {
		return coffee;
	}

	/**
	 * Sets the value of the coffee property.
	 *
	 * @param value allowed object is
	 *              {@link Coffee }
	 */
	public void setCoffee(Coffee value) {
		this.coffee = value;
	}

}
