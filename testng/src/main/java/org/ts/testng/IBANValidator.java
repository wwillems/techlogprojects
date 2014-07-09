package org.ts.testng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IBANValidator {

    private Matcher matcher;
    private Pattern pattern;

    private static final String IBAN_REGEX =
            "^(" +
            "(NO)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|" +
            "(NO)[0-9A-Z]{13}|" +
            "(BE)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|" +
            "(BE)[0-9A-Z]{14}|" +
            "(DK|FO|FI|GL|NL)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|" +
            "(DK|FO|FI|GL|NL)[0-9A-Z]{16}|" +
            "(MK|SI)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|" +
            "(MK|SI)[0-9A-Z]{17}|" +
            "(BA|EE|KZ|LT|LU|AT)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|" +
            "(BA|EE|KZ|LT|LU|AT)[0-9A-Z]{18}|" +
            "(HR|LI|LV|CH|CR)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{1}|" +
            "(HR|LI|LV|CH|CR)[0-9A-Z]{19}|" +
            "(BG|DE|IE|ME|RS|GB|BH|GE)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|" +
            "(BG|DE|IE|ME|RS|GB|BH|GE)[0-9A-Z]{20}|" +
            "(GI|IL|AE)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|" +
            "(GI|IL|AE)[0-9A-Z]{21}|" +
            "(AD|CZ|SA|RO|SK|ES|SE|TN|VG|MD|PK)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|" +
            "(AD|CZ|SA|RO|SK|ES|SE|TN|VG|MD|PK)[0-9A-Z]{22}|" +
            "(PT)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{1}|" +
            "(PT)[0-9A-Z]{23}|" +
            "(IS|TR)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|" +
            "(IS|TR)[0-9A-Z]{24}|" +
            "(FR|GR|IT|MC|SM|MR)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|" +
            "(FR|GR|IT|MC|SM|MR)[0-9A-Z]{25}|" +
            "(AL|CY|HU|LB|PL|GT|DO|AZ)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|" +
            "(AL|CY|HU|LB|PL|GT|DO|AZ)[0-9A-Z]{26}|" +
            "(PS|QA|BR)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{1}|" +
            "(PS|QA|BR)[0-9A-Z]{27}|" +
            "(MU|JO|KW)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|" +
            "(MU|JO|KW)[0-9A-Z]{28}|" +
            "(MT)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|" +
            "(MT)[0-9A-Z]{29})$";

    public IBANValidator() {
        pattern = Pattern.compile(IBAN_REGEX);
    }

    /**
     * Validate
     *
     * @param iban iban to be validated
     * @return true if valid iban, false if invalid iban
     */
    public boolean validate(String iban) {
        matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}