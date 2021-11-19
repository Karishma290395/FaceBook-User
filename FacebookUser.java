package test5;

public class FacebookUser {
	public static void main(String[] args) {

		String name = "karishma Nikhil Pawar";
		String address = "604,Tejashri CHS,Ramchandra Nagar,Thane(W)";
		String profession = "Accountat";
		String hobbies = "Dancing";
		boolean specs = true;
		String marritalStatus = "Married";
		int approximateAge = 27;
		int sons = 0;
		float hemoglobin = 12.5f;
		int[] favouriteNumbers = { 10, 20, 100, 500 };
		String[] favouriteMovies = { "Shivaji", "Dil to pagal hain", "bekhayali" };

		Facebook fbKarishma = new Facebook();
		fbKarishma.setName(name);
		fbKarishma.setAddress(address);
		fbKarishma.setProfession(profession);
		fbKarishma.setHobbies(hobbies);
		fbKarishma.setSpecs(specs);
		fbKarishma.setMarritalStatus(marritalStatus);
		fbKarishma.setApproximateAge(approximateAge);
		fbKarishma.setSons(sons);
		fbKarishma.setHemoglobin(hemoglobin);
		fbKarishma.setFavouriteNumbers(favouriteNumbers);
		fbKarishma.setFavouriteMovies(favouriteMovies);

		System.out.println("Name : " + fbKarishma.getName() +"\nAddress : " + fbKarishma.getAddress() + "\nProfession : "
				+ fbKarishma.getProfession() + "\nFavourite Hobbies : " + fbKarishma.getHobbies() + "\nSpecs : "
				+ fbKarishma.getSpecs() + "\nMarrital Status : " + fbKarishma.getMarritalStatus()
				+ "\nApproximate Age : " + fbKarishma.getApproximateAge() +"\nHemoglobin : "+ fbKarishma.getHemoglobin()
				+"\nSons : "+ fbKarishma.getSons());
		
	}
}
