package b;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the b
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Response_QNAME = new QName("", "Response");
	private final static QName _EncodeRequest_QNAME = new QName("", "EncodeRequest");
	private final static QName _FreeFormAddress_QNAME = new QName("", "FreeFormAddress");
	private final static QName _StandardAddress_QNAME = new QName("", "StandardAddress");
	private final static QName _Container_QNAME = new QName("", "Container");
	private final static QName _Mpu_QNAME = new QName("", "Mpu");
	private final static QName _Address_QNAME = new QName("", "Address");
	private final static QName _Impb_QNAME = new QName("", "Impb");
	private final static QName _LabelDetail_QNAME = new QName("", "LabelDetail");
	private final static QName _PackageRef_QNAME = new QName("", "PackageRef");
	private final static QName _Weight_QNAME = new QName("", "Weight");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: b
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link FreeFormAddressElement }
	 * 
	 */
	public FreeFormAddressElement createFreeFormAddressElement() {
		return new FreeFormAddressElement();
	}

	/**
	 * Create an instance of {@link ImpbElement }
	 * 
	 */
	public ImpbElement createImpbElement() {
		return new ImpbElement();
	}

	/**
	 * Create an instance of {@link PackageRefElement }
	 * 
	 */
	public PackageRefElement createPackageRefElement() {
		return new PackageRefElement();
	}

	/**
	 * Create an instance of {@link StandardAddressElement }
	 * 
	 */
	public StandardAddressElement createStandardAddressElement() {
		return new StandardAddressElement();
	}

	/**
	 * Create an instance of {@link LabelDetailElement }
	 * 
	 */
	public LabelDetailElement createLabelDetailElement() {
		return new LabelDetailElement();
	}

	/**
	 * Create an instance of {@link EncodeRequest }
	 * 
	 */
	public EncodeRequest createEncodeRequest() {
		return new EncodeRequest();
	}

	/**
	 * Create an instance of {@link MpuResponseElement }
	 * 
	 */
	public MpuResponseElement createMpuResponseElement() {
		return new MpuResponseElement();
	}

	/**
	 * Create an instance of {@link AbstractRequest }
	 * 
	 */
	public AbstractRequest createAbstractRequest() {
		return new AbstractRequest();
	}

	/**
	 * Create an instance of {@link EncodeRequest.MpuList }
	 * 
	 */
	public EncodeRequest.MpuList createEncodeRequestMpuList() {
		return new EncodeRequest.MpuList();
	}

	/**
	 * Create an instance of {@link MpuElement }
	 * 
	 */
	public MpuElement createMpuElement() {
		return new MpuElement();
	}

	/**
	 * Create an instance of {@link AddressElement }
	 * 
	 */
	public AddressElement createAddressElement() {
		return new AddressElement();
	}

	/**
	 * Create an instance of {@link WeightElement }
	 * 
	 */
	public WeightElement createWeightElement() {
		return new WeightElement();
	}

	/**
	 * Create an instance of {@link ContainerElement }
	 * 
	 */
	public ContainerElement createContainerElement() {
		return new ContainerElement();
	}

	/**
	 * Create an instance of {@link MpuResponseElement.ErrorList }
	 * 
	 */
	public MpuResponseElement.ErrorList createMpuResponseElementErrorList() {
		return new MpuResponseElement.ErrorList();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MpuResponseElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Response")
	public JAXBElement<MpuResponseElement> createResponse(MpuResponseElement value) {
		return new JAXBElement<MpuResponseElement>(_Response_QNAME, MpuResponseElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EncodeRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "EncodeRequest")
	public JAXBElement<EncodeRequest> createEncodeRequest(EncodeRequest value) {
		return new JAXBElement<EncodeRequest>(_EncodeRequest_QNAME, EncodeRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormAddressElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "FreeFormAddress")
	public JAXBElement<FreeFormAddressElement> createFreeFormAddress(FreeFormAddressElement value) {
		return new JAXBElement<FreeFormAddressElement>(_FreeFormAddress_QNAME, FreeFormAddressElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link StandardAddressElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "StandardAddress")
	public JAXBElement<StandardAddressElement> createStandardAddress(StandardAddressElement value) {
		return new JAXBElement<StandardAddressElement>(_StandardAddress_QNAME, StandardAddressElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ContainerElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Container")
	public JAXBElement<ContainerElement> createContainer(ContainerElement value) {
		return new JAXBElement<ContainerElement>(_Container_QNAME, ContainerElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MpuElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Mpu")
	public JAXBElement<MpuElement> createMpu(MpuElement value) {
		return new JAXBElement<MpuElement>(_Mpu_QNAME, MpuElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddressElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Address")
	public JAXBElement<AddressElement> createAddress(AddressElement value) {
		return new JAXBElement<AddressElement>(_Address_QNAME, AddressElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ImpbElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Impb")
	public JAXBElement<ImpbElement> createImpb(ImpbElement value) {
		return new JAXBElement<ImpbElement>(_Impb_QNAME, ImpbElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LabelDetailElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "LabelDetail")
	public JAXBElement<LabelDetailElement> createLabelDetail(LabelDetailElement value) {
		return new JAXBElement<LabelDetailElement>(_LabelDetail_QNAME, LabelDetailElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PackageRefElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "PackageRef")
	public JAXBElement<PackageRefElement> createPackageRef(PackageRefElement value) {
		return new JAXBElement<PackageRefElement>(_PackageRef_QNAME, PackageRefElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link WeightElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Weight")
	public JAXBElement<WeightElement> createWeight(WeightElement value) {
		return new JAXBElement<WeightElement>(_Weight_QNAME, WeightElement.class, null, value);
	}

}
