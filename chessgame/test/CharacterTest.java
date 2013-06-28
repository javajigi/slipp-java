import junit.framework.TestCase;

public class CharacterTest extends TestCase {
	public void testWhitespace() throws Exception {
		assertTrue(Character.isWhitespace('\n'));
		assertTrue(Character.isWhitespace('\t'));
		assertTrue(Character.isWhitespace(' '));
	}
	
	public void testIdentifier() throws Exception {
		assertTrue(Character.isJavaIdentifierPart('_'));
		assertTrue(Character.isJavaIdentifierPart('$'));
		assertFalse(Character.isJavaIdentifierStart('7'));
		assertTrue(Character.isJavaIdentifierStart('_'));
	}
}
