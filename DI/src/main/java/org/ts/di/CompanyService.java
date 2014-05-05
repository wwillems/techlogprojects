package org.ts.di;

import java.util.ArrayList;
import java.util.List;

public class CompanyService {
    public static List<Company> getLocalCompanies(String city) {
		WebCompanyLocator locator = new WebCompanyLocator();
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