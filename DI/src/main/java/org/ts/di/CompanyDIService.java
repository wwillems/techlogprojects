package org.ts.di;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class CompanyDIService {

	private CompanyLocator companyLocator;

    // JSR330 annotation
	@Inject
	public void setCompanyLocator(CompanyLocator companyLocator) {
		this.companyLocator = companyLocator;
	}
	
	public List<Company> getLocalCompanies(String city) {
		List<Company> companies = this.companyLocator.retrieveAllCompanies();
		List<Company> localCompanies = new ArrayList<Company>();
		for (Company company: companies) {
			if (company.getCity().equals(city)) {
				localCompanies.add(company);
			}
		}
		return localCompanies;
	}
}