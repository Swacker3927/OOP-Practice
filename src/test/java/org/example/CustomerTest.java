package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CustomerTest {
    @Test
    @DisplayName("메뉴 이름에 해당하는 요리를 주문한다.")
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(
                new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)
        ));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("만두", menu, cooking))
                .doesNotThrowAnyException();
    }
}
