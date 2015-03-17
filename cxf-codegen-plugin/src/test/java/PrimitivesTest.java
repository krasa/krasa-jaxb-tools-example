import a.Primitives;

public class PrimitivesTest {

	@org.junit.Test
	public void testName() throws Exception {
		Primitives primitives = new Primitives();
		primitives.equals(new Primitives());
		primitives.hashCode();
	}
}
