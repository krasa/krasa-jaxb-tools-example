package a;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;choice maxOccurs="2">
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
		"teaOrCoffee"
})
public class ChoicesWithMinMax {

	@XmlElementRefs({
			@XmlElementRef(name = "Tea", namespace = "a", type = JAXBElement.class),
			@XmlElementRef(name = "Coffee", namespace = "a", type = JAXBElement.class)
	})
	protected List<JAXBElement<String>> teaOrCoffee;

	/**
	 * Gets the value of the teaOrCoffee property.
	 * <p/>
	 * <p/>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the teaOrCoffee property.
	 * <p/>
	 * <p/>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getTeaOrCoffee().add(newItem);
	 * </pre>
	 * <p/>
	 * <p/>
	 * <p/>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link String }{@code >}
	 * {@link JAXBElement }{@code <}{@link String }{@code >}
	 */
	public List<JAXBElement<String>> getTeaOrCoffee() {
		if (teaOrCoffee == null) {
			teaOrCoffee = new ArrayList<JAXBElement<String>>();
		}
		return this.teaOrCoffee;
	}

}
