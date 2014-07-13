package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for containerElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="containerElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{}containerTypeValue"/>
 *         &lt;element name="ContainerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containerElement", propOrder = {
		"type",
		"containerId"
})
public class ContainerElement {

	@XmlElement(name = "Type", required = true)
	@NotNull
	protected ContainerTypeValue type;
	@XmlElement(name = "ContainerId", required = true)
	@NotNull
	protected String containerId;

	/**
	 * Gets the value of the type property.
	 *
	 * @return possible object is
	 * {@link ContainerTypeValue }
	 */
	public ContainerTypeValue getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 *
	 * @param value allowed object is
	 *              {@link ContainerTypeValue }
	 */
	public void setType(ContainerTypeValue value) {
		this.type = value;
	}

	/**
	 * Gets the value of the containerId property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getContainerId() {
		return containerId;
	}

	/**
	 * Sets the value of the containerId property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setContainerId(String value) {
		this.containerId = value;
	}

}
