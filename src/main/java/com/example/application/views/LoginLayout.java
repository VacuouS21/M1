package com.example.application.views;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Авторизация")
@Route(value = "login")
public class LoginLayout extends HorizontalLayout {
    public LoginLayout(){
        addClassName("login-layout");

        LoginForm loginForm = new LoginForm();
        loginForm.getElement().getThemeList().add("dark");

        loginForm.addLoginListener(e ->
                loginForm.getUI().ifPresent(ui -> ui.navigate(
                        ""))
        );
        add(loginForm);
    }
}
