package liberty.spring.medals;

public class MedalCount {

    private String country;
    private String medalsWon;

    protected MedalCount() {
    }

    public MedalCount(String country,String medalsWon) {
        this.country = country;
        this.medalsWon = medalsWon;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

	/**
	 * @return the medalsWon
	 */
	public String getMedalsWon() {
		return medalsWon;
	}
}