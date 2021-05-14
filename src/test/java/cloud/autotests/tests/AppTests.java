package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("iikoweb")
    void generatedTest() {
        step("Открыть 'https://sitweb.iiko.it/'", () -> {
            // todo just add selenium action
        });

        step("Ввести логин 'dbusygin'", () -> {
            // todo just add selenium action
        });

        step("Ввести пароль 'dbusygin'", () -> {
            // todo just add selenium action
        });

        step("Отправить форму", () -> {
            // todo just add selenium action
        });

        step("Проверить успешную авторизацию под 'dbusygin'", () -> {
            // todo just add selenium action
        });
    }
}