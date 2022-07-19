package com.cf.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Patheg {

	public static void main(String[] args) {
		Path p = Paths.get("c://home//sally//statusreport");
		System.out.println(p.isAbsolute()); //true
		System.out.println(p.getFileName()); //statusreport
		System.out.println(p.getNameCount());//3
		System.out.println(p.getParent());//c:\home\sally
		System.out.println(p.getRoot());//c:\
		
		System.out.println("========================================");
		Path p1 = Paths.get("home//sally");
		System.out.println(p1.isAbsolute()); //false
		System.out.println(p1.getFileName()); //sally
		System.out.println(p1.getNameCount());//2
		System.out.println(p1.getParent());//home
		System.out.println(p1.getRoot());//null
		
		System.out.println("========================================");
		Path p3=Paths.get("home//dir//a.txt"); //relative path
        Path fullPath = p3.toAbsolutePath();
        System.out.println(fullPath);/*C:\Users\kvk\eclipse-workspace\18-07-2022
        									\home\dir\a.txt*/
		System.out.println("========================================");
		String userI="//user//file";
		String def="c://dir//";
		Path p4=Paths.get(def+".."+userI);	
		System.out.println(p4.normalize() ); //c:\ user\file
		System.out.println("=========================================");
		
		Path p5 = Paths.get("//home//joe//foo");//ensure double slash used//single slash is not absolute
		Path p6=p5.resolve("bar");
		System.out.println(p6);//\\home\joe\foo\bar to join both paths
		
		System.out.println("=========================================");
		Path p7=Paths.get("c:\\Users\\Kathiresan\\Desktop\\ji\\repo3");
		Path p8=Paths.get("c:\\Users\\Kathiresan\\Desktop\\repo4");
		System.out.println(p7.relativize(p8));
		System.out.println(p8.relativize(p7));
		System.out.println(p3.toUri());
	}

}
