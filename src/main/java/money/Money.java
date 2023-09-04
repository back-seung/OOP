package main.java.money;import java.util.Currency;// 전형적인 데이터 클래스//public class Money {//    int amount; // 금액//    Currency currency; // 통화 단위//}// 클래스 설계란 인스턴스 변수가 잘못된 상태에 빠지지 않게 하기 위한 구조를 만드는 것public class Money {    // 불변 변수로 만들었으므로 값의 변경이나 부수 효과로부터 안전함    private final int amount; // 금액    private final Currency currency; // 통화 단위    // 인스턴스 변수의 값을 생성자에서 확정하므로 초기화하지 않은 상태가 있을 수 없음    public Money(int amount, Currency currency) {        // 값 검증 Validation을 통해 잘못된 값의 주입을 막음        if (amount < 0) throw new IllegalArgumentException("0 이상의 값을 지정해주세요");        if (currency == null) throw new NullPointerException("통화 단위를 지정해주세요");        this.amount = amount;        this.currency = currency;    }    // 필요한 로직이 클래스 내부에 모여있음    // 다른데서 중복 코드가 작성될 일이 줄어듬    //   -> 중복 코드가 발생하지 않으면, 수정 누락이 줄어듬    //   -> 필요한 로직이 Money 내부에 모여 있어, 여기저기 찾아보지 않아, 가독성이 높아짐    // 매개변수 전달이 Money 자료형으로 바뀌었으므로 다른 자료형의 값을 실수로 넣었을 때 컴파일 오류 발생    public Money add(final Money other) {        if(!currency.equals(other.currency)) throw new IllegalArgumentException("통화 단위가 다릅니다");        final int added = amount + other.amount;        return new Money(added, currency);    }    @Override    public String toString() {        return "Money{" +                "amount=" + amount +                ", currency=" + currency +                '}';    }}