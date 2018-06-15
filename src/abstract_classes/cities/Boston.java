package abstract_classes.cities;

public class Boston extends City{

	public Boston(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = (population * growthRate) + (0.5 * population);
		System.out.println(AnnualTaxes);
		// TODO Auto-generated method stub
		return AnnualTaxes;
	}

}
