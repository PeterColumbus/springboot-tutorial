package com.example.test.com.example.test;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class KartuKreditController {

	private ArrayList<KartuKredit> listCC = new ArrayList<KartuKredit>();
	
	public KartuKreditController() {
		listCC.add(new KartuKredit(1111111 ,"kevin", "Platinum" ,"01/2023" , 10000000 , 1));
		listCC.add(new KartuKredit(1111122 ,"kevin", "Silver" ,"02/2023" , 5000000 , 1));
		listCC.add(new KartuKredit(1111133 ,"kevin", "Gold" ,"03/2023" , 7500000 , 1));
		
		listCC.add(new KartuKredit(1112211 ,"kevina", "Gold" ,"03/2023" , 7500000 , 2));
		listCC.add(new KartuKredit(1112222 ,"kevina", "Silver" ,"04/2023" , 5000000 , 2));
		
		listCC.add(new KartuKredit(1113311 ,"kevinb", "Gold" ,"04/2023" , 7500000 , 3));
		listCC.add(new KartuKredit(1113322 ,"kevinb", "Silver" ,"04/2023" , 5000000 , 3));
		
		listCC.add(new KartuKredit(1114411 ,"kevinc", "Platinum" ,"02/2023" , 10000000 , 4));
		listCC.add(new KartuKredit(1114422 ,"kevinc", "Silver" ,"02/2023" , 5000000 , 4));
		listCC.add(new KartuKredit(1114433 ,"kevinc", "Gold" ,"03/2023" , 7500000 , 4));
	}
	
	/*@GetMapping("/nocc/{nomor}")
	public KartuKredit getByName(@PathVariable int nomor) {
		int n = listCC.size();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getIdkartu() == nomor) {
				return listCC.get(i);
			}
		}
		KartuKredit error = new KartuKredit(999, "Error", "Error","Error", 0 , 0);
		
		return error;
	}*/
	
	@GetMapping("/{user}/cc/{cc}")
	public KartuKredit getByBothId(@PathVariable int user, @PathVariable int cc) {
		int n = listCC.size();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getIdowner() == user && listCC.get(i).getIdkartu() == cc ) {
				return listCC.get(i);
			}
		}
		KartuKredit error = new KartuKredit(999, "Error", "Error","Error", 0 , 0);
		
		return error;
	}
	
	@GetMapping("/{id}/cc")
	public ArrayList<KartuKredit> getById(@PathVariable int id) {
		int n = listCC.size();
		ArrayList<KartuKredit> temp = new ArrayList<KartuKredit>();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getIdowner()== id) {
				temp.add(listCC.get(i));
			}
		}
		return temp;
	}
	@GetMapping("/{user}/cc/limit/{id}")
	public ArrayList<KartuKredit> getByLimit(@PathVariable int id, @PathVariable int user) {
		int n = listCC.size();
		ArrayList<KartuKredit> temp = new ArrayList<KartuKredit>();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getLimit()== id && listCC.get(i).getIdowner() == user) {
				temp.add(listCC.get(i));
			}
		}
		return temp;
	}
	@GetMapping("{user}/cc/tipe/{jenis}")
	public ArrayList<KartuKredit> getById(@PathVariable String jenis, @PathVariable int user ) {
		int n = listCC.size();
		ArrayList<KartuKredit> temp = new ArrayList<KartuKredit>();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getJenis().compareToIgnoreCase(jenis) == 0 && listCC.get(i).getIdowner() == user) {
				temp.add(listCC.get(i));
			}
		}
		return temp;
	}
	
	@PostMapping("/{id}/cc")
	public String addCC(@RequestBody KartuKredit kartukredit) {
		if(kartukredit.getJenis().compareToIgnoreCase("silver") == 0 || kartukredit.getJenis().compareToIgnoreCase("gold") == 0 || kartukredit.getJenis().compareToIgnoreCase("platinum") == 0) {
			//int x = listCC.size();
			listCC.add(kartukredit);
			return "Input Success";
		}
		else {
			return "Input Error try again !";
		}
	}
	
	@PutMapping("/{user}/cc/{cc}")
	public String updateCC(@RequestBody KartuKredit kartukredit, @PathVariable int user, @PathVariable int cc) {
		int n = listCC.size();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getIdowner() == user && listCC.get(i).getIdkartu() == cc ) {
				if(kartukredit.getDate() != null)
					listCC.get(i).setDate(kartukredit.getDate());
				if(kartukredit.getIdowner() != 0)
					listCC.get(i).setIdowner(kartukredit.getIdowner());
				if(kartukredit.getJenis() != null)
					listCC.get(i).setJenis(kartukredit.getJenis());
				if(kartukredit.getName() != null)
					listCC.get(i).setName(kartukredit.getName());
				if(kartukredit.getLimit() != 0)
					listCC.get(i).setLimit(kartukredit.getLimit());
				return "update success!!";
			}
		}
			return "update failed!!";
	}
	
	@DeleteMapping("/{user}/cc/{cc}")
	public String DeleteCC(@PathVariable int user, @PathVariable int cc) {
		int n = listCC.size();
		for(int i=0; i<n; i++) {
			if(listCC.get(i).getIdowner() == user && listCC.get(i).getIdkartu() == cc ) {
				listCC.remove(i);
				return "Delete Success";
			}
		}
		
		return "Credit Card Not Found";
	}
	
}
