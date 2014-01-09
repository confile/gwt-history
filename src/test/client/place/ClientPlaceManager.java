package test.client.place;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

/**
 * Documentation see: https://github.com/ArcBees/GWTP/wiki/PlaceManager
 * @author mg
 *
 */
public class ClientPlaceManager extends PlaceManagerImpl {

	private final PlaceRequest defaultPlaceRequest;

	@Inject
	public ClientPlaceManager(final EventBus eventBus, final TokenFormatter tokenFormatter,
			@DefaultPlace final String defaultPlaceNameToken) {
		
		super(eventBus, tokenFormatter);
		this.defaultPlaceRequest = new PlaceRequest.Builder().nameToken(defaultPlaceNameToken).build();
	}

	@Override
	public void revealDefaultPlace() {
        // Using false as a second parameter ensures that the URL in the browser bar
        // is not updated, so the user is able to leave the application using the
        // browser's back navigation button.
        revealPlace(defaultPlaceRequest, false);
	}
}
