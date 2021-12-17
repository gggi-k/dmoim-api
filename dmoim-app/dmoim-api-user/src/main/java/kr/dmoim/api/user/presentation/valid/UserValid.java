package kr.dmoim.api.user.presentation.valid;

import kr.dmoim.api.user.presentation.view.UserView;

public interface UserValid {

    interface Create extends UserView.Create {}
    interface Update extends UserView.Update {}
}
