/*
 * generated by Xtext 2.25.0
 */
package org.xtext.unipampa.erdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ErDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/unipampa/erdsl/parser/antlr/internal/InternalErDslParser.tokens");
	}
}
