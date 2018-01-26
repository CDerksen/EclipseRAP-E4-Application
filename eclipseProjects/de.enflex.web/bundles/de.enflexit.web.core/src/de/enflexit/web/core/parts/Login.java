package de.enflexit.web.core.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class Login {
	
	private Text txtPassword;
	private Text txtUserName;
	private Label lblPassword;

	@PostConstruct
	public void postConstruct(MPart part, Composite parent) {
		
		GridLayout gl_parent = new GridLayout(2, false);
		gl_parent.marginBottom = 10;
		gl_parent.marginRight = 10;
		gl_parent.marginTop = 10;
		gl_parent.marginLeft = 10;
		parent.setLayout(gl_parent);
		
		Label lblLoginToEnflexit = new Label(parent, SWT.NONE);
//		lblLoginToEnflexit.setFont(SWTResourceManager.getFont("Verdana", 12, SWT.BOLD));
		lblLoginToEnflexit.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblLoginToEnflexit.setText("Login to EnFlex.IT - Service");
		
		Label lblUserName = new Label(parent, SWT.NONE);
//		lblUserName.setFont(SWTResourceManager.getFont("Verdana", 10, SWT.BOLD));
		lblUserName.setText("User Name");
		
		txtUserName = new Text(parent, SWT.BORDER);
//		txtUserName.setFont(SWTResourceManager.getFont("Verdana", 10, SWT.NORMAL));
		txtUserName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		lblPassword = new Label(parent, SWT.NONE);
//		lblPassword.setFont(SWTResourceManager.getFont("Verdana", 10, SWT.BOLD));
		lblPassword.setText("Password");
		
		txtPassword = new Text(parent, SWT.BORDER);
//		txtPassword.setFont(SWTResourceManager.getFont("Verdana", 10, SWT.NORMAL));
		txtPassword.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		
		
	}

}