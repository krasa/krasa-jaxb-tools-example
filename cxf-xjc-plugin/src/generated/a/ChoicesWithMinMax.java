package a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChoicesWithMinMax complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ChoicesWithMinMax">
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
@XmlType(name = "ChoicesWithMinMax", propOrder = {
		"tea",
		"coffee"
})
public class ChoicesWithMinMax {

	@XmlElement(name = "Tea")
	protected String tea;
	@XmlElement(name = "Coffee")
	protected String coffee;

	/**
	 * Gets the value of the tea property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getTea() {
		return tea;
	}

	/**
	 * Sets the value of the tea property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setTea(String value) {
		this.tea = value;
	}

	/**
	 * Gets the value of the coffee property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getCoffee() {
		return coffee;
	}

	/**
	 * Sets the value of the coffee property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setCoffee(String value) {
		this.coffee = value;
	}

}
