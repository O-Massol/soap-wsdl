
import lexisnexis.*;

import java.net.MalformedURLException;
import java.net.URL;

public class App {

    public void main(String[] args) throws MalformedURLException, ISearchSearchServiceFaultFaultFaultMessage {
        //TODO url
        URL url = new URL("http://localhost:8080/employeeservice?wsdl");
        XGServices xgServices = new XGServices(url);
        ISearch search = xgServices.getBasicHttpBindingISearch();

        //TODO better inputs
        ClientContext clientContext = new ClientContext();
        SearchConfiguration searchConfiguration = new SearchConfiguration();
        SearchInput searchInput = new SearchInput();

        var results = search.search(clientContext,searchConfiguration,searchInput);
    }


}
