package test.client.application;

import test.client.place.NameTokens;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class SecondPresenter extends
		Presenter<SecondPresenter.MyView, SecondPresenter.MyProxy> implements SecondViewUiHandlers {

	public interface MyView extends View, HasUiHandlers<SecondViewUiHandlers> {
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.second)
	public interface MyProxy extends ProxyPlace<SecondPresenter> {
	}
	
	private final PlaceManager placeManager;

	@Inject
	public SecondPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, PlaceManager placeManager) {
		super(eventBus, view, proxy);
		this.placeManager = placeManager;
		view.setUiHandlers(this);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}
	
	@Override
	public void buttonClicked() {
		GWT.log("SecondPresenter buttonClicked() HierarchyDepth: "+placeManager.getHierarchyDepth());
		
		PlaceRequest request = new PlaceRequest.Builder()
		.nameToken(NameTokens.getFirst())
		.build();
//		placeManager.revealPlace(request);	
		placeManager.revealRelativePlace(request);

	}
}
