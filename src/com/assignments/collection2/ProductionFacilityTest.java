package com.assignments.collection2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ProductionFacilityTest {
	public static void main(String[] args) {

		// pfFacility1
		ProductionFacility pd1 = new ProductionFacility(101, "Developement", "wardha", 12,
				new String[] { "abc", "def", "aaa", "mmm", "nnnnn", "gdttyuio" }, LocalDate.of(2022, 8, 30));
		ProductionFacility pd2 = new ProductionFacility(102, "Developement", "yavatmal", 13,
				new String[] { "pqr", "stu", "etryy", "uytrf" }, LocalDate.of(2022, 8, 29));
		ProductionFacility pd3 = new ProductionFacility(103, "Developement", "kanpur", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 28));

		// pfFacility2
		ProductionFacility pd11 = new ProductionFacility(201, "Testing", "amravati", 11, new String[] { "abc", "def" },
				LocalDate.of(2022, 8, 20));
		ProductionFacility pd12 = new ProductionFacility(202, "Testing", "washim", 12,
				new String[] { "pqr", "stu", "uytfd", "yfd", "kjhtr", "uytrfd" }, LocalDate.of(2022, 8, 19));
		ProductionFacility pd13 = new ProductionFacility(203, "Testing", "buldhana", 13, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 18));

		// pfFacility3
		ProductionFacility pd21 = new ProductionFacility(301, "Production", "shegaon", 22,
				new String[] { "abc", "def" }, LocalDate.of(2022, 8, 10));
		ProductionFacility pd22 = new ProductionFacility(302, "Production", "nagpur", 3, new String[] { "pqr", "stu" },
				LocalDate.of(2022, 8, 9));
		ProductionFacility pd23 = new ProductionFacility(303, "Production", "jalgaon", 14, new String[] { "vwx", "yz" },
				LocalDate.of(2022, 8, 8));
//===================================================================================================        
		List<ProductionFacility> plist = Arrays.asList(pd1, pd2, pd11, pd12, pd21, pd22, pd23);

		// sorted acc to prod_fac_name
		plist.sort((p1, p2) -> p1.getProd_fac_name().compareTo(p2.getProd_fac_name()));

		for (ProductionFacility productionFacility : plist) {
			System.out.println(productionFacility);

		}
//===================================================================================================        

		// highest production per day
		Optional<ProductionFacility> findFirst = plist.stream()
				.sorted((p1, p2) -> p2.getTotalproduction_perday() - p1.getTotalproduction_perday()).findFirst();

		System.out.println("Highest production per day is : " + findFirst.get().getTotalproduction_perday());

//===================================================================================================  
		// sorting acc to prod_date
		plist.stream().sorted((p1, p2) -> p2.getProd_date().compareTo(p1.getProd_date()));

		for (ProductionFacility productionFacility : plist) {
			System.out.println(productionFacility);

		}

//===================================================================================================  

	}
}
