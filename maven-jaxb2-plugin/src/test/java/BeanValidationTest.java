import static org.junit.Assert.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import a.PatternElement;

public class BeanValidationTest {
	@org.junit.Test
	public void testValidation() {
		PatternElement bean = new PatternElement();
		bean.setMultiplePatternsWithBase("A");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<PatternElement>> validate = validator.validate(bean);

		for (ConstraintViolation<PatternElement> stringsConstraintViolation : validate) {
			System.err.println(stringsConstraintViolation);
		}

		assertTrue(validate.size() == 0);
	}
}