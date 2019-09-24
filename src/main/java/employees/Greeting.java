package employees;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JacksonXmlRootElement(localName = "Greeting")
public class Greeting {
	@JacksonXmlProperty(isAttribute = true)
    private final long id;
	@JacksonXmlProperty 
    private final String content;
	@JacksonXmlProperty 
    private String message;
    
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.message="test";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getMessage() {
    	return message;
    }
}
