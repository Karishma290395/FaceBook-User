package test5;

import java.util.Arrays;

public class Facebook {
	String name;
	String address;
	String profession;
	String hobbies;
	boolean specs;
	String marritalStatus;
	int approximateAge;
	int sons;
	float hemoglobin;
	int[] favouriteNumbers;
	String[] favouriteMovies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public boolean getSpecs() {
		return specs;
	}

	public void setSpecs(boolean specs) {
		this.specs = specs;
	}

	public String getMarritalStatus() {
		return marritalStatus;
	}

	public void setMarritalStatus(String marritalStatus) {
		this.marritalStatus = marritalStatus;
	}

	public int getApproximateAge() {
		return approximateAge;
	}

	public void setApproximateAge(int approximateAge) {
		this.approximateAge = approximateAge;
	}

	public int getSons() {
		return sons;
	}

	public void setSons(int sons) {
		this.sons = sons;
	}

	public float getHemoglobin() {
		return hemoglobin;
	}

	public void setHemoglobin(float hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public int[] getFavouriteNumbers() {
		return favouriteNumbers;
	}

	public void setFavouriteNumbers(int[] favouriteNumbers) {
		this.favouriteNumbers = favouriteNumbers;
	}

	public String[] getFavouriteMovies() {
		return favouriteMovies;
	}

	public void setFavouriteMovies(String[] favouriteMovies) {
		this.favouriteMovies = favouriteMovies;
	}

	Facebook() {

	}

	Facebook(String name, String address, String profession, String hobbies, boolean specs, String marritalStatus,
			int approximateAge, int sons, float hemoglobin, int[] favouriteNumbers, String[] favouriteMovies) {

		this.name = name;
		this.address = address;
		this.profession = profession;
		this.hobbies = hobbies;
		this.specs = specs;
		this.hemoglobin = hemoglobin;
		this.favouriteNumbers = favouriteNumbers;
		this.marritalStatus = marritalStatus;
		this.approximateAge = approximateAge;
		this.favouriteMovies = favouriteMovies;
	}
	
	@Override
	public String toString() {
		return "Facebook [name=" + name + ", address=" + address + ", profession=" + profession + ", hobbies=" + hobbies
				+ ", specs=" + specs + ", marritalStatus=" + marritalStatus + ", approximateAge=" + approximateAge
				+ ", sons=" + sons + ", hemoglobin=" + hemoglobin + ", favouriteNumbers="
				+ Arrays.toString(favouriteNumbers) + ", favouriteMovies=" + Arrays.toString(favouriteMovies) + "]";
	}
	
}