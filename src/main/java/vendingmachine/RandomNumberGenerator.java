package vendingmachine;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {

    private RandomNumberGenerator() {
    }

    public int generate(List<Integer> numbers) {
        return Randoms.pickNumberInList(numbers);
    }
}
