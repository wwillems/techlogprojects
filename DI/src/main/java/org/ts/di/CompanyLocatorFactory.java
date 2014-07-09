package org.ts.di;

public class CompanyLocatorFactory {

    public static CompanyLocatorFactory getInstance() {
        return new CompanyLocatorFactory();
    }

    public CompanyLocator getCompanyLocator(String type) {
        if ("web".equals(type)) {
            return new WebCompanyLocator();
        } else {
            throw new TypeNotSupportedException();
        }
    }
}
