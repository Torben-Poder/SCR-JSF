package dk.roskilde.it.tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Hallowtag extends SimpleTagSupport {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		JspWriter out = pageContext.getOut();
		JspFragment body = getJspBody();

		try {
			StringWriter sb = new StringWriter();
			sb.append("<p>");
			sb.append("Hallow ");
			body.invoke(sb);
			sb.append("</p>");
			out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
