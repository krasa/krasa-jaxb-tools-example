package b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for packageRefElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageRefElement", propOrder = { "printFlag", "labelText" })
public class PackageRefElement implements Equals, HashCode {

	@XmlElement(name = "PrintFlag")
	protected Boolean printFlag;
	@XmlElement(name = "LabelText")
	protected String labelText;

	/**
	 * Gets the value of the printFlag property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPrintFlag() {
		return printFlag;
	}

	/**
	 * Sets the value of the printFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPrintFlag(Boolean value) {
		this.printFlag = value;
	}

	/**
	 * Gets the value of the labelText property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLabelText() {
		return labelText;
	}

	/**
	 * Sets the value of the labelText property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLabelText(String value) {
		this.labelText = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			Boolean thePrintFlag;
			thePrintFlag = this.isPrintFlag();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "printFlag", thePrintFlag),
					currentHashCode, thePrintFlag);
		}
		{
			String theLabelText;
			theLabelText = this.getLabelText();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "labelText", theLabelText),
					currentHashCode, theLabelText);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
		if (!(object instanceof PackageRefElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final PackageRefElement that = ((PackageRefElement) object);
		{
			Boolean lhsPrintFlag;
			lhsPrintFlag = this.isPrintFlag();
			Boolean rhsPrintFlag;
			rhsPrintFlag = that.isPrintFlag();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "printFlag", lhsPrintFlag),
					LocatorUtils.property(thatLocator, "printFlag", rhsPrintFlag), lhsPrintFlag, rhsPrintFlag)) {
				return false;
			}
		}
		{
			String lhsLabelText;
			lhsLabelText = this.getLabelText();
			String rhsLabelText;
			rhsLabelText = that.getLabelText();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "labelText", lhsLabelText),
					LocatorUtils.property(thatLocator, "labelText", rhsLabelText), lhsLabelText, rhsLabelText)) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(Object object) {
		final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
		return equals(null, null, object, strategy);
	}

}
