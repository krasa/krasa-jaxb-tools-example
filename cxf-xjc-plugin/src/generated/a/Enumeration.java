package a;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumeration complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Enumeration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="foo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="N05"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enumeration", propOrder = {
		"foo"
})
public class Enumeration {

	@XmlElement(required = true)
	@NotNull
	@Pattern(regexp = "N05")
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
