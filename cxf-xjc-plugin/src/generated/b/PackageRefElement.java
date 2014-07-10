package b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageRefElement complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="packageRefElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrintFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LabelText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageRefElement", propOrder = {
		"printFlag",
		"labelText"
})
public class PackageRefElement {

	@XmlElement(name = "PrintFlag")
	protected Boolean printFlag;
	@XmlElement(name = "LabelText")
	protected String labelText;

	/**
	 * Gets the value of the printFlag property.
	 *
	 * @return possible object is
	 * {@link Boolean }
	 */
	public Boolean isPrintFlag() {
		return printFlag;
	}

	/**
	 * Sets the value of the printFlag property.
	 *
	 * @param value allowed object is
	 *              {@link Boolean }
	 */
	public void setPrintFlag(Boolean value) {
		this.printFlag = value;
	}

	/**
	 * Gets the value of the labelText property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getLabelText() {
		return labelText;
	}

	/**
	 * Sets the value of the labelText property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setLabelText(String value) {
		this.labelText = value;
	}

}
