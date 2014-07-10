package b;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for encodeRequest complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encodeRequest", propOrder = {
		"customerId",
		"batchRef",
		"haltOnError",
		"rejectAllOnError",
		"mpuList"
})
public class EncodeRequest
		extends AbstractRequest {

	@XmlElement(name = "CustomerId")
	@NotNull
	protected int customerId;
	@XmlElement(name = "BatchRef", required = true)
	@NotNull
	protected String batchRef;
	@XmlElement(name = "HaltOnError")
	@NotNull
	protected boolean haltOnError;
	@XmlElement(name = "RejectAllOnError")
	@NotNull
	protected boolean rejectAllOnError;
	@XmlElement(name = "MpuList", required = true)
	@NotNull
	protected EncodeRequest.MpuList mpuList;

	/**
	 * Gets the value of the customerId property.
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the value of the customerId property.
	 */
	public void setCustomerId(int value) {
		this.customerId = value;
	}

	/**
	 * Gets the value of the batchRef property.
	 *
	 * @return possible object is
	 * {@link String }
	 */
	public String getBatchRef() {
		return batchRef;
	}

	/**
	 * Sets the value of the batchRef property.
	 *
	 * @param value allowed object is
	 *              {@link String }
	 */
	public void setBatchRef(String value) {
		this.batchRef = value;
	}

	/**
	 * Gets the value of the haltOnError property.
	 */
	public boolean isHaltOnError() {
		return haltOnError;
	}

	/**
	 * Sets the value of the haltOnError property.
	 */
	public void setHaltOnError(boolean value) {
		this.haltOnError = value;
	}

	/**
	 * Gets the value of the rejectAllOnError property.
	 */
	public boolean isRejectAllOnError() {
		return rejectAllOnError;
	}

	/**
	 * Sets the value of the rejectAllOnError property.
	 */
	public void setRejectAllOnError(boolean value) {
		this.rejectAllOnError = value;
	}

	/**
	 * Gets the value of the mpuList property.
	 *
	 * @return possible object is
	 * {@link EncodeRequest.MpuList }
	 */
	public EncodeRequest.MpuList getMpuList() {
		return mpuList;
	}

	/**
	 * Sets the value of the mpuList property.
	 *
	 * @param value allowed object is
	 *              {@link EncodeRequest.MpuList }
	 */
	public void setMpuList(EncodeRequest.MpuList value) {
		this.mpuList = value;
	}


	/**
	 * <p>Java class for anonymous complex type.
	 * <p/>
	 * <p>The following schema fragment specifies the expected content contained within this class.
	 * <p/>
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
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"mpu"
	})
	public static class MpuList {

		@XmlElement(name = "Mpu", required = true)
		@NotNull
		@Size(min = 1)
		protected List<MpuElement> mpu;

		/**
		 * Gets the value of the mpu property.
		 * <p/>
		 * <p/>
		 * This accessor method returns a reference to the live list,
		 * not a snapshot. Therefore any modification you make to the
		 * returned list will be present inside the JAXB object.
		 * This is why there is not a <CODE>set</CODE> method for the mpu property.
		 * <p/>
		 * <p/>
		 * For example, to add a new item, do as follows:
		 * <pre>
		 *    getMpu().add(newItem);
		 * </pre>
		 * <p/>
		 * <p/>
		 * <p/>
		 * Objects of the following type(s) are allowed in the list
		 * {@link MpuElement }
		 */
		public List<MpuElement> getMpu() {
			if (mpu == null) {
				mpu = new ArrayList<MpuElement>();
			}
			return this.mpu;
		}

	}

}
