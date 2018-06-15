package abstract_classes.cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = population * growthRate * (2 * growthRate);
		System.out.println(AnnualTaxes);
		// TODO Auto-generated method stub
		return AnnualTaxes;
	}

}
