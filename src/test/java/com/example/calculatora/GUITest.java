package com.example.calculatora;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.util.NodeQueryUtils.hasText;

public class GUITest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calculator-view.fxml"));
        stage.setScene(new Scene(loader.load(), 300, 420));
        stage.show();
    }

    @Test
    public void oneButtonClick() throws InterruptedException {
        clickOn("#oneButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("1"));
    }

    @Test
    public void twoButtonClick() throws InterruptedException {
        clickOn("#twoButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("2"));
    }

    @Test
    public void threeButtonClick() throws InterruptedException {
        clickOn("#threeButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("3"));
    }

    @Test
    public void fourButtonClick() throws InterruptedException {
        clickOn("#fourButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("4"));
    }

    @Test
    public void fiveButtonClick() throws InterruptedException {
        clickOn("#fiveButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("5"));
    }

    @Test
    public void sixButtonClick() throws InterruptedException {
        clickOn("#sixButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("6"));
    }

    @Test
    public void sevenButtonClick() throws InterruptedException {
        clickOn("#sevenButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("7"));
    }

    @Test
    public void eightButtonClick() throws InterruptedException {
        clickOn("#eightButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("8"));
    }

    @Test
    public void nineButtonClick() throws InterruptedException {
        clickOn("#nineButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("9"));
    }

    @Test
    public void zeroButtonClick() throws InterruptedException {
        clickOn("#zeroButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("0"));
    }

    @Test
    public void plusButtonClick() throws InterruptedException {
        clickOn("#addButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("+"));
    }

    @Test
    public void minusButtonClick() throws InterruptedException {
        clickOn("#subtractButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("-"));
    }

    @Test
    public void multiplyButtonClick() throws InterruptedException {
        clickOn("#oneButton");
        clickOn("#multiplyButton");
        Thread.sleep(1000);
        verifyThat("#expression-label", hasText("1*"));
    }
}
