package tax_pay.service.tax_manager;

import java.util.ArrayList;
import java.util.List;

import tax_pay.service.tax.ITaxPayer;

public class TaxPayerManager implements ITaxPayerManager {

	List<ITaxPayer> iTaxPayers = new ArrayList<>();
	
	@Override
	public ITaxPayer getTaxPayerById(int id) {
		return this.iTaxPayers.get(id);
	}
	
	@Override
	public void add(ITaxPayer iTaxPayer) {
		this.iTaxPayers.add(iTaxPayer);
	}
	
}
