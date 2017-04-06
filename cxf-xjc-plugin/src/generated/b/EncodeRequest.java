package b;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

/**
 * <p>
 * Java class for encodeRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="encodeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractRequest">
 *       &lt;sequence>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BatchRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HaltOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RejectAllOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MpuList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Mpu" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encodeRequest", propOrder = { "customerId", "batchRef", "haltOnError", "rejectAllOnError", "mpuList" })
public class EncodeRequest extends AbstractRequest implements Equals, HashCode {

	@XmlElement(name = "CustomerId")
	@javax.validation.constraints.NotNull
	protected Integer customerId;
	@XmlElement(name = "BatchRef", required = true)
	@javax.validation.constraints.NotNull
	protected String batchRef;
	@XmlElement(name = "HaltOnError")
	@javax.validation.constraints.NotNull
	protected java.lang.Boolean haltOnError;
	@XmlElement(name = "RejectAllOnError")
	@javax.validation.constraints.NotNull
	protected java.lang.Boolean rejectAllOnError;
	@XmlElement(name = "MpuList", required = true)
	@javax.validation.constraints.NotNull
	protected EncodeRequest.MpuList mpuList;

	/**
	 * Gets the value of the customerId property.
	 * 
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the value of the customerId property.
	 * 
	 */
	public void setCustomerId(Integer value) {
		this.customerId = value;
	}

	/**
	 * Gets the value of the batchRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBatchRef() {
		return batchRef;
	}

	/**
	 * Sets the value of the batchRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBatchRef(String value) {
		this.batchRef = value;
	}

	/**
	 * Gets the value of the haltOnError property.
	 * 
	 */
	public java.lang.Boolean isHaltOnError() {
		return haltOnError;
	}

	/**
	 * Sets the value of the haltOnError property.
	 * 
	 */
	public void setHaltOnError(java.lang.Boolean value) {
		this.haltOnError = value;
	}

	/**
	 * Gets the value of the rejectAllOnError property.
	 * 
	 */
	public java.lang.Boolean isRejectAllOnError() {
		return rejectAllOnError;
	}

	/**
	 * Sets the value of the rejectAllOnError property.
	 * 
	 */
	public void setRejectAllOnError(java.lang.Boolean value) {
		this.rejectAllOnError = value;
	}

	/**
	 * Gets the value of the mpuList property.
	 * 
	 * @return possible object is {@link EncodeRequest.MpuList }
	 * 
	 */
	public EncodeRequest.MpuList getMpuList() {
		return mpuList;
	}

	/**
	 * Sets the value of the mpuList property.
	 * 
	 * @param value
	 *            allowed object is {@link EncodeRequest.MpuList }
	 * 
	 */
	public void setMpuList(EncodeRequest.MpuList value) {
		this.mpuList = value;
	}

	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
		int currentHashCode = super.hashCode(locator, strategy);
		{
			Integer theCustomerId;
			theCustomerId = this.getCustomerId();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerId", theCustomerId),
					currentHashCode, theCustomerId);
		}
		{
			String theBatchRef;
			theBatchRef = this.getBatchRef();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchRef", theBatchRef),
					currentHashCode, theBatchRef);
		}
		{
			java.lang.Boolean theHaltOnError;
			theHaltOnError = this.isHaltOnError();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haltOnError", theHaltOnError),
					currentHashCode, theHaltOnError);
		}
		{
			java.lang.Boolean theRejectAllOnError;
			theRejectAllOnError = this.isRejectAllOnError();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectAllOnError", theRejectAllOnError),
					currentHashCode, theRejectAllOnError);
		}
		{
			EncodeRequest.MpuList theMpuList;
			theMpuList = this.getMpuList();
			currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mpuList", theMpuList), currentHashCode,
					theMpuList);
		}
		return currentHashCode;
	}

	public int hashCode() {
		final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
		return this.hashCode(null, strategy);
	}

	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
			EqualsStrategy strategy) {
		if (!(object instanceof EncodeRequest)) {
			return false;
		}
		if (this == object) {
			return true;
		}
		if (!super.equals(thisLocator, thatLocator, object, strategy)) {
			return false;
		}
		final EncodeRequest that = ((EncodeRequest) object);
		{
			Integer lhsCustomerId;
			lhsCustomerId = this.getCustomerId();
			Integer rhsCustomerId;
			rhsCustomerId = that.getCustomerId();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "customerId", lhsCustomerId),
					LocatorUtils.property(thatLocator, "customerId", rhsCustomerId), lhsCustomerId, rhsCustomerId)) {
				return false;
			}
		}
		{
			String lhsBatchRef;
			lhsBatchRef = this.getBatchRef();
			String rhsBatchRef;
			rhsBatchRef = that.getBatchRef();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "batchRef", lhsBatchRef),
					LocatorUtils.property(thatLocator, "batchRef", rhsBatchRef), lhsBatchRef, rhsBatchRef)) {
				return false;
			}
		}
		{
			java.lang.Boolean lhsHaltOnError;
			lhsHaltOnError = this.isHaltOnError();
			java.lang.Boolean rhsHaltOnError;
			rhsHaltOnError = that.isHaltOnError();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "haltOnError", lhsHaltOnError),
					LocatorUtils.property(thatLocator, "haltOnError", rhsHaltOnError), lhsHaltOnError,
					rhsHaltOnError)) {
				return false;
			}
		}
		{
			java.lang.Boolean lhsRejectAllOnError;
			lhsRejectAllOnError = this.isRejectAllOnError();
			java.lang.Boolean rhsRejectAllOnError;
			rhsRejectAllOnError = that.isRejectAllOnError();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectAllOnError", lhsRejectAllOnError),
					LocatorUtils.property(thatLocator, "rejectAllOnError", rhsRejectAllOnError), lhsRejectAllOnError,
					rhsRejectAllOnError)) {
				return false;
			}
		}
		{
			EncodeRequest.MpuList lhsMpuList;
			lhsMpuList = this.getMpuList();
			EncodeRequest.MpuList rhsMpuList;
			rhsMpuList = that.getMpuList();
			if (!strategy.equals(LocatorUtils.property(thisLocator, "mpuList", lhsMpuList),
					LocatorUtils.property(thatLocator, "mpuList", rhsMpuList), lhsMpuList, rhsMpuList)) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(Object object) {
		final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
		return equals(null, null, object, strategy);
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element ref="{}Mpu" maxOccurs="unbounded"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "mpu" })
	public static class MpuList implements Equals, HashCode {

		@XmlElement(name = "Mpu", required = true)
		@javax.validation.constraints.NotNull
		@Size(min = 1)
		protected List<MpuElement> mpu;

		/**
		 * Gets the value of the mpu property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
		 * make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE>
		 * method for the mpu property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getMpu().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link MpuElement }
		 * 
		 * 
		 */
		public List<MpuElement> getMpu() {
			if (mpu == null) {
				mpu = new ArrayList<MpuElement>();
			}
			return this.mpu;
		}

		public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
			int currentHashCode = 1;
			{
				List<MpuElement> theMpu;
				theMpu = (((this.mpu != null) && (!this.mpu.isEmpty())) ? this.getMpu() : null);
				currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mpu", theMpu), currentHashCode,
						theMpu);
			}
			return currentHashCode;
		}

		public int hashCode() {
			final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
			return this.hashCode(null, strategy);
		}

		public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object,
				EqualsStrategy strategy) {
			if (!(object instanceof EncodeRequest.MpuList)) {
				return false;
			}
			if (this == object) {
				return true;
			}
			final EncodeRequest.MpuList that = ((EncodeRequest.MpuList) object);
			{
				List<MpuElement> lhsMpu;
				lhsMpu = (((this.mpu != null) && (!this.mpu.isEmpty())) ? this.getMpu() : null);
				List<MpuElement> rhsMpu;
				rhsMpu = (((that.mpu != null) && (!that.mpu.isEmpty())) ? that.getMpu() : null);
				if (!strategy.equals(LocatorUtils.property(thisLocator, "mpu", lhsMpu),
						LocatorUtils.property(thatLocator, "mpu", rhsMpu), lhsMpu, rhsMpu)) {
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

}
