package test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.ApplicationController;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtpHistory implements EntryPoint {

	private static final ApplicationController controller = GWT.create(ApplicationController.class);

	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		controller.init();
		
	}
}
