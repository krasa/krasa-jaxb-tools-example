package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impbElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="impbElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Construct" type="{}impbConstructValue"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impbElement", propOrder = {
		"construct",
		"value"
})
public class ImpbElement {

	@XmlElement(name = "Construct", required = true)
	@NotNull
	@javax.validation.constraints.Pattern.List({

	})
	protected ImpbConstructValue construct;
	@XmlElement(name = "Value", required = true)
	@NotNull
	protected String value;

	/**
	 * Gets the value of the construct property.
	 *
	 * @return possible object is
	 * {@link ImpbConstructValue }
	 */
	public ImpbConstructValue getConstruct() {
		return construct;
	}

	/**
	 * Sets the value of the construct property.
	 *
	 * @param value allowed object is
	 *              {@link ImpbConstructValue }
	 */
	public void setConstruct(ImpbConstructValue value) {
		this.construct = value;
	}

	/**
	 * Gets the value of the value property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
