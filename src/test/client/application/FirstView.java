package test.client.application;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class FirstView extends ViewWithUiHandlers<FirstViewUiHandlers> implements FirstPresenter.MyView {


	public interface Binder extends UiBinder<Widget, FirstView> {
	}

	@Inject
	public FirstView(final Binder binder) {
		initWidget(binder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onClick(ClickEvent event) {
		getUiHandlers().buttonClicked();
	}
	

}
