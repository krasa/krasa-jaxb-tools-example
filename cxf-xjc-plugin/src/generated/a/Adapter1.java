package a;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.example.FaxNumber;

public class Adapter1 extends XmlAdapter<String, FaxNumber> {

	public FaxNumber unmarshal(String value) {
		return (com.example.FaxNumber.parse(value));
	}

	public String marshal(FaxNumber value) {
		return (com.example.FaxNumber.print(value));
	}

}
