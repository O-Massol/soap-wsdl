//import com.sun.xml.bind.v2.ContextFactory; 2.3.6 and no more
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.glassfish.jaxb.runtime.v2.ContextFactory;

public class Dummy {

    ContextFactory comSunXmlBindContextFactoryJaxb2301;

    public void dummy() throws JAXBException {
        JAXBContext c = ContextFactory.createContext(null, null);
    }

}
