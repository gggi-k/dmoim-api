package kr.dmoim.api.user.presentation.view;

public interface UserView {

    interface List {}
    interface Detail {}
    interface Create extends Detail {}
    interface Update extends Detail {}
}
