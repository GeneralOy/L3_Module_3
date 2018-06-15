package abstract_classes.cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double AnnualTaxes = population * growthRate * (growthRate * 0.5);
		System.out.println(AnnualTaxes);
		// TODO Auto-generated method stub
		return AnnualTaxes;
	}

}
