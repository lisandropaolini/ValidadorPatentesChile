package cl.lisandro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Util {
	
	
	static boolean isPatternMatcher(String exp, String val) throws NullPointerException {
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(val);
		return m.matches();
	}
}
