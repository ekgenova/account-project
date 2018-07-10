package converters;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import accounts.AccountService;

public class JavaToXMLConverter {

    public void convertHashToXML(AccountService accServ, Object object) {
	   	
    	try {
    		JAXBContext context = JAXBContext.newInstance(AccountService.class);
    		Marshaller m = context.createMarshaller();
    		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    		m.marshal(object, System.out);
    		
    		m.marshal(object, new File("C:\\Users\\Admin\\eclipse-workspace\\generated\\hashmap.xml"));
    	} catch (JAXBException e) {
    		e.printStackTrace();
    	}
    }
	
}
