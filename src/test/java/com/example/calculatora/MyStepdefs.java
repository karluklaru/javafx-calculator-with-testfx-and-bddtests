package com.example.calculatora;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.testfx.api.FxRobotInterface;
import org.testfx.framework.junit.ApplicationTest;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.util.NodeQueryUtils.hasText;


public class MyStepdefs extends ApplicationTest {

    @Given("Application is started")
    public void applicationIsStarted() throws Exception {
        ApplicationTest.launch(Main.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calculator-view.fxml"));
        stage.setScene(new Scene(loader.load(), 300, 420));
        stage.show();
    }

    @When("^I click the button with value \"([^\"]*)\"$")
    public void clickButton(String value) throws Throwable {
        String text = "#" + value + "Button";
        FxRobotInterface fxRobotInterface = clickOn(text);
    }

    @Then("^The label show answer \"([^\"]*)\"$")
    public void showAnswer(String answer) throws Throwable {
        verifyThat("#expression-label", hasText(answer));
    }

    @Then("^The label show error \"([^\"]*)\"$")
    public void showError(String error) throws Throwable {
        verifyThat("#expression-label", hasText(error));
    }
}
