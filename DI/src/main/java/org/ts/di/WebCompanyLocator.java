package org.ts.di;

import java.util.ArrayList;
import java.util.List;

public class WebCompanyLocator implements CompanyLocator {
    @Override
	public List<Company> retrieveAllCompanies() {
	    return new ArrayList<Company>();
	}
}