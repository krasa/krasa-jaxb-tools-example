package b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weightUnitValue.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="weightUnitValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="OZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "weightUnitValue")
@XmlEnum
public enum WeightUnitValue {

	GM,
	LB,
	KG,
	OZ;

	public String value() {
		return name();
	}

	public static WeightUnitValue fromValue(String v) {
		return valueOf(v);
	}

}
