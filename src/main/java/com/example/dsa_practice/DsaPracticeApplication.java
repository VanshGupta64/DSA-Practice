package com.example.dsa_practice;

import com.example.dsa_practice.utility.Combinatorics;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.spec.RSAOtherPrimeInfo;


@SpringBootApplication
public class DsaPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(DsaPracticeApplication.class, args);
		Combinatorics combinatorics = new Combinatorics();
		System.out.println("-----------");
		System.out.println(combinatorics.findCombination(10,2));
	}

}
