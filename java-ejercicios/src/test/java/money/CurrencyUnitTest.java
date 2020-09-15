package money;

import lombok.extern.java.Log;
import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;

import static org.junit.jupiter.api.Assertions.*;

@Log
public class CurrencyUnitTest {

    @Test
    public void givenCurrencyCode_whenString_thanExist() {
        CurrencyUnit usd = Monetary.getCurrency("USD");

        assertNotNull(usd);
        assertEquals(usd.getCurrencyCode(), "USD");
        assertEquals(usd.getNumericCode(), 840);
        assertEquals(usd.getDefaultFractionDigits(), 2);

    }

    //@Test(expected = UnknownCurrencyException.class)
    public void givenCurrencyCode_whenNoExist_thanThrowsError() {
        Monetary.getCurrency("AAA");
    }

    @Test
    public void givenAmounts_whenStringified_thanEquals() {

        CurrencyUnit usd = Monetary.getCurrency("USD");
        MonetaryAmount fstAmtUSD = Monetary.getDefaultAmountFactory()
                .setCurrency(usd).setNumber(200).create();
        Money moneyOf = Money.of(12, usd);
        FastMoney fastMoneyOf = FastMoney.of(2, usd);

        assertEquals("USD", usd.toString());
        assertEquals("USD 200", fstAmtUSD.toString());
        assertEquals("USD 12", moneyOf.toString());
        assertEquals("USD 2.00000", fastMoneyOf.toString());
    }

    @Test
    public void givenCurrencies_whenCompared_thanNotequal() {
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory()
                .setCurrency("USD").setNumber(1).create();
        Money oneEuro = Money.of(1, "EUR");

        assertFalse(oneEuro.equals(FastMoney.of(1, "EUR")));
        assertTrue(oneDollar.equals(Money.of(1, "USD")));
    }

    @Test
    public void givenArithmetic_whenStringified_thanEqualsAmount() {
        CurrencyUnit usd = Monetary.getCurrency("USD");

        Money moneyof = Money.of(12, usd);
        MonetaryAmount fstAmtUSD = Monetary.getDefaultAmountFactory()
                .setCurrency(usd).setNumber(200.50).create();
        MonetaryAmount oneDolar = Monetary.getDefaultAmountFactory()
                .setCurrency("USD").setNumber(1).create();
        Money subtractedAmount = Money.of(1, "USD").subtract(fstAmtUSD);
        MonetaryAmount multiplyAmount = oneDolar.multiply(0.25);
        MonetaryAmount divideAmount = oneDolar.divide(0.25);

        assertEquals("USD", usd.toString());
        assertEquals("USD 1", oneDolar.toString());
        assertEquals("USD 200.5", fstAmtUSD.toString());
        assertEquals("USD 12", moneyof.toString());
        assertEquals("USD -199.5", subtractedAmount.toString());
        assertEquals("USD 0.25", multiplyAmount.toString());
        assertEquals("USD 4", divideAmount.toString());
    }

    @Test
    public void givenAmount_whenRounded_thanEquals() {
        MonetaryAmount fstAmtEUR = Monetary.getDefaultAmountFactory()
                .setCurrency("EUR").setNumber(1.30473908).create();
        MonetaryAmount roundEUR = fstAmtEUR.with(Monetary.getDefaultRounding());

        assertEquals("EUR 1.30473908", fstAmtEUR.toString());
        assertEquals("EUR 1.3", roundEUR.toString());
    }

    @Test
    public void givenAmount_whenConversion_thenNotNull() {
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD")
                .setNumber(1).create();

        CurrencyConversion conversionEUR = MonetaryConversions.getConversion("EUR");
        System.out.println(conversionEUR);

        //MonetaryAmount convertedAmountUSDtoEUR = oneDollar.with(conversionEUR);

        assertEquals("USD 1", oneDollar.toString());
        //assertNotNull(convertedAmountUSDtoEUR);
    }

}
