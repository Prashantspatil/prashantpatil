package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamCollectionRunner {

	public static void main(String[] args) {
		
        //karnataka
        Collection<String> karDams=new ArrayList<String>();
        karDams.add("ksr");
        karDams.add("almetti");
        karDams.add("tb");
        karDams.add("linganamakki");
        karDams.add("bennethore");
        karDams.add("karanja");
        karDams.add("basava");
        karDams.add("hidkal");
        karDams.add("kali");
        karDams.add("renuka");
        System.out.println("kar dams : "+karDams.size());
        System.out.println(System.lineSeparator());
        //kerala
        Collection<String> kerDams=new ArrayList<String>();
        kerDams.add("mullaperiyar");
        kerDams.add("idukki");
        kerDams.add("neyyar");
        kerDams.add("idamalayar");
        kerDams.add("kakki");
        kerDams.add("walayar");
        kerDams.add("sholayar");
        kerDams.add("siruvani");
        kerDams.add("ponmundi");
        kerDams.add("malayalam");
        System.out.println("ker dams : "+kerDams.size());
        System.out.println(System.lineSeparator());
        //tamilnadu
        Collection<String> tnDams=new ArrayList<String>();
        tnDams.add("mettur");
        tnDams.add("vaigai");
        tnDams.add("chittar");
        tnDams.add("kallanai");
        tnDams.add("kodiveri");
        tnDams.add("aliyar");
        tnDams.add("mukkadal");
        tnDams.add("indira");
        tnDams.add("upper");
        tnDams.add("pechiparai");
        System.out.println("tamilnadu dams : "+tnDams.size());
        System.out.println(System.lineSeparator());
        //andhrapradesh
        Collection<String> apDams=new ArrayList<String>();
        apDams.add("nagarjun");
        apDams.add("srisailam");
        apDams.add("polavaram");
        apDams.add("somasila");
        apDams.add("nallamala");
        apDams.add("jalaput");
        apDams.add("gandikota");
        apDams.add("kalyani");
        apDams.add("brahmam");
        apDams.add("mylavaram");
        System.out.println("andhra pradesh dams : "+apDams.size());
        System.out.println(System.lineSeparator());
        //telangana
        Collection<String> tgDams=new ArrayList<String>();
        tgDams.add("singur");
        tgDams.add("nizam");
        tgDams.add("sriram");
        tgDams.add("sadarmat");
        tgDams.add("pocharam");
        tgDams.add("rajolibanda");
        tgDams.add("dindi");
        tgDams.add("osman");
        tgDams.add("himayath");
        tgDams.add("musi");
        System.out.println("telangana dams : "+tgDams.size());
        System.out.println(System.lineSeparator());
        //goa
        Collection<String> goaDams=new ArrayList<String>();
        goaDams.add("anjunam");
        goaDams.add("m i");
        goaDams.add("salaulim");
        goaDams.add("aaa");
        goaDams.add("bbb");
        goaDams.add("ccc");
        goaDams.add("ddd");
        goaDams.add("eee");
        goaDams.add("fff");
        goaDams.add("ggg");
        System.out.println("goa dams : "+goaDams.size());
        System.out.println(System.lineSeparator());
        //maharastra
        Collection<String> mhDams=new ArrayList<String>();
        mhDams.add("koyna");
        mhDams.add("muslhi");
        mhDams.add("panshet");
        mhDams.add("yelderi");
        mhDams.add("ujjani");
        mhDams.add("vaitarna");
        mhDams.add("bhatsa");
        mhDams.add("radhanagari");
        mhDams.add("bhivpuri");
        mhDams.add("dhom");
        System.out.println("maharastra dams : "+mhDams.size());
        System.out.println(System.lineSeparator());
        //madhyapradesh
        Collection<String> mpDams=new ArrayList<String>();
        mpDams.add("gandhi");
        mpDams.add("bansagar");
        mpDams.add("bargi");
        mpDams.add("barna");
        mpDams.add("tawa");
        mpDams.add("omkareshwar");
        mpDams.add("tehri");
        mpDams.add("rajghat");
        mpDams.add("tigra");
        mpDams.add("madikheda");
        System.out.println("madhyapradesh dams : "+mpDams.size());
        System.out.println(System.lineSeparator());
        //gujarath
        Collection<String> gjDams=new ArrayList<String>();
        gjDams.add("abhalwad");
        gjDams.add("adhia");
        gjDams.add("adhochhani");
        gjDams.add("adpur");
        gjDams.add("advana");
        gjDams.add("ajwa");
        gjDams.add("ambajal");
        gjDams.add("ambakuli");
        gjDams.add("ambala");
        gjDams.add("ambani");
        System.out.println("gujarath dams : "+gjDams.size());
        System.out.println(System.lineSeparator());
        //rajasthan
        Collection<String> rjDams=new ArrayList<String>();
        rjDams.add("bilaspur");
        rjDams.add("mahi bajaj");
        rjDams.add("rana pratap");
        rjDams.add("meja");
        rjDams.add("jawai");
        rjDams.add("morel");
        rjDams.add("kota");
        rjDams.add("gosunda");
        rjDams.add("jawahar");
        rjDams.add("sei");
        System.out.println("rajasthan dams : "+rjDams.size());
        System.out.println(System.lineSeparator());
        //westbengal
        Collection<String> wbDams=new ArrayList<String>();
        wbDams.add("bakreshwar");
        wbDams.add("bandhu");
        wbDams.add("barabhum");
        wbDams.add("beka");
        wbDams.add("dimu");
        wbDams.add("futiary");
        wbDams.add("hanumata");
        wbDams.add("kanjan");
        wbDams.add("karrior");
        wbDams.add("kumari");
        System.out.println("westbengal dams : "+wbDams.size());
        System.out.println(System.lineSeparator());
        //arunachalpradesh
        Collection<String> arunachalDams=new ArrayList<String>();
        arunachalDams.add("ranganadi");
        arunachalDams.add("subansiri");
        arunachalDams.add("siang");
        arunachalDams.add("dibang");
        arunachalDams.add("mmm");
        arunachalDams.add("nnn");
        arunachalDams.add("vvv");
        arunachalDams.add("ccc");
        arunachalDams.add("dfg");
        arunachalDams.add("hgf");
        System.out.println("arunachal pradesh dams : "+arunachalDams.size());
        System.out.println(System.lineSeparator());
        //jammu
        Collection<String> jammuDams=new ArrayList<String>();
        jammuDams.add("baglihar");
        jammuDams.add("dulhasti");
        jammuDams.add("kishenganga");
        jammuDams.add("nimoo");
        jammuDams.add("pakal");
        jammuDams.add("niu");
        jammuDams.add("salal");
        jammuDams.add("sewa");
        jammuDams.add("uri");
        jammuDams.add("ratle");
        System.out.println("jammu dams : "+jammuDams.size());
        System.out.println(System.lineSeparator());
        //punjab
        Collection<String> punDams=new ArrayList<String>();
        punDams.add("chohal");
        punDams.add("damsal");
        punDams.add("dholbaha");
        punDams.add("jainti");
        punDams.add("janauri");
        punDams.add("maili");
        punDams.add("mirzapur");
        punDams.add("patiari");
        punDams.add("perch");
        punDams.add("ranjit");
        System.out.println("punjab dams : "+punDams.size());
        System.out.println(System.lineSeparator());
        //haryan
        Collection<String> harDams=new ArrayList<String>();
        harDams.add("anangpur");
        harDams.add("hathni kund");
        harDams.add("kaushalya");
        harDams.add("masani");
        harDams.add("ottu");
        harDams.add("palla");
        harDams.add("pathrala");
        harDams.add("tajewala");
        harDams.add("kli");
        harDams.add("iuy");
        System.out.println("haryan dams : "+harDams.size());
        System.out.println(System.lineSeparator());
        //jharkhand
        Collection<String> jharDams=new ArrayList<String>();
        jharDams.add("amanat");
        jharDams.add("anjanwa");
        jharDams.add("anraj");
        jharDams.add("baksa");
        jharDams.add("bandha");
        jharDams.add("baranadi");
        jharDams.add("barhi");
        jharDams.add("basuki");
        jharDams.add("batane");
        jharDams.add("batre");
        System.out.println("jharkhand dams : "+jharDams.size());
        System.out.println(System.lineSeparator());
        //uttarpradesh
        Collection<String> upDams=new ArrayList<String>();
        upDams.add("adwa");
        upDams.add("afzalgarh");
        upDams.add("ahraura");
        upDams.add("arjun");
        upDams.add("aunjhar");
        upDams.add("bachara");
        upDams.add("balui");
        upDams.add("banjari");
        upDams.add("barwar");
        upDams.add("deori");
        System.out.println("uttarpradesh dams : "+upDams.size());
        System.out.println(System.lineSeparator());
        //uttarkhand
        Collection<String> uttarDams=new ArrayList<String>();
        uttarDams.add("baigul");
        uttarDams.add("baur");
        uttarDams.add("bhimtal");
        uttarDams.add("dhora");
        uttarDams.add("haripura");
        uttarDams.add("ichari");
        uttarDams.add("jamrani");
        uttarDams.add("koteshwar");
        uttarDams.add("lakhwar");
        uttarDams.add("maneri");
        System.out.println("uttarkhand dams : "+uttarDams.size());
        System.out.println(System.lineSeparator());
        //sikkim
        Collection<String> sikDams=new ArrayList<String>();
        sikDams.add("rangit");
        sikDams.add("rangpo");
        sikDams.add("rongli");
        sikDams.add("teesta");
        sikDams.add("dikchu");
        sikDams.add("ght");
        sikDams.add("gfv");
        sikDams.add("zxs");
        sikDams.add("qwk");
        sikDams.add("lhs");
        System.out.println("sikkim dams : "+sikDams.size());
        System.out.println(System.lineSeparator());
        //nagaland
        Collection<String> nagDams=new ArrayList<String>();
        nagDams.add("doyang");
        nagDams.add("likimro");
        nagDams.add("lang");
        nagDams.add("tehok");
        nagDams.add("ponglefo");
        nagDams.add("dzudza");
        nagDams.add("thivopisii");
        nagDams.add("nguiki");
        nagDams.add("lge");
        nagDams.add("blw");
        System.out.println("nagaland dams : "+nagDams.size());
        System.out.println(System.lineSeparator());
        //manipur
        Collection<String> maniDams=new ArrayList<String>();
        maniDams.add("khoupum");
        maniDams.add("khuga");
        maniDams.add("singda");
        maniDams.add("thoubal");
        maniDams.add("tipaimukh");
        maniDams.add("mapithel");
        maniDams.add("myanmar");
        maniDams.add("wjs");
        maniDams.add("lsp");
        maniDams.add("vks");
        System.out.println("manipur dams : "+maniDams.size());
        System.out.println(System.lineSeparator());
        //mizoram
        Collection<String> mizoDams=new ArrayList<String>();
        mizoDams.add("bairabi");
        mizoDams.add("serlui");
        mizoDams.add("tlawng");
        mizoDams.add("tuirial");
        mizoDams.add("wpv");
        mizoDams.add("alb");
        mizoDams.add("euf");
        mizoDams.add("qps");
        mizoDams.add("vbt");
        mizoDams.add("lkw");
        System.out.println("mizoram dams : "+mizoDams.size());
        System.out.println(System.lineSeparator());
        //tripura
        Collection<String> tripDams=new ArrayList<String>();
        tripDams.add("gumti");
        tripDams.add("qwm");
        tripDams.add("slt");
        tripDams.add("fgp");
        tripDams.add("lkq");
        tripDams.add("asp");
        tripDams.add("peu");
        tripDams.add("fgw");
        tripDams.add("cmy");
        tripDams.add("slg");
        System.out.println("tripura dams : "+tripDams.size());
        System.out.println(System.lineSeparator());
        //assam
        Collection<String> assamDams=new ArrayList<String>();
        assamDams.add("karbi");
        assamDams.add("umrong");
        assamDams.add("pagladia");
        assamDams.add("khandong");
        assamDams.add("subansiri");
        assamDams.add("langpi");
        assamDams.add("kopili");
        assamDams.add("borpani");
        assamDams.add("dle");
        assamDams.add("xmy");
        System.out.println("assam dams : "+assamDams.size());
        System.out.println(System.lineSeparator());
        //meghalaya
        Collection<String> megDams=new ArrayList<String>();
        megDams.add("khandang");
        megDams.add("kyrdemulai");
        megDams.add("mawphlang");
        megDams.add("myntdu");
        megDams.add("nongkhyllem");
        megDams.add("umiam");
        megDams.add("umtru");
        megDams.add("hlq");
        megDams.add("smy");
        megDams.add("htswertyuioplkjhgfddscvbn");
        System.out.println("meghalaya dams : "+megDams.size());
        System.out.println(System.lineSeparator());
        //bihar
        Collection<String> bihDams=new ArrayList<String>();
        bihDams.add("ajan");
        bihDams.add("amrity");
        bihDams.add("badua");
        bihDams.add("barnar");
        bihDams.add("baskund");
        bihDams.add("belharna");
        bihDams.add("bilasi");
        bihDams.add("chandan");
        bihDams.add("durgawati");
        bihDams.add("gaighat");
        System.out.println("bihar dams : "+bihDams.size());
        System.out.println(System.lineSeparator());
        //odisha
        Collection<String> odiDams=new ArrayList<String>();
        odiDams.add("alubani");
        odiDams.add("aradei");
        odiDams.add("arikul");
        odiDams.add("badabandh");
        odiDams.add("badanalla");
        odiDams.add("badjore");
        odiDams.add("baghalati");
        odiDams.add("baghua");
        odiDams.add("balimela");
        odiDams.add("damsal");
        System.out.println("odisha dams : "+odiDams.size());
        System.out.println(System.lineSeparator());
        //himachalpradesh
        Collection<String> hpDams=new ArrayList<String>();
        hpDams.add("baira");
        hpDams.add("bassi");
        hpDams.add("bhakra");
        hpDams.add("chamera");
        hpDams.add("karchham");
        hpDams.add("wangtoo");
        hpDams.add("kol");
        hpDams.add("largi");
        hpDams.add("malana");
        hpDams.add("nathpa");
        System.out.println("himachalpradesh dams : "+hpDams.size());
        System.out.println(System.lineSeparator());
        //chhattisgarh
        Collection<String> chhDams=new ArrayList<String>();
        chhDams.add("hasdeo");
        chhDams.add("adpather");
        chhDams.add("agariya");
        chhDams.add("ajabnagar");
        chhDams.add("amabeda");
        chhDams.add("amachuwa");
        chhDams.add("amakhokhra");
        chhDams.add("amakoni");
        chhDams.add("amgaon");
        chhDams.add("amhar");
        System.out.println("chhattisgarh dams : "+chhDams.size());
        System.out.println(System.lineSeparator());
        Collection<String> indianDams=new ArrayList<String>();
        indianDams.addAll(chhDams);
        indianDams.addAll(karDams);
        indianDams.addAll(kerDams);
        indianDams.addAll(apDams);
        indianDams.addAll(arunachalDams);
        indianDams.addAll(assamDams);
        indianDams.addAll(bihDams);
        indianDams.addAll(gjDams);
        indianDams.addAll(goaDams);
        indianDams.addAll(harDams);
        indianDams.addAll(hpDams);
        indianDams.addAll(jammuDams);
        indianDams.addAll(jharDams);
        indianDams.addAll(maniDams);
        indianDams.addAll(megDams);
        indianDams.addAll(mhDams);
        indianDams.addAll(mizoDams);
        indianDams.addAll(mpDams);
        indianDams.addAll(nagDams);
        indianDams.addAll(odiDams);
        indianDams.addAll(punDams);
        indianDams.addAll(rjDams);
        indianDams.addAll(sikDams);
        indianDams.addAll(tgDams);
        indianDams.addAll(tripDams);
        indianDams.addAll(tnDams);
        indianDams.addAll(upDams);
        indianDams.addAll(uttarDams);
        indianDams.addAll(wbDams);
        System.out.println("indian dams collection : "+indianDams.size());
        System.out.println(System.lineSeparator());
        Iterator<String> tstart=indianDams.iterator();
        while (tstart.hasNext()) {
			String string = (String) tstart.next();
			if (string.startsWith("t")) {
				System.out.println(string);
			}
		}
        System.out.println(System.lineSeparator());
        Iterator<String> endra=indianDams.iterator();
        while (endra.hasNext()) {
			String ele = (String) endra.next();
			if (ele.endsWith("ra")) {
				System.out.println(ele);
			}
		}
        System.out.println(System.lineSeparator());
		Iterator<String> ref1=indianDams.iterator();
		while (ref1.hasNext()) {
			String string1 = (String) ref1.next();
			if (string1.length()>=15) {
				System.out.println(string1);
			}
		}
		Iterator<String> upper=indianDams.iterator();
		while (upper.hasNext()) {
			String string = (String) upper.next();
			System.out.println(string.toUpperCase());
		}
		Iterator<String> lower=indianDams.iterator();
		while (lower.hasNext()) {
			String string = (String) lower.next();
			System.out.println(string.toLowerCase());
		}
		Iterator<String> palindrome=indianDams.iterator();
		while (palindrome.hasNext()) {
			String string = (String) palindrome.next();
			int c=0;
			StringBuffer buffer=new StringBuffer(string);
		    buffer.reverse();
		    String str=buffer.toString();
		    if(string.equals(str)) {
		    	c++;
		    System.out.println("palindrome : "+buffer);
		    } 
		}
		Iterator<String> p=indianDams.iterator();
		while (p.hasNext()) {
			String string = (String) p.next();
			if (string.contains("p")) {
				p.remove();
			}
		}System.out.println("after removed 'p' contained : "+indianDams.size());
	}

}
