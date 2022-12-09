package paraunity;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import praunit.Money;

@Test
public class MoneyTest {
public void constructorShouldSetAmountAndCurrency() {
	Money money = new Money(10,"USD");
	
	assertEquals(money.getAmount(),10);
	assertEquals(money.getCurrency(),"USD");
}
}
