package de.enflexit.web.core;

import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class E4LifeCycleManager {

	@PostContextCreate
	void postContextCreate(Display display) {
		
		final Shell shell = new Shell(SWT.SHELL_TRIM);
		System.err.println("[" + this.getClass().getName() + "] => It works!");
		
	}

}
