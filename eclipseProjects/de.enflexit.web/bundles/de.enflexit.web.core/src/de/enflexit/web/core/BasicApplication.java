package de.enflexit.web.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rap.e4.E4ApplicationConfig;
import org.eclipse.rap.e4.E4EntryPointFactory;
import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.application.Application.OperationMode;
import org.eclipse.rap.rwt.client.WebClient;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * The Class BasicApplication.
 * Tutorial taken from: https://o7planning.org/en/10183/eclipse-rap-tutorial-for-beginners-workbench-application 
 */
public class BasicApplication implements ApplicationConfiguration {

   
	public void configure(Application application) {

		Map<String, String> properties = new HashMap<String, String>();
		properties.put(WebClient.PAGE_TITLE, "EnFlex.IT - Web-Application");

		Bundle bundle = FrameworkUtil.getBundle(E4LifeCycleManager.class);
		String symbolicName = bundle.getSymbolicName();

		String appXmiLocation = "platform:/plugin/" + symbolicName + "/Application.e4xmi";
		String lifeCycleLocation = "bundleclass://" + symbolicName + "/" + E4LifeCycleManager.class.getName();

		E4ApplicationConfig applicationConfig = E4ApplicationConfig.create(appXmiLocation, lifeCycleLocation);
		
		E4EntryPointFactory entryPointFactory = new E4EntryPointFactory(applicationConfig);

		application.addEntryPoint("/webApp", entryPointFactory, properties);
		application.setOperationMode(OperationMode.SWT_COMPATIBILITY);

	}
    
}
