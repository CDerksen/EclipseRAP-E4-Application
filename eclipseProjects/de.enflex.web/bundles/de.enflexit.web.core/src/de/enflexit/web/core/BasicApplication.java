package de.enflexit.web.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rap.e4.E4ApplicationConfig;
import org.eclipse.rap.e4.E4EntryPointFactory;
import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.application.Application.OperationMode;
import org.eclipse.rap.rwt.client.WebClient;

/**
 * The Class BasicApplication.
 * Tutorial taken from: https://o7planning.org/en/10183/eclipse-rap-tutorial-for-beginners-workbench-application 
 */
public class BasicApplication implements ApplicationConfiguration {

    /* (non-Javadoc)
     * @see org.eclipse.rap.rwt.application.ApplicationConfiguration#configure(org.eclipse.rap.rwt.application.Application)
     */
    public void configure(Application application) {
    	
    	Map<String, String> properties = new HashMap<String, String>();
        properties.put(WebClient.PAGE_TITLE, "EnFlex.IT - Web-Application");
        
        application.addEntryPoint("/webApp", new E4EntryPointFactory(E4ApplicationConfig.create("platform:/plugin/de.enflexit.web.core/Application.e4xmi")), properties);
        application.setOperationMode( OperationMode.SWT_COMPATIBILITY );
        
    }

}
