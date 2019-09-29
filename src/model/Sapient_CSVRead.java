package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Sapient_CSVRead {
	public static void code() {
		List<Emp> emp = new ArrayList<Emp>();
		Emp e = new Emp();
		e.name = "s";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "s";
		e.gender = "f";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "s";
		e.gender = "f";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "a";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "a";
		e.gender = "f";
		e.currency = 20;
		emp.add(e);
		e = new Emp();
		e.name = "a";
		e.gender = "f";
		e.currency = 30;
		emp.add(e);
		e = new Emp();
		e.name = "b";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "s";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "s";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "s";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);
		e = new Emp();
		e.name = "s";
		e.gender = "m";
		e.currency = 10;
		emp.add(e);

		FileWriter fw = null;
		try {
			fw = new FileWriter("writeToCSV.csv");
			fw.append("name,gender,currency");
			final String NEW_LINE_SEPARATOR = "\n";
			final String COMMA_DELIMITER = ",";
			for (Emp key : emp) {
				System.out.println(key.name + ",," + key.gender + ",," + key.currency);
				fw.append(key.name + "," + key.gender + "," + key.currency);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		/*System.out.println(emp);
		for (Emp key : emp) {
			System.out.println(key.name + ",," + key.gender + ",," + key.currency);
		}*/
		System.out.println("---------------------------");
		// Map<String, List<Emp>> memp =
		// emp.stream().collect(Collectors.groupingBy(Emp::getName));
		Map<String, Double> memp = null;
		/*
		 * emp.stream().sorted(new Comparator<Emp>() {
		 * 
		 * @Override public int compare(Emp o1, Emp o2) { // TODO Auto-generated method
		 * stub return o1.name.compareTo(o2.name); }
		 * }).collect(Collectors.groupingBy(Emp::groupByKey,
		 * Collectors.averagingDouble(Emp::getCurrency)));
		 * 
		 */

		Map<String, List<Emp>> mEmp = emp.stream().sorted(new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		}).collect(Collectors.groupingBy(Emp::groupByKey, LinkedHashMap::new, Collectors.toList()));

		for (Entry entry : mEmp.entrySet()) {
			List<Emp> lemp = (List<Emp>) entry.getValue();

			System.out.println(lemp.get(0).getName() + "," + lemp.get(0).getGender() + " ,"
					+ lemp.stream().mapToDouble(m -> m.getCurrency()).average().getAsDouble());
		}
		// Collectors.averagingDouble(Emp::getCurrency)
		/*
		 * for (Entry entry : memp.entrySet()) { String key = (String) entry.getKey();
		 * List<Emp> value = (List<Emp>) entry.getValue();
		 * 
		 * OptionalDouble opt = value.stream().mapToDouble(m ->
		 * m.getCurrency()).average(); if (opt.isPresent()) { key.currency =
		 * opt.getAsDouble(); } System.out.println(key+opt.getAsDouble()); }
		 */

		/*
		 * for (Entry entry : memp.entrySet()) { Emp key = (Emp) entry.getKey();
		 * List<Emp> value = (List<Emp>) entry.getValue();
		 * 
		 * OptionalDouble opt = value.stream().mapToDouble(m ->
		 * m.getCurrency()).average(); if (opt.isPresent()) { key.currency =
		 * opt.getAsDouble(); } System.out.println(key.name + ",," + key.gender + ",," +
		 * key.currency); }
		 */
	}
}

class Emp {
	String name;
	String gender;
	double currency;

	Emp() {

	}

	Emp(String name) {
		this.name = name;

	}

	Emp(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getCurrency() {
		return currency;
	}

	public void setCurrency(double currency) {
		this.currency = currency;
	}

	public String groupByKey() {
		return this.getName() + "_" + this.getGender();
	}
}
