class BillionairesListRunner{
	public static void main(String[] abhjopathi){
		BillionairesList.save("elon");
		BillionairesList.save("adani");
		BillionairesList.save("bezos");
		BillionairesList.save("arnault");
		BillionairesList.save("bill");
		BillionairesList.save("warren");
		BillionairesList.save("ellison");
		BillionairesList.save("larry");
		BillionairesList.save("ambani");
		BillionairesList.save("brin");
		
		BillionairesList.displayDetails();
		
		BillionairesList.found("Prashant");
		
		BillionairesList.update("ambani","birla");
		
		BillionairesList.updateWithInt(10,"kedia");
		
		BillionairesList.delete("bezos");
		
		BillionairesList.deleteWithInt(1,"elon");
		
		BillionairesList.displayDetails();
	}
}