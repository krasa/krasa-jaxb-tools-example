
package a;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the a
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

	private final static QName _PatternElement_QNAME = new QName("a", "patternElement");
	private final static QName _Main_QNAME = new QName("a", "main");
	private final static QName _ChoicesWithMinMaxTea_QNAME = new QName("a", "Tea");
	private final static QName _ChoicesWithMinMaxCoffee_QNAME = new QName("a", "Coffee");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: a
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link PatternElement }
	 * 
	 */
	public PatternElement createPatternElement() {
		return new PatternElement();
	}

	/**
	 * Create an instance of {@link Main }
	 * 
	 */
	public Main createMain() {
		return new Main();
	}

	/**
	 * Create an instance of {@link NumberWithCode }
	 * 
	 */
	public NumberWithCode createNumberWithCode() {
		return new NumberWithCode();
	}

	/**
	 * Create an instance of {@link Dates }
	 * 
	 */
	public Dates createDates() {
		return new Dates();
	}

	/**
	 * Create an instance of {@link Coffee }
	 * 
	 */
	public Coffee createCoffee() {
		return new Coffee();
	}

	/**
	 * Create an instance of {@link ChoicesWithMinMax }
	 * 
	 */
	public ChoicesWithMinMax createChoicesWithMinMax() {
		return new ChoicesWithMinMax();
	}

	/**
	 * Create an instance of {@link Numbers }
	 * 
	 */
	public Numbers createNumbers() {
		return new Numbers();
	}

	/**
	 * Create an instance of {@link Choices }
	 * 
	 */
	public Choices createChoices() {
		return new Choices();
	}

	/**
	 * Create an instance of {@link ComplexChoicesWithMinMax }
	 * 
	 */
	public ComplexChoicesWithMinMax createComplexChoicesWithMinMax() {
		return new ComplexChoicesWithMinMax();
	}

	/**
	 * Create an instance of {@link Primitives }
	 * 
	 */
	public Primitives createPrimitives() {
		return new Primitives();
	}

	/**
	 * Create an instance of {@link ComplexChoices }
	 * 
	 */
	public ComplexChoices createComplexChoices() {
		return new ComplexChoices();
	}

	/**
	 * Create an instance of {@link Enumeration }
	 * 
	 */
	public Enumeration createEnumeration() {
		return new Enumeration();
	}

	/**
	 * Create an instance of {@link Strings }
	 * 
	 */
	public Strings createStrings() {
		return new Strings();
	}

	/**
	 * Create an instance of {@link Tea }
	 * 
	 */
	public Tea createTea() {
		return new Tea();
	}

	/**
	 * Create an instance of {@link Enumerations }
	 * 
	 */
	public Enumerations createEnumerations() {
		return new Enumerations();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PatternElement }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "a", name = "patternElement")
	public JAXBElement<PatternElement> createPatternElement(PatternElement value) {
		return new JAXBElement<PatternElement>(_PatternElement_QNAME, PatternElement.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Main }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "a", name = "main")
	public JAXBElement<Main> createMain(Main value) {
		return new JAXBElement<Main>(_Main_QNAME, Main.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "a", name = "Tea", scope = ChoicesWithMinMax.class)
	public JAXBElement<String> createChoicesWithMinMaxTea(String value) {
		return new JAXBElement<String>(_ChoicesWithMinMaxTea_QNAME, String.class, ChoicesWithMinMax.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "a", name = "Coffee", scope = ChoicesWithMinMax.class)
	public JAXBElement<String> createChoicesWithMinMaxCoffee(String value) {
		return new JAXBElement<String>(_ChoicesWithMinMaxCoffee_QNAME, String.class, ChoicesWithMinMax.class, value);
	}

}
