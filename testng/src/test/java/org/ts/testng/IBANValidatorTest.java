package org.ts.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * IBAN validator Test
 * 
 * @author wwillems
 * 
 */
public class IBANValidatorTest {

    private Logger log = Logger.getLogger(IBANValidatorTest.class);

    private IBANValidator ibanValidator;
 
	@BeforeClass
    public void init() {
        ibanValidator = new IBANValidator();
	}
 
	@DataProvider
	public Object[][] correctNumbers() {
		return new Object[][] { { new String[] {
                "AL47212110090000000235698741",
                "AD1200012030200359100100",
                "AT611904300234573201",
                "AZ21NABZ00000000137010001944",
                "BH67BMAG00001299123456",
                "BE68539007547034",
                "BA391290079401028494",
                "BR9700360305000010009795493P1",
                "BG80BNBG96611020345678",
                "CR0515202001026284066",
                "HR1210010051863000160",
                "CY17002001280000001200527600",
                "CZ6508000000192000145399",
                "CZ9455000000001011038930",
                "DK5000400440116243",
                "FO6264600001631634",
                "GL8964710001000206",
                "DO28BAGR00000001212453611324",
                "EE382200221020145685",
                "FI2112345600000785",
                "FI5542345670000081",
                "FR1420041010050500013M02606",
                "GE29NB0000000101904917",
                "DE89370400440532013000",
                "GI75NWBK000000007099453",
                "GR1601101250000000012300695",
                "GT82TRAJ01020000001210029690",
                "HU42117730161111101800000000",
                "IS140159260076545510730339",
                "IE29AIBK93115212345678",
                "IL620108000000099999999",
                "IT60X0542811101000000123456",
                "JO94CBJO0010000000000131000302",
                "KZ86125KZT5004100100",
                "KW81CBKU0000000000001234560101",
                "LV80BANK0000435195001",
                "LB62099900000001001901229114",
                "LI21088100002324013AA",
                "LT121000011101001000",
                "LU280019400644750000",
                "MK07250120000058984",
                "MT84MALT011000012345MTLCAST001S",
                "MR1300020001010000123456753",
                "MU17BOMM0101101030300200000MUR",
                "MD24AG000225100013104168",
                "MC5811222000010123456789030",
                "ME25505000012345678951",
                "NL91ABNA0417164300",
                "NO9386011117947",
                "PK36SCBL0000001123456702",
                "PS92PALS000000000400123456702",
                "PL61109010140000071219812874",
                "PT50000201231234567890154",
                "RO49AAAA1B31007593840000",
                "QA58DOHB00001234567890ABCDEFG",
                "SM86U0322509800000000270100",
                "SA0380000000608010167519",
                "RS35260005601001611379",
                "SK3112000000198742637541",
                "SI56263300012039086",
                "ES9121000418450200051332",
                "SE4550000000058398257466",
                "CH9300762011623852957",
                "TN5910006035183598478831",
                "TR330006100519786457841326",
                "AE070331234567890123456",
                "GB29NWBK60161331926819",
                "VG96VPVG0000012345678901"
        }
        } };
	}
 
	@DataProvider
	public Object[][] incorrectNumbers() {
		return new Object[][] { { new String[] {
                "12345",
                "AL124",
                "XX1231"
        } } };
	}
 
	@Test(dataProvider = "correctNumbers")
	public void validateCorrectNumbers(String[] numbers) {
        processNumbers(numbers, true);
	}
 
	@Test(dataProvider = "incorrectNumbers", dependsOnMethods = "validateCorrectNumbers")
	public void validateIncorrectNumbers(String[] numbers) {
        processNumbers(numbers, false);
    }

    private void processNumbers(String[] numbers, boolean correct) {
        for (String iban: numbers) {
            boolean valid = ibanValidator.validate(iban);
            log.info("IBAN " + iban + " is valid: " + valid);
            Assert.assertEquals(valid, correct);
        }
    }


}