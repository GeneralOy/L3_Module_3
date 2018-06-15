package abstract_classes.cities;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = 1000000 + (population * growthRate);
		System.out.println(AnnualTaxes);
		// TODO Auto-generated method stub
		return AnnualTaxes;
	}

}
