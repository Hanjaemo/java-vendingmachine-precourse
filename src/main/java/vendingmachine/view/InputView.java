package vendingmachine.view;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.utils.Converter;

public class InputView {

    private InputView() {
    }

    public static int readVendingMachineAmount() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
        String input = Console.readLine();
        return Converter.convertToInt(input);
    }

    public static List<String> readProducts() {
        System.out.println("상품명과 가격, 수량을 입력해 주세요.");
        String input = Console.readLine();
        return Arrays.stream(input.split(";"))
                .map(product -> product.substring(1, product.length() - 1))
                .collect(Collectors.toList());
    }

    public static int readInputAmount() {
        System.out.println("투입 금액을 입력해 주세요.");
        String input = Console.readLine();
        return Converter.convertToInt(input);
    }

    public static String readProductNameToPurchase() {
        System.out.println("구매할 상품명을 입력해 주세요.");
        return Console.readLine();
    }
}
