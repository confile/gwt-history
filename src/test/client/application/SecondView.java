package test.client.application;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class SecondView extends ViewWithUiHandlers<SecondViewUiHandlers> implements SecondPresenter.MyView {


	public interface Binder extends UiBinder<Widget, SecondView> {
	}

	@Inject
	public SecondView(final Binder binder) {
		initWidget(binder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onClick(ClickEvent event) {
		getUiHandlers().buttonClicked();
	}

}
