package com.desafio.Contribuinte.oo.list;

public class TaxPayer {
	private Double salaryIcome;
	private Double servicesIcome;
	private Double capitalIcome;
	private Double healthSpending;
	private Double educationSpending;

	public TaxPayer(Double salaryIcome, Double servicesIcome, Double capitalIcome, Double healthSpending,
			Double educationSpending) {

		this.salaryIcome = salaryIcome;
		this.servicesIcome = servicesIcome;
		this.capitalIcome = capitalIcome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;

	}

	public Double getSalaryIcome() {
		return salaryIcome;
	}

	public void setSalaryIcome(Double salaryIcome) {
		this.salaryIcome = salaryIcome;
	}

	public Double getServicesIcome() {
		return servicesIcome;
	}

	public void setServicesIcome(Double servicesIcome) {
		this.servicesIcome = servicesIcome;
	}

	public Double getCapitalIcome() {
		return capitalIcome;
	}

	public void setCapitalIcome(Double capitalIcome) {
		this.capitalIcome = capitalIcome;

	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public Double salaryTax() {
		return (salaryIcome < 30000) ? (salaryIcome)
				: (salaryIcome >= 30000 && salaryIcome <= 50000) ? (salaryIcome * 0.10) : (salaryIcome * 0.20);

	}

	public Double servicesTax() {
		return servicesIcome * 0.15;
	}

	public Double capitalTax() {
		return capitalIcome * 0.20;
	}

	public Double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public Double taxRebate() {
		return (salaryIcome < 30000) ? (salaryIcome)
				: (salaryIcome >= 30000 && salaryIcome <= 50000) ? (grossTax() * 0.30) : (healthSpending + educationSpending);
	}

	public Double netTax() {

		return (salaryIcome < 30000) ? (salaryIcome)
				: (salaryIcome >= 30000 && salaryIcome <= 50000) ? (grossTax() - taxRebate())
						: (grossTax() - taxRebate());

	}

	@Override
	public String toString() {
		return "Resumondo  contribuinte: " +

				"Impostoi Bruto Total: " + String.format("%.2f", grossTax()) + "\n" + "Abatimento: "
				+ String.format("%.2f", taxRebate()) + "\n" + "Imposto Devido: " + String.format("%.2f", netTax());

	}

}
