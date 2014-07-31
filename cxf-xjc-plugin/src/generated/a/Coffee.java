package a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coffee complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Coffee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="bar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coffee", propOrder = {
		"bar"
})
public class Coffee {

	protected String bar;

	/**
	 * Gets the value of the bar property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBar() {
		return bar;
	}

	/**
	 * Sets the value of the bar property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBar(String value) {
		this.bar = value;
	}

}
