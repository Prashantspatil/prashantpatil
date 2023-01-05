package com.xworkz.stream.boot;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;
import com.xworkz.stream.constant.WeaponType;
import com.xworkz.stream.dto.WeaponDto;

public class WeaponRunner {

	public static void main(String[] args) {

		Collection<WeaponDto> weaponDtos=new LinkedList<WeaponDto>();
		weaponDtos.add(new WeaponDto("aruval", "ancestors", "stone", 0D, WeaponType.ANCIENT));
		weaponDtos.add(new WeaponDto("asi", "ancestors", "stone", 0D, WeaponType.ANCIENT));
		weaponDtos.add(new WeaponDto("katti", "ancestors", "stone", 0D, WeaponType.ANCIENT));
		weaponDtos.add(new WeaponDto("bichuwa", "ancestors", "stone", 0D, WeaponType.ANCIENT));
		weaponDtos.add(new WeaponDto("firangi", "ancestors", "stone", 0D, WeaponType.ANCIENT));
		weaponDtos.add(new WeaponDto("gupti", "ancestors", "stone", 0D, WeaponType.ANCIENT));
		weaponDtos.add(new WeaponDto("axe", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("bow", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("mace", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("crossbow", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("culverin", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("trebuchet", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("polearm", "rulers", "copper", 1D, WeaponType.MEDIEVEL));
		weaponDtos.add(new WeaponDto("rifle", "defence", "mss", 500D, WeaponType.MODERN));
		weaponDtos.add(new WeaponDto("machinegun", "defence", "mss", 1500D, WeaponType.MODERN));
		weaponDtos.add(new WeaponDto("sniper", "defence", "mss", 2500D, WeaponType.MODERN));
		weaponDtos.add(new WeaponDto("mortar", "defence", "mss", 3500D, WeaponType.MODERN));
		weaponDtos.add(new WeaponDto("uzi", "defence", "mss", 4500D, WeaponType.MODERN));
		weaponDtos.add(new WeaponDto("grenade", "defence", "mss", 5500D, WeaponType.MODERN));
		weaponDtos.add(new WeaponDto("ak-47", "defence", "mss", 6500D, WeaponType.MODERN));
		System.out.println("printing the collection----------------------------------------");
		weaponDtos.stream().forEach(ele->System.out.println(ele));
		System.out.println("printing weapons price greater than 100D------------------------");
		weaponDtos.stream()
		.filter(dto->dto.getPrice()>100)
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
		System.out.println("printing weapons based on madeby & madeof------------------------");
		weaponDtos.stream().collect(Collectors.toList())
		.forEach(ele->System.out.println(ele.getMadeBy()+"-"+ele.getMadeOf()));
		System.out.println("printing weapons name in descending order-------------------------");				
		weaponDtos.stream()
		.sorted().forEach(ele->System.out.println(ele.getName()));
		System.out.println("print weapon names sort by madeby---------------------------------");
		weaponDtos.stream()
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele.getMadeBy()));
		System.out.println("print weapon names sort by madeof---------------------------------");
        weaponDtos.stream()
        .collect(Collectors.toList())
        .forEach(m->System.out.println(m.getMadeOf()));
		System.out.println("print weapon names sort by price---------------------------------");
        weaponDtos.stream()
        .collect(Collectors.toList())
        .forEach(p->System.out.println(p.getPrice()));
		System.out.println("print weapon names sort by price in descending-------------------");
		weaponDtos.stream()
		.sorted((p1,p2)->p2.getPrice().compareTo(p1.getPrice()))
		.forEach(p->System.out.println(p.getPrice()));
		System.out.println("print weapon names sort by name & madeof in ascending---------------------------------");
        weaponDtos.stream()
        .sorted((n1,n2)->(n1.getName().compareTo(n2.getName())))
        .sorted((n1,n2)->(n1.getMadeOf().compareTo(n2.getMadeOf())))
        .forEach(n->System.out.println(n.getName()+"-"+n.getMadeOf()));
		System.out.println("print weapon names sort by type, madeby & name in descending---------------------------------");
		weaponDtos.stream()
        .sorted((n1,n2)->(n2.getType().compareTo(n1.getType())))
        .sorted((n1,n2)->(n2.getMadeOf().compareTo(n1.getMadeOf())))
        .sorted((n1,n2)->(n2.getName().compareTo(n1.getName())))
        .forEach(t->System.out.println(t.getType()+"-"+t.getMadeBy()+"-"+t.getName()));
		
	}
}

