package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionJustificationRunner {

	public static void main(String[] args) {
		
		String currency1="euro";
		String currency2="us dollar";
		String currency="argentine peso";
		String currency3="pula";
		String currency4="yuan";
		String currency5="nakfa";
		String currency6="ethopian birr";
		String currency7="fiji dollar";
		String currency8="cfp franc";
		String currency9="dalasi";
		String currency10="lari";
		String currency11="cedi";
		String currency12="gibraltar pound";
		String currency13="dinesh krone";
		String currency14="quetzal";
		String currency15="guinea franc";
		String currency16="lempira";
		String currency17="forint";
		String currency18="ind rupee";
		String currency19="rupiah";
		String currency20="iranian rial";
		String currency21="iraqi dinar";
		String currency22="yen";
		String currency23="tenge";
		String currency24="won";
		String currency25="som";
		String currency26="kip";
		String currency27="";
		String currency28=null;
		
		Collection<String> collection=new LinkedList<String>();
		
		System.out.println(collection.add(currency28));//added & accessed
		System.out.println(collection.add(currency27));//added & accessed
		System.out.println(collection.add(currency26));
		System.out.println(collection.add(currency26));
		System.out.println(collection.add(currency25));
		System.out.println(collection.add(currency24));
		System.out.println(collection.add(currency23));
		System.out.println(collection.add(currency22));
		System.out.println(collection.add(currency21));
		System.out.println(collection.add(currency20));
		System.out.println(collection.add(currency19));
		System.out.println(collection.add(currency18));
		System.out.println(collection.add(currency17));
		System.out.println(collection.add(currency16));
		System.out.println(collection.add(currency15));
		System.out.println(collection.add(currency14));
		System.out.println(collection.add(currency13));
		System.out.println(collection.add(currency12));
		System.out.println(collection.add(currency1));
		System.out.println(collection.add(currency10));
		System.out.println(collection.add(currency9));
		System.out.println(collection.add(currency8));
		System.out.println(collection.add(currency7));
		System.out.println(collection.add(currency6));
		System.out.println(collection.add(currency5));
		System.out.println(collection.add(currency4));
		System.out.println(collection.add(currency3));
		System.out.println(collection.add(currency2));
		System.out.println(collection.add(currency1));//return-type add method in collection is boolean
		
		System.out.println("total currencies in collection : "+collection.size());
		for (String string : collection) {
			System.out.println(string);
		}
		Iterator<String> iterator=collection.iterator();
		System.out.println("accessed through iterator");
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		collection.clear();
		System.out.println(System.lineSeparator());
		
		String sweet1="jalebi";
		String sweet2="kheer";
		String sweet3="shrikhand";
		String sweet4="rasmalai";
		String sweet5="ghevar";
		String sweet6="rasgulla";
		String sweet7="malpua";
		String sweet8="ladoo";
		String sweet9="kulfi";
		String sweet10="bebinca";
		String sweet11="basundi";
		String sweet12="bakushahi";
		String sweet13="mysore pak";
		
		Collection<String> collection2=new LinkedList<String>();
		
		System.out.println(collection2.add(sweet13));
		System.out.println(collection2.add(sweet12));
		System.out.println(collection2.add(sweet11));
		System.out.println(collection2.add(sweet10));
		System.out.println(collection2.add(sweet9));
		System.out.println(collection2.add(sweet8));
		System.out.println(collection2.add(sweet7));
		System.out.println(collection2.add(sweet6));
		System.out.println(collection2.add(sweet5));
		System.out.println(collection2.add(sweet4));
		System.out.println(collection2.add(sweet3));
		System.out.println(collection2.add(sweet2));
		System.out.println(collection2.add(sweet1));
		
		System.out.println("total sweets in collection : "+collection2.size());
		collection2.clear();
		System.out.println(System.lineSeparator());
		
		String coupon1="flipkart";
		String coupon2="mintra";
		String coupon3="amazon";
		String coupon4="pantaloons";
		String coupon5="shoppers stop";
		String coupon6="nike";
		String coupon7="reebok";
		String coupon8="casio";
		String coupon9="fasttrack";
		String coupon10="police";
		String coupon11="adidas";
		String coupon12="wrogn";
		Collection<String> collection3=new LinkedList<String>();
		System.out.println(collection3.add(coupon12));
		System.out.println(collection3.add(coupon11));
		System.out.println(collection3.add(coupon10));
		System.out.println(collection3.add(coupon9));
		System.out.println(collection3.add(coupon8));
		System.out.println(collection3.add(coupon7));
		System.out.println(collection3.add(coupon6));
		System.out.println(collection3.add(coupon5));
		System.out.println(collection3.add(coupon4));
		System.out.println(collection3.add(coupon3));
		System.out.println(collection3.add(coupon2));
		System.out.println(collection3.add(coupon1));
		System.out.println("total coupons in collection : "+collection3.size());
		collection3.clear();
		System.out.println(System.lineSeparator());
		
		String bike1="cd 100";
		String bike2="cbz";
		String bike3="pulsor";
		String bike4="splendor";
		String bike5="zixer";
		String bike6="activa";
		String bike7="access";
		String bike8="hf deluxe";
		String bike9="facino";
		String bike10="ola";
		String bike11="aether";
		String bike12="bajaj";
		String bike13="suzuki";
		String bike14="hero";
		String bike15="honda";
		String bike16="rx100";
		String bike17="dio";
		String bike18="jupiter";
		Collection<String> collection4=new LinkedList<String>();
		System.out.println(collection4.add(bike18));
		System.out.println(collection4.add(bike17));
		System.out.println(collection4.add(bike16));
		System.out.println(collection4.add(bike15));
		System.out.println(collection4.add(bike14));
		System.out.println(collection4.add(bike13));
		System.out.println(collection4.add(bike12));
		System.out.println(collection4.add(bike11));
		System.out.println(collection4.add(bike10));
		System.out.println(collection4.add(bike9));
		System.out.println(collection4.add(bike8));
		System.out.println(collection4.add(bike7));
		System.out.println(collection4.add(bike6));
		System.out.println(collection4.add(bike5));
		System.out.println(collection4.add(bike4));
		System.out.println(collection4.add(bike3));
		System.out.println(collection4.add(bike2));
		System.out.println(collection4.add(bike1));
        System.out.println("total bikes in collection : "+collection4.size());
		collection4.clear();
        System.out.println(System.lineSeparator());
		
        String mall1="orion";
        String mall2="mantri";
        String mall3="gt";
        String mall4="ub city";
        String mall5="garuda";
        String mall6="global";
        String mall7="asian";
        String mall8="orchid";
        String mall9="kandur";
        String mall10="shraddha";
        String mall11="pheonix";
        String mall12="forum";
        String mall13="nexous";
        String mall14="inorbit";
        String mall15="dlf";
        String mall16="lulu";
        String mall17="abhiram";
        String mall18="fum";
        String mall19="alsa";
        String mall20="sunil";
        String mall21="prashant";
        String mall22="abhishek";
        String mall23="mallan";
        String mall24="shruti";
        String mall25="pooja";
        String mall26="jagadeesh";
        String mall27="rudra";
        String mall28="jaideep";
        String mall29="srisham";
        String mall30="arun";
        String mall31="chethan";
        String mall32="vinayak";
        String mall33="vinay";
        String mall34="om";
        String mall35="maharaj";
        String mall36="shivanna";
        String mall37="punith";
        String mall38="sudeep";
        String mall39="dboss";
        String mall40="yash";
        Collection<String> collection5=new LinkedList<String>();
        System.out.println(collection5.add(mall1));
        System.out.println(collection5.add(mall2));
        System.out.println(collection5.add(mall3));
        System.out.println(collection5.add(mall4));
        System.out.println(collection5.add(mall5));
        System.out.println(collection5.add(mall6));
        System.out.println(collection5.add(mall7));
        System.out.println(collection5.add(mall8));
        System.out.println(collection5.add(mall9));
        System.out.println(collection5.add(mall10));
        System.out.println(collection5.add(mall11));
        System.out.println(collection5.add(mall12));
        System.out.println(collection5.add(mall13));
        System.out.println(collection5.add(mall14));
        System.out.println(collection5.add(mall15));
        System.out.println(collection5.add(mall16));
        System.out.println(collection5.add(mall17));
        System.out.println(collection5.add(mall18));
        System.out.println(collection5.add(mall19));
        System.out.println(collection5.add(mall20));
        System.out.println(collection5.add(mall21));
        System.out.println(collection5.add(mall22));
        System.out.println(collection5.add(mall23));
        System.out.println(collection5.add(mall24));
        System.out.println(collection5.add(mall25));
        System.out.println(collection5.add(mall26));
        System.out.println(collection5.add(mall27));
        System.out.println(collection5.add(mall28));
        System.out.println(collection5.add(mall29));
        System.out.println(collection5.add(mall30));
        System.out.println(collection5.add(mall31));
        System.out.println(collection5.add(mall32));
        System.out.println(collection5.add(mall33));
        System.out.println(collection5.add(mall34));
        System.out.println(collection5.add(mall35));
        System.out.println(collection5.add(mall36));
        System.out.println(collection5.add(mall37));
        System.out.println(collection5.add(mall38));
        System.out.println(collection5.add(mall39));
        System.out.println(collection5.add(mall40));
        System.out.println("total malls in collection : "+collection5.size());
        collection5.clear();

	}

}
