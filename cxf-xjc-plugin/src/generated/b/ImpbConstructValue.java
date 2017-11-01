
package b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for impbConstructValue.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="impbConstructValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N05"/>
 *     &lt;enumeration value="C05"/>
 *     &lt;enumeration value="N04"/>
 *     &lt;enumeration value="C07"/>
 *     &lt;enumeration value="C06"/>
 *     &lt;enumeration value="N01"/>
 *     &lt;enumeration value="C01"/>
 *     &lt;enumeration value="N02"/>
 *     &lt;enumeration value="C03"/>
 *     &lt;enumeration value="C02"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "impbConstructValue")
@XmlEnum
public enum ImpbConstructValue {

	@XmlEnumValue("N05")
	N_05("N05"),
	@XmlEnumValue("C05")
	C_05("C05"),
	@XmlEnumValue("N04")
	N_04("N04"),
	@XmlEnumValue("C07")
	C_07("C07"),
	@XmlEnumValue("C06")
	C_06("C06"),
	@XmlEnumValue("N01")
	N_01("N01"),
	@XmlEnumValue("C01")
	C_01("C01"),
	@XmlEnumValue("N02")
	N_02("N02"),
	@XmlEnumValue("C03")
	C_03("C03"),
	@XmlEnumValue("C02")
	C_02("C02");
	private final String value;

	ImpbConstructValue(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ImpbConstructValue fromValue(String v) {
		for (ImpbConstructValue c : ImpbConstructValue.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
