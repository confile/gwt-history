package test.client.gin;

import test.client.application.FirstPresenter;
import test.client.application.SecondPresenter;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;


//@GinModules({ DispatchAsyncModule.class, ClientModule.class })
//@GinModules({ ClientModule.class })
//@GinModules({ RestDispatchAsyncModule.class, ClientModule.class })
//public interface ClientGinjector extends Ginjector {
	public interface ClientGinjector extends Ginjector {
	EventBus getEventBus();
//
		
		// 
		
	PlaceManager getPlaceManager();
//
//	AsyncProvider<AppPresenter> getAppPresenter();
//
//	AsyncProvider<FeedPagePresenter> getFeedPresenter();
//
//	AsyncProvider<ProfilePagePresenter> getProfilePresenter();
//
//	AsyncProvider<StartPagePresenter> getStartPresenter();
//
//	AsyncProvider<SignupPagePresenter> getSignUpPresenter();
//
//	AsyncProvider<LoginPagePresenter> getLoginPresenter();

	AsyncProvider<FirstPresenter> getFirstPresenter();

	AsyncProvider<SecondPresenter> getSecondPresenter();






	// CometListener getCometListener();

	// CometService getCometService();

	// AsyncProvider<MainPresenter> getMainPresenter();

	// AsyncProvider<ApplicationPresenter>

}
