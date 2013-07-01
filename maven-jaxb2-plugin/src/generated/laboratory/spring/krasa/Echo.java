
package laboratory.spring.krasa;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import a.Main;


/**
 * <p>Java class for Echo complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Echo", propOrder = {
		"message",
		"main"
})
public class Echo {

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
	 * @return possible object is
	 *         {@link String }
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setMessage(String value) {
		this.message = value;
	}

	/**
	 * Gets the value of the main property.
	 *
	 * @return possible object is
	 *         {@link Main }
	 */
	public Main getMain() {
		return main;
	}

	/**
	 * Sets the value of the main property.
	 *
	 * @param value allowed object is
	 *              {@link Main }
	 */
	public void setMain(Main value) {
		this.main = value;
	}

}
