package org.ts.di;

import java.util.ArrayList;
import java.util.List;

public class CompanyFactoryService {
    public List<Company> getLocalCompanies(String city) {
		CompanyLocatorFactory factory = CompanyLocatorFactory.getInstance();
		CompanyLocator locator = factory.getCompanyLocator("web");
		List<Company> companies = locator.retrieveAllCompanies();
		List<Company> localCompanies = new ArrayList<Company>();
		for (Company company: companies) {
			if (company.getCity().equals(city)) {
				localCompanies.add(company);
			}
		}
		return localCompanies;
	}
}