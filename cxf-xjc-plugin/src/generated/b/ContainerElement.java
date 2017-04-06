package b;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for containerElement complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containerElement", propOrder = { "type", "containerId" })
public class ContainerElement implements Equals, HashCode {

	@XmlElement(name = "Type", required = true)
	@NotNull
	protected ContainerTypeValue type;
	@XmlElement(name = "ContainerId", required = true)
	@NotNull
	protected String containerId;

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link ContainerTypeValue }
	 * 
	 */
	public ContainerTypeValue getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link ContainerTypeValue }
	 * 
	 */
	public void setType(ContainerTypeValue value) {
		this.type = value;
	}

	/**
	 * Gets the value of the containerId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContainerId() {
		return containerId;
	}

	/**
	 * Sets the value of the containerId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContainerId(String value) {
		this.containerId = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = 1;
		{
			ContainerTypeValue theType;
			theType = this.getType();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode,
					theType);
		}
		{
			String theContainerId;
			theContainerId = this.getContainerId();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerId", theContainerId),
					currentHashCode, theContainerId);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof ContainerElement)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		final ContainerElement that = ((ContainerElement) object);
		{
			ContainerTypeValue lhsType;
			lhsType = this.getType();
			ContainerTypeValue rhsType;
			rhsType = that.getType();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType),
					LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
				return false;
			}
		}
		{
			String lhsContainerId;
			lhsContainerId = this.getContainerId();
			String rhsContainerId;
			rhsContainerId = that.getContainerId();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "containerId", lhsContainerId),
					LocatorUtils.property(thatLocator, "containerId", rhsContainerId), lhsContainerId,
					rhsContainerId)) {
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
