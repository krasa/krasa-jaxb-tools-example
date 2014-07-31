package a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tea complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Tea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="foo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tea", propOrder = {
		"foo"
})
public class Tea {

	protected String foo;

	/**
	 * Gets the value of the foo property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getFoo() {
		return foo;
	}

	/**
	 * Sets the value of the foo property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setFoo(String value) {
		this.foo = value;
	}

}
