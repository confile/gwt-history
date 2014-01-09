package test.client.gin;

import test.client.application.FirstPresenter;
import test.client.application.FirstView;
import test.client.application.SecondPresenter;
import test.client.application.SecondView;
import test.client.place.NameTokens;

import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.mvp.client.proxy.DefaultPlaceManager;
import com.gwtplatform.mvp.client.proxy.RouteTokenFormatter;


public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {

		install(new DefaultModule(DefaultPlaceManager.class, RouteTokenFormatter.class));
//		install(new DefaultModule());



		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.first);
		bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.first);
		bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.first);

	



		bindPresenter(FirstPresenter.class, FirstPresenter.MyView.class,
				FirstView.class, FirstPresenter.MyProxy.class);

		bindPresenter(SecondPresenter.class, SecondPresenter.MyView.class,
				SecondView.class, SecondPresenter.MyProxy.class);
	}
}
