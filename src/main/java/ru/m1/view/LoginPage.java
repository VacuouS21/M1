package ru.m1.view;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinRequest;

@Route("todo")
public class LoginPage extends UI {
    @Override
    public void init(VaadinRequest request) {
        addClassName("login-rich-content");

        LoginForm loginForm = new LoginForm();
        loginForm.getElement().getThemeList().add("dark");
    }
}
