package DataBase;

public class Skat {
	private String byNavn;
	private float skatteprocent;

	public Skat(String byNavn, float skatteprocent) {
		this.byNavn = byNavn;
		this.skatteprocent = skatteprocent;
	}

	public String getByNavn() {
		return byNavn;
	}

	public float getSkatProcent() {
		return skatteprocent;
	}

}
