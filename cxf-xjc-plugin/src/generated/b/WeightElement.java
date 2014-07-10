package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;


/**
 * <p>Java class for weightElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="weightElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{}weightUnitValue"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weightElement", propOrder = {
		"unit",
		"value"
})
public class WeightElement {

	@XmlElement(name = "Unit", required = true)
	@NotNull
	@javax.validation.constraints.Pattern.List({

	})
	protected WeightUnitValue unit;
	@XmlElement(name = "Value", required = true)
	@NotNull
	protected BigDecimal value;

	/**
	 * Gets the value of the unit property.
	 *
	 * @return possible object is
	 * {@link WeightUnitValue }
	 */
	public WeightUnitValue getUnit() {
		return unit;
	}

	/**
	 * Sets the value of the unit property.
	 *
	 * @param value allowed object is
	 *              {@link WeightUnitValue }
	 */
	public void setUnit(WeightUnitValue value) {
		this.unit = value;
	}

	/**
	 * Gets the value of the value property.
	 *
	 * @return possible object is
	 * {@link BigDecimal }
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 *
	 * @param value allowed object is
	 *              {@link BigDecimal }
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
