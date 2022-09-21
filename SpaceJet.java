class SpaceJet{
	static void flightNos(String[] flightNos){
		System.out.println("Entered the airport : ");
		System.out.println("Total flights in the list : "+flightNos.length);
		for(int index=0;index<flightNos.length;index++){
			String ref=flightNos[index];
			System.out.println(ref);
		}
		System.out.println("Exited the airport : ");	
	}
}