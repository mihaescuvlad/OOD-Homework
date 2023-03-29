package tax_pay.service.tax_manager;

import tax_pay.service.tax.ITaxPayer;

public interface ITaxPayerManager {
	
	ITaxPayer getTaxPayerById(int id);
	void add(ITaxPayer iTaxPayer);

}
