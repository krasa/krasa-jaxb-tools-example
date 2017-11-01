
package b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for containerTypeValue.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="containerTypeValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SACK"/>
 *     &lt;enumeration value="GAYLORD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "containerTypeValue")
@XmlEnum
public enum ContainerTypeValue {

	SACK,
	GAYLORD;

	public String value() {
		return name();
	}

	public static ContainerTypeValue fromValue(String v) {
		return valueOf(v);
	}

}
