class BillionairesList{
	static String[] billionaires={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save(String billionaire){
	billionaires[position]=billionaire;
			position++;	
		
		if(position>10){
		System.out.println("fraud billionaire");
        return;		
		}
		if(billionaire!=null && billionaire.length()>=5) {
			System.out.println("name : "+billionaire +"position : "+position);
		}
		else{
			System.out.println("billionaire not found");
		}
	}
	static void displayDetails(){
		for(int index=0;index<billionaires.length;index++){
			String ref=billionaires[index];
			System.out.println("billionaire in respective position : "+ref);
		}
	}
	static boolean found(String name){
		if(name!=null && name.length()>=5){
			for(int find=0;find<billionaires.length;find++){
				String ref=billionaires[find];
				if(ref==name){
					System.out.println("billionaire found in the list : "+ref);
					return true;
				}
			}
		}
		return false;
	}
	static String update(String oldName, String newName){
		if(oldName!=null && newName!=null){
			if(oldName.length()>=5 && newName.length()>=5){
				for(int point=0;point<billionaires.length;point++){
					String ref=billionaires[point];
					if(ref==oldName){
						System.out.println("old name : "+ref);
						billionaires[point]=newName;
						System.out.println("new name in the list : "+newName);
						return newName;
					}
				}
			}
		}
		return null;
	}
	static String updateWithInt(int index,String newName){
		if(newName!=null && newName.length()>=5){
			System.out.println("old point : "+index);
			billionaires[index]=newName;
			System.out.println("updated name : "+newName);
			return newName;
		}
		return null;
	}
	static boolean delete(String name){
		if(billionaires!=null && name.length()>=5){
			for(int naam=0;naam<billionaires.length;naam++){
				String ref=billionaires[naam];
				if(ref==name){
					System.out.println("entered name : "+name);
					ref=null;
					System.out.println("name deleted : "+ref);
					return true;
				}
			}
		}
		return false;
	}
	static boolean deleteWithInt(int index,String name){
	if(name!=null && name.length()>=5){
		System.out.println("index : "+index);
		billionaires[index]=name;
		name=null;
		System.out.println("updated name : "+name);
		return true;
	}	
	return false;
	}
}