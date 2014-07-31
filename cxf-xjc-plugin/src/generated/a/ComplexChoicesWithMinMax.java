package a;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ComplexChoicesWithMinMax complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ComplexChoicesWithMinMax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="2">
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
@XmlType(name = "ComplexChoicesWithMinMax", propOrder = {
		"teaOrCoffee"
})
public class ComplexChoicesWithMinMax {

	@XmlElements({
			@XmlElement(name = "Coffee", type = Coffee.class),
			@XmlElement(name = "Tea", type = Tea.class)
	})
	@Size(min = 1, max = 2)
	protected List<Object> teaOrCoffee;

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
	 * {@link Coffee }
	 * {@link Tea }
	 */
	public List<Object> getTeaOrCoffee() {
		if (teaOrCoffee == null) {
			teaOrCoffee = new ArrayList<Object>();
		}
		return this.teaOrCoffee;
	}

}
