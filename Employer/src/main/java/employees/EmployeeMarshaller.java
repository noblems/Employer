package employees;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.transform.stream.StreamResult;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class EmployeeMarshaller {
	String FILE_NAME = "settings.xml";
	private Greeting greeting=new Greeting(1234,"hello");
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;
	
	public void setMarshaller(Marshaller marshaller) {
		this.marshaller=marshaller;
	}
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		this.unmarshaller=unmarshaller;
	}
	
	public FileOutputStream returnXml() throws IOException {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(FILE_NAME);
            this.marshaller.marshal(greeting, new StreamResult(os));
        } finally {
           
           return os;
           
        }
    }
}
